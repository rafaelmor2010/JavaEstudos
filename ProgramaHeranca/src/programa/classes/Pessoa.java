package programa.classes;

// superclasse, classe pai, classe master Pessoa tem que usar protected
// abstract impedir  n�o utilizar essa classe como objeto na classe principal n�o pode instanciar
public abstract class Pessoa {
	
	protected String  nome;
	protected int idade;
	protected char sexo;
	protected String dataNascimento;
	protected String registroGeral;
	protected String numeroCpf;
	protected String nomeMae;
	protected String nomePai;
	
	// m�todo obrigat�rio pois tem abstract
	//m�todo abstrato fica sempre na classe pai - � obrigat�rio utlizar nas classes filhas
	public abstract double salario();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	
	
	public boolean maiorIdade() {
		
		return idade >= 18;
	}
	

}
