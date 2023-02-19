package vize_odevi;

public class Departman {
    private int depNo;
	private String depAd;
	public Personel staff[];
	public Servis services[];
		
	public Departman(int depNo, String depAd, Personel staff[], Servis services[]) 
	{
		this.depNo=depNo;
		this.depAd=depAd;
		this.staff=staff;
		this.services=services;
	}
	public Departman(int depNo)
	{
		this.depNo=depNo;
	}
	
	
	public int getDepNo()
	{
		return depNo;
	}
	public void setDepNo(int depNo) 
	{
		this.depNo = depNo;
	}
	
	public String getDepAd()
	{
		return depAd;
	}
	public void setPerAd(String depAd) 
	{
		this.depAd = depAd;
	}
	
	
}
