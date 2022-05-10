package programa.classes;

import java.util.ArrayList;
import java.util.List;
// heran�a de pessoa utilizando extends
public class Aluno  extends Pessoa{
	//vari�veis - atributos do aluno
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	//INSTACINADO CLASSE DISCIPLINA POR <LISTA>
	private List<Disciplina> disciplina = new ArrayList<Disciplina>();
	
	//CRIANDO GETTERS E SETTERS DA <LISTA>
	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
		
	}
	
	public List<Disciplina> getDisciplina(){
		return disciplina;
	}
	
	
	
	
	// Getters e Setters do aluno
	//------------NOME----------------------------------
	
	public void setNome (String nome) {
		this.nome = nome;
				
	}
	
	public String getNome () {
		return nome;
	}
	
	//-----------IDADE---------------------------------
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	//----------SEXO------------------------------------

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	//---------DATA NASCIMENTO-------------------------------------

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	//------------RG----------------------------------

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	
	//--------------CPF--------------------------------

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	
	//----------NOME M�E------------------------------------

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	//----------NOME PAI------------------------------------

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	//-----------DATA MATRICULA-----------------------------------

	public String getDataMatricula() {
		return dataMatricula;
	}
	
	

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	//-------------NOME ESCOLA---------------------------------
	
	public String getNomeEscola() {
		return nomeEscola;
	}
	
	

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	//------------SERIE MATRICULADO----------------------------------
	
	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	//CALCULA A M�DIA 
	public double getMediaNota() {
		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplina) {
			somaNotas += disciplina.getNota();
		}
		
		//somaNotas SOMOU TODAS AS NOTAS E disciplina.size VERIFICOU QUANTIDADES DE DISCIPLINAS PARA DIVIDIR
		//ASSIM TERA RESULTADO MEDIA
		return somaNotas / disciplina.size();
		
	}
	
	// VERIFICA UMA CONDI��O DO ALUNO - APROVADO - REPROVADO - RECUPERA��O
	
	public String getCondicaoAluno() {
		double media = this.getMediaNota();
		if(media >= 50 && media <= 69) {
			return Constantes.RECUPERACAO;
		}else if(media >= 70){
			return Constantes.APROVADO;
			
		}else {
			return Constantes.REPROVADO;
		}
		
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
				+ ", serieMatriculado=" + serieMatriculado + ", disciplina=" + disciplina + "]";
	}
	
	
	//-----------------TO STRING PARA MOSTRAR NO CONSOLE OS RESULTADOS---------------------------
	
	
	
	
	
	

}
