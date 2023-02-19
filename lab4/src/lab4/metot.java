package lab4;

public class metot {
	
	public static void enBuyukBul(int sayi1, int sayi2) {
		if(sayi1 >= sayi2) {
			System.out.println("En buyuk: "+sayi1);
		}
		else {
			System.out.println("En buyuk: "+sayi2);
		}
	}
	
	public static void enBuyukBul(int sayi1, int sayi2, int sayi3) {
		int eb=sayi1;
		if(sayi1<sayi2) {
			eb=sayi2;
		}
		else if(sayi1<sayi3) {
			eb=sayi3;
		}
		if(eb<sayi3) {
			eb=sayi3;
		}
		System.out.println("En buyuk: "+eb);
		
	}
	
	public static void main(String[] args) {
		enBuyukBul(10,20);
		enBuyukBul(4,90,45);
		}

}
