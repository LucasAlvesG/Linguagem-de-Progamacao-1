package AULA10DO02;

public class aluno {
	
	String nome;
	String genero;
	int idade;
	
	public static int gerarIdade(int min, int max) {
		int i = (int)((Math.random() * (max-min))+min);
		return i;
	}
	public static String passarParaMaiscula(String nome) {
		return nome.toUpperCase();
	}
}
