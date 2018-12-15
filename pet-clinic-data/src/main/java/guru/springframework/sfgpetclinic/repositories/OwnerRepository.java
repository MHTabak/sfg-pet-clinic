package guru.springframework.sfgpetclinic.repositories;

// Created in Lecture  156

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
