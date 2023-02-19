package polimorfizm;

public class MakMuh extends Muhendis{

	public MakMuh(String ad, int yas) {
		super(ad, yas);
		this.brans="Makine Muhendisi";
	}

	@Override
	public void BilgileriYazdir() {
		System.out.println("--------------Makine Muhendisligi Sinifi----------------");
		System.out.println("Muhendis Ad: "+this.ad);
		System.out.println("Muhendis Yas: "+this.yas);
		System.out.println("Muhendis Brans: "+this.brans);
		System.out.println("------------------------------------------------------");
	}

	
}
