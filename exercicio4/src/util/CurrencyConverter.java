package util;

public class CurrencyConverter {
	
	public static final double IOF = 6.0; 
	
	public static double dollatToReal(double dollarPrice, double dollarResult) {
		double calc = dollarPrice * dollarResult;
		return calc = calc + (calc*IOF/100);
	}
	
}
