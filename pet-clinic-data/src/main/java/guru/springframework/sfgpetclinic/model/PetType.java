package guru.springframework.sfgpetclinic.model;

// Created Lecture 54
// Lecture 58  - Extend BaseEntity
// Lecture 153 - Add @Entity, @Types and @Column
// Lecture 174 - Annotate class with @Setter, @Getter, @NoArgsConstructor, @AllArgsConstructor,
//                 and @Builder for Lombok

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
