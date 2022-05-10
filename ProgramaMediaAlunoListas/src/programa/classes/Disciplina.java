package programa.classes;

public class Disciplina {
	 
	private String disciplina;
	private double nota;
	
	
	//--------------DISCIPLINA------------------------------
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	//--------------NOTA------------------------------
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	//--TO STRING MOSTRAR RESULTADO NO CONSOLE
	@Override
	public String toString() {
		return "Disciplina [disciplina=" + disciplina + ", nota=" + nota + "]";
	}
	
	
	
	
	
	

}
