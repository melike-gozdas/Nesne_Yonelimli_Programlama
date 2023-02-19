package polimorfizm;

import java.util.Scanner;

//polimorfizm sayesinde muhendis sinifindan bir nesne alan metoda bilgisayar muhendisi nesnesi gonderebilirim.

public class Anasayfa {
	public static void BilgileriListele(Muhendis muhendis) 
	{
		System.out.println(" ");
		muhendis.BilgileriYazdir();
	}
	public static void PuanlariYazdir(Muhendis[] muhler)
	{
		System.out.println(" ");
		for(int i=0; i<muhler.length; i++)
		{
			System.out.println((i+1)+". muhendisin bransi: "+muhler[i].brans+" Yasi: "+muhler[i].yas+" Puani: "+muhler[i].PuanHesapla());
			//birden fazla puan hesapla metodu var. bil muh ve elek muh kendi sinifindaki puanhesapla mak muh icinse muh sinifindaki puanhesapla metodu cagirilirr.
			//bu ozelligin ismi gec baslamadir. derleyici calisma aninda karar verir. cunku hangi siniftaki puanhesapla metodunu kullanacagina calisma esnasinda karar verir.
		}
	}
	

	public static void main(String[] args) {
		String ad;
		int yas;
		int toplam, bs, es, ms;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bilgisayar Muhendisi sayisini giriniz:");
		bs=scan.nextInt();
		
		System.out.println("Elektrik Muhendisi sayisini giriniz:");
		es=scan.nextInt();
		
		System.out.println("Makine Muhendisi sayisini giriniz:");
	    ms=scan.nextInt();
	    
	    toplam=bs+es+ms;
	    Muhendis[] muhendisler = new Muhendis[toplam];
	    
	    System.out.println(" ");
	    for(int i=0; i<bs; i++)
	    {
	    	System.out.println((i+1)+". sirada olan Bilgisayar Muhendisinin adini giriniz:");
	    	ad=scan.next();
	    	
	    	System.out.println((i+1)+". sirada olan Bilgisayar Muhendisinin yasini giriniz:");
	    	yas=scan.nextInt();
	    	
	    	muhendisler[i]=new BilMuh(ad,yas); //yukari cevrim  ,bilgisayar muhendis dizisini muhendis dizisine benzetiyorum.
	    }
	    
	    System.out.println(" ");
	    for(int i=bs; i<bs+es; i++)
	    {
	    	System.out.println((i+1)+". sirada olan Elektrik Muhendisinin adini giriniz:");
	    	ad=scan.next();
	    	
	    	System.out.println((i+1)+". sirada olan Elektrik Muhendisinin yasini giriniz:");
	    	yas=scan.nextInt();
	    	
	    	muhendisler[i]=new ElekMuh(ad,yas); //yukari cevrim
	    }
	    
	    System.out.println(" ");
	    for(int i=bs+es; i<toplam; i++)
	    {
	    	System.out.println((i+1)+". sirada olan Makine Muhendisinin adini giriniz:");
	    	ad=scan.next();
	    	
	    	System.out.println((i+1)+". sirada olan Makine Muhendisinin yasini giriniz:");
	    	yas=scan.nextInt();
	    	
	    	muhendisler[i]=new MakMuh(ad,yas); //yukari cevrim 
	    }

	    for(int i=0; i<toplam; i++)
	    {
	    	BilgileriListele(muhendisler[i]);
	    }
	    PuanlariYazdir(muhendisler);
	}

}
