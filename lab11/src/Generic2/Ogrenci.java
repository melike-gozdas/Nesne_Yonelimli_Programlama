package Generic2;

public class Ogrenci {
	public String ad;
	public String soyad;
	public int no;
	
	public Ogrenci( int no, String ad, String soyad) 
	{
		
		this.ad = ad;
		this.soyad = soyad;
		this.no = no;
		
	}

	@Override
	public String toString() {
		return "Ogrenci Bilgileri:"+no+" "+ad+" "+soyad;
	}
	
	
	

}
