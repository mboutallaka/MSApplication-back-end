package msa.com.services;

import msa.com.dtos.CourseDTO;
import msa.com.exception.CourseNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CourseService {
    List<CourseDTO> listCourses();

    CourseDTO getCourse(Long id) throws CourseNotFoundException;


    CourseDTO saveCourse(CourseDTO courseDTO);

    CourseDTO updateCourse(CourseDTO courseDTO);

    void deleteCourse(Long id);
}
