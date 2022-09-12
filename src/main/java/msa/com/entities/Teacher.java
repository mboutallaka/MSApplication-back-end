package msa.com.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Teacher {
    @Id
    private Long id;
    private String name;
    private String surname;
    @OneToMany(mappedBy = "teacher")
    private Collection<Course> courses;
    @ManyToOne
    private Student student;
    @OneToMany(mappedBy = "teacher")
    private Collection<Exam> exams;


}
