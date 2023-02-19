package Ornekler;

public class SmartPhone {
	private String marka;
	private String model;
	private int hafiza;
	
	private int id;  //private tanimladigim degisken baska siniflar tarafindan kullanilamaz.
	public static int count=0;
	
	public SmartPhone(String marka, String model, int hafiza) {
		this.marka= marka;
		this.model=model;
		this.hafiza=hafiza;
		this.id=++count;
	}
	
	public void bilgileriYazdir() {
		System.out.println("------------------------------");
		System.out.println("Telefon ID'si: "+this.id);
		System.out.println("Telefonun Markasi: "+this.marka);
		System.out.println("Telefonun Modeli: "+this.model);
		System.out.println("Telefonun Hafizasi: "+this.hafiza);
	}
	
	public void hafizaDegerlendir() {
		if(hafiza<=16) {
			System.out.println("Hafiza dusuk"); 
		}
		else {
			System.out.println("Hafiza dusuk degil");
		}
	}
	
	public int getSmartPhoneSayisi() 
	{
		return count;
	}
	public int getId() 
	{
		return id;
	}
	public void setMarka(String marka)
	{
		this.marka=marka;
	}
	public String getMarka() 
	{
		return this.marka;
	}
	public String getModel()
	{
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getHafiza() {
		return hafiza;
	}
	public void setHafiza(int hafiza) {
		this.hafiza = hafiza;
	}	

}
