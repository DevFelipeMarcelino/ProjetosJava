package aula;

import java.util.Scanner;

public class calculadora {

	public static float divisao(float x, float y) {
		return x / y;
	}
	public static int soma(int x, int y) {
		return x + y;
	}
	public static int subtracao(int x, int y) {
		return x - y;
	}
	public static int multiplicacao(int x, int y) {
		return x * y;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a operação desejada:");
		System.out.println("1-Soma | 2-Subtração | 3-Multiplicação | 4-Divisão:");
		int numero = sc.nextInt();
		
		switch(numero) {
		case 1:
			System.out.println("Digite um valor");
			int x = sc.nextInt();
			System.out.println("Digite outro valor");
			int y = sc.nextInt();
			System.out.println(soma(x,y));
			break;
			
		case 2:
			System.out.println("Digite um valor");
			int valor1 = sc.nextInt();
			System.out.println("Digite outro valor");
			int valor2 = sc.nextInt();
			System.out.println(subtracao(valor1,valor2));
			break;
			
		case 3:
			System.out.println("Digite um valor");
			int valor3 = sc.nextInt();
			System.out.println("Digite outro valor");
			int valor4 = sc.nextInt();
			System.out.println(multiplicacao(valor3,valor4));
			break;
			
		case 4:
			System.out.println("Digite um valor");
			int valor5 = sc.nextInt();
			System.out.println("Digite outro valor");
			int valor6 = sc.nextInt();
			System.out.println(divisao(valor5,valor6));
			break;
		}
	}


}
