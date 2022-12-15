package aula;

public class MetodoParametro2 {
	static void metodo(String fname, int age) {
		System.out.println(fname + " is " + age);
	}
	
	public static void main(String[] args) {
		metodo("Liam", 5);
		metodo("Jenny", 8);
		metodo("Anja", 31);
	}

}
