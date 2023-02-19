package Quiz1;

public class ResimOgretmeni_1920 extends Ogretmen_1920 {
	
	private int id;
	public int gs;
	public double tp;
	
	private static int count=0;
	
	public ResimOgretmeni_1920(String ad, String soyad, int yas, int gs) {
		super(ad, soyad, yas);
		this.id=++count;
		this.brans="Resim";
		this.gs=gs;
		this.tp=gs*0.3;
		// TODO Auto-generated constructor stub
	}
	
	public void bilgileriYazdir() 
	{
		System.out.println("---------------RESIM OGRETMENI SINIFI---------------");
		System.out.println("Ogretmen Id: "+this.id);
		System.out.println("Ogretmenin Adi: "+this.ad);
		System.out.println("Ogretmenin Soyadi: "+this.soyad);
		System.out.println("Ogretmenin Yasi: "+this.yas);
		System.out.println("Ogretmenin Bransi: "+this.brans);
		System.out.println("Ogretmenin Tecrube Puani: "+this.tp);
		
	}
	

}
