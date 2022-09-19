package msa.com.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor @NoArgsConstructor
public class Matiere {
  @Id
   private Long id ;
   private String name;
   @OneToMany
   private Collection<Course> courses;
   @ManyToMany
   @JoinTable(name = "enrolledStudent" ,joinColumns = @JoinColumn(name = "matiere_id"),
               inverseJoinColumns = @JoinColumn(name = "student_id"))
   private Set<Student> enrolledStudent=new HashSet<Student>();
   @OneToMany
   private Collection<Exam> exams;
   @ManyToMany
   @JoinTable(name = "enrolledKesm" ,joinColumns = @JoinColumn(name = "subject_id"),
         inverseJoinColumns = @JoinColumn(name = "student_id"))
   private Set<Classes> enrolledKesm=new HashSet<>();
   @OneToOne
   private Teacher teacher;
}
