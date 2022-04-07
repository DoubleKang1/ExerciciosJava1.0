package ExercicioPoo;

public class ProdutoEletro {

	public static void main(String[] args) {
		
		ModeloProdutoEletro m1 = new ModeloProdutoEletro("Celular","A30s",84,1376,true);	
		ModeloProdutoEletro m2 = new ModeloProdutoEletro("Alto falante","Partybox 310",100,3620,false);
		
		m1.estado();
		m2.estado();

	}

}
