package Generic1;

public class Anasayfa {
	
	public static void main(String[] args)
	{
		Ogrenci ogr=new Ogrenci("Ali","Kacar",1010);
		
		Jenerik<Integer> nesne1=new Jenerik<Integer>(10);
		Jenerik<String> nesne2 =new Jenerik<String>("Ayse");
		Jenerik<Double> nesne3=new Jenerik<Double>(5.8);
		Jenerik<Ogrenci> nesne4=new Jenerik<Ogrenci>(ogr);
		
		nesne1.NesneBilgileriGoruntule();
		nesne2.NesneBilgileriGoruntule();
		nesne3.NesneBilgileriGoruntule();
		nesne4.NesneBilgileriGoruntule();
		
	}

}
