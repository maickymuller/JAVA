package projeto03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Integer num1, num2, num3;
		String nome;
		String sobrenome;
		int idade;

		// Objeto que realiza a leitura do teclado
		Scanner entrada = new Scanner(System.in);

		/*
		 * System.out.println("Oi, qual seu nome?"); nome = entrada.nextLine();
		 * 
		 * //System.out.println("Bem vindo " + nome + "! Digite sua idade:"); //idade =
		 * entrada.nextInt();
		 * 
		 * if (nome == "") {
		 * 
		 * System.out.println("Nome inv�lido!");
		 * 
		 * } else {
		 * 
		 * System.out.println("Ol� " + nome);
		 * 
		 * }
		 */

//		System.out.println("Digite um n�mero:");
//		num1 = entrada.nextInt();
//
//		int total = (num1 / 2) * 2;
//
//		if (total == num1) {
//
//			System.out.println("N�mero par!");
//
//		} else {
//
//			System.out.println("n�mero impar");
//		}

		
		System.out.println("Digite sua idade:");
		idade =  entrada.nextInt();
				
		if (idade < 18) {
			
			if (18 - idade >= 4) {

				System.out.println("Faltam pelo menos 4 anos para voc� tirar sua CNH!");
			}
			else {
				
				System.out.println("Falta pouco...");
			}
				
				
		} else {
			
			System.out.println("Voc� j� pode tirar sua CNH");
		}
		     
	}

}
