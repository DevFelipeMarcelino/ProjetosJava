package aula;

public class MetodoParametro22 {
	static void metodo(String nome, int idade) {
		System.out.println(nome + " tem " + idade + " anos");
	}
	
	public static void main(String[] args) {
		metodo("Felipe", 19);
		metodo("Pedro", 19);
		metodo("Gustavo", 19);
	}

}
