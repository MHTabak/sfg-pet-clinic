package guru.springframework.sfgpetclinic.model;

// Created Lecture 54
// Lecture 58 Extend BaseEntity

public class PetType extends BaseEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
