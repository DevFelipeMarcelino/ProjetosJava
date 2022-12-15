package aula;

import java.util.Scanner;

public class MetodoReturnMultiplicacao {

	public static int multi(int x, int y) {
		return x * y;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor");
		int x = sc.nextInt();
		
		System.out.println("Digite outro valor");
		int y = sc.nextInt();
		
		System.out.println(multi(x,y));
	}

}
