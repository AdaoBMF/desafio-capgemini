package com.capgemini.questao1;

public class Stairway {
	static String output = "";
	static String gap = "";

	public static void stairway(int n) {
		int count = 1;
		if (n <= 0) {
			System.out.println("Valor inválido");
			return;
		} else if (n == 1) {
			System.out.println("*");
			return;
		}

		while (n >= count) {
			gap = "";
			output = "";
			for (int i = 0; i < n - count; i++) {
				gap += " ";
			}
			for (int i = 0; i < count; i++) {
				output += "*";
			}
			System.out.println(gap + output);
			count++;
		}
	}
}
