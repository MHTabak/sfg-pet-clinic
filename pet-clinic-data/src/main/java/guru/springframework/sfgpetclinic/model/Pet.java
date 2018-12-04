package guru.springframework.sfgpetclinic.model;

// Created Lecture 54
// Lecture 59 Extend BaseEntity
// Lecture 130 - Added name property
// Lecture 153 - Annotate class with @Entity and @Table. Add @Column to properties,
//               and ManyToOne to the PetType property


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType;

    @ManyToOne
    @JoinColumn(name="owner_id")
    private Owner owner;

    @Column(name = "birth_date")
    private LocalDate birthDate;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthdate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

}
