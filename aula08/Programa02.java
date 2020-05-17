package aula08;

import java.util.Scanner;

public class Programa02 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String n1 = "Nicolas";
		String n2 = "Nicolas";
		String n3 = new String("Nicolas");
		System.out.println("N1 e N2 são: " + ((n1 == n2)?"iguais":"diferentes"));
		System.out.println("N1 e N3 são: " + ((n1 == n3)?"iguais":"diferentes"));
		System.out.println("O conteúde N1 e N3 são: " + ((n1.equals(n3))?"iguais":"diferentes"));
	}
}
