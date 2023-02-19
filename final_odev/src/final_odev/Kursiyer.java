package final_odev;

import java.util.ArrayList;


public class Kursiyer {
	private int kursiyer_id;
	private String kursiyer_adsoyad;
	private int kursiyer_yas;
	public ArrayList<Kurs> alinan_kurslar;

	
	
	public Kursiyer(int kursiyer_id, String kursiyer_adsoyad, int kursiyer_yas) {
		this.kursiyer_id = kursiyer_id;
		this.kursiyer_adsoyad = kursiyer_adsoyad;
		this.kursiyer_yas = kursiyer_yas;
		alinan_kurslar= new ArrayList<Kurs>();
	}

	public int getKursiyer_id() {
		return kursiyer_id;
	}

	public void setKursiyer_id(int kursiyer_id) {
		this.kursiyer_id = kursiyer_id;
	}

	public String getKursiyer_adsoyad() {
		return kursiyer_adsoyad;
	}

	public void setKursiyer_adsoyad(String kursiyer_adsoyad) {
		this.kursiyer_adsoyad = kursiyer_adsoyad;
	}

	public int getKurs_yas() {
		return kursiyer_yas;
	}

	public void setKurs_yas(int kurs_yas) {
		this.kursiyer_yas = kurs_yas;
	}

	public ArrayList<Kurs> getAlinan_kurslar() {
		return alinan_kurslar;
	}

	public void setAlinan_kurslar(ArrayList<Kurs> alinan_kurslar) {
		this.alinan_kurslar = alinan_kurslar;
	}
}
