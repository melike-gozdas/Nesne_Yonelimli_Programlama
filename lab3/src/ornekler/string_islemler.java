package ornekler;

import java.util.Scanner;

public class string_islemler {
	public static void main(String[] args) {
		String kelime ,kelime2;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Bir kelime giriniz:");
		kelime=scan.nextLine();
		
		kelime.length();
		
		System.out.println("Alinan kelime:"+kelime+" ve uzunlugu:"+kelime.length());
		
		for(int i=0; i<kelime.length(); i++) {
			System.out.println(kelime.charAt(i));
		}
		
		System.out.println("Bir kelime daha giriniz:");
		kelime2=scan.nextLine();
		
		System.out.println("iki kelimenin birbirine gore durumu: "+kelime.equals(kelime2));
	}

}
