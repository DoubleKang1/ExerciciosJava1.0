package ExerciciosHerancaPolimorfismo;

public class ProjetoAnimal {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		Cavalo c2 = new Cavalo();
		Pregui�a p1 = new Pregui�a();
		
		c1.setNome("Pitoco");
		c1.setIdade(7);
		c1.setCorrer("Correndo");
		
		c2.setNome("Spirit");
		c2.setIdade(17);
		c2.setCorrer("Galopando");
		
		p1.setNome("La�s");
		p1.setIdade(5);
		p1.setSubir("Subindo");
		
		c1.somAnimal();//Polimorfismo
		c1.estado();
		
		c2.somAnimal();//Polimorfismo
		c2.estado();
		
		p1.somAnimal();//Polimorfismo
		p1.estado();
	}	

}
