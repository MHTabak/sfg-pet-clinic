package guru.springframework.sfgpetclinic.model;

// Created Lecture 54
// Lecture 58  - Extend BaseEntity class
// Lecture 153 - Add @MappedSuperclass. We will not work with a
//               person POJO directly. We'll extend from it. Add
//               @Column
// Lecture 174 - This is an intermediate class. Owner and Vet extend it. It is usually
//                 a good idea to add getters and setters. Annotate with @Getter and
//                 @Setter and remove the getter/setter code in this file.
//               To get functionality of builder, add a constructor that takes params
//                 Long id, String firstName, String lastName. First things constructor does
//                 is call super(id).

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    public Person(Long id, String firstName, String lastName) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
