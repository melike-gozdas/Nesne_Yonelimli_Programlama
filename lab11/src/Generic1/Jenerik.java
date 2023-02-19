package Generic1;

public class Jenerik <T>{
	
	T nesne;

	public Jenerik(T nesne) 
	{
		this.nesne = nesne;
	}
	
	public void NesneBilgileriGoruntule() 
	{
		System.out.println("Sinif Bilgisi: "+nesne.getClass().getName());
		System.out.println("Degeri: "+nesne.toString());
		System.out.println("------------------------------");
	}
	
	

}
