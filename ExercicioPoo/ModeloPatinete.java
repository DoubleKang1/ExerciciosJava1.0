package ExercicioPoo;

public class ModeloPatinete {
	String cor,tamanho,estado1;
	double preco;
	boolean mov;
	
	public ModeloPatinete(String c, String t, double p, String t1){
		this.cor=c;
		this.tamanho=t;
		this.estado1=t1;
		this.preco=p;
		this.mov=true;
		
	}
	
	public void movimentando() {
		this.mov=true;
	}
	
	public void parado() {
		this.mov=false;
	}
	
	public void estado() {
		System.out.println("Cor: "+this.cor);
		System.out.println("Tamanho: "+this.tamanho);
		System.out.println("Preço: R$"+this.preco);
		System.out.println("Estado do patinete "+this.estado1);
		System.out.println("Está em movimento? "+this.mov);
	}

}
