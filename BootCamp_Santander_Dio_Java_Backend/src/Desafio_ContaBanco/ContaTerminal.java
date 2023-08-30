package Desafio_ContaBanco;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		// TODO 
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite seu numero: ");
		int numeroCliente = input.nextInt();
		
		System.out.println("Digite sua agência: ");
		String agenciaCliente = input.next();
		
		System.out.println("Digite seu nome: ");
		String nomeCliente = input.next();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenomeCliente = input.next();
		
		System.out.println("Digite o saldo desejado: ");
		System.out.println("Usar virgula como separador decimal. ex: 0,01");
		double saldoCliente = input.nextDouble();
		
		
		System.out.println("Ola "+ nomeCliente +" "+ sobrenomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia e "
				+ agenciaCliente +", conta "+ numeroCliente +" e o seu saldo de: "+ saldoCliente +"R$ ja esta disponivel para saque!");
		
		input.close();
	}

}
