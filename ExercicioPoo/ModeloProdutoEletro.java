package ExercicioPoo;

public class ModeloProdutoEletro {
	
	String tipo;
	String modelo;
	int bateria;
	boolean ligar, usar;
	double preco;
	
	public ModeloProdutoEletro(String t, String m, int b, double p, boolean l) {
		
		this.tipo=t;
		this.modelo=m;
		this.bateria=b;
		this.preco=p;		
		this.ligar=l;
	}
	
	public void ligado() {
		this.ligar=false;
	}
	
	public void desligado() {
		this.ligar=false;
	}
	
	public void usar() {
		if(ligar=false) 
			System.out.println("Não dá para usar");
		else
			System.out.println("Usando");
	}
	
	public void estado() {
		System.out.println("Tipo: "+this.tipo);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Bateria: "+this.bateria+"%");
		System.out.println("Preco: R$"+this.preco);
		System.out.println("\n");
	}

}
