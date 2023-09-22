package Desafios;
import java.util.Scanner;


public class Desafio_CondicionalmenteRico {
	  public static void main(String[] args) {

	    // Entrada de dados
	    Scanner scanner = new Scanner(System.in);
	    int saldoTotal = scanner.nextInt();
	    int valorSaque = scanner.nextInt();

	    //TODO: Criar as condições necessárias para impressão da saída, vide tabela de exemplos.
		  //TODO: teste no intellij
	    int saldoDisponivel = saldoTotal - valorSaque;
	    
	    if(saldoTotal >= valorSaque){
	      System.out.println("Saque realizado com sucesso. Novo saldo: "+saldoDisponivel);
	    }else{
	      System.out.println("Saldo insuficiente. Saque nao realizado!");
	    }
	    
	    
	    scanner.close();
	  }
}
