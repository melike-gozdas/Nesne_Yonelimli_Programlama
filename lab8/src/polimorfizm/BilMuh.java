package polimorfizm;

public class BilMuh extends Muhendis {

	public BilMuh(String ad, int yas) {
		super(ad, yas);
		this.brans="Bilgisayar Muhendisi";
	}

	@Override
	public void BilgileriYazdir() {
		System.out.println("--------------Bil. Muhendisligi Sinifi----------------");
		System.out.println("Muhendis Ad: "+this.ad);
		System.out.println("Muhendis Yas: "+this.yas);
		System.out.println("Muhendis Brans: "+this.brans);
		System.out.println("------------------------------------------------------");
	}

	@Override
	public int PuanHesapla() {
         this.puan=yas*4;
         return this.puan;
	}
	

}
