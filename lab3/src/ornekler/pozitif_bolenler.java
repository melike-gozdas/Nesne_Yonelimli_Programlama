package ornekler;

import java.util.Scanner;

public class pozitif_bolenler {
	public static void main(String[] args) {
		int sayi, i=1;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Bir sayi giriniz:");
	    sayi=scan.nextInt();
	    
	    /*for(int i=1; i<= sayi; i++) {
	    	if(sayi %i== 0 ) {
	    		System.out.println("Pozitif bolen:"+i);
	    	}
	    }*/
	    
	    while (i<=sayi) {
	    	if(sayi %i== 0 ) {
	    		System.out.println("Pozitif bolen:"+i);
	    	}
	    	i++;
	    }
	}

}
