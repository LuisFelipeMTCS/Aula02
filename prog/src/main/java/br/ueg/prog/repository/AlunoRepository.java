package br.ueg.prog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.ueg.prog.model.Aluno;

@Repository
public interface AlunoRepository  extends JpaRepository<Aluno,Long>{
    
    
}
