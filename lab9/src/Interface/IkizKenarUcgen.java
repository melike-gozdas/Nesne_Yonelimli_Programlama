package Interface;

import java.text.DecimalFormat;

public class IkizKenarUcgen extends Ucgen implements Alan{
	public int aci;
	public IkizKenarUcgen(int kenar1, int kenar2, int aci) {
		super(kenar1, kenar2);
		this.aci=aci;
		// TODO Auto-generated constructor stub
	}



	@Override
	public void AlanHesapla() {
		double alan;
		alan=(kenar1*kenar2*Math.sin(aci))/2;
		if(alan<0)
			alan=alan*(-1);
		System.out.println("Ikiz kenar ucgenin alani: "+new DecimalFormat(".##").format(alan));
		//decimal format virgulden sonraki basamak sayisini belirlemek icin kullanilir.
	}
	
	@Override
	public void UcgenTipiYazdir() {
		System.out.println("Bu bir ikiz kenar ucgendir.");
		
	}

}
