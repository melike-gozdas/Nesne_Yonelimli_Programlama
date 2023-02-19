package lab4;

public class smart_phone {
	private String marka;
	private String model;
	private String renk;
	private int hafiza;
	private double hiz;
	
	public smart_phone(String marka, String model, String renk, int hafiza, double hiz) {
		this.marka= marka;
		this.model=model;
		this.renk=renk;
		this.hafiza=hafiza;
		this.hiz=hiz;
	}
	
	public void bilgileriYazdir() {
		System.out.println("Telefonun Markasi: "+this.marka);
		System.out.println("Telefonun Modeli: "+this.model);
		System.out.println("Telefonun Rengi: "+this.renk);
		System.out.println("Telefonun Hafizasi: "+this.hafiza);
		System.out.println("Telefonun Hizi: "+this.hiz);
	}
	
	public void hafizaDegerlendir() {
		if(hafiza<16) {
			System.out.println("Hafiza dusuk"); 
		}
		else {
			System.out.println("Hafiza dusuk degil");
		}
	}
	
	public void setMarka(String marka) {
		this.marka=marka;
	}
	 public String getMarka() {
		 return this.marka;
	 }
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public int getHafiza() {
		return hafiza;
	}
	public void setHafiza(int hafiza) {
		this.hafiza = hafiza;
	}
	public double getHiz() {
		return hiz;
	}
	public void setHiz(double hiz) {
		this.hiz = hiz;
	}
	 

}
