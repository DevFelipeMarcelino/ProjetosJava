package aula;

import java.util.Scanner;

public class MatrizPreencher {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		byte [][] numeros = new byte[3][3];
		
		for (byte i = 0; i < numeros.length; i++) {
			for (byte j = 0; j < 3; j++) {
				System.out.println("Informe um valor: ");
				numeros[i][i] = sc.nextByte();
			}
		}
		for (byte contadora = 0; contadora < numeros.length; contadora++) {
			for (byte contadora2 = 0; contadora2 < numeros[contadora].length; contadora2++) {
				System.out.print(numeros[contadora][contadora2]);
				if (numeros [contadora].length == 3) {
					System.out.print("\n");
				}
			}
		}
		sc.close();
	}

}
