package aula;

public class MatrizNome {

	public static void main(String[] args) {
	
		String carros[][] = {{ "Corsa", "Ford-K", "Uno", "Gol"}, {"Corsa", "Fiat", "Pegeot"}};
	    
//		for (String[] i : carros) {
//	    	System.out.println(i);
//	    }
	    
	    for (int i = 0; i < carros.length; i++) {
	    	for (int j = 0; j < carros.length; j++) {
	    		System.out.println(carros[i][j]);
	    	}
	    }
	}
}
