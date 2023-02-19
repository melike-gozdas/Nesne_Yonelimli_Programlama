package Interface2;

public abstract class Sayilar implements BasamakToplamiHesapla{
	//abstract sinifi oldugu icin implemente ettigi arayuzlerin abstract metotlarini override etmek zorunda degil.
	//normal bir sinif olsaydi override etmeliydim.
	public int sayi;

	public Sayilar(int sayi) 
	{
		this.sayi = sayi;
	}
	
	public abstract void SayiBilgisi();	
	
	

}
