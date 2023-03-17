package br.ueg.prog;


import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.ueg.prog.model.Aluno;
import br.ueg.prog.repository.AlunoRepository;

@SpringBootApplication
public class ProgApplication {

	public static void main(String[] args) {SpringApplication.run(ProgApplication.class, args);}
		@Bean
		public CommandLineRunner commandLineRunner(AlunoRepository alunoRepository) {
			return args -> {
				System.out.println("Executado");
				System.out.println(alunoRepository);
				Aluno a1 = new Aluno();

				a1.setPrimeiroNome("João");
				a1.setSegundoNome("Pereira");
				a1.setIdade(38);
				try {
					alunoRepository.save(a1);

				} catch (Exception e){
					e.printStackTrace();
				}
				a1.setId(1l);
				a1 = alunoRepository.save(a1);
				System.out.println("Aluno" + a1);
				a1.setEMail("Teste@teste.com.br");
				a1 = alunoRepository.save(a1);
				System.out.println("Aluno2 " + a1);
				alunoRepository.delete(a1);

				a1 = new Aluno();
				a1.setId(2L);
				a1.setPrimeiroNome("Outro");
				a1.setSegundoNome("Pereira");
				a1 = alunoRepository.save(a1);
				System.out.println("Aluno2" + a1);
				List<Aluno> lista = alunoRepository.findAll();
				lista.forEach( item ->{
					System.out.println("Aluno" + item);
				});
			};

		}

}
