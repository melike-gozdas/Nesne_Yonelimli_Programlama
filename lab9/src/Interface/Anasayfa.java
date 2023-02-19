package Interface;

public class Anasayfa {

	public static void main(String[] args) {
		
		DikUcgen du= new DikUcgen(3,4);
		du.UcgenTipiYazdir();
		du.CevreHesapla();
		du.AlanHesapla();
		
		IkizKenarUcgen iu=new IkizKenarUcgen(5,5,30);
		iu.UcgenTipiYazdir();
		iu.AlanHesapla();

	}

}
