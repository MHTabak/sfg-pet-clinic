package guru.springframework.sfgpetclinic.model;

// Created in Leture 125
// Lecture 155 Issue 38. Make Visit a Hibernate entity set Table and Column names
//        set up mapping bewtween pet in this entity and the Pet entity in Pet.java

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
