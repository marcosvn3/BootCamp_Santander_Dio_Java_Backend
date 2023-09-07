package edu.marcosvn3.Desafios;

import java.util.Scanner;

public class Desafio_EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
       
        double valorAtualizado = (saldoAtual+valorDeposito) - valorRetirada;
        
     //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).
     
        System.out.println(String.format("Saldo atualizado na conta: %.1f",valorAtualizado));
        
        scanner.close();
    }
}