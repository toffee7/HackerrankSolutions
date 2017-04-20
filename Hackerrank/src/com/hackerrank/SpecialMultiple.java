package com.toffee.home;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Scanner;

public class SpecialMultiple {
	private BigInteger[] bNumArray = new BigInteger[501];
	private BigInteger calculateSpecialMultiple(BigInteger n) {
		
		BigInteger counter = new BigInteger("1");
		BigInteger counter0 = new BigInteger("0");
		BigInteger counter2 = new BigInteger("2");
		BigInteger multiple = new BigInteger("9");
		
		if (!bNumArray[n.intValue()].equals(counter0)) {
			return bNumArray[n.intValue()];
		}
		
		if (n.mod(counter2) == counter0) {
			counter = counter2;			
		}
		
		BigInteger binNum = new BigInteger("1");
		while (!multiple.mod(n).equals(counter0)) {
			String bNumber = binNum.toString(2);
			
			multiple = new BigInteger(bNumber.replaceAll("1", "9"));
			
			if (multiple.mod(n).equals(counter0) ) {
				break;
			} else {
				binNum = binNum.add(counter);
			}
		}
		
		bNumArray[n.intValue()] = multiple;
		return multiple;
		
	}

	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		SpecialMultiple specialMultiple = new SpecialMultiple();
		int nTest = sc.nextInt();
		
		for (int i =1; i<501; i++) {
			specialMultiple.bNumArray[i] = new BigInteger("0");
		}
		for (int i = 0; i < nTest; i++) {
			BigInteger n = sc.nextBigInteger();
			System.out.println(specialMultiple.calculateSpecialMultiple(n));
		}
	}
}
