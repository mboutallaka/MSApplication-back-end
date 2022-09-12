package msa.com.dtos;



import lombok.Data;


import javax.persistence.*;

@Data
public class ExamDTO {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Number score;
    private String place;

}
