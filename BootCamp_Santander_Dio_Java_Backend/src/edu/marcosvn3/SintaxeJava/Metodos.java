package edu.marcosvn3.SintaxeJava;

public class Metodos {
	
	//Ex metodo:
	public static void mensagem(){
        System.out.println("Curso Java Progressivo!");
    }

	public static void main(String[] args) {
		//Metodos são como uma ação que a classe pode exercer
		// Estrutura:
			//TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

		//Ex:
			//int somar (int numeroUm, int numero2)
			//String formatarCep (long cep)
		
		//OBS:Como parte da estrutura de declaração de variáveis e métodos,
		//também temos o aspecto da visibilidade, mas ainda não é necessário nesta etapa de estudos.
		
		
		System.out.print("Exibindo a mensagem uma vez: ");
		//chamando metodo:
        mensagem();
	}

}
