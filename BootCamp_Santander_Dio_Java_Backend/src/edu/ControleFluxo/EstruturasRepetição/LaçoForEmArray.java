package edu.ControleFluxo.EstruturasRepetição;

public class LaçoForEmArray {

	public static void main(String[] args) {
		/*
		 * tipo é o tipo de dados dos elementos do array.
			variável é o nome da variável que será usada para armazenar cada elemento do array.
			array é o nome do array ou coleção que será percorrido.
			Por exemplo, se você tiver um array de inteiros chamado numeros, você pode percorrê-lo usando um laço 
			for da seguinte maneira:
			
			for (tipo varialvel ; validacao ; incremento) {
    				// código a ser executado
			}
			
			ou
			
			for (tipo variável : array) {
    			// código a ser executado
			}		
		 
		 */
		
		int[] numeros = {1, 2, 3, 4, 5};

		for(int i = 0; i <numeros.length ;i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println("+==================+");
		
		for (int numero : numeros) {
		    System.out.println(numero);
		}
		
	}

}
