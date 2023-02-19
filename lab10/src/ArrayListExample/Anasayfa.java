package ArrayListExample;

import java.util.ArrayList;
import java.util.Scanner;

public class Anasayfa {
	
	public static void main(String[] args) 
	{
		String ad, soyad;
		Scanner scan=new Scanner(System.in);
		ArrayList<Ogrenci> liste=new ArrayList<Ogrenci>();
		boolean dongu=true;
		int secim, vn, fn;
		
		while(dongu)
		{
			System.out.println("1-Ogrenci Ekle");
			System.out.println("2-Ogrencileri Listele");
			System.out.println("3-Ogrenci Ara");
			System.out.println("4-Ogrenci Sil");
			System.out.println("5-Cikis");
			System.out.println("(1-5) arasinda bir secim yapiniz:");
			secim=scan.nextInt();
			
			switch(secim)
			{
			case 1:
				System.out.println("Ogrencinin adini giriniz:");
				ad=scan.next();
				System.out.println("Ogrencinin soyadini giriniz:");
				soyad=scan.next();
				System.out.println("Ogrencinin vize notunu giriniz:");
				vn=scan.nextInt();
				System.out.println("Ogrencinin final notunu giriniz:");
				fn=scan.nextInt();
				Ogrenci ogr=new Ogrenci(ad,soyad,vn, fn);
				liste.add(ogr);
				break;
			case 2:
				System.out.println("Listedeki Ogrenciler");
				for(Ogrenci ogrenci:liste)
				{
					System.out.println("Ogrenci No:"+ogrenci.getNo()+" Ad:"+ogrenci.getAd()+" Soyad:"+ogrenci.getSoyad()+" Gecme Notu:"+ogrenci.getGecme_notu());
				}
				break;
			case 3:
				int count=0;
				String aranacak_ad;
				System.out.println("Listede aramak istediginiz ogrencinin adini giriniz:");
				aranacak_ad=scan.next();
				for(Ogrenci ogrenci:liste)
				{
					if(aranacak_ad.equals(ogrenci.getAd()));
					{
						count++;
						System.out.println("Aranan Ogrenci Bulundu.");
						System.out.println("Ogrenci No:"+ogrenci.getNo()+" Ad:"+ogrenci.getAd()+" Soyad:"+ogrenci.getSoyad()+" Gecme Notu:"+ogrenci.getGecme_notu());
					}
				}
				if(count==0)
				{
					System.out.println("Aranan Ogrenci Bulunamadi.");
				}
				break;
			case 4:
				String silinecek_ad;
				System.out.println("Listeden silmek istediginiz ogrencinin adini giriniz:");
				silinecek_ad=scan.next();
				for(Ogrenci ogrenci:liste)
				{
					if(silinecek_ad.equals(ogrenci.getAd()));
					{
						liste.remove(ogrenci);
						
					}
				}
				break;
			case 5:
				System.out.println("Cikis Yapiliyor..");
				dongu=false;
				break;
			default:
				System.out.println("(1-5) arasinda bir sayi giriniz:");	
			}
		}
	}

}
