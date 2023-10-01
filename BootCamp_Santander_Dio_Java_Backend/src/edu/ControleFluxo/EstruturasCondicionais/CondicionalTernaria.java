package edu.ControleFluxo.EstruturasCondicionais;

public class CondicionalTernaria {

	public static void main(String[] args) {
		//Condição ternária
		
		/*
		 * podemos abreviar nosso algoritmo condicional, refatorando com o conceito de operador ternário.
		 */
		
		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);
		
		
		// Ex2:
		int nota2 = 6;
		String resultado2 = nota2 >=7 ? "Aprovado" : nota2 >=5 && nota2 <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado2);
	}

}
