package vize_odevi;

import java.util.Scanner;

public class Anasayfa {

	public static void main(String[] args) {
		int deps, depNo, pers = 0, sers, perId, serId;
		int perYas;
		String depAd, perAd, perSoyad, serGu;
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
		
		System.out.print("Departman sayisini giriniz: ");
		deps=scan.nextInt();
		
		
        Departman[]departments=new Departman[deps];
        
		for(int k=0; k<deps; k++) 
		{
			System.out.print(k+1+". Departman numarasini giriniz: ");
			depNo=scan.nextInt();
			
			System.out.print(k+1+". Departman adini giriniz: ");
			depAd=scan.next();
			
			System.out.print(k+1+". Departmanda bulunan personel sayisini giriniz: ");
			pers=scan1.nextInt();
			
			Personel[]staff=new Personel[pers];

			for(int l=0; l<pers; l++) 
			{
				System.out.print(l+1+". Personelin adini giriniz: ");
				perAd=scan1.next();
				
				System.out.print(l+1+". Personelin soyadini giriniz: ");
				perSoyad=scan1.next();
				
				System.out.print(l+1+". Personelin yasini giriniz: ");
				perYas=scan1.nextInt();
				
				staff[l]=new Personel(depNo, perAd, perSoyad, perYas);
			}
			
			System.out.println(" ");
			
			System.out.print(k+1+". Departmanda bulunan servis sayisi giriniz: ");
			sers=scan2.nextInt();
			
			Servis[]services=new Servis[sers];

			for(int m=0; m<sers; m++) 
			{
				System.out.print(m+1+". Servisin guzergahini giriniz: ");
				serGu=scan2.next();
				
				services[m]=new Servis(depNo,serGu);
			}
			
			System.out.println(" ");
			
			
			
			departments[k]=new Departman(depNo, depAd, staff, services);
		}
		
		System.out.println(" ");
		while(true) 
		{
			System.out.println("MENU");
			System.out.println("1-Tum Departman Bilgilerini Listele");
			System.out.println("2-Departman Adina Gore Arama Yap");
			System.out.println("3-Personel Adina Gore Arama Yap");
			System.out.println("4-Servis Guzergahina Gore Arama Yap");
			System.out.println("5-Yasi En Buyuk ve En Kucuk Personel/Personelleri Bul");
			System.out.println("6-Cikis");
			
			int secim;
			Scanner scan4 = new Scanner(System.in);
			
			System.out.print("Yapmak istediginiz islemi seciniz: ");
			secim=scan4.nextInt();
			
			System.out.println(" ");
			
			
			if(secim == 1) 
			{
				
				for(int k=0; k<departments.length; k++) 
				{
					System.out.println("---------------------------------------------------------------------");
					System.out.println(" ");
					System.out.print("Departman No: "+departments[k].getDepNo()+" ");
					System.out.println("Departman Ad: "+departments[k].getDepAd()+" ");
					System.out.println(" ");
					System.out.println("Personeller:");
					
					for(int l=0; l<departments[k].staff.length; l++)
					{
						System.out.print("Personel Id: "+departments[k].staff[l].getPerId()+" ");
						//System.out.print("Personel Ad: "+departments[k].staff[l].getPerAd()+" ");
						//System.out.print("Personel Soyad:"+departments[k].staff[l].getPerSoyad()+" ");
						System.out.print("Personel Ad-Soyad: "+departments[k].staff[l].getPerAd()+" " +departments[k].staff[l].getPerSoyad()+" ");
						System.out.println("Personel Yas:"+departments[k].staff[l].getPerYas()+" ");
					}
					System.out.println(" ");
					System.out.println("Servisler:");
					
					for(int m=0; m<departments[k].services.length; m++)
					{
						System.out.print("Servis Id: "+departments[k].services[m].getSerId()+" ");
						System.out.println("Servis Guzergahi: "+departments[k].services[m].getSerGu()+" ");
					}
					System.out.println(" ");
					System.out.println(" ");
					
				}
				System.out.println(" ");
				System.out.println(" ");
				
				continue;
			}
			
			
			
			
			
			
			else if(secim==2)
			{
				int flag=0;
				System.out.print("Aramak istediginiz departmanin adini giriniz:");
				depAd=scan.next();
				System.out.println(" ");
				
				for(int k=0; k<departments.length; k++)
				{
					if(depAd.equals(departments[k].getDepAd()))
					{
						flag++;
						System.out.println("---------------------------------------------------------------------");
						System.out.println(" ");
						System.out.print("Departman No: "+departments[k].getDepNo()+" ");
						System.out.println("Departman Ad: "+departments[k].getDepAd()+" ");
						System.out.println(" ");
						System.out.println("Personeller:");
						
						for(int l=0; l<departments[k].staff.length; l++)
						{
							
							System.out.print("Personel Id: "+departments[k].staff[l].getPerId()+" ");
							//System.out.print("Personel Ad: "+departments[k].staff[l].getPerAd()+" ");
							//System.out.print("Personel Soyad:"+departments[k].staff[l].getPerSoyad()+" ");
							System.out.print("Personel Ad-Soyad: "+departments[k].staff[l].getPerAd()+" " +departments[k].staff[l].getPerSoyad()+" ");
							System.out.println("Personel Yas:"+departments[k].staff[l].getPerYas()+" ");
						}
						System.out.println(" ");
						System.out.println("Servisler:");
						
						for(int m=0; m<departments[k].services.length; m++)
						{
							System.out.print("Servis Id: "+departments[k].services[m].getSerId()+" ");
							System.out.println("Servis Guzergahi: "+departments[k].services[m].getSerGu()+" ");
						}
						System.out.println(" ");
						
					}
					
				}
				System.out.println(" ");
				System.out.println(" ");
				if(flag==0)
				{
					System.out.println("Aradiginiz departman bulunmamaktadir.");
					
				}
				System.out.println(" ");
				System.out.println(" ");
				
				continue;
				
			}
			
			
			
			
			
			else if(secim==3)
			{
				int flag=0;
				System.out.print("Aramak istediginiz personelin adini giriniz:");
				perAd=scan.next();
				System.out.println(" ");
				
				for(int k=0; k<departments.length; k++)
				{
					for(int l=0; l<departments[k].staff.length; l++)
					{
						if(perAd.equals(departments[k].staff[l].getPerAd()))
						{
							flag++;
							System.out.println("---------------------------------------------------------------------");
							System.out.println(" ");
							//System.out.print("Departman No: "+departments[k].getDepNo()+" ");
							System.out.print("Departman No: "+departments[k].staff[l].getDepNo()+" ");
							System.out.println("Departman Ad: "+departments[k].getDepAd()+" ");
							//System.out.println("Departman No: "+departments[k].staff[l].getDepNo()+" ");
							System.out.println(" ");
							System.out.print("Personel Id: "+departments[k].staff[l].getPerId()+" ");
							System.out.print("Personel Ad-Soyad: "+departments[k].staff[l].getPerAd()+" " +departments[k].staff[l].getPerSoyad()+" ");
							System.out.println("Personel Yas:"+departments[k].staff[l].getPerYas()+" ");
							System.out.println(" ");
						}
						
					}
						
				}
				System.out.println(" ");
				System.out.println(" ");
				if(flag==0)
				{
					System.out.println("Aradiginiz personel bulunmamaktadir.");
					System.out.println(" ");
					System.out.println(" ");
				}
				continue;
					
			}
			
			
			
			
			
			
			else if(secim==4)
			{
				int flag=0;
				System.out.print("Aramak istediginiz servis guzergahini giriniz:");
				serGu=scan.next();
				System.out.println(" ");
				
				for(int k=0; k<departments.length; k++)
				{
					for(int m=0; m<departments[k].services.length; m++)
					{
						if(serGu.equals(departments[k].services[m].getSerGu()))
						{
							flag++;
							System.out.println("---------------------------------------------------------------------");
							System.out.println(" ");
							//System.out.print("Departman No: "+departments[k].getDepNo()+" ");
							System.out.print("Departman No: "+departments[k].services[m].getDepNo()+" ");
							System.out.println("Departman Ad: "+departments[k].getDepAd()+" ");
							System.out.println(" ");
							System.out.print("Servis Id: "+departments[k].services[m].getSerId()+" ");
							System.out.println("Servis Guzergahi: "+departments[k].services[m].getSerGu()+" ");
							System.out.println(" ");
						}
						
				    }
				}
				System.out.println(" ");
				System.out.println(" ");
				if(flag==0)
				{
					System.out.println("Aradiginiz servis guzergahi bulunmamaktadir.");
					System.out.println(" ");
					System.out.println(" ");
				}
				
				continue;
				
			}
			
			
			
			
			
			
			else if(secim==5) 
			{
				int a = 0,b = 0;
				System.out.println("---------------------------------------------------------------------");
				System.out.println(" ");
				
				for(int k=0; k<departments.length; k++)
				{
					int peryas=0;
					System.out.println(k+1+". Departmandaki en buyuk personel/personellerin bilgileri: ");
					System.out.println(" ");
					System.out.print("Departman No: "+departments[k].getDepNo()+" ");
					System.out.println("Departman Ad: "+departments[k].getDepAd()+" ");
					for(int l=0; l<departments[k].staff.length; l++)
					{
						if(departments[k].staff[l].getPerYas()>=peryas)
						{
						    peryas=departments[k].staff[l].getPerYas();
							a=k;
							b=l;
						}
					}
					int yas=departments[a].staff[b].getPerYas();
						
					for(int r=0; r<departments[k].staff.length; r++)
					{
						if(yas==departments[k].staff[r].getPerYas())
						{
							System.out.print("Personel Id: "+departments[k].staff[r].getPerId()+" ");
							//System.out.print("Personel Ad: "+departments[k].staff[r].getPerAd()+" ");
							//System.out.print("Personel Soyad:"+departments[k].staff[r].getPerSoyad()+" ");
							System.out.print("Personel Ad-Soyad: "+departments[k].staff[r].getPerAd()+" "+departments[k].staff[r].getPerSoyad()+" ");
						    System.out.print("Personel Yas:"+departments[k].staff[r].getPerYas()+" ");
							System.out.println(" ");
						}
					}
						
					System.out.println(" ");
				}
				
				int e = 0,f = 0;
                int peryas1=0;
				for(int k=0; k<departments.length; k++)
				{
					
					for(int l=0; l<departments[k].staff.length; l++)
					{
						if(departments[k].staff[l].getPerYas()>=peryas1)
						{
						    peryas1=departments[k].staff[l].getPerYas();
							e=k;
							f=l;
						}
					}
				
				}
				
				int yas1=departments[e].staff[f].getPerYas();
				System.out.println("---------------------------------------------------------------------");
				System.out.println(" ");
				System.out.println("Butun departmanlar icindeki en buyuk personel/personellerin bilgileri");
				System.out.println(" ");
				for(int p=0; p<departments.length; p++)
				{
					for(int r=0; r<departments[p].staff.length; r++)
					{
						if(yas1==departments[p].staff[r].getPerYas())
						{
							System.out.print("Departman No: "+departments[p].getDepNo()+" ");
							System.out.println("Departman Ad: "+departments[p].getDepAd()+" ");
							System.out.print("Personel Id: "+departments[p].staff[r].getPerId()+" ");
							//System.out.print("Personel Ad: "+departments[p].staff[r].getPerAd()+" ");
							//System.out.print("Personel Soyad:"+departments[p].staff[r].getPerSoyad()+" ");
							System.out.print("Personel Ad-Soyad: "+departments[p].staff[r].getPerAd()+" "+departments[p].staff[r].getPerSoyad()+" ");
							System.out.println("Personel Yas:"+departments[p].staff[r].getPerYas()+" ");
							System.out.println(" ");
						}
					}
				}
				System.out.println(" ");
				System.out.println("---------------------------------------------------------------------");
				
				
				
				
				
				
				int c = 0,d = 0;
				for(int k=0; k<departments.length; k++)
				{
					int peryas2=150;
					System.out.println(k+1+". Departmandaki en kucuk personel/personellerin bilgileri: ");
					System.out.println(" ");
					System.out.print("Departman No: "+departments[k].getDepNo()+" ");
					System.out.println("Departman Ad: "+departments[k].getDepAd()+" ");
					for(int l=0; l<departments[k].staff.length; l++)
					{
						if(departments[k].staff[l].getPerYas()<=peryas2)
						{
							peryas2=departments[k].staff[l].getPerYas();
							c=k;
							d=l;
							
						}
					}
					
					int yas2=departments[c].staff[d].getPerYas();
					for(int r=0; r<departments[k].staff.length; r++)
					{
						if(yas2==departments[k].staff[r].getPerYas())
						{
								
							System.out.print("Personel Id: "+departments[k].staff[r].getPerId()+" ");
							//System.out.print("Personel Ad: "+departments[k].staff[r].getPerAd()+" ");
							//System.out.print("Personel Soyad:"+departments[k].staff[r].getPerSoyad()+" ");
							System.out.print("Personel Ad-Soyad: "+departments[k].staff[r].getPerAd()+" "+departments[k].staff[r].getPerSoyad()+" ");
							System.out.println("Personel Yas:"+departments[k].staff[r].getPerYas()+" ");
						}
					}
					System.out.println(" ");
				}
				
				int g = 0,h = 0;
                int peryas3=150;
				for(int k=0; k<departments.length; k++)
				{
					
					for(int l=0; l<departments[k].staff.length; l++)
					{
						if(departments[k].staff[l].getPerYas()<=peryas3)
						{
						    peryas3=departments[k].staff[l].getPerYas();
							g=k;
							h=l;
						}
					}
				
				}
				
				int yas3=departments[g].staff[h].getPerYas();
				System.out.println("---------------------------------------------------------------------");
				System.out.println("Butun departmanlar icindeki en kucuk personel/personellerin bilgileri");
				System.out.println(" ");
				for(int p=0; p<departments.length; p++)
				{
					for(int r=0; r<departments[p].staff.length; r++)
					{
						if(yas3==departments[p].staff[r].getPerYas())
						{
							System.out.print("Departman No: "+departments[p].getDepNo()+" ");
							System.out.println("Departman Ad: "+departments[p].getDepAd()+" ");
							System.out.print("Personel Id: "+departments[p].staff[r].getPerId()+" ");
							//System.out.print("Personel Ad: "+departments[p].staff[r].getPerAd()+" ");
							//System.out.print("Personel Soyad:"+departments[p].staff[r].getPerSoyad()+" ");
							System.out.print("Personel Ad-Soyad: "+departments[p].staff[r].getPerAd()+" "+departments[p].staff[r].getPerSoyad()+" ");
							System.out.println("Personel Yas:"+departments[p].staff[r].getPerYas()+" ");
							System.out.println(" ");
						}
					}
				}
				System.out.println("---------------------------------------------------------------------");
				System.out.println(" ");
				continue;
			}
				
			
			
			else if(secim==6) 
			{
				
				break;
			}
			
			
			else 
			{
				System.out.println("Hatali giris yaptiniz. Lutfen yeniden secim yapiniz. ");
				System.out.println(" ");
			}
			
		}
		
	}

}
