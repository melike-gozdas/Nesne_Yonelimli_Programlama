package Generic2;

public class Anasayfa {
	
	public static <T> String Bilgiler(T nesne)
	{
		System.out.println("Sinif Bilgisi: "+nesne.getClass().getName());
		return nesne.toString();
	}

	public static void main(String[] args) {
		
		Ogrenci ogr=new Ogrenci(1014,"Eda","Ada");
		Ogretmen ogret=new Ogretmen("Mehmet","Kacar","Resim",30);
        
		//main static bir metot ve metot icinde metot cagiriyorsak o metodunda static olmasi lazim.
		System.out.println(Bilgiler(ogr));
		System.out.println(Bilgiler(ogret));
	}

}
