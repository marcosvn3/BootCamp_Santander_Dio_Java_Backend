package edu.marcosvn3.ControleFluxo;

public class CondicionalSimples {

	public static void main(String[] args) {
		//Condicional simples
		//Quando ocorre uma validação de execução de fluxo, somente quando a condição for positiva!
		
		double saldo = 25.0;
	       double valorSolicitado = 17.0;

	       if(valorSolicitado < saldo)
	        saldo = saldo - valorSolicitado;
	        System.out.println(saldo);
	        
	    
	   	}

}
