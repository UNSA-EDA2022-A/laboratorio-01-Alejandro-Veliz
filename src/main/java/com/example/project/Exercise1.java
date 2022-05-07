package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.convertirBaseGabriel(n));			
		}
	}

	public String convertirBaseGabriel(int a) {
		int l = (String.valueOf(a)).length();
		int[] numero = new int[l];
		for (int i = 0; i < l; i++) {
			int digit = a % 10;
			numero[i] = digit;
			a = a / 10;
		}
		int conv = 0;
		if (filtros(numero, l)) {
			for (int i = 0; i < numero.length; i++)
				conv = (int) (conv + numero[i] * (Math.pow(2, i + 1) - 1));
			return String.valueOf(conv);
		} else
			return "El numero proporcionado no esta en base Gabriel.";
	}
	
	public static boolean filtros(int[] num, int a) {
		int cont2 = 0;
		a--; // índice del arreglo
		for (int i = 0; i < num.length; i++) {
			if (num[i] == 2)
				cont2++;
			if (num[i] > 2 || cont2 > 1)
				return false;
		}
		if (cont2 == 0 || num[0] == 2 || (num[0] == 0 && num[1] == 2))
			return true;
		else
			return false;
	}
}
