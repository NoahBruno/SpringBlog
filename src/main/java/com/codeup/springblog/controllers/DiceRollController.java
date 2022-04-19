package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class DiceRollController {
    @GetMapping("/roll-dice")
    public String diceRoll(){
        return "roll-dice";
    }

    @GetMapping("roll-dice/{num}")
    @ResponseBody
    public String diceRoll(@PathVariable String num){
        Random random = new Random();
        int int_num = Integer.parseInt(num);
        int upperbound = 6;
        int int_random = random.nextInt(upperbound + 1);
        if(int_random == int_num){
            return "You guessed correctly! Your number was: " + num + " Random number was: " + int_random;
        } else{
            return "Nope not today! Your number was: " + num + " Random number was: " + int_random;
//            return "redirect:/doggos";
        }
    }
}
