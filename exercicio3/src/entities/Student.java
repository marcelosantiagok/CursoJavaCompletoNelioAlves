package entities;

public class Student {
	
	public String name;
	public double a;
	public double b;
	public double c;
	
	public double finalGrade() {
		return a+b+c;
	}
	
	public double missingPoints() {
		
		if(finalGrade()< 60.00) {
			return 60.00 - finalGrade();
		}else {
			return 0.0;
		}
	}

}
