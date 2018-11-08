package guru.springframework.sfgpetclinic.model;

// Created Lecture 54
// Lecture 125 Add a Pet

import java.util.Set;

public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
