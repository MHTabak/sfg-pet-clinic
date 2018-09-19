package guru.springframework.sfgpetclinic.controllers;

// Created in Lecture 73 Issue #7

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets() {

        return "vets/index";

    }

}
