package Desafio_Contador;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		//Projeto concluido
		
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);	
		}
		catch (ParametrosInvalidoException e) {
			System.out.println("O SEGUNDO PARAMETRO DEVE SER MAIOR QUE O PRIMEIRO!");
		}
		
		terminal.close();
		
	}
	
	
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidoException {
		if(parametroDois <= parametroUm) 
			throw new ParametrosInvalidoException();
		
		int contagem = parametroDois - parametroUm;
		for(int i = 1; i <= contagem;i++) {
			System.out.println("imprimindo o número "+ i+"!");
		
		}
		
		
	}
}