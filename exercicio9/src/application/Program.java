package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int mat[][] = new int[n][n];
		int cont = 0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
				if(mat[i][j]<0) {
					cont++;
				}
			}
		}
		
		System.out.println("Main diagonal: ");

		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(i==j) {
					System.out.print(mat[i][j]+" ");
				}
			}
		}
		
		System.out.println();
		System.out.printf("Negative numbers = %d",cont);

		
		sc.close();
	}

}
