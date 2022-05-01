package cursojava.principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class Principal {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Qual nome do Aluno ? ");
		String idade =  JOptionPane.showInputDialog("Qual idade do Aluno ? ");
		String dataNascimento = JOptionPane.showInputDialog("Data Nascimento do Aluno ? ");
		String registroGeral = JOptionPane.showInputDialog("Qual RG do ALuno ?");
		String cpf = JOptionPane.showInputDialog("Qual CPF do ALuno ?");
		String nomeMae = JOptionPane.showInputDialog("Qual nome da mãe ?");
		String nomePai = JOptionPane.showInputDialog("Qual nome do Pai ?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data da matricula ?");
		String nomeEscola = JOptionPane.showInputDialog("Qual nome da escola ?");
		String SerieMatricula = JOptionPane.showInputDialog("Qual a série matriculada ?");
		/**
		String disciplina01 = JOptionPane.showInputDialog("Digite nome da disciplina 1");
		String nota01 = JOptionPane.showInputDialog("Qual a nota 1 ?");
		
		String disciplina02 = JOptionPane.showInputDialog("Digite nome da disciplina2 ");
		String nota02 = JOptionPane.showInputDialog("Qual a nota 2 ?");
		
		String disciplina03 = JOptionPane.showInputDialog("Digite nome da disciplina 3");
		String nota03 = JOptionPane.showInputDialog("Qual a nota 3 ?");
		
		String disciplina04 = JOptionPane.showInputDialog("Digite nome da disciplina 4");
		String nota04 = JOptionPane.showInputDialog("Qual a nota 4 ?");
		*/
		
		Aluno aluno1 = new Aluno();
		
		System.out.println("\n----------------------------------------------------");
		//classe aluno
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));//convertendo para inteiro
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistrogeral(registroGeral);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(nomeEscola);
		aluno1.setSerieMatriculado(SerieMatricula);
/**		
		
		//----Criando a Lista de Disciplinas
		
				Disciplina disciplina1 = new Disciplina();
	
				Disciplina disciplina2 = new Disciplina();
				
				Disciplina disciplina3 = new Disciplina();						
				
				Disciplina disciplina4 = new Disciplina();
				
	//---Setando as disciplinas da lista 					
				disciplina1.setDisciplina(disciplina01);
				disciplina2.setDisciplina(disciplina02);
				disciplina3.setDisciplina(disciplina03);
				disciplina4.setDisciplina(disciplina04);
			
				
	//---Setando as notas da lista 		
				disciplina1.setNota(Double.parseDouble(nota01));
				disciplina2.setNota(Double.parseDouble(nota02));
				disciplina3.setNota(Double.parseDouble(nota03));
				disciplina4.setNota(Double.parseDouble(nota04));
				
				
				
	//---Adicionando na lista usando add()
				aluno1.getDisciplinas().add(disciplina1);
				aluno1.getDisciplinas().add(disciplina2);
				aluno1.getDisciplinas().add(disciplina3);
				aluno1.getDisciplinas().add(disciplina4);
				*/
		
		
		//utilizando for  de forma dinamica disciplinas e notas
		
		for(int pos = 1 ; pos <= 4 ; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Qual nome Disciplina  "+pos+ " ?");
			String notaDisciplina = JOptionPane.showInputDialog("Qual é a nota "+pos+"?");
			
			Disciplina disciplina = new Disciplina();
			
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			//adiciona na lista usando add()
			aluno1.getDisciplinas().add(disciplina);

			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null,"Deseja remover alguma disciplina ?");
		
		if (escolha == 0 ) {
			String removerDisciplina = JOptionPane.showInputDialog("Qual disciplina remover 1 - 2 - 3 - 4");
			//REMOVENDO DISCIPLINA NA LISTA [0] [1] [2] [3] POR ISSO UTLIZADO -1 
			aluno1.getDisciplinas().remove(Integer.parseInt(removerDisciplina) -1);
		}
		
		
		
		System.out.println("Olá "+aluno1.getNome());				
		System.out.println("A idade é : "+aluno1.getIdade());				
		System.out.println("A data Nascimento é : "+aluno1.getDataNascimento());				
		System.out.println("O RG é : "+aluno1.getRegistrogeral());	
		System.out.println("O CPF é :"+aluno1.getNumeroCpf());
		System.out.println("Nome da mãe é :"+aluno1.getNomeMae());				
		System.out.println("Nome do pai é :"+aluno1.getNomePai());			
		System.out.println("A data da matrícula é :"+aluno1.getDataMatricula());				
		System.out.println("Nome " +aluno1.getNomeEscola());				
		System.out.println("Matriculado " +aluno1.getSerieMatriculado());
		
		
		//System.out.println("Disciplinas "+aluno1.getDisciplinas());
	
	
	
		
		System.out.println("Sua média é : "+aluno1.getMediaNota());
		System.out.println("Resultado foi : " +( aluno1.getAprovadoReprovado() ? "Aprovado" : "Reprovado" ));
		System.out.println("Resultado 2 foi : "+(aluno1.getAlunoAprovado2()));
		
		/*-------------------------------------------------------------------*/
		System.out.println("\n------------Utilizando toString mostrar no console------------------");
		
		System.out.println(aluno1.toString());
		System.out.println("Sua Média é :" +aluno1.getMediaNota());
		System.out.println("Resultado foi :"+aluno1.getAlunoAprovado2());
		
		
		
	
		
	}

}
