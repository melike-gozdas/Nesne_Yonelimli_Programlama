package lab2;

import java.util.Scanner;

public class vizefinal {
	public static void main(String[] args) {
		double vize,final_not,gn;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vize notunu giriniz:");
		vize = scan.nextDouble();
		
		System.out.println("Final notunu giriniz:");
		final_not = scan.nextDouble();
		
		gn=(vize*0.4)+(final_not*0.6);
		 
	    System.out.println("Vize notu:"+vize+" Final notu:"+final_not+" olan Gecme notu:"+gn);
		
	}

}
