package ExerciciosHerancaPolimorfismo;

public class Preguiça extends Animal{
	
	private String subir;
	
	public void subindo() {
	}
	
	public void parada() {
		
	}

	public String isSubir() {
		return subir;
	}

	public void setSubir(String subir) {
		this.subir = subir;
	}
	
	public void estado() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Idade: "+this.getIdade());
		System.out.println("Som: "+this.getSom());
		System.out.println("Situação: "+this.isSubir());
		System.out.println("\n");
	}

}
