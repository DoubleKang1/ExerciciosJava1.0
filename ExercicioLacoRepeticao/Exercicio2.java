package ExercicioLacoRepeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int n, cont1 = 0, cont = 0;
		
		for(int x =1;x<=10;x++) {
			System.out.println("Informe um número: ");
			n = leia.nextInt();

			
			if(n%2 == 0) {
				cont++;
			}
			else {
				cont1++;
			}

		}
		System.out.println("Pares: "+cont);
		System.out.println("ímpares: "+cont1);

	}

}
