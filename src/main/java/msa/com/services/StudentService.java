package msa.com.services;

import msa.com.dtos.ClassesDTO;
import msa.com.dtos.CourseDTO;
import msa.com.exception.ClassesNotFoundException;


import java.util.List;

public interface ClassesService {

    List<ClassesDTO> listClasses();

    ClassesDTO getClasses(Long id) throws ClassesNotFoundException;


    ClassesDTO saveClasses(ClassesDTO classesDTO);

    ClassesDTO updateClasses(ClassesDTO classesDTO);

    void deleteClasses(Long id);

    List<ClassesDTO> searchClasses(String keyword);
}
