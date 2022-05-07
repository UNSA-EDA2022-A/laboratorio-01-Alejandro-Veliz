package com.example.project;

import java.util.Scanner;

public class Exercise2 {

	public static void main(final String[] args) {

		Exercise2 obj = new Exercise2();
		Scanner sc = new Scanner(System.in);
		while (true) {

            int a [] = new int [7];
            for(int i = 0; i < 7; i++){
                int n = sc.nextInt();
                a[i] = n;
            }
			
			System.out.println(obj.getMenorNumeroSaltos(a));			
		}
	}

	public Integer getMenorNumeroSaltos(int a []) {
		
		int roca = 0, saltos = 0;
		while (roca != 6) {
			for (int i = a.length - 1; i >= 0; i--) {
				if (a[i] == a[roca])
					return -1;
				if (a[i] <= a[roca] + 50 || a[i] <= 50) {
					roca = i;
					saltos++;
					break;
				}
			}
		}
		return saltos;
		
	}
}
