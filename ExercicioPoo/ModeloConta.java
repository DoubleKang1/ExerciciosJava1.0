package ExercicioPoo;

public class ModeloConta {
	
	String nome,email;
	double valor;
	int cpf,idade;
	boolean divida;
	
	public void devendo() {
		this.divida=true;
	}
	
	public void limpo() {
		this.divida=false;
	}
	
	public void estado() {
		System.out.println("\n");
		System.out.println("Dados do cliente atualizados: ");
		System.out.println("Nome: "+this.nome);
		System.out.println("Email: "+this.email);
		System.out.println("CPF: "+this.cpf);
		System.out.println("Idade: "+this.idade);
		System.out.println("Saldo: "+this.valor);
		System.out.println("Cliente possui dívidas?: "+this.divida);
	}
	
	
}
