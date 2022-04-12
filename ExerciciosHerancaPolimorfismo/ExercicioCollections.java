package ExerciciosHerancaPolimorfismo;

import java.util.ArrayList;
import java.util.Scanner;
public class ExercicioCollections {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		String p;
		int r;
		
		ArrayList<String> estoque =new ArrayList();
		
		System.out.println("Informe um produto para adicionar: ");
		p = x.next();
		estoque.add(p);
		
		do {
			
			
			System.out.println("Informe um produto para adicionar, ou digite s para sair: ");
			p = x.next();
			estoque.add(p);
			estoque.remove("s");
			
		}while (!"s".equals(p));
		
		System.out.println(estoque);
		do {
			
			System.out.println("Se deseja tirar um item da lista, informe o nome do produto, ou digite 's' para sair: ");
			p = x.next();
			estoque.remove(p);
			System.out.println(estoque);
			
		}while(!"s".equals(p));
		
		System.out.println("Deseja adicionar mais algum item? 1 - sim, 2 - não ");
		r = x.nextInt();
		if(r == 1) {
			do {
				
			System.out.println("Informe o produto: ");
			p = x.next();
			estoque.add(p);
			estoque.remove("s");
			System.out.println("Deseja adicionar mais algum item? 1 - sim, 2 = não ");
			r = x.nextInt();
			
			}while (r!=2);
			
	}	else;
		
		System.out.println("\nSeus itens: ");
		System.out.println(estoque);

	}
	}
	

	
