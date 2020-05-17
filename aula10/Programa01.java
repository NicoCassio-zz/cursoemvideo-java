package aula10;

import java.util.Scanner;

public class Programa01 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int anoNasc, idade;
		System.out.print("Ano de Nascimento: ");
		anoNasc = input.nextInt();
		idade = 2020 - anoNasc;
		if(idade < 16) {
			System.out.println("Não vota");
		} else if(idade < 18 || idade >= 70) {
			System.out.println("Voto opicional");
		} else {
			System.out.println("Voto obrigatório");
		}
	}
}
