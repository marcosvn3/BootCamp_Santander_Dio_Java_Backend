package edu.marcosvn3.SintaxeJava;

public class Tipos {
	
	public static void main(String[] args) {
		byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // Sempre termina em LetraL para definir tipo,se começar com zero, talvez tenha que ser outro tipo.
		float pi = 3.14F;// sempre termina em Letra F para definir tipo.
		double salario = 1275.33;
		
		
		// Um tipo menor pde ser atribuido a um tipo maior:
			int novaIdade = idade;
			
		//porem para um tipo maior atribuir um tipo menor é preciso fazer um CAST
		//Cast é a confirmacao de troca de tipo mesmo com perca de informacoes
		//ex:
			int novoCPF = (int) cpf;
		//                  ^
			//            |CAST|
			
	}
}
