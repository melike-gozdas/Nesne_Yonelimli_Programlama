package Abstract;

public class ElekMuh extends AbMuhendis{

	public ElekMuh(String ad, int yas) {
		super(ad, yas);
		this.brans="Elektrik Muhendisi";
	}

	@Override
	public int PuanHesapla() {
        this.puan=yas*5;
        return this.puan;
	}

}
