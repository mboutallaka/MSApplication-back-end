package msa.com.dtos;

import lombok.Data;

import javax.persistence.Id;
@Data
public class ClassesDTO {
    @Id
    private Long id ;
    private String name ;
}
