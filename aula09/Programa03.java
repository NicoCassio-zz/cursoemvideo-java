package aula09;

import java.util.Scanner;

public class Programa03 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int valor;
		System.out.print("Valor: ");
		valor = input.nextInt();
		if(valor % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
	}
}
