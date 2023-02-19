package Ornek1;

import java.util.ArrayList;
import java.util.Scanner;

public class Anasayfa {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String cad, csoyad,cocukad;
		int cyas,cocukyas,syc,csayisi,id;
		ArrayList<Calisan> calisanlar=new ArrayList<Calisan>();
		
		System.out.println("Calisan sayisini giriniz:");
		syc=scan.nextInt();
		
		for(int i=0; i<syc; i++)
		{
			System.out.println((i+1)+". calisanin id'sini giriniz:");
			id=scan.nextInt();
			
			System.out.println((i+1)+". calisanin adini giriniz:");
			cad=scan.next();
			
			System.out.println((i+1)+". calisanin soyadini giriniz:");
			csoyad=scan.next();
			
			System.out.println((i+1)+". calisanin yasini giriniz:");
			cyas=scan.nextInt();
			
			Calisan calisan=new Calisan(id,cad,csoyad,cyas);
			
			System.out.println("calisanin cocuk sayisini giriniz:");
			csayisi=scan.nextInt();
			
			for(int j=0; j<csayisi; j++)
			{
				
				System.out.println((j+1)+". cocugun adini giriniz:");
				cocukad=scan.next();
				
				System.out.println((j+1)+". cocugun yasini giriniz:");
				cocukyas=scan.nextInt();
				
				Cocuk cocuk=new Cocuk(cocukad,cocukyas);
				
				calisan.cocuklar.add(cocuk);
			}
			calisanlar.add(calisan);
		}
		
		System.out.println("Tum Calisan Bilgileri");
		for(Calisan clsn:calisanlar)
		{
			System.out.println(clsn.id+" "+clsn.ad+" "+clsn.soyad+" "+clsn.yas);
			for(Cocuk cck:clsn.cocuklar)
			{
				System.out.println("\t"+cck.ad+" "+cck.yas); 
			}
		}
		
		
	}

}
