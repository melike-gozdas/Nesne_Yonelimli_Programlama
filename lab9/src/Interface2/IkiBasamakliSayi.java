package Interface2;

public class IkiBasamakliSayi extends Sayilar {
	
	public int bs;

	public IkiBasamakliSayi(int sayi) {
		super(sayi);
		bs=2;
	}

	@Override
	public void Topla() {
		
		int toplam=0;
		int[] dizi;
		dizi=SayiBasBul();
		
		for(int i=0; i<dizi.length; i++)
		{
			toplam=toplam+dizi[i];
		}
		
		System.out.println("Sayinin rakamlari toplam: "+toplam);
	}

	@Override
	public int[] SayiBasBul() {
		
		int[] dizi=new int[bs];
		int kalan, syc=0;
		
		while(sayi>0)
		{
			kalan=sayi%10;
			sayi=sayi/10;
			dizi[syc]=kalan;
			syc++;
		}
		return dizi;
	}

	@Override
	public void SayiBilgisi() {
		
		System.out.println("Bu iki basamakli bir sayidir.");
	}

}
