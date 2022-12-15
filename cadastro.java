package aula;

import java.util.Scanner;

public class cadastro {
	
	static void cadastro(String nome, int idade) {
		
		System.out.println("Seu nome é: "+nome+" e a sua idade é: "+idade);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu nome");
		String nome = sc.next();
		System.out.println("Digite a sua idade");
		int idade = sc.nextInt();
		
		cadastro(nome,idade);
	}

}
	
