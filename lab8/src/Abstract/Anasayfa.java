package Abstract;

import java.util.Scanner;


public class Anasayfa {
	public static void BilgileriListele(AbMuhendis muhendis) 
	{
		System.out.println(" ");
		muhendis.BilgileriYazdir();
		//abstract olmayan metodu abstract sinifi icinde olusturdugum icin bir hata vermez.
	}
	public static void PuanlariYazdir(AbMuhendis[] muhler)
	{
		System.out.println(" ");
		for(int i=0; i<muhler.length; i++)
		{
			System.out.println((i+1)+". muhendisin bransi: "+muhler[i].brans+" Yasi: "+muhler[i].yas+" Puani: "+muhler[i].PuanHesapla());
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
		
	    toplam=bs+es;
	    //AbMuhendis muh = new AbMuhendis("Ali",30); 
	    //yukaridaki gibi direk new ile adi yasi belli bir nesne uretemem.
	    AbMuhendis[] muhendisler = new AbMuhendis[toplam];
	    //yukarida hata vermemesinin nedeni ise ici henuz dolu degil sadece yer ayirdigim icin.
	    
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
	    for(int i=bs; i<toplam; i++)
	    {
	    	System.out.println((i+1)+". sirada olan Elektrik Muhendisinin adini giriniz:");
	    	ad=scan.next();
	    	
	    	System.out.println((i+1)+". sirada olan Elektrik Muhendisinin yasini giriniz:");
	    	yas=scan.nextInt();
	    	
	    	muhendisler[i]=new ElekMuh(ad,yas); //yukari cevrim
	    }
	    

	    for(int i=0; i<toplam; i++)
	    {
	    	BilgileriListele(muhendisler[i]);
	    }
	    PuanlariYazdir(muhendisler);
	}

}
