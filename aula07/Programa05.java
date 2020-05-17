package aula07;

import java.util.Scanner;

public class Programa05 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		float v = 8.3f;
		int ab = (int) Math.floor(v);
		int ac = (int) Math.ceil(v);
		int a = (int) Math.round(v);
		System.out.println(v + " arredondado aritméticamente: " + a);
		System.out.println(v + " arredondado pra baixo: " + ab);
		System.out.println(v + " arredondado pra cima: " + ac);
	}
}
