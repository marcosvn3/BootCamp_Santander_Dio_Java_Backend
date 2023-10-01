package edu.ControleFluxo.EstruturasCondicionais;

public class SwitchCase {

	public static void main(String[] args) {
		// SwitchCase
		/*
		 * A estrutura switch, compara o valor de cada caso, com o da variável sequencialmente 
		 * e sempre que encontra um valor correspondente, executa o código associado ao caso.
		 * Para evitar que as comparações continuem a ser executadas, após um caso correspondente
		 *  ter sido encontrado, acrescentamos o comando break no final de cada bloco de códigos. 
		 * O comando break, quando executado, encerra a execução da estrutura onde ele se encontra.
		 */
		
		
		//Ex:
		
		String tamanhoAcai = "M";
		
		switch(tamanhoAcai) {
		case "P":
			System.out.println("Pequeno");
			break;
		case "M":
			System.out.println("Medio");
			break;
		case "G":
			System.out.println("Grande");
			break;
		default:
			System.out.println("Indefinido");
			
			
		}
	}

}
