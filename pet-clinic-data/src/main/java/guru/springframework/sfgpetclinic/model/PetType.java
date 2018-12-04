package guru.springframework.sfgpetclinic.model;

// Created Lecture 54
// Lecture 58 Extend BaseEntity
// Lecture 153 Add @Entity, @Types and @Column


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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
