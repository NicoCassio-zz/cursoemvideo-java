package aula06;

import java.util.Scanner;

public class Programa01 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Nome: ");
		String nome = input.nextLine(); 
		System.out.print("Nota: ");
		float nota = input.nextFloat();
		System.out.printf("Nota do %s: %.2f\n", nome, nota);
	}
}
