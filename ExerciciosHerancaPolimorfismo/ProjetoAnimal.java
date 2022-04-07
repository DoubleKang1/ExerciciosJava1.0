package ExerciciosHerancaPolimorfismo;

public class ProjetoAnimal {

	public static void main(String[] args) {
		Cachorro c1 = new Cachorro();
		Cavalo c2 = new Cavalo();
		Preguiça p1 = new Preguiça();
		
		c1.setNome("Pitoco");
		c1.setIdade(7);
		c1.setSom("Auauau");
		c1.setCorrer("Correndo");
		
		c2.setNome("Spirit");
		c2.setIdade(17);
		c2.setSom("Hinn in in");
		c2.setCorrer("Galopando");
		
		p1.setNome("Laís");
		p1.setIdade(5);
		p1.setSom("Fiiiiii");
		p1.setSubir("Subindo");
		
		c1.estado();
		c2.estado();
		p1.estado();

	}

}
