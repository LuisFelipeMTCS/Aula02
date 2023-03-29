package br.ueg.prog.model;

import javax.sound.midi.Sequence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "TBL_ALUNO")
public class Aluno {
    @SequenceGenerator(
        name="amigo_sequence",
        sequenceName = "amigo_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
    strategy = GenerationType.SEQUENCE,
    generator = "amigo_sequence"
)

    @Id
    @Column(name = "codigo")
    private Long id;
    @Column(name = "nome", length = 200, nullable = false)
    private String primeiroNome;
    @Column(name = "sobrenome", length = 200, nullable = false)
    private String segundoNome;
    @Column(name = "mail", length = 300, unique = true)
    private String eMail;
    @Column(name = "idade")
    private Integer idade;
}
