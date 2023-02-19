package polimorfizm;

public class ElekMuh extends Muhendis{

	public ElekMuh(String ad, int yas) {
		super(ad, yas);
        this.brans="Elektrik Muhendisi";
        
	}

	@Override
	public void BilgileriYazdir() {
		System.out.println("--------------Elektrik Muhendisligi Sinifi----------------");
		System.out.println("Muhendis Ad: "+this.ad);
		System.out.println("Muhendis Yas: "+this.yas);
		System.out.println("Muhendis Brans: "+this.brans);
		System.out.println("-------------------------------------------------------");
	}

	@Override
	public int PuanHesapla() {
		this.puan=yas*5;
        return this.puan;
	}
	

}
