package guru.springframework.sfgpetclinic.controllers;

// Created in lecture 74 for issue #13
// Lecture 89 Add OwnerService and code to retrieve a list of owners
// Lectgure 133 Add method findOwnerss(). Returns notimplemtnted for now

// import guru.springframework.sfgpetclinic.model.Owner;

import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// import java.util.HashSet;
// import java.util.Set;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(Model model) {

        //Set<Owner> owners = ownerService.findAll();
        //System.out.println("OwnerController: num of owners - " + owners.size());
        //model.addAttribute("owners", owners);

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";

    }

    // Lecture 133 Add method to handle the Ownwer search
    // URL just calls the notimplemented.html template
    @RequestMapping({"/find", "/oups"})
    public String findOwners() {

        return "notimplemented";

    }
}
