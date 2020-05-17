package aula09;

import java.util.Scanner;

public class Programa02 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int anoNasc, idade;
		System.out.print("Ano de Nascimento: ");
		anoNasc = input.nextInt();
		idade = 2020 - anoNasc;
		System.out.println("Idade: " + idade);
		System.out.print("Situação: ");
		if(idade >= 18) {
			System.out.println("MAIOR");
		} else {
			System.out.println("MENOR");
		}
	}
}
