package msa.com.services;

import lombok.AllArgsConstructor;
import msa.com.dtos.ClassesDTO;


import msa.com.dtos.CourseDTO;
import msa.com.entities.Classes;
import msa.com.entities.Course;
import msa.com.exception.ClassesNotFoundException;

import msa.com.mappers.ClassesMapperImp;
import msa.com.repositories.ClassesRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ClassesServiceImpl implements ClassesService {
    private ClassesRepository classesRepository;
    private ClassesMapperImp classesMapperImp;


    @Override
    public List<ClassesDTO> listClasses() {
        List<Classes> classes= classesRepository.findAll();
        List<ClassesDTO> ClassesDTOS = classes.stream().map(classes1 -> classesMapperImp.fromClasses(classes1)).collect(Collectors.toList());
        return ClassesDTOS;
    }

    @Override
    public ClassesDTO getClasses(Long id) throws ClassesNotFoundException {
        Classes classes = classesRepository.findById(id).orElseThrow(()-> new ClassesNotFoundException("Classes Not Found"));
        return classesMapperImp.fromClasses(classes);
    }

    @Override
    public ClassesDTO saveClasses(ClassesDTO classesDTO) {
        Classes classes=classesMapperImp.fromClassesDTO(classesDTO);
        Classes savedClasses=classesRepository.save(classes);
        return classesMapperImp.fromClasses(savedClasses);
    }

    @Override
    public ClassesDTO updateClasses(ClassesDTO classesDTO) {
        Classes classes=classesMapperImp.fromClassesDTO(classesDTO);
        Classes savedClasses=classesRepository.save(classes);
        return classesMapperImp.fromClasses(savedClasses);
    }

    @Override
    public void deleteClasses(Long id) {
        classesRepository.deleteById(id);
    }

    @Override
    public List<ClassesDTO> searchClasses(String keyword) {
        List<Classes> classes=classesRepository.searchClasses(keyword);
        List<ClassesDTO> classesDTOS = classes.stream().map(classes1 -> classesMapperImp.fromClasses(classes1)).collect(Collectors.toList());
        return classesDTOS;
    }
}
