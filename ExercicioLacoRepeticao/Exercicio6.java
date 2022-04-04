package ExercicioLacoRepeticao;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);		
		float n, conta = 0, media = 0, cont = 0;
		
		do {
			System.out.println("Informe o número: ");
			n = leia.nextInt();
			
			if(n%3 == 0) {
				conta += n;
				cont++;
				media = conta/(cont-1);
			}
				
		}while(n != 0);
		
		System.out.println(media);

	}
}
	
