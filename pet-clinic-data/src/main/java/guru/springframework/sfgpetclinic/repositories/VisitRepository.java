package guru.springframework.sfgpetclinic.repositories;

// Created in Lecture 156

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
