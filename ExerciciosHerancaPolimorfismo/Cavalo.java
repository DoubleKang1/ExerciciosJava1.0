package ExerciciosHerancaPolimorfismo;

public class Cavalo extends Animal {
	
	private String correr;
	
	@Override
	public void somAnimal() {//Polimorfismo
		System.out.println("Ihiiiim");
		
	}
	
	public void galopando() {
		
	}
	
	public void parado() {
		
	}

	public String isCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void estado() {
		System.out.println("Nome: "+this.getNome());
		System.out.println("Idade: "+this.getIdade());
		System.out.println("Situação: "+this.isCorrer());
		System.out.println("\n");
	}
	

}
