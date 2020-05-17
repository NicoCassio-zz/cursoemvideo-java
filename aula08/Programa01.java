package aula08;

import java.util.Scanner;

public class Programa01 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int n1, n2;
		String r;
		n1 = 3;
		n2 = 9;
		r = (n1 > n2)?"sim":"não";
		System.out.println(n1 + " > " + n2 + "? " + r);
	}
}
