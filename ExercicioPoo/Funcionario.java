package ExercicioPoo;

public class Funcionario {

	public static void main(String[] args) {
		
		ModeloFuncionario f1 = new ModeloFuncionario(25,"Feminino","Desenvolvedor J�nior",3600,true,true);
		ModeloFuncionario f2 = new ModeloFuncionario(25,"Masculino","Estagi�rio",1100,true,false);
		
		f1.estado();
		f2.estado();
	}
	

}
