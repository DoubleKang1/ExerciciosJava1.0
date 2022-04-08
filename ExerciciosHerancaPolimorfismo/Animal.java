package ExerciciosHerancaPolimorfismo;

public class Animal {
	
	private String nome,som;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void somAnimal() {//Polimorfismo
		System.out.println("Ruído");
		
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	

}
