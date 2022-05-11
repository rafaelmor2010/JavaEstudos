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
		aluno.maiorIdade();
		
		//setando do objeto Secretario
		secretario.setNome("Gabriel Balico");
		secretario.setIdade(20);
		secretario.maiorIdade();
		
		//setando do objeto Diretor
		diretor.setNome("Jo�o");
		diretor.setIdade(16);
		diretor.maiorIdade();
		
		System.out.println("Aluno: "+aluno.toString()+"\n"+aluno.msMaiorIdade());
		System.out.println("Sal�rio do aluno � : "+aluno.salario());
		
		System.out.println("------------------------------------");
		
		System.out.println("Secretario :"+secretario.toString()+"\n"+secretario.msMaiorIdade());
		System.out.println("Sal�rio do secret�rio � :  "+ secretario.salario());
		
		System.out.println("------------------------------------");
		
		System.out.println("Diretor :"+diretor.toString()+"\n"+diretor.msMaiorIdade());
		System.out.println("Sal�rio do diretor � : "+diretor.salario());
	}

}
