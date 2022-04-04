package ExercicioLacoRepeticao;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, soma = 0;
		
		do {
			System.out.println("Informe um número: ");
			n = leia.nextInt();
			
			soma +=n;
			
		}while(n != 0);
		
		System.out.println(soma);
	}

}
