package aula;

import java.util.Scanner;

public class Metodo3 {
	
	static void soma(int a, int b) {
		
		
		int s = a + b;
		System.out.println("A soma é "+s);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		int valor2 = sc.nextInt();
		soma(valor1,valor2);
	}

}
