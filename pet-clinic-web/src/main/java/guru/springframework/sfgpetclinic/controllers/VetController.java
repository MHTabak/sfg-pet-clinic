package guru.springframework.sfgpetclinic.controllers;

// Created in Lecture 73 Issue #7
// Lecture 90 - Add VetService using constructor loading.
//             Add list of vets to model in listVets()
// Lecture 133 Add mapping to "/vets.html. Note there is no class
//             level mapping here, so all mappings are off the root context

import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html", "/vets.html"})
    public String listVets(Model model) {

        model.addAttribute("vets", vetService.findAll());
        return "vets/index";

    }

}
