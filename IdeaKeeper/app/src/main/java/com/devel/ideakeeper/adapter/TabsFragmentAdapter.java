package com.devel.ideakeeper.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.devel.ideakeeper.dto.RemindDTO;
import com.devel.ideakeeper.fragment.AbstactTabsFragment;
import com.devel.ideakeeper.fragment.BirthdaysFragment;
import com.devel.ideakeeper.fragment.HistoryFragment;
import com.devel.ideakeeper.fragment.IdeasFragment;
import com.devel.ideakeeper.fragment.TodoFragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstactTabsFragment> tabs;
    private Context mContext;
    private List<RemindDTO> data;
    private HistoryFragment historyFragment;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        this.data = new ArrayList<>();
        initTabs(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabs(Context context) {
        tabs = new HashMap<>();
        historyFragment = HistoryFragment.getInstance(context, data);

        tabs.put(0, historyFragment);
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, TodoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }

    public  void setData(List<RemindDTO> data) {
        this.data = data;
        historyFragment.updateData(data);
    }
}
