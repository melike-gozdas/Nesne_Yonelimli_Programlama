package lab2;

import java.util.Scanner;

public class daire2 {
	public static void main(String[] args) {
		/*int yaricap = 3, alan , cevre;
		//float pi = 3.14f;  //float veri tipini tanimasi icin sayinin sonuna kucuk veya buyuk f konmali
	    double pi = 3.14;
	    
		
		alan = (int) (pi*yaricap*yaricap);
		cevre = (int) (2*pi*yaricap); */
		
		
		double yaricap , alan , cevre;
		double pi= 3.14;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Yaricapi giriniz:");
		yaricap = reader.nextDouble();
	    
		alan = (pi*yaricap*yaricap);
		cevre = (2*pi*yaricap);
		
		System.out.println("Yaricapi "+yaricap+" olan daireni alani:"+alan+" cevresi:"+cevre);
   	
	}

}