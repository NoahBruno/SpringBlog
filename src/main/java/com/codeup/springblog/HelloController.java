package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @GetMapping("/doggos/{name}")
    public String doggos(@PathVariable String name, Model model){
        model.addAttribute("pathVar", name);
        return "doggos";
    }
    @RequestMapping(path= "/hello/{name}/and/{age}", method = RequestMethod.GET)
    @ResponseBody
    public String helloNameAge(@PathVariable String name,@PathVariable int age){
        return "Hey " + name + " you are " + age + " years old.";
    }
}
