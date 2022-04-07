package ExercicioPoo;

import java.util.Scanner;
public class Paciente {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		ModeloPaciente p = new ModeloPaciente();
		
		System.out.println("Nome do cliente: ");
		p.nome = ler.next();
		
		System.out.println("Idade: ");
		p.idade = ler.nextInt();
		
		System.out.println("Estado do paciente: ");
		p.sit = ler.next();
		
		
		p.estado();
		
		
		
		
		
	

	}

}