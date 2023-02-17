package Java;

import java.util.Random;

public class GenarateRandomeNumber_string {

	public static void main(String[] args) {
		// How to generate Random Number and String
		//Randome number
		
		//logic 1-use Random class
		Random ra =new Random();
		int a=ra.nextInt(100);
		System.out.println(a);
		double b=ra.nextDouble(); //range 0.0 and less than 1.0
		System.out.println(b);
		
		//logic 2-use Math class-genearte only decimal number
		System.out.println(Math.random());
		
		//logic 3-apache comman language API
//		String randome=RandomStringUtils.randomNumeric(5);
//		System.out.println(randome);
//		
//		String random1=RandomStringUtils.randomeAlphabetic(5); //for string
//		System.out.println(randome1);

	}

}
