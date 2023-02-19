package polimorfizm;

public class Muhendis {
	public String ad;
	public String brans;
	public int yas;
	public int puan;
	public Muhendis(String ad, int yas) 
	{
		this.ad = ad;
		this.yas = yas;
		this.brans="Muhendis";
	}
	
	public void BilgileriYazdir() 
	{
		System.out.println("--------------MUhendis Sinifi----------------");
		System.out.println("Muhendis Ad: "+this.ad);
		System.out.println("Muhendis Yas: "+this.yas);
		System.out.println("Muhendis Puan: "+this.puan);
		System.out.println("---------------------------------------------");
	}
	public int PuanHesapla()
	{
		this.puan=yas*3;
		return this.puan;
	}

}
