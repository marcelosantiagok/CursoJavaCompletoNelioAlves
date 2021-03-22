package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		st.name = sc.nextLine();
		st.a = sc.nextDouble();
		st.b = sc.nextDouble();
		st.c = sc.nextDouble();
		
		System.out.println("FINAL GRADE = "+String.format("%.2f", st.finalGrade()));
		
		if(st.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", st.missingPoints());
		}else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
