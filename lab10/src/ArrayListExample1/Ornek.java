package ArrayListExample1;

import java.util.ArrayList;

public class Ornek {
	public static void main(String[] args) 
	{
		ArrayList<String> liste= new ArrayList<String>();
		
		liste.add("Elma");
		liste.add("Muz");
		
		System.out.println(liste);
		
        ArrayList<Integer> liste1= new ArrayList<Integer>();
		
		liste1.add(10);
		liste1.add(20);
		liste1.add(30);
		liste1.remove(0);
		
		System.out.println(liste1);
		
		
	}

}
