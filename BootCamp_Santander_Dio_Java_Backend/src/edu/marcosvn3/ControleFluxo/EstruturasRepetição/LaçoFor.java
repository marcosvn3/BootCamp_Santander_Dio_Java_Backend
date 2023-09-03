package edu.marcosvn3.ControleFluxo.EstruturasRepetição;

public class LaçoFor {

	public static void main(String[] args) {
		/*
		 * O comando for (na tradução literal para a língua portuguesa “para”) permite que uma variável contadora,
		 *  seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. 
		 * 
		 * O comando for recebe como entrada uma variável contadora,
		 * a condição para continuar a execução e o valor de incrementação.
		 */
		
		//for(tipo var = 0 ; validação de iteracao ; incrementação)
		
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}

	}

}
