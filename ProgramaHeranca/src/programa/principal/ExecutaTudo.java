package programa.principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;



import programa.classes.Aluno;
import programa.classes.Constantes;
import programa.classes.Disciplina;
import programa.classes.Secretario;
import programa.interfaces.PermitirAcesso;

public class ExecutaTudo {
	public static void main(String[] args) {
		
		// iniciando para menizar erro no sistema try catch
		try {
		
		String login = JOptionPane.showInputDialog("Digite o login ");
		String senha = JOptionPane.showInputDialog("Digite a senha ");
		
		PermitirAcesso secretario = new Secretario();
		if(secretario.autenticar(login, senha)) {
		
		/*
		Secretario secretario = new Secretario();
		
		
		
		secretario.setLogin(login);
		secretario.setSenha(senha);
		*/
		//if (secretario.autenticar()) {
			
		// se for true ele acessa se false não acessa
		
		
		
		
		//instanciando Lista de Aluno
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		
		for(int qtdAluno = 1; qtdAluno <= 2; qtdAluno++ ) {
			
			String nome  = JOptionPane.showInputDialog("Digite o nome do aluno número...: "+ qtdAluno);
			String sexo  = JOptionPane.showInputDialog("Digite sexo do aluno M (Masculino)  ou F (Feminino): ");
			String idade = JOptionPane.showInputDialog("Digite a idade do aluno: ");
		String dataNascimento  = JOptionPane.showInputDialog("Digite a data nascimento: ");
			String registroGeral  = JOptionPane.showInputDialog("Digite o RG do aluno:");
			String numeroCpf  = JOptionPane.showInputDialog("Digite o CPF do aluno: ");
			String nomeMae  = JOptionPane.showInputDialog("Digite nome da mãe: ");
			String nomePai  = JOptionPane.showInputDialog("Digite nome pai: ");
			String dataMatricula = JOptionPane.showInputDialog("Digite a data matricula:");
			String nomeEscola = JOptionPane.showInputDialog("Digite o nome da escola:");
			String serieMatriculado = JOptionPane.showInputDialog("Digite serie matricula:");
			//instacinado o objeto Aluno
			Aluno aluno1 = new Aluno();
			
			aluno1.setNome(nome);
			aluno1.setSexo (sexo.charAt(0));
			aluno1.setIdade(Integer.parseInt(idade));
			aluno1.setDataNascimento(dataNascimento);
			aluno1.setRegistroGeral(registroGeral);
			aluno1.setNumeroCpf(numeroCpf);
			aluno1.setNomeMae(nomeMae);
			aluno1.setNomePai(nomePai);
			aluno1.setDataMatricula(dataMatricula);
			aluno1.setNomeEscola(nomeEscola);
			aluno1.setSerieMatriculado(serieMatriculado);
			
			
			
			//for para adicionar 4 notas 
			for(int discPos = 1; discPos <= 4; discPos++ ) {
				
				String nomeDisciplina = JOptionPane.showInputDialog("Qual nome da Disciplina..: "+discPos);
				String notaDisciplina = JOptionPane.showInputDialog("Qual é a nota..: "+discPos);
				
				//instanciando objeto Disciplina
				Disciplina disciplina = new Disciplina();
				
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.parseDouble(notaDisciplina));
				//adicionando no aluno
				aluno1.getDisciplina().add(disciplina);
				
				
				
				
			}
		
			
			//adicionando alunos na lista
			alunos.add(aluno1);
		}
			System.out.println("\n");
			
			System.out.println("---------------Adicionando Lista ---------------------------------------");
			for (Aluno aluno : alunos) {
				if(aluno.getCondicaoAluno().equalsIgnoreCase(Constantes.APROVADO)) {
				
				alunosAprovados.add(aluno);
				}else
					if(aluno.getCondicaoAluno().equalsIgnoreCase(Constantes.RECUPERACAO)) {
						alunosRecuperacao.add(aluno);
						
					}else {
						alunosReprovados.add(aluno);
					}
			}
			
			
			
			
			
			System.out.println("\n--------------Listando Alunos Aprovados----------------------------------------");
			for (Aluno aluno : alunosAprovados) {
				System.out.println("Nome do aluno...:"+aluno.getNome()+ " Média...: "+aluno.getMediaNota()+
						" a condição do aluno é...: "+aluno.getCondicaoAluno());
				
			}
			System.out.println("\n--------------Listando Alunos Recuperação----------------------------------------");
			for (Aluno aluno : alunosRecuperacao) {
				System.out.println("Nome do aluno...:"+aluno.getNome()+ " Média...: "+aluno.getMediaNota()+
						" a condição do aluno é...: "+aluno.getCondicaoAluno());
				
			}
			
			System.out.println("\n--------------Listando Alunos Reprovados----------------------------------------");
			for (Aluno aluno : alunosReprovados) {
				System.out.println("Nome do aluno...:"+aluno.getNome()+ " Média...: "+aluno.getMediaNota()+
						" a condição do aluno é...: "+aluno.getCondicaoAluno());
				
			}
			
			
			
			
			
		}else {
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}

	 // aqui erro ao processar notas
		}catch (Exception erro) {
			//tranalhando com textos - mostrar erros mensagem no sistema no JoptionPane
			StringBuilder saida = new StringBuilder();
			
			erro.printStackTrace();//imprimi no console
			//messagem de erro ou causa
			
			
			System.out.println("Mensagem de erro ..:"+erro.getMessage());
			
			//fazer um for pois comando de tratamento de erro é um array
			// getStackTrace().length se tiver 10 messagem ele mostra todas
			for(int pos = 0; pos < erro.getStackTrace().length; pos++) {
				//imprimi no console
				System.out.println("Classe de erro..:"+erro.getStackTrace()[pos].getClassName());
				System.out.println(" Linha de erro..:"+erro.getStackTrace()[pos].getLineNumber());
				System.out.println(" Método de erro..:"+erro.getStackTrace()[pos].getMethodName());
				
				//-------------------Mostra sistema erro mensagem dialog -----------------------------------------------------
				saida.append("\n Classe de erro..:"+erro.getStackTrace()[pos].getClassName());
				saida.append("\n Linha de erro..:"+erro.getStackTrace()[pos].getLineNumber());
				saida.append("\n Método de erro..:"+erro.getStackTrace()[pos].getMethodName());
				saida.append("\n Método de erro..:"+erro.getClass().getName());
			}
			// mostrar no sistema
			JOptionPane.showMessageDialog(null, "Erro ao processar notas..:"+saida.toString());
		}
		
	}
	
		
	}


