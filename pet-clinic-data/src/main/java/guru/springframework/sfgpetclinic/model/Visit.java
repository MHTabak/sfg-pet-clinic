package guru.springframework.sfgpetclinic.model;

// Created in Leture 125
// Lecture 155 - Issue 38. Make Visit a Hibernate entity set Table and Column names
//             set up mapping bewtween pet in this entity and the Pet entity in Pet.java
// Lecture 163 - Added getter method for Pet for issue 46 so Visit service can get the
//             Pet
// Lecture 164 - Had to add a constructor to take a Pet as a parameter. This was so
//             we cold load data in the DataLoader class. Had to also add setDescription()
//             for same reason. John had this in his code, mine was missing it. Not sure why,
//             but it's a concern, what else is missing?
// Lecture 174 - Annotate class with @Setter, @Getter, @NoArgsConstructor, @AllArgsConstructor,
//                 and @Builder for Lombok. Remove getter/setter code

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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

    public Visit(Pet pet) {
        this.pet = pet;
    }

    public LocalDate getDate() {
        return date;
    }

}
