package ExercicioPoo;

public class ModeloFuncionario {
	
	int idade;
	String sexo, cargo;
	double salario;
	boolean presente,entrega;
	
	public ModeloFuncionario(int i, String s, String c, double sa, boolean p,boolean e){
		this.idade=i;
		this.sexo=s;
		this.cargo=c;
		this.salario=sa;
		this.presente=p;
		this.entrega=e;
	}
	
	public void presente() {
		this.presente=true;
	}
	
	public void falta() {
		this.presente=false;
	}
	
	public void entregou() {
		this.entrega=true;
	}
	
	public void naoentregou() {
		this.entrega=false;
	}
	
	public void estado() {
		System.out.println("Idade: "+this.idade);
		System.out.println("Sexo: "+this.sexo);
		System.out.println("Cargo: "+this.cargo);
		System.out.println("Salário: R$"+this.salario);
		System.out.println("Entregou a tarefa? "+this.entrega);
		System.out.println("Foi para o trabalho hoje? "+this.presente);
		System.out.println("\n");
	}

}
