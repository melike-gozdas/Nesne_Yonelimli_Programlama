package KalitimOrnek;

public class Anasayfa { 
		public static void main(String[] args) 
		{
			Samsung sa=new Samsung("S5",32,1.5,38);
			sa.bilgileriYazdir();
			sa.hafizaDegerlendir();
			sa.hizDegerlendir();
			sa.kameraDegerlendir();
			
			Samsung sa2=new Samsung();
			sa2.bilgileriYazdir();
		}
}
