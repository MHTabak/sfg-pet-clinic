package guru.springframework.sfgpetclinic.model;

// Created Lecture 54
// Lecture 126 - Add Specialty
// Lecture 130 - Initialize the specialties list
import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {

    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
