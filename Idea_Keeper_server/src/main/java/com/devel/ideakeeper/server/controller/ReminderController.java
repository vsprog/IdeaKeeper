package com.devel.ideakeeper.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/reminder")
public class ReminderController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getReminder(ModelMap model) {
        return "Some reminder";
    }

}
