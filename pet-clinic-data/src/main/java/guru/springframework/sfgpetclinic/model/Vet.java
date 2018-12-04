package guru.springframework.sfgpetclinic.model;

// Created Lecture 54
// Lecture 126 - Add Specialty
// Lecture 130 - Initialize the specialties list
// Lecture 154 - Add @Entity, @Table. @ManyToMany, and @JoinTable

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialties", joinColumns = @JoinColumn(name = "vet_id"),
               inverseJoinColumns = @JoinColumn(name= "specialty_id"))
    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
