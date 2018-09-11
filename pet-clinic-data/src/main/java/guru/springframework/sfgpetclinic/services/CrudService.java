package guru.springframework.sfgpetclinic.services;

// Created in Lecture 68 for issue 11. This mimics Spring's CrudRepository<T, ID>
// Refactor our service classes to inherit from this class. The methods in this
//   interface were common to all 3 of the existing interfaces. Now they will just
//   inherit from this interface

import java.util.Set;

public interface CrudService<T, ID> {

    // CrudRepository returns Iterable, we'll simplify
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
