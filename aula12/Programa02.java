package aula12;

import java.util.Scanner;

public class Programa02 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int s = 0;
		String op;
		do {
			System.out.print("Número: ");
			s += input.nextInt();
			System.out.print("Quer continuar? [s/n]");
			op = input.next();
		}while(op.equals("s"));
		System.out.println("Soma: " + s);
	}
}
