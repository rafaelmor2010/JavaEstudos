package programa.principal;

import programa.classes.Aluno;
import programa.classes.Diretor;
import programa.classes.Secretario;

public class TestandoClassesFilhas {
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		Secretario secretario = new Secretario();
		Diretor diretor = new Diretor();
		
		//setando do objeto Aluno
		aluno.setNome("Rafael Morales");
		aluno.setIdade(40);
		
		
		//setando do objeto Secretario
		secretario.setNome("Gabriel Balico");
		secretario.setIdade(11);
		
		//setando do objeto Diretor
		diretor.setNome("João");
		diretor.setIdade(20);
		
		System.out.println("Aluno: "+aluno);
		
		System.out.println("------------------------------------");
		
		System.out.println("Secretario :"+secretario);
		
		System.out.println("------------------------------------");
		
		System.out.println("Diretor :"+diretor);
	}

}
