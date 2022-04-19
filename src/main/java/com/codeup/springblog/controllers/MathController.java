package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @RequestMapping(path = "/add/{three}/and/{four}", method= RequestMethod.GET)
    @ResponseBody
    public String addNum(@PathVariable int three, @PathVariable int four){
        return "results " + (three + four);
    }

    @RequestMapping(path = "/subtract/{three}/from/{ten}", method= RequestMethod.GET)
    @ResponseBody
    public String subNum(@PathVariable int three, @PathVariable int ten){
        return "results " + (three - ten);
    }

    @RequestMapping(path = "/multiply/{four}/by/{five}", method= RequestMethod.GET)
    @ResponseBody
    public String multNum(@PathVariable int four, @PathVariable int five){
        return "results " + (four * five);
    }

    @RequestMapping(path = "/divide/{six}/by/{three}", method= RequestMethod.GET)
    @ResponseBody
    public String divNum(@PathVariable int six, @PathVariable int three) {
        return "results " + (six / three);
    }

}
