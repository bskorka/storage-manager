package pl.bskorka.storagemanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class WebAppController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "Bartek");
        model.addAttribute("mode", "super app mode");

        return "index";
    }

}
