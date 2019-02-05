package guru.springframework.sfgpetclinic.model;

// Created Lecture 54
// Lecture 125 - Add Pets, address, city, telephone
// Lecture 130 - Modify declaration of Pets list to crete empty list
// Lecture 153 - Annotate class with @Entity. Add @Table. Declare column
//                 names for the properties. Set up a OneToMany relationship
//                 between Pets and Owners.
// Lecture 174 - Annotate class with @Setter, @Getter, @NoArgsConstructor, @AllArgsConstructor,
//                 and @Builder for Lombok. Remove getter/setter code.
//               To get functionality of Builder, create a constructor that has all the params
//                 of Owner, Person, and BaseEntity. Move @Builder annotation from class level
//                 to that constructor. Constructor calls super(id, firstName, lastName)

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
// @AllArgsConstructor
// @Builder
@Entity
@Table(name = "owners")
public class Owner extends Person {

    @Column(name = "address" )
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

    @Builder
    public Owner(Long id, String firstName, String lastName, String address, String city, String telephone, Set<Pet> pets) {
        super(id, firstName, lastName);
        this.address = address;
        this.city = city;
        this.telephone = telephone;
        this.pets = pets;
    }
}
