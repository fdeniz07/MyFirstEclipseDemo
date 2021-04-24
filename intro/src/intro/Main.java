package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// camelCase
		// Don't repeat yourself
		String internetSubeButonu = "Internet Subesi";
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;

		// System.out.println("Hello World");
		System.out.println(internetSubeButonu);

		if (dolarDun < dolarBugun) {
			System.out.println("Dolar düstü resmi");
		} else if (dolarBugun < dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		} else {
			System.out.println("Dolar esittir resmi");
		}

		System.out.println("////////////");

		String kredi1 = "Hizli Kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "Ciftci kredisi";
		String kredi5 = "Msb kredisi";
		String kredi6 = "Meb kredisi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);

		System.out.println("////////////");

		String[] krediler = { "Hizli Kredi", "Mutlu emekli kredisi", "Konut kredisi", "Ciftci kredisi", "Msb kredisi",
				"Meb kredisi" };

		// foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		System.out.println("////////////");
		// klasik for
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		System.out.println("////////////");
		
		int sayi1=10;
		int sayi2=20;
		
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		System.out.println("////////////");
		
		int[] sayilar1= {1,2,3,4,5};
		int[] sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);

		System.out.println("////////////");
		
		
		// stringlere özel istisnai durum, her ne kadar string tipi bir referans deger olsa da, deger tipi gibi calisirlar
		String sehir1="Ankara";
		String sehir2="Istanbul";
		sehir1=sehir2;
		sehir2="Izmir";
		System.out.println(sehir1);
	}
}
