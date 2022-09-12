package msa.com;

import msa.com.dtos.CourseDTO;
import msa.com.entities.Course;
import msa.com.entities.Teacher;
import msa.com.repositories.CourseRepository;
import msa.com.repositories.ExamRepository;
import msa.com.repositories.StudentRepository;
import msa.com.repositories.TeacherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class ComApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComApplication.class, args);
    }

   @Bean
    CommandLineRunner start(CourseRepository courseRepository, ExamRepository examRepository,
                            StudentRepository studentRepository, TeacherRepository teacherRepository){
        return args -> {
            Stream.of("geo","arabe","english").forEach(name->{
                CourseDTO courseDTO=new CourseDTO();
                courseDTO.setName(name);



            });

        };
    }




}
