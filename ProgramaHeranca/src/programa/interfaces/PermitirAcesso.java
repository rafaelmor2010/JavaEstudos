package programa.interfaces;


//Essa interface será o contrato de autenticação
public interface PermitirAcesso {
	
	//public boolean autenticar();//apenas declaração do método
	public boolean autenticar(String login, String senha);

}
