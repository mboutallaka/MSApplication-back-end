package msa.com.repositories;

import msa.com.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRespository extends JpaRepository<Subject,Long> {
}
