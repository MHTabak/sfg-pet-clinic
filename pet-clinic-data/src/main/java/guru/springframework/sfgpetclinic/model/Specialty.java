package guru.springframework.sfgpetclinic.model;

// Created in Lecture 126
// Lecture 154 - annotate with @Entity,
// Lecture 174 - Annotate class with @Setter, @Getter, @NoArgsConstructor, @AllArgsConstructor,
//                 and @Builder for Lombok. Remove getter/setter code.

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
@Table(name = "specialties")
public class Specialty extends BaseEntity {

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
