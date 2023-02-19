package Quiz1;

public class Ogretmen_1920 {
	public String ad;
	public String soyad;
	public int yas;
	public String brans;
	
	private static int count=0;
	
	public Ogretmen_1920(String ad, String soyad, int yas) 
	{
		
		this.ad=ad;
		this.soyad=soyad;
		this.yas=yas;
		count++;
	}
	
	public void bilgileriYazdir() 
	{
		System.out.println("-------------OGRETMEN SINIFI-----------------");
		System.out.println("Ogretmenin Adi: "+this.ad);
		System.out.println("Ogretmenin Soyadi: "+this.soyad);
		System.out.println("Ogretmenin Yasi: "+this.yas);
		System.out.println("---------------------------------------------");
	    System.out.println(" ");
	}
	
	public final void OgretmenSayisiVer() 
	{
		System.out.println("-------------OGRETMEN SAYISI-----------------");
		System.out.println("Okulda toplam "+this.count+" ogretmen vardir.");
	    System.out.println(" ");
	}

	public int getOgretmenSayisi() 
	{
		return count;
	}
	public void setAd(String ad)
	{
		this.ad=ad;
	}
	public String getAd() 
	{
		return this.ad;
	}
	public String getSoyad()
	{
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}	
	public String getBrans() {
		return brans;
	}
	public void setBrans(String brans) {
		this.brans = brans;
	}
}
