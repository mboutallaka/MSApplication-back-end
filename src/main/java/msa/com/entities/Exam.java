package msa.com.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Exam {
    @Id
    private Long id;
    private Number score;
    private String place;
    @OneToMany(mappedBy = "exam")
    private Collection<Course> courses;
    @OneToMany(mappedBy = "exam")
    private Collection<Student> students;
    @ManyToOne
    private Teacher teacher;

}
