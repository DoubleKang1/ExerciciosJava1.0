package ExercicioPoo;

public class ModeloAviao {
	
	String tamanho;
	boolean voar;
	String modelo;
	int combustivel, capacidade;
	
	public ModeloAviao(String t, String m, int c, boolean v, int cp){
		
		this.tamanho=t;
		this.modelo=m;
		this.combustivel=c;
		this.voar=v;
		this.capacidade=cp;		
	}
	
	public void voando() {
		this.voar=true;
	}
	
	public void parado() {
		this.voar=false;
	}
	
	public void estado() {
		System.out.println("Tamanho: "+this.tamanho+" porte");
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Capacidade: "+this.capacidade+" assentos");
		System.out.println("Combustível: "+this.combustivel+"%");
		System.out.println("O avião está voando?: "+this.voar);
		System.out.println("\n");
	}
	 

}
