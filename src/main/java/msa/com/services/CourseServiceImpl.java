package msa.com.services;

import lombok.AllArgsConstructor;
import msa.com.dtos.CourseDTO;
import msa.com.entities.Course;
import msa.com.exception.CourseNotFoundException;
import msa.com.mappers.CourseMapperImp;
import msa.com.repositories.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class CourseServiceImpl implements CourseService {
    private  CourseRepository courseRepository;
    private  CourseMapperImp courseMapperImp;
    @Override
    public List<CourseDTO> listCourses() {
        List<Course> courses= courseRepository.findAll();
        List<CourseDTO> CourseDTOS = courses.stream().map(course -> courseMapperImp.fromCourse(course)).collect(Collectors.toList());
        return CourseDTOS;
    }
    @Override
    public CourseDTO getCourse(Long idCourse) throws CourseNotFoundException {
        Course course = courseRepository.findById(idCourse).orElseThrow(()-> new CourseNotFoundException("Course Not Found"));
        return courseMapperImp.fromCourse(course);
    }
    @Override
    public CourseDTO saveCourse(CourseDTO courseDTO){
       Course course=courseMapperImp.fromCourseDTO(courseDTO);
       Course savedCourse=courseRepository.save(course);
       return courseMapperImp.fromCourse(savedCourse);
    }
    @Override
    public CourseDTO updateCourse(CourseDTO courseDTO){
        Course course=courseMapperImp.fromCourseDTO(courseDTO);
        Course savedCourse=courseRepository.save(course);
        return courseMapperImp.fromCourse(savedCourse);
    }
    @Override
    public void deleteCourse(Long idCourse){
        courseRepository.deleteById(idCourse);
    }
}
