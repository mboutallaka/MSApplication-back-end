package msa.com.repositories;



import msa.com.dtos.CourseDTO;
import msa.com.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course,Long> {

}
