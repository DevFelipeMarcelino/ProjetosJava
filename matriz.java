package aula;

public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] [] numero= {{1,2,3},{4,5,6}};
		
		System.out.println(numero [0][2]);
		System.out.println(numero [1][1]);
		
		numero [0] [0] = 6;
		numero [0] [1] = 5;
		numero [0] [2] = 4;
		
		numero [1] [0] = 1;
		numero [1] [1] = 2;
		numero [1] [2] = 3;
		
		System.out.println(numero [1][1]);

	}

}
