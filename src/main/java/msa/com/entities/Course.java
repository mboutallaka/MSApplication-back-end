package msa.com.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Course {
    @Id
    private Long id;
    private String name;
    @ManyToOne
    private Teacher teacher;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Exam exam;


}
