package msa.com.web;

import msa.com.dtos.ClassesDTO;
import msa.com.dtos.CourseDTO;
import msa.com.exception.ClassesNotFoundException;
import msa.com.exception.CourseNotFoundException;
import msa.com.services.ClassesService;
import msa.com.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@Transactional
public class ClassesRestController {
   @Autowired
   private ClassesService classesService;

    @GetMapping("/classes")
    public List<ClassesDTO> classes(){
        return classesService.listClasses();
    }
    @GetMapping("/classes/{id}")
    public ClassesDTO getClasses(@PathVariable Long id) throws ClassesNotFoundException {
        return classesService.getClasses(id);

    }
    @PostMapping("/classes")
    public ClassesDTO saveClasses(@RequestBody ClassesDTO classesDTO){
        return classesService.saveClasses(classesDTO);
    }


    @PutMapping("/classes/{id}")
    public ClassesDTO updateClasses(@PathVariable Long id,@RequestBody ClassesDTO classesDTO){
        classesDTO.setId(id);
        return classesService.updateClasses(classesDTO);
    }
    @DeleteMapping("/classes/{id}")
    public void deleteClasses(@PathVariable Long id){
        classesService.deleteClasses(id);
    }
    @GetMapping("/classes/search")
    public List<ClassesDTO> searchClasses(@RequestParam(name = "keyword" ,defaultValue = "")String keyword ){
        return classesService.searchClasses("%"+keyword+"%");
    }

}
