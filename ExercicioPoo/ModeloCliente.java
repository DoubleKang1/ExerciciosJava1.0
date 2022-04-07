package ExercicioPoo;

public class ModeloCliente {
	
	String sexo;
	int idade, capacidade;
	boolean compra;
	
	public ModeloCliente(String s, int i, boolean c) {
		
		this.sexo=s;
		this.idade=i;
		this.compra=c;
		
	}
	
	public void comprar() {
		this.compra=true;
	}
	public void naocomprar() {
		this.compra=false;
	}
	
	public void estado() {
		
		System.out.println("Sexo: "+this.sexo);
		System.out.println("Idade: "+this.idade);
		System.out.println("O produto foi comprado?: "+this.compra);
		
	}

}
