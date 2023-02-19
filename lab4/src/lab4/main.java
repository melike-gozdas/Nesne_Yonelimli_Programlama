package lab4;

public class main {
	public static void main(String[] args) {
		smart_phone sp=new smart_phone("Samsung","S20","Gri0",128,1.8);
		//smart_phone sp2=new smart_phone();
		//smart_phone sp = new smart_phone();
		/*
		sp.marka="Samsung";
		sp.model="S20";
		sp.renk="Gri";
		sp.hafiza="128";
		sp.hiz="1.8";
		
		
		System.out.println("Telefonun Markasi: "+sp.marka);
		System.out.println("Telefonun Modeli: "+sp.model);
		
		*/
		
		/*
		sp.setMarka("Samsung");
		sp.setModel("S20");
		sp.setRenk("Beyaz");
		sp.setHafiza(128);
		sp.setHiz(1.8);
		
		System.out.println("Telefonun Markasi: "+sp.getMarka());
		System.out.println("Telefonun Modeli: "+sp.getModel());
		*/
		sp.bilgileriYazdir();
		sp.hafizaDegerlendir();
		
	}

}
