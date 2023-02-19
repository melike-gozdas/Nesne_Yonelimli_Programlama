package Ornekler;

import java.util.Scanner;

public class DiziOrnekler2 {
	public static void main(String[] args) {
		int satir, sutun;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dizinin satir sayisini giriniz: ");
		satir=scan.nextInt();
		
		System.out.print("Dizinin sutun sayisini giriniz: ");
		sutun=scan.nextInt();
		
		int[][] dizi= new int[satir][sutun];
		
		for(int i=0; i<satir; i++) 
		{
			for(int j=0; j<sutun; j++) {
				System.out.print("Dizinin "+i+". satirinin "+j+". elemanini giriniz:");
				dizi[i][j]=scan.nextInt();
			}
		}
		for(int i=0; i<satir; i++) 
		{
			for(int j=0; j<sutun; j++)
			{
				System.out.print(dizi[i][j]+"  ");
			}
			System.out.println(" ");
		}
		for(int i=0; i<satir; i++) 
		{
			double satirtoplam=0;
			for(int j=0; j<sutun; j++)
			{
				satirtoplam=satirtoplam+dizi[i][j];
			}
			satirtoplam=satirtoplam/sutun;
			System.out.println(i+". satirin ortalamasi: "+satirtoplam);
		}
	}

}
