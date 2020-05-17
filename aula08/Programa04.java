package aula08;

import java.util.Scanner;

public class Programa04 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Ano de Nascimento: ");
		int anoNasc = input.nextInt();
		int idade = 2020 - anoNasc;
		String sit = ((idade >= 16 && idade < 18) || (idade >= 70))?"OPICIONAL":"NÃO OPICIONAL";
		System.out.println("Idade: " + idade);
		System.out.println("Situação: Voto " + sit);
	}
}
