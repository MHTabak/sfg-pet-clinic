package guru.springframework.sfgpetclinic.model;

// Created in lecture 58
// Lecture 152 - Annotate with @MappedSuperclass. Add @id to id property
// Lecture 174 - Add Lombok annotations @Getter and @Setter, remove getId()
//                 and setId()
//               To get Builder functionality, add @NoArgsConstructor and
//               @AllArgsConstructor

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
