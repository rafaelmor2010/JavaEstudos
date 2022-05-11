package programa.classes;

// herdando da classe pessoa
//herança usando extends Pessoa
//Classe filha de Pessoa
public class Secretario extends Pessoa  {
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	
	
	//Getters e Setters
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + "]";
	}
	
	//sobrescrevendo da classe pai Pessoa
	@Override
	public boolean maiorIdade() {
		// TODO Auto-generated method stub
		return super.maiorIdade();
	}
	
	public String msMaiorIdade() {
		
		return this.maiorIdade()?"Secretário é maior de idade " : "Secretário é menor de idade";
	}
//---------------------------------------------------------------------
	//sobrescrevendo da classe pai Pessoa
	@Override
	public double salario() {
		
		return 2500.00;
	}
	
	
	
	
}
