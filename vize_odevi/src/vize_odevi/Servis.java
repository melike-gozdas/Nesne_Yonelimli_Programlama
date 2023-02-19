package vize_odevi;

public class Servis {
	private int depNo;
	private int serId;
	private String serGu;
	private static int count=0;

	public Servis(int depNo, String serGu) 
	{
		this.depNo=depNo;
		this.serId=++count;
		this.serGu=serGu;
	}


	public int getSerId()
	{
		return serId;
	}
	public void setSerId(int serId) 
	{
		this.serId = serId;
	}
	public String getSerGu()
	{
		return serGu;
	}
	public void setSerGu(String serGu) 
	{
		this.serGu = serGu;
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

