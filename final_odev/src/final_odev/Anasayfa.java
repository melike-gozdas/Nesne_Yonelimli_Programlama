package final_odev;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Anasayfa {

	public static void main(String[] args) throws IOException {
		
		int kurs_id = 0 , kursiyer_id = 0 , kursiyer_yas = 0 , kurs_sys, alinan_kursid=0, yeni_kurs_id;
		String kurs_ad = null , kursiyer_adsoyad = null, alinan_kursad, kursiyer_ad, kursiyer_soyad;
		
		ArrayList<Kursiyer> Kursiyerler= new ArrayList<Kursiyer>();
	
		ArrayList<Kurs> Kurslar= new ArrayList<Kurs>();
		
		/*
		File dosya1=new File("kursiyer.txt");
		if(!dosya1.exists())
		{
			dosya1.createNewFile();
		}
	
		
		Scanner scanner1=new Scanner(dosya1);
		while(scanner1.hasNextLine())
		{	
			String satir=scanner1.nextLine();
			
			if(satir.contains("#")==true)
			{
				String[] bol1=satir.split("#");
				String satir2=bol1[1];
				String[] bol = satir2.split("-");
				kursiyer_id=Integer.parseInt(bol[0]);
				kursiyer_adsoyad=bol[1];
				kursiyer_yas=Integer.parseInt(bol[2]);
				
			}

			else
			{
				String[] bol1=satir.split("\\*");
				String satir2=bol1[1];
				String[] bol2 = satir2.split("-");
				kurs_id=Integer.parseInt(bol2[0]);
				kurs_ad=bol2[1];
			}
			Kursiyer kursiyer1= new Kursiyer(kursiyer_id,kursiyer_adsoyad,kursiyer_yas);
			
			Kurs alinan_kurslar1=new Kurs(kurs_id,kurs_ad);
			kursiyer1.alinan_kurslar.add(alinan_kurslar1);
			Kursiyerler.add(kursiyer1);
		}
		
		
		File dosya2=new File("kurs.txt");
		if(!dosya2.exists())
		{
			dosya2.createNewFile();
		}
		
		Scanner scanner2=new Scanner(dosya2);
		while(scanner2.hasNextLine())
		{
			String satir=scanner2.nextLine();
			String[] bol = satir.split("-");
			kurs_id=Integer.parseInt(bol[0]);
			kurs_ad=bol[1];
			Kurs kurs= new Kurs(kurs_id,kurs_ad); 
			Kurslar.add(kurs);
		}
		*/
		
		while(true)
		{
			
			System.out.println("MENU");
			System.out.println("1-Kurs Ekle");
			System.out.println("2-Kurs Listele");
			System.out.println("3-Kursiyer Ekle");
			System.out.println("4-Kursiyer Arama(Kursiyer adi -soyadina gore)");
			System.out.println("5-Kursiyer Sil(Kursiyer id'sine gore)");
			System.out.println("6-Kursiyer Listele");
			System.out.println("7-Kursiyer Ayrintili Listele");
			System.out.println("8-Kursiyer Odeyecegi Tutar Hesaplama");
			System.out.println("9-Cikis");
			System.out.println(" ");
			int secim;
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Yapmak istediginiz islemi seciniz: ");
			secim=scan.nextInt();
			
			System.out.println(" ");
			
			if(secim==1)
			{
				int adet;
				System.out.println("Kac adet kurs bilgisi ekleyeceginizi giriniz:");
				adet=scan.nextInt();
				for(int k1=0; k1<adet; k1++)
				{
					System.out.println("Kurs id giriniz:");
					kurs_id=scan.nextInt();
					for(Kurs krslr:Kurslar)
					{
						if(krslr.getKurs_id()==kurs_id)
						{
							System.out.println("Bu id baska bir kursa ait. Yeni bir id giriniz:");
							kurs_id=scan.nextInt();
							
						}
					}
					System.out.println("Kursun adini giriniz:");
					kurs_ad=scan.next();
					
					Kurs kurs= new Kurs(kurs_id,kurs_ad);
					Kurslar.add(kurs);
					
				}
				System.out.println(" ");
			}
			
			else if(secim==2)
			{
				System.out.println("Listedeki Kurslar");
				System.out.println("Kurs Id      Kurs Adi");
				for(Kurs kurslar:Kurslar)
				{
					System.out.println(kurslar.getKurs_id()+"         "+kurslar.getKurs_ad());
				}
				System.out.println(" ");
			}
			
			else if(secim==3)
			{
				int adet;
				System.out.println("Kac adet kursiyer bilgisi ekleyeceginizi giriniz:");
				adet=scan.nextInt();
				
				for(int k1=0; k1<adet; k1++)
				{
					System.out.println("Kursiyer id giriniz:");
					kursiyer_id=scan.nextInt();
					
					for(Kursiyer krsyrlr:Kursiyerler)
					{
						if(krsyrlr.getKursiyer_id()==kursiyer_id)
						{
							System.out.println("Bu id baska bir kursiyere ait. Yeni bir id giriniz:");
							kursiyer_id=scan.nextInt();
							
						}
					}
					
					System.out.println("Kursiyerin adini giriniz:");
					kursiyer_ad=scan.next();
					
					System.out.println("Kursiyerin soyadini giriniz:");
					kursiyer_soyad=scan.next();
					
					System.out.println("Kursiyerin yasini giriniz:");
					kursiyer_yas=scan.nextInt();
					
					kursiyer_adsoyad=kursiyer_ad+" "+kursiyer_soyad;
					
					Kursiyer kursiyer=new Kursiyer(kursiyer_id,kursiyer_adsoyad,kursiyer_yas);
					
					System.out.println("Kursiyerin kayit olacagi kurs sayisini giriniz:");
					kurs_sys=scan.nextInt();
					
					for(int l=0; l<kurs_sys; l++)
					{
						System.out.println((l+1)+". kursun adini giriniz:");
						alinan_kursad=scan.next();
						
						for(Kurs kurslar:Kurslar)
						{
							if(alinan_kursad.equals(kurslar.getKurs_ad()))
							{
								alinan_kursid=kurslar.getKurs_id();
							}

						}
						
						Kurs alinan_kurs=new Kurs(alinan_kursid,alinan_kursad);
						
						kursiyer.alinan_kurslar.add(alinan_kurs);
					}
					
					Kursiyerler.add(kursiyer);
					
				}
				System.out.println(" ");
			}
			
			else if(secim==4)
			{
				int syc1=0;
				String aranacak_ad;
				String aranacak_soyad;
				String aranacak;
				System.out.println("Aramak istediginiz kursiyerin adini giriniz:");
				aranacak_ad=scan.next();
				
				System.out.println("Aramak istediginiz kursiyerin soyadini giriniz:");
				aranacak_soyad=scan.next();
				
				aranacak=aranacak_ad+" "+aranacak_soyad;
				
				for(Kursiyer krsyr:Kursiyerler)
				{
					if(aranacak.equals(krsyr.getKursiyer_adsoyad()))
					{
						syc1 = syc1+1;
						System.out.println("Kursiyerin Bilgileri ve Aldigi Kurslar");
						
						System.out.println(krsyr.getKursiyer_id()+" "+krsyr.getKursiyer_adsoyad()+" "+krsyr.getKurs_yas());
							
						for(Kurs krslr:krsyr.alinan_kurslar)
						{
							System.out.println("\t"+krslr.getKurs_id()+" "+krslr.getKurs_ad());
						}
					
					}
					
				}
				if(syc1==0)
				{
					System.out.println("Aradiginiz kursiyer listede bulunmamaktadir.");
				}
				System.out.println(" ");
			}
			
			
			else if(secim==5)
			{
				int silinecek_id;
				System.out.println("Listeden silmek istediginiz kursiyerin id'sini giriniz:");
				silinecek_id=scan.nextInt();
				
				for(Kursiyer krsyrlr:Kursiyerler)
				{
					if(krsyrlr.getKursiyer_id()==silinecek_id)
					{
						Kursiyerler.remove(krsyrlr);
					}
				}
				System.out.println(" ");
			}
			
			else if(secim==6)
			{
				System.out.println("Kursiyer Bilgileri");
				for(Kursiyer krsyr:Kursiyerler)
				{
					System.out.println(krsyr.getKursiyer_id()+" "+krsyr.getKursiyer_adsoyad()+" "+krsyr.getKurs_yas());
				}
				System.out.println(" ");
			}
			
			else if(secim==7)
			{
				System.out.println("Kursiyer Bilgileri ve Aldiklari Kurslar");
				for(Kursiyer krsyr:Kursiyerler)
				{
					System.out.println(krsyr.getKursiyer_id()+" "+krsyr.getKursiyer_adsoyad()+" "+krsyr.getKurs_yas());
					
					for(Kurs krslr:krsyr.alinan_kurslar)
					{
						System.out.println("  "+krslr.getKurs_id()+" "+krslr.getKurs_ad());
					}
				}
				System.out.println(" ");
			}
			
			else if(secim==8)
			{
				int aranacak_id;
				System.out.println("Aylik Ucreti hesaplanacak kursiyerin id'sini giriniz:");
				aranacak_id=scan.nextInt();
				int ak_sayisi;
				
				for(Kursiyer krsyr:Kursiyerler)
				{
					
					if(krsyr.getKursiyer_id()==aranacak_id)
					{ 
						int toplam=0;
						int indirim=0;
						ak_sayisi=krsyr.alinan_kurslar.size();
						//System.out.println(ak_sayisi);
						if(ak_sayisi==1)
						{
							System.out.println("Bir adet kurs alana kampanya bulunmamaktadir.");
							toplam=100*4;
							
						}
						
						else if(ak_sayisi==2)
						{
							System.out.println("Kampanya 1'den yararlanmaktasiniz.");
							indirim=100*4*15/100;
							toplam=ak_sayisi*100*4-indirim;
							
						}
						
						else if(ak_sayisi==3)
						{
							System.out.println("Kampanya 2'den yararlanmaktasiniz.");
							indirim=100*4*25/100;
							toplam=ak_sayisi*100*4-indirim;
							
						}
						
						else
						{
							System.out.println("Kampanya 3'den yararlanmaktasiniz.");
							indirim=ak_sayisi*100*4*10/100;
							toplam=ak_sayisi*100*4-indirim;
						}
						System.out.println("Kursiyerin odeyecegi aylik tutar: "+toplam);
					}
					
				}
				System.out.println(" ");
			}
			else if(secim==9)
			{
                FileWriter fl=new FileWriter("kursiyer.txt");
				BufferedWriter bw= new BufferedWriter(fl);
				
				for(Kursiyer krsyr:Kursiyerler)
				{
					bw.write(krsyr.getKursiyer_id()+" "+krsyr.getKursiyer_adsoyad()+" "+krsyr.getKurs_yas()+"\n");
					for(Kurs krslr:krsyr.alinan_kurslar)
					{
						bw.write("\t"+krslr.getKurs_id()+" "+krslr.getKurs_ad()+"\n");
					}
					
				}
				bw.close();
				
                FileWriter fl1=new FileWriter("kurs.txt");
				BufferedWriter bw1= new BufferedWriter(fl1);
				
				for(Kurs krslr:Kurslar)
				{
					bw1.write(krslr.getKurs_id()+"-"+krslr.getKurs_ad()+"\n");
				}
				bw1.close();
				
				System.out.println("Cikis Yapiliyor..");
				System.out.println(" ");
				break;
			}
			else
			{
				System.out.println("Yanlis islem yaptiniz");
				System.out.println(" ");
				continue;
			}
		}

	}

}
