package com.java.patterns;
import java.util.Scanner;
/*
Write the program to print the following pattern
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/
public class Pattern38 {
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		for(int i=0;i<N;i++){
			for(int j=N;j>i;j--)
				if(j == N)
					System.out.print(j);
				else
					System.out.print(" "+j);
			if(i != N-1)
				System.out.println();
		}
		scanner.close();
	}
}
/*
Input
5
Output
5 4 3 2 1
5 4 3 2
5 4 3
5 4
5
*/