package ExercicioLacoRepeticao;

import java.util.Scanner;
import java.util.Random;

public class Exercicio4 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner leia = new Scanner(System.in);
		int i = 0, n, n1, n2, cont = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0;
		
		while(i<150) {
			i++;
			
			n = random.nextInt(100) +10;
			
			n1 = random.nextInt(3) + 1;
						
			n2 = random.nextInt(3) + 1;
			
			System.out.println("\nPessoa "+i);
			
			System.out.println("Sua idade: "+n);
			
			System.out.println("Seu sexo: "+n1);
			
			System.out.println("Seu temperamento: "+n2);
			
			if(n2 == 1) {
				cont++;
			}
			if(n1 == 1 && n2 == 2) {
				cont2++;
			}
			if(n1 == 2 && n2 == 3) {
				cont3++;
			}
			if(n1 == 3 && n2 == 1) {
				cont4++;
			}
			if(n > 40 && n2 == 2) {
				cont5++;
			}
			if(n < 18 && n2 == 1) {
				cont6++;
			}
			
			
		}
		
		System.out.println("\nNúmero de pessoas calmas: "+cont);
			
		System.out.println("Número de mulheres nervosas: "+cont2);
			
		System.out.println("Número de homens agressivos: "+cont3);
		
		System.out.println("Número de outros calmos: "+cont4);
		
		System.out.println("Número de pessoas nervosas com mais de 40 anos: "+cont5);
		
		System.out.println("Número de pessoas calmas com menos de 18 anos: "+cont6);
	}

}
