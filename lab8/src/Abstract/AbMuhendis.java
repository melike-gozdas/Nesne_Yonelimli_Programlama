package Abstract;

public abstract class AbMuhendis {
	public String ad;
	public String brans;
	public int yas;
	public int puan;
	
	public AbMuhendis(String ad, int yas) 
	{
		this.ad = ad;
		this.yas = yas;
		this.brans="Muhendis";
	}
	
	public void BilgileriYazdir() 
	{
		System.out.println("--------------Muhendis Sinifi----------------");
		System.out.println("Muhendis Ad: "+this.ad);
		System.out.println("Muhendis Yas: "+this.yas);
		System.out.println("Muhendis Puan: "+this.puan);
		System.out.println("---------------------------------------------");
	}
	public abstract int PuanHesapla();

}
