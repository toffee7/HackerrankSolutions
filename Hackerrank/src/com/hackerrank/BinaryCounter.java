package com.toffee.home;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String nBinary = Long.toString(n, 2);

		int max = 0;

		String[] splitted = nBinary.split("[0]");
		for (String s : splitted) {

			if (s.length() > max) {
				max = s.length();
			}
		}

		System.out.println(max);

	}

}
