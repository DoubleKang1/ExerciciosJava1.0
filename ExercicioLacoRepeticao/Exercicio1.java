package ExercicioLacoRepeticao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int conta, cont = 0;
		
		for(int x = 1000; x <=1999; x++) {
			
			conta = x%11;
			
			if(conta == 5)
				System.out.println(x+" dão o resto 5");
		}
				
		
	}
	
}
