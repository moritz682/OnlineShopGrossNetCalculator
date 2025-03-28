package moritz.schmoetzer.online_shop_gross_net_calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
}
