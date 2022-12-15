package aula;

public class Main {
	
//	static void myMethod() {
//		System.out.println("I just got executed!");
//	}
//	
//	public static void main(String[] args) {
//		myMethod();
//	}
	
	static void metodosomar() {
		
		int valor1 = 2;
		int valor2 = 10;
		
		int soma = valor1 + valor2;
		
		System.out.println("A soma é : "+soma);
	}
	
	
	static void metodosubtrair() {
		
		int valor1 = 2;
		int valor2 = 10;
		
		int sub = valor1 - valor2;
		
		System.out.println("A subtração é : "+sub);
	}
	
    static void metodomutiplicar() {
		
		int valor1 = 2;
		int valor2 = 10;
		
		int mult = valor1 * valor2;
		
		System.out.println("A subtração é : "+mult);
	}
    
    static void metododividir() {
		
		int valor1 = 2;
		int valor2 = 10;
		
		int divisao = valor1 / valor2;
		
		System.out.println("A subtração é : "+divisao);
	}
    
    static void abraco() {
    	System.out.println("Abraço");
    }
	
	public static void main(String[] args) {
		metodosubtrair();
		metodosomar();
		metodomutiplicar();
		metododividir();
		abraco();
		abraco();
		abraco();
		
	}
}
