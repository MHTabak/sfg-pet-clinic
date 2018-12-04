package guru.springframework.sfgpetclinic.model;

// Created Lecture 54
// Lecture 58 Extend BaseEntity class
// Lecture 153 Add @MappedSuperclass. We will not work with a
//         person POJO directly. We'll extend from it. Add
//         @Column

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
