package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @GetMapping("/doggos/{name}")
    public String doggos(@PathVariable String name, Model model) {
        model.addAttribute("pathVar", name);
        return "doggos";
    }

    @GetMapping("/doggos")
    public String dogs(){
        return "doggos";
    }

    @RequestMapping(path = "/hello/{name}/and/{age}", method = RequestMethod.GET)
    @ResponseBody
    public String helloNameAge(@PathVariable String name, @PathVariable int age) {
        return "Hey " + name + " you are " + age + " years old.";
    }

//    @RequestMapping(path = "/roll-dice/{n}", method = RequestMethod.GET)
//    public String rollDice(@PathVariable String number){
//        model.addAttribute("guess", number);
//        return "roll-dice";
//
//    }

//    @GetMapping("/roll-dice")
//    public String rolldiceForm() {
//        return "roll-dice";
//    }
//
//    @PostMapping("/roll-dice")
//    public String rollDice(@RequestParam(name = "number") String number, Model model) {
//        model.addAttribute("number", number);
//        return "roll-dice";
//
//    }
//
//    public int random(){
//
//        int min=1;
//        int max =6;
//        int num = (int)Math.floor(Math.random()*(max-min+1)+min);
//
//        return num;
//    }
//
//    public String isRight(String number){
//
//    }
}
