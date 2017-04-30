package com.toffee.home;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HourGlass {
    public int maxHourGlass(int[][] matrix) {
		int sum = 0;
		int n = matrix[0].length;
		int m = matrix.length;
        
		for (int x=0;x<m-2;x++) {
			for (int y=0;y<n-2;y++){
				int cSum = matrix[x][y]+matrix[x][y+1]+matrix[x][y+2]+matrix[x+1][y+1]+matrix[x+2][y]+matrix[x+2][y+1]+matrix[x+2][y+2];
				
                if (sum<cSum) {
					sum=cSum;
				}
			}
		}
		
		return sum;
	}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        HourGlass sol = new HourGlass();
        System.out.println(sol.maxHourGlass(arr));
    }
}
