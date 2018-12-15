package guru.springframework.sfgpetclinic.repositories;

// Created in Lecture 156

import guru.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
