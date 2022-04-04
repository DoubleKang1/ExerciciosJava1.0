package ExercicioLacoRepeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i = 0, cont = 0, cont2 = 0;
		
		while(i != -99) {
			System.out.println("Informe a idade: ");
			i = leia.nextInt();
			
			if(i > 0 && i < 21) {
				cont++;
			}
			else if(i > 50) {
				cont2++;
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos: "+cont);
		System.out.println("Total de pessoas com mais de 50 anos: "+cont2);

	}

}
