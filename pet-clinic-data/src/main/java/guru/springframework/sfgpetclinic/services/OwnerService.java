package guru.springframework.sfgpetclinic.services;

// Created in lecture 57
// Lecture 68 Refactor to use our CrudService

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String name);

}
