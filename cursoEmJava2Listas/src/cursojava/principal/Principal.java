package cursojava.principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

//import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.ConstantesAluno;

public class Principal {
	public static void main(String[] args) {
		
		
		//simples validação de permissão de acesso 
		String login = JOptionPane.showInputDialog("Informe login :");
		String senha = JOptionPane.showInputDialog("Informe senha :");
		
		if(login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
			
		
		
		
		//utilizando lista hashmaps forma de carregar dados atravaes de uma valor
		//lista que tem uma chave identifica uma sequencia de valores
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
		
		
		
		
		
		//instaciando uma lista de aluno 
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		
		//instanciando listas de alunos Aprovados, Recupeção e Reprovados
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecupecao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		
		
		//criando um for para informar dois alunos
		for(int qtdAluno = 1; qtdAluno <= 2; qtdAluno++) {
		
		String nome = JOptionPane.showInputDialog("Qual nome do Aluno "+qtdAluno+" ? ");
		
		
		String idade =  JOptionPane.showInputDialog("Qual idade do Aluno ? ");
		String dataNascimento = JOptionPane.showInputDialog("Data Nascimento do Aluno ? ");
		String registroGeral = JOptionPane.showInputDialog("Qual RG do ALuno ?");
		String cpf = JOptionPane.showInputDialog("Qual CPF do Aluno ?");
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
		// se clicar no sim ele vai para if pois sim é 0
		if (escolha == 0 ) {
			// para entrar no while a primeira vez 
			int continuarRemover = 0;
			int posicao = 1;
			while(continuarRemover == 0) {
			String removerDisciplina = JOptionPane.showInputDialog("Qual disciplina remover 1 - 2 - 3 - 4");
			//REMOVENDO DISCIPLINA NA LISTA [0] [1] [2] [3] POR ISSO UTLIZADO -1 
			aluno1.getDisciplinas().remove(Integer.parseInt(removerDisciplina) -posicao);
			posicao++;
			//continuarRemovar se for sim = 0 ele vai para while novamente  não = 1 ele sai e continua o codigo 
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover ?");
			
			}
		}
		
		
		/*
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
		
		*/
		//System.out.println("Disciplinas "+aluno1.getDisciplinas());
	
		
		//adicionando alunos na lista
		alunos.add(aluno1);
		
		}
		
		//percorrendo a lista alunos
		for (int pos = 0; pos < alunos.size(); pos++) {
			
			Aluno aluno = alunos.get(pos);
			System.out.println("o Aluno = "+aluno.getNome());
			System.out.println("A média é = "+aluno.getMediaNota());
			System.out.println("Resultado = "+aluno.getAlunoAprovado2());
			System.out.println("------------------------------------------");
		
			for(int posD = 0; posD < aluno.getDisciplinas().size(); posD++) {
				Disciplina disc = aluno.getDisciplinas().get(posD);
				System.out.println("Materia = "+disc.getDisciplina()+" "+ " Nota = "+ disc.getNota());
				System.out.println("***************************************");
				
			}
			
			
		}
		
		//outro tipo de liasta Usando maps
		
		System.out.println("++++++++++++++++++HASHMAPS+++++++++++++++++++++++++++++++++");
		//iniciando lista maps
		maps.put(ConstantesAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(ConstantesAluno.RECUPECAO, new ArrayList<Aluno>());
		maps.put(ConstantesAluno.REPROVADO, new ArrayList<Aluno>());
		
		//adicionando na lista da classe ConstantesAluno 
		for (Aluno alunoMap : alunos) {
			if (alunoMap.getAlunoAprovado2().equalsIgnoreCase(ConstantesAluno.APROVADO)) {
				maps.get(ConstantesAluno.APROVADO).add(alunoMap);
				
			}else
				if(alunoMap.getAlunoAprovado2().equalsIgnoreCase(ConstantesAluno.RECUPECAO)) {
					maps.get(ConstantesAluno.RECUPECAO).add(alunoMap);
				}else {
					maps.get(ConstantesAluno.REPROVADO).add(alunoMap);
				}
					
			
		}
		
	System.out.println("000000000000000000000000000000000000000000000000000000000000000000000");
	System.out.println("\n------------ Lista de Alunos Aprovados MAPS--------------------------");
	//percorrendo a lista mostra no console
		for(Aluno alunoMap : maps.get(ConstantesAluno.APROVADO)) {
			System.out.println("Aluno ...:" +alunoMap.getNome()
			+ " Resultado ...:" +alunoMap.getAlunoAprovado2()+" Média...: "+alunoMap.getMediaNota());
		}
		System.out.println("\n------------ Lista de Alunos Recuperação ------------");
		//percorrendo a lista mostra no console
		for(Aluno alunoMap : maps.get(ConstantesAluno.RECUPECAO)) {
			System.out.println("Aluno ...:" +alunoMap.getNome()
			+"Resultado ...: "+alunoMap.getAlunoAprovado2()+"Média...: "+alunoMap.getMediaNota());
			
		}
		
		System.out.println("\n------------ Lista de Alunos Reprovados ------------");
		//percorrendo a lista mostra no console
		for(Aluno alunoMap : maps.get(ConstantesAluno.REPROVADO)) {
			System.out.println("Aluno ...: "+alunoMap.getNome()
			+"Resultado ...: "+alunoMap.getAlunoAprovado2()+ " Média...: "+alunoMap.getMediaNota());
		}
		
		
		
		
		
		
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		
		System.out.println("ººººººººººººººººº LISTAS ºººººººººººººººººººººººººººººººººº");
		System.out.println("ººººººººººººººººººººººººººººººººººººººººººººººººººº");
		//utilizando lista de alunos Aprovados, Recupeção e Reprovados
		
		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(ConstantesAluno.APROVADO)) {
				alunosAprovados.add(aluno);
				
			}else
				if(aluno.getAlunoAprovado2().equalsIgnoreCase(ConstantesAluno.RECUPECAO)) {
					alunosRecupecao.add(aluno);
				}else {
					alunosReprovados.add(aluno);
				}
					
			
		}
		
		System.out.println("------------ Lista de Alunos Aprovados ------------");
		
		for(Aluno aluno : alunosAprovados) {
			System.out.println("Aluno ...:" +aluno.getNome()+ " Resultado ...:" +aluno.getAlunoAprovado2()+" Média...: "+aluno.getMediaNota());
		}
		
		System.out.println("------------ Lista de Alunos Recuperação ------------");
		
		for(Aluno aluno : alunosRecupecao) {
			System.out.println("Aluno ...:" +aluno.getNome()+ " Resultado ...:" +aluno.getAlunoAprovado2()+" Média...: "+aluno.getMediaNota());
		}
		
		System.out.println("------------ Lista de Alunos Reprovados ------------");
		
		for(Aluno aluno : alunosReprovados) {
			System.out.println("Aluno ...:" +aluno.getNome()+ " Resultado ...:" +aluno.getAlunoAprovado2()+" Média...: "+aluno.getMediaNota());
		}
		
		
		
		//mostrando os dados no console utlizando listas
		
		
		
		
		/**
		//depois adicionar os alunos na lida add(aluno1) for para percorrer a lista alunos
		for (Aluno aluno : alunos) {
			
			//pprocurando pelo nome do aluno para efetuar media e se esta aprovafo 
			String procuraAluno = JOptionPane.showInputDialog("Digite o nome do aluno que você esta procurando :");
			//usando condição if para pegar o nome equalsIgnoreCase tanto faz maiusculo ou minusculo
			if(aluno.getNome().equalsIgnoreCase(procuraAluno)) {
			
			System.out.println(aluno);
			System.out.println("Sua Média é :" +aluno.getMediaNota());
			System.out.println("Resultado foi :"+aluno.getAlunoAprovado2());
			System.out.println("\n-------------------------------------------------------");
			break;
			}
		}
		**/
		//depois adicionar os alunos na lida add(aluno1) for para percorrer a lista alunos
		/*
		for (Aluno aluno : alunos) {
			String removeAluno = JOptionPane.showInputDialog("Deseja Remover qualç aluno ?");
			if(aluno.getNome().equalsIgnoreCase(removeAluno)) {
				alunos.remove(aluno);
				break;
			}else {
				System.out.println(aluno);
				System.out.println("Sua Média é :" +aluno.getMediaNota());
				System.out.println("Resultado foi :"+aluno.getAlunoAprovado2());
				System.out.println("\n-------------------------------------------------------");
				
			}
			
			
			
			
		}
		*/
		
		// em caso se remover vai mostrar alunos que estão na lista
	
	
		/**
		for (Aluno aluno : alunos) {
			
			System.out.println("Alunos que sobraram na lista ");
			System.out.println("Aluno  :" +aluno.getNome());
			System.out.println("sua média é :"+aluno.getMediaNota());
			System.out.println("Resultado foi :"+aluno.getAlunoAprovado2());
			System.out.println("Suas disciplinas são :  ");
			
		
		for(Disciplina disciplina : aluno.getDisciplinas()) {
			System.out.println(disciplina.getDisciplina());
			
		}
		
	
		
		System.out.println("Sua média é : "+aluno1.getMediaNota());
		System.out.println("Resultado foi : " +( aluno1.getAprovadoReprovado() ? "Aprovado" : "Reprovado" ));
		System.out.println("Resultado 2 foi : "+(aluno1.getAlunoAprovado2()));
	
	
		
		
		
	
		
	}*/

		}
		
	}
}
