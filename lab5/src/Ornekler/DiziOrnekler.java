package Ornekler;

import java.util.Scanner;

public class DiziOrnekler {
	public static void main(String[] args) {
		int db;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Dizi boyutunu giriniz:");
		db=scan.nextInt();
		
		int[]dizi=new int[db];
		
		for (int i=0; i<db; i++)
		{
			System.out.println("Dizi elemanini giriniz:");
			dizi[i]=scan.nextInt();
		}
		for (int i=0; i<db; i++) 
		{
			System.out.println("Dizi elemani: "+dizi[i]);
			
		}
		
		BubbleSort(dizi);
		System.out.println("Dizinin siralanmis hali");
		for (int i=0; i<db; i++) 
		{
			System.out.println("Dizi elemani: "+dizi[i]);
			
		}
	}

	private static void BubbleSort(int[] dizi) {
		int gecici;
		
		for(int i=0; i<dizi.length; i++) 
		{
			for(int j=0; j<dizi.length-1; j++) 
			{
				if(dizi[j]>dizi[j+1])
				{
				  	gecici=dizi[j];
				  	dizi[j]=dizi[j+1];
				  	dizi[j+1]=gecici;
				}
			}
		}
		
	}

}
