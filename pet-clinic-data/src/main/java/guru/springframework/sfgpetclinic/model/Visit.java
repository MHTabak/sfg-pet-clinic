package guru.springframework.sfgpetclinic.model;

// Created in Leture 125

import java.time.LocalDate;

public class Visit extends BaseEntity {

    private LocalDate date;

    private String description;

    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
