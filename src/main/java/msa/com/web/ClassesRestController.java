package msa.com.web;

import lombok.NoArgsConstructor;
import msa.com.dtos.CourseDTO;
import msa.com.exception.CourseNotFoundException;
import msa.com.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")

public class CourseRestController {
   @Autowired
   private CourseService courseService;

    @GetMapping("/courses")
    public List<CourseDTO> courses(){
        return courseService.listCourses();
    }
    @GetMapping("/courses/{idCourse}")
    public CourseDTO getCourse(@PathVariable Long idCourse) throws CourseNotFoundException {
        return courseService.getCourse(idCourse);

    }
    @PostMapping("/courses")
    public CourseDTO saveCourse(@RequestBody CourseDTO courseDTO){
        return courseService.saveCourse(courseDTO);
    }


    @PutMapping("/courses/{id}")
    public CourseDTO updateCourse(@PathVariable Long id,@RequestBody CourseDTO courseDTO){
        courseDTO.setId(id);
        return courseService.updateCourse(courseDTO);
    }
    @DeleteMapping("/courses/{idCourse}")
    public void deleteCourse(@PathVariable Long idCourse){
        courseService.deleteCourse(idCourse);
    }
    @GetMapping("/courses/search")
    public List<CourseDTO> searchCourses(@RequestParam(name = "keyword" ,defaultValue = "")String keyword ){
        return courseService.searchCourses("%"+keyword+"%");
    }

}
