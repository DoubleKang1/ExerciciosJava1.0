package ExercicioPoo;

public class ModeloPaciente {
	String nome, sexo, sit;
	int idade;
	boolean al,ac;
	
	public void alergico() {
		this.al=true;
	}
	
	public void naoalergico() {
		this.al=false;
	}
	
	public void acordado() {
		this.ac=true;
	}
	
	public void desacordado() {
		this.ac=false;
	}
	
	public void estado() {
		System.out.println("\n");
		System.out.println("Dados do paciente: ");
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("Estado do paciente: "+this.sit);
		System.out.println("Paciente é alérgico há algum medicamento?: "+this.al);
		System.out.println("Paciente está acordado: "+this.ac);
	}




}
