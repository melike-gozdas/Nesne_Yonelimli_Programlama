package vize_odevi;

public class Personel {
	private int depNo;
	private int perId;
	private String perAd;
	private String perSoyad;
	private int perYas;
	private static int count=0;
	
	
	public Personel(int depNo, String perAd, String perSoyad, int perYas) 
	{
		this.depNo=depNo;
		this.perId=++count;
		this.perAd=perAd;
		this.perSoyad=perSoyad;
		this.perYas=perYas;
	}

	public int getPerId()
	{
		return perId;
	}
	public void setPerId(int perId) 
	{
		this.perId = perId;
	}
	
	public String getPerAd()
	{
		return perAd;
	}
	public void setPerAd(String perAd) 
	{
		this.perAd = perAd;
	}
	
	public String getPerSoyad()
	{
		return perSoyad;
	}
	public void setPerSoyad(String perSoyad) 
	{
		this.perSoyad = perSoyad;
	}
	
	public int getPerYas()
	{
		return perYas;
	}
	public void setPerYas(int perYas) 
	{
		this.perYas = perYas;
	}
	
	public int getDepNo()
	{
		return depNo;
	}
	public void setDepNo(int depNo) 
	{
		this.depNo = depNo;
	}
}
