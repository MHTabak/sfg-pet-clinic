package guru.springframework.sfgpetclinic.repositories;

// Created in Lecture 156

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
