package Ornek2;

/*public class ThreadOrnek extends Thread {
	public ThreadOrnek()
	{
		System.out.println(this.getName()+" olusturuldu.");
	}

	@Override
	public void run() {
		
		for(int i=0; i<5; i++)
		{
			System.out.println(this.getName()+" yazdirilan:"+i);
		}
	}
	
	

}*/
public class ThreadOrnek implements Runnable
{
	public int sayi;
	
	public ThreadOrnek(int sayi)
	{
		this.sayi=sayi;
	}

	@Override
	public void run() {
		
		int syc=0,tahmin;
		
		//senkronize edildiginde ilk thread tahmin ettikten sonra ikinci thread metoda girer.
		synchronized (ThreadOrnek.class)
		{
			do 
			{
				tahmin=(int)(Math.random()*100+1);
				syc++;
				System.out.println(Thread.currentThread().getName()+" Tahmin:"+tahmin);
				
			}while(sayi != tahmin);
			
			System.out.println(Thread.currentThread().getName()+" dogru tahmin etti. Deneme sayisi:"+syc);
		}
		
		//senkronize etmeden onceki hali
		/*do 
		{
			tahmin=(int)(Math.random()*100+1);
			syc++;
			System.out.println(Thread.currentThread().getName()+" Tahmin:"+tahmin);
			
		}while(sayi != tahmin);
		
		System.out.println(Thread.currentThread().getName()+" dogru tahmin etti. Deneme sayisi:"+syc);
	    */
	}
	
	
}
