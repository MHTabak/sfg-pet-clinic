package guru.springframework.sfgpetclinic.repositories;

// Created in Lecture 156

import guru.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
