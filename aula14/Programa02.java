package aula14;

import java.util.Scanner;

public class Programa02 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
		int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for(int i = 0; i < mes.length; i++) {
			System.out.println(mes[i] + ": " + dias[i] + " dias");
		}
	}
}
