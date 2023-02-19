package ornekler;

import java.util.Scanner;

public class reverse {
	public static void main(String[] args) {
		int sayi, kalan,ters=0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Bir sayi giriniz:");
	    sayi=scan.nextInt();
	    
	    while(sayi>0) {
	    	kalan = sayi%10;
	    	ters = ters*10+ kalan;
	    	sayi =sayi/10;
	    }
	     
	    System.out.println("Girilen sayinin tersi:"+ters);
}
}
