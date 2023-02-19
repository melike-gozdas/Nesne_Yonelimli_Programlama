package final_odev;

public class Kurs {
	private int kurs_id;
	private String kurs_ad;
	
	public Kurs(int kurs_id, String kurs_ad) 
	{
		this.kurs_id = kurs_id;
		this.kurs_ad = kurs_ad;
	}

	public int getKurs_id() {
		return kurs_id;
	}

	public void setKurs_id(int kurs_id) {
		this.kurs_id = kurs_id;
	}

	public String getKurs_ad() {
		return kurs_ad;
	}

	public void setKurs_ad(String kurs_ad) {
		this.kurs_ad = kurs_ad;
	}

}
