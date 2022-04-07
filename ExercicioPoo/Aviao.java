package ExercicioPoo;

public class Aviao {
	
	public static void main(String[] args) {
		
		ModeloAviao a1 = new ModeloAviao("Grande","Airbus A380",100,true,853);
		ModeloAviao a2 = new ModeloAviao("Pequeno","Cessna 152",30,false,2);
		ModeloAviao a3 = new ModeloAviao("Médio","Boeing 737",57,false,149);
		
		a1.estado();
		a2.estado();
		a3.estado();
		
	}

}
