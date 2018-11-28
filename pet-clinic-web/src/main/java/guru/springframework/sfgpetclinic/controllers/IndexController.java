package guru.springframework.sfgpetclinic.controllers;

// Created in Lecture 71
// Lecture 133 Add method to handle "/oups", the "Error" link on
//      the menu

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})

    public String index() {

        return "index";

    }

    // Handle Error link on menu
    @RequestMapping("/oups")
    public String oupsHandler() {

        return "notimplemented";

    }

}
