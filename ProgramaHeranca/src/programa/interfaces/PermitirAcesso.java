package programa.interfaces;


//Essa interface ser� o contrato de autentica��o
public interface PermitirAcesso {
	
	//public boolean autenticar();//apenas declara��o do m�todo
	public boolean autenticar(String login, String senha);

}
