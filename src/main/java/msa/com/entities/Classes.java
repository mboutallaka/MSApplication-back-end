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
public class Kesm {
    @Id
    private Long id ;
    private String name ;
    @ManyToMany(mappedBy = "enrolledKesm")
    private Set<Matiere> matiere=new HashSet<Matiere>();
    @OneToMany(mappedBy = "kesm")
    private Collection<Student> students;
    @ManyToMany(mappedBy = "enrolledKesm")
    private Set<Course> course=new HashSet<Course>();
    @ManyToMany
    @JoinTable(name = "enrolledExam" ,joinColumns = @JoinColumn(name = "kesm_id"),
            inverseJoinColumns = @JoinColumn(name = "exam_id"))
    private Set<Exam> enrolledExam =new HashSet<>();
    @ManyToMany
    @JoinTable(name = "enrolledTeacher" ,joinColumns = @JoinColumn(name = "kesm_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_id"))
    private Set<Teacher> enrolledTeacher =new HashSet<>();
}
