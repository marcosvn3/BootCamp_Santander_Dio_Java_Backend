package edu.SintaxeJava.Operadores;

public class Ternario {

	public static void main(String[] args) {
		// O operador de condição ternária é uma forma resumida para definir uma condição e escolher por um dentre dois valores.
		//	Você deve pensar numa condição ternária, como se fosse uma condição IF normal, porém, 
		//	de uma forma em que toda a sua estrutura estará escrita numa única linha.
		//O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:
			//<Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>
		
		// classe Operadores.java
		int a, b;

		a = 5;
		b = 6;

		/* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
		if(a==b)
		   resultado = "verdadeiro";
		else
		   resultado = "falso";
		*/

		//MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
		String resultado = (a==b) ? "verdadeiro" : "false";

		System.out.println(resultado);

	}

}
