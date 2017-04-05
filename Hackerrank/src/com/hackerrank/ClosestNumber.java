package com.hackerrank;

import java.util.Scanner;

public class ClosestNumber {
	
	public static void main(String ...args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0; i<n;i++) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			double x = sc.nextInt();
			
			
			double mFloor = Math.floor(Math.pow(a,b)/x);
			double mCeiling = Math.ceil(Math.pow(a,b)/x);
			
			if (Math.pow(a,b) > ((mCeiling*x + mFloor*x)/2)) {
				System.out.println((int)(mCeiling*x));
			} else {
				System.out.println((int)(mFloor*x));
			}
			
		}
	}
}
