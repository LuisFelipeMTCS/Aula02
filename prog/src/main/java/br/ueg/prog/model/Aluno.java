package br.ueg.prog.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity 
@Table(name = "TBL_ALUNO")
public class Aluno {
    @Id
    @Column(name = "codigo")
    private Long id;
    @Column(name = "nome", length = 200,nullable = false)
    private String primeiroNome;
    @Column(name = "sobrenome", length = 200,nullable = false)
    private String segundoNome;
    @Column(name = "mail", length = 300)
    private String eMail;
    @Column(name = "idade")
    private Integer idade;
}
