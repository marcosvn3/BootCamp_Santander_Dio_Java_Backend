package edu.ControleFluxo.EstruturasExcepcionais;
import java.util.Scanner;


public class TratandoExceções {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Exçeções
		//Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro.
		//O termo técnico para isso é: Java lançará uma exceção (jogará um erro).

		//Temos 3 instruções para tratar exceção
		/*	A instrução try, permite que você defina um bloco de código, para ser testado quanto a erros enquanto está sendo executado.
		 *	A instrução catch, permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.
		 *	A instrução finally, permite definir um bloco de código a ser executado, independente de ocorrer um erro ou não
		 */
		
		try {
			  //  bloco de código conforme esperado
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Digite seu nome: ");
			String nome = input.next();
			
			System.out.println("Digite sua idade: ");
			int idade = input.nextInt();
			
			System.out.println("Concluido com sucesso!");
			System.out.println("Nome:"+nome+" Idade:"+idade);
			}
		catch(Exception e) {// precisamos saber qual exceção
			  // bloco de código que captura as exceções que podem acontecer
			  // em caso de um fluxo não previsto
			System.out.println("Idade deve ser valor numerico");
			}
	}

}
