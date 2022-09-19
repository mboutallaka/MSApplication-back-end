package msa.com.mappers;

import msa.com.dtos.CourseDTO;
import msa.com.entities.Course;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class CourseMapperImp {
    public CourseDTO fromCourse(Course course){
      CourseDTO courseDTO=new CourseDTO();
      BeanUtils.copyProperties(course,courseDTO);
      return courseDTO;
    }

    public Course fromCourseDTO(CourseDTO courseDTO){
        Course course=new Course();
        BeanUtils.copyProperties(courseDTO,course);
        return course;
    }
}
