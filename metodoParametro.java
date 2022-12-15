package aula;

public class metodoParametro {

		static void nome(String fname) {
			System.out.println(fname + "Silva");
		}
		public static void main(String[] args) {
			nome("Liam");
			nome("Jenny");
			nome("Felipe");
			idade("Felipe");
			idade("Matheus");
			idade("Isaac");
		}
		
		 static void idade(String fname) {
			System.out.println(fname + " 10 anos");
		}
	}


