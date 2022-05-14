package programa.classes;

import programa.interfaces.PermitirAcesso;

// herdando da classe pessoa
//herança usando extends Pessoa
//Classe filha de Pessoa
//implements PermitirAcesso é uma interface
public class Secretario extends Pessoa implements PermitirAcesso{
	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	//private String login;
	//private String senha;
	
	
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
	
	// metodo de contrato de autenticação interface
	// classe Permitir acesso apenas secretario tem acesso

	/*
	@Override
public boolean autenticar() {
	//login e senha 
	return login.equals("admin") && senha.equals("admin") ;
}*/
	
/*	

//----------------------------------------------------
public String getLogin() {
	return login;
}
public void setLogin(String login) {
	this.login = login;
}

//-----------------------------------------------------
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
*/

@Override
public boolean autenticar(String login, String senha) {

	return login.equals("admin") && login.equals("admin");
}
	
	
	
	
}
