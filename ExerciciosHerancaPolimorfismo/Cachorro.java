package ExerciciosHerancaPolimorfismo;

public class Cachorro extends Animal {
	
	private String correr;
	
	@Override
	public void somAnimal() {//Polimorfismo
		System.out.println("AuAuAu");
		
	}
	
	public void correr() {
		System.out.println("Correndo");
	}
	
	public void parado() {
		System.out.println("Parado");
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
		System.out.println("Situa��o: "+this.isCorrer());
		System.out.println("\n");
	}

}
