package guru.springframework.sfgpetclinic.model;

// Created in Lecture 126

public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
