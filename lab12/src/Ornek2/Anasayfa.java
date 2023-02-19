package Ornek2;

public class Anasayfa {
	
	/*public static void main(String[] args)
	{
		// Her calistiginda farkli sirada yazdirilir. Multithreading yapisindan kaynakli
		//multithreadler es zamanli olarak calismaya baslar.
		//multithreading yapisinda bazen bir metoda bir threadin girmesi gerekebilir. oyle oldugunda artik multithread yapisi kalmaz.
		//o zaman senkronize etmek gerekir.
		//multithread zamandan tasarruf saglar.
		ThreadOrnek th1=new ThreadOrnek();
		ThreadOrnek th2=new ThreadOrnek();
		
		th1.start();
		th2.start();
	}*/
	public static void main(String[] args)
	{
		// Her calistiginda farkli sirada yazdirilir. Multithreading yapisindan kaynakli
		Thread th1=new Thread(new ThreadOrnek(61));
		Thread th2=new Thread(new ThreadOrnek(61));
		
		th1.start();
		th2.start();
	}

}
