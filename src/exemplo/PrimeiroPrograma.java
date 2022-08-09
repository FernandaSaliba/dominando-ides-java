package exemplo;

import exemplo.project.proj1;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		proj1 Proj1 = new proj1();
		Livros livros = new Livros();
		
		System.out.println(Proj1);
		System.out.println(livros);
		/*int a = 2;
		int b = 3;
		System.out.println("hello world!");*/

	}

}

class Livros {
	private String nome;
	private String npag;
}