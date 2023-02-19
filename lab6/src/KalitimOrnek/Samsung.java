package KalitimOrnek;

public class Samsung extends SmartPhone{
	
	
	private int id;
	private double hiz;
	private int kamera;
	
	private static int count=0;

	public Samsung(String model, int hafiza, double hiz, int kamera) {
		super(model, hafiza);
		this.marka="Samsung";
		this.id=++count;
		this.hiz=hiz;
		this.kamera=kamera;
		// TODO Auto-generated constructor stub
	}
	
	public Samsung() 
	{
		this.id=++count;
		this.hiz=0;
		this.kamera=0;
	}
	
	public void bilgileriYazdir() 
	{
		System.out.println("--------------Samsung Nesnesi----------------");
		System.out.println("Telefon ID'si: "+this.id);
		System.out.println("Telefonun Markasi: "+this.marka);
		System.out.println("Telefonun Modeli: "+this.model);
		System.out.println("Telefonun Hafizasi: "+this.hafiza);
		System.out.println("Telefonun Hizi: "+this.hiz);
		System.out.println("Telefonun Kamerasi: "+this.kamera);
	}
	
	public void hizDegerlendir() 
	{
		if(this.hiz<=1.0) 
		{
			System.out.println("Hiz Dusuk!");
		}
		else 
		{
			System.out.println("Hiz Normal!");
		}
	}
	
	public void kameraDegerlendir() 
	{
		if(this.hiz<=1.0) 
		{
			System.out.println("Kamera Dusuk!");
		}
		else 
		{
			System.out.println("Kamera Normal!");
		}
	}


}
