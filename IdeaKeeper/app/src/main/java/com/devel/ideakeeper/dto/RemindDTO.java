package com.devel.ideakeeper.dto;

import java.util.Date;

public class RemindDTO {

    private String id;
    private String title;
    private Date remindDate;

    public RemindDTO(){}

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getRemindDate() {
        return remindDate;
    }

    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
