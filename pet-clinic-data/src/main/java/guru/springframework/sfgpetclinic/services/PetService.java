package guru.springframework.sfgpetclinic.services;

// Created in Lecture 57

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();

}
