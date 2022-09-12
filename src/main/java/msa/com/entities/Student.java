package msa.com.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class Student {
   @Id
   private Long id ;
   private String name;
   private String surname;
   private Date dateOfBirth;
   @OneToMany(mappedBy = "student")
   private Collection<Teacher> teachers;
   @OneToMany(mappedBy = "student")
   private Collection<Course> courses;
   @ManyToOne
   private Exam exam;
}
