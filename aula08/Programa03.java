package aula08;

import java.util.Scanner;

public class Programa03 {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int x, y, z;
		x = 9;
		y = 7;
		z = 12;
		boolean r = (x < y && y < z)?true:false;
		System.out.println("X é a menor varíável? " + r);
	}
}
