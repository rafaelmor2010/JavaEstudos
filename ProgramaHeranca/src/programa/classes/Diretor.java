package programa.classes;

//heran?a usando extends Pessoa
//Classe filha de Pessoa
public class Diretor  extends Pessoa{
	
	private String registroEducacao;
	private String tempoDirecao;
	private String titulacao;
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public String getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(String tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao + ", tempoDirecao=" + tempoDirecao + ", titulacao="
				+ titulacao + ", nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", dataNascimento="
				+ dataNascimento + ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae="
				+ nomeMae + ", nomePai=" + nomePai + "]";
	}
	
	//sobrescrevendo da classe pai Pessoa
	@Override
	public boolean maiorIdade() {
		// TODO Auto-generated method stub
		return super.maiorIdade();
	}

	
	public String msMaiorIdade() {
		
		return this.maiorIdade()? "Diretor tem maior idade " : "Diretor ? menor de idade"; 
	}
	
	//-----------------------------------------------------------------------------------
	//sobrescrevendo da classe pai Pessoa
	@Override
	public double salario() {
		
		return 4000.00;
	}
}
