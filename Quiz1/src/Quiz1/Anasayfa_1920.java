package Quiz1;

import java.util.Scanner;

public class Anasayfa_1920 {
	public static void main(String[] args) {
		int ms;
		int rs;
		int gs;
		int yas;
		String ad;
		String soyad;
		String brans;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Matematik ogretmeni sayisini giriniz:");
		ms=scan.nextInt();
		System.out.println("Resim ogretmeni sayisini giriniz:");
		rs=scan.nextInt();
		System.out.println(" ");
        MatematikOgretmeni_1920[] mat=new MatematikOgretmeni_1920[ms];
        ResimOgretmeni_1920[] resim=new ResimOgretmeni_1920[rs];
        for(int k=0; k<ms; k++) 
		{
			System.out.print(k+1+". matemetik ogretmenin adini giriniz: ");
			ad=scan.next();
			
			System.out.print(k+1+". matematik ogretmenin soyadini giriniz: ");
			soyad=scan.next();
			
			System.out.print(k+1+". matematik ogretmenin yasini giriniz: ");
			yas=scan.nextInt();
			
			System.out.print(k+1+". matematik ogretmenin gorev suresini giriniz: ");
			gs=scan.nextInt();
			
			
		    mat[k]= new MatematikOgretmeni_1920(ad, soyad, yas, gs);
			System.out.println(" ");
		}
        for(int i=0; i<rs; i++)
        {
        	System.out.print(i+1+". resim ogretmenin adini giriniz: ");
			ad=scan.next();
			
			System.out.print(i+1+". resim ogretmenin soyadini giriniz: ");
			soyad=scan.next();
			
			System.out.print(i+1+". resim ogretmenin yasini giriniz: ");
			yas=scan.nextInt();
			
			System.out.print(i+1+". resim ogretmenin gorev suresini giriniz: ");
			gs=scan.nextInt();
			
			
		    resim[i]= new ResimOgretmeni_1920(ad, soyad, yas, gs);
		    System.out.println(" ");
        }
        
        System.out.println(" ");
        mat[0].OgretmenSayisiVer();
        for(int k=0; k<ms; k++)
        {
        	mat[k].bilgileriYazdir();
        }
        for(int i=0; i<rs; i++)
        {
        	resim[i].bilgileriYazdir();
        }
        OgretmenSirala(mat);
        System.out.println(" ");
        System.out.println("Matematik ogretmenleri dizisi siralandi!");
        System.out.println(" ");
        
        for(int i=0; i<ms; i++)
        {
        	mat[i].bilgileriYazdir();
        }
        
        OgretmenSirala(resim);
        System.out.println(" ");
        System.out.println("Resim ogretmenleri dizisi siralandi!");
        System.out.println(" ");
        
        for(int i=0; i<rs; i++)
        {
        	resim[i].bilgileriYazdir();
        }
	}

	public static void OgretmenSirala(MatematikOgretmeni_1920[] mat) 
	{
		// TODO Auto-generated method stub
		MatematikOgretmeni_1920 gecici;
    	for(int i=0; i<mat.length; i++)
    	{
    		for(int j=0; j<mat.length-1; j++)
    		{
    			if(mat[j].tp<mat[j+1].tp)
    			{	gecici=mat[j];
    			    mat[j]= mat[j+1];
    			    mat[j+1]=gecici;
    			}
    		}
    	}
		
	}   
	public static void OgretmenSirala(ResimOgretmeni_1920[] resim) 
	{
		// TODO Auto-generated method stub
		ResimOgretmeni_1920 gecici;
    	for(int i=0; i<resim.length; i++)
    	{
    		for(int j=0; j<resim.length-1; j++)
    		{
    			if(resim[j].tp<resim[j+1].tp)
    			{	gecici=resim[j];
    			    resim[j]= resim[j+1];
    			    resim[j+1]=gecici;
    			}
    		}
    	}
		
	}   
}
