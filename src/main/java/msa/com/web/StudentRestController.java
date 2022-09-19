package msa.com.web;

import lombok.AllArgsConstructor;
import msa.com.entities.Subject;
import msa.com.repositories.StudentRepository;
import msa.com.repositories.SubjectRepository;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@Transactional
@AllArgsConstructor
public class SubjectRestController {

   private SubjectRepository subjectRepository;


}

