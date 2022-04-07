package ExercicioPoo;

import java.util.Scanner;
public class Conta {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		ModeloConta modelo = new ModeloConta();
		
		System.out.println("Nome do cliente: ");
		modelo.nome = ler.next();
		
		System.out.println("Email: ");
		modelo.email = ler.next();
		
		System.out.println("CPF: ");
		modelo.cpf = ler.nextInt();
		
		System.out.println("Idade: ");
		modelo.idade = ler.nextInt();
		
		System.out.println("Valor a ser inserido: ");
		modelo.valor = ler.nextDouble();
		
		modelo.estado();
		
		
		
		
		
	

	}

}
