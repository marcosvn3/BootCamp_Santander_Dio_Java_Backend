package edu.marcosvn3.Desafios;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Desafio_BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Valor inicial!");
        double valorInicial = scanner.nextDouble();
        
        System.out.println("Taxa de juros");
        double taxaJuros = scanner.nextDouble();
        
        System.out.println("Periodo");
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial*(Math.pow(1+taxaJuros,periodo));

        
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        
        System.out.println(String.format("Valor final do investimento: R$ %.2f", valorFinal));
        
        scanner.close();
    }
}
