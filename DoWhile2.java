package aula;

import java.util.Scanner;

public class DoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, s =0; 
		String resp;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.println("Digite um valor");
			n = teclado.nextInt();
			s += n;
			System.out.println("Deseja continuar? (s/n)");
			resp = teclado.next();
			
		} 
		while(resp.equals("s"));
		System.out.println("A resposta é: "+s);

	}

}
