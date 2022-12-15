package aula;

import java.util.Scanner;

public class MetodoReturnDivisao {

	public static float divisao(float x, float y) {
		return x / y;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int x = sc.nextInt();
		
		System.out.println("Digite um valor");
		int y = sc.nextInt();
		
		System.out.println(divisao(x,y));
	}
}
