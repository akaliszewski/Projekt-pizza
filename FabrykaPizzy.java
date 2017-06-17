//Klasa Main jako FabrykaPizzy

import java.util.Scanner;

// Fabryka Pizzy tworzy nowe obiekty typu Pizza z klasy Pizza
public class FabrykaPizzy {
	
	public static void main (String args[]){
		
		// "czytnik" klawiatury u¿ytkownika
		Scanner odczyt = new Scanner(System.in);
		
		// przedstawiamy u¿ytkownikowi menu dostepnych pizz
		System.out.println("Witaj w Pizzeri");
		System.out.println("               ");
		System.out.println("Wybierz pizzê: ");
		System.out.println("1 - Pizza Wegetariañska");
		System.out.println("2 - Pizza Capricciosa");
		System.out.println("3 - Pizza Pepperoni");
		
		// zapisujemy wybór rodzaju pizzy przez u¿ytkownika pod zmienna liczbowa "rodzaj"
		int rodzaj = odczyt.nextInt();
		
		// przedstawiamy u¿ytkownikowi wybór dostepnych rozmiarów pizz
		System.out.println("Wybierz rozmiar: ");
		System.out.println("1 - Du¿a");
		System.out.println("2 - Œrednia");
		System.out.println("3 - Ma³a");
		
		// zapisujemy wybór wielkoœæ pizzy przez u¿ytkownika pod zmienna liczbow¹ "wielkosc"
		int wielkosc = odczyt.nextInt();
		
		// przedstawiamy u¿ytkownikowi mo¿liwoœæ odbioru pizzy
		System.out.println("Odbiór Pizzy: ");
		System.out.println("1 - Odbiór w Pizzeri");
		System.out.println("2 - Dowóz do klienta za dodatkow¹ op³at¹");
							
		// zapisujemy wybór odbbioru pizzy przez u¿ytkownika pod zmienna liczbow¹ "zamówienie"
		int zamowienie = odczyt.nextInt();
		
		//jeœli odbiór w pizzeri
		if (zamowienie == 1){
		// jesli Pizza Wegetarianska
		if(rodzaj==1){
			
			// ustalamy wybór pizzy na Pizza Wegetarianska
			Pizza a = new WegetarianskaPizza();
			
			// jesli du¿a pizza
			if(wielkosc == 1 ){
			a = new DuzaPizza(a);
			} 
			// jesli œrednia pizza
			else if ( wielkosc == 2 ){
			a = new SredniaPizza(a);
			} 
			// jesli ma³a pizza
			else if ( wielkosc == 3 ){
			a = new MalaPizza(a);
			}
			
			// dodajemy sk³adniki
			a = new Papryka(a);
			a = new Pomidor(a);
			a = new Ser(a);
			
			// tworzymy pizze wed³ug zamówienia
			a.makePizza();
			} 
				
				// jesli Pizza Capricciosa
				else if( rodzaj == 2 ){
				
					// ustalamy wybór pizzy na Pizza Capricciosa
					Pizza b = new CapricciosaPizza();
					
						// jesli du¿a pizza
						if(wielkosc == 1 ){
						b = new DuzaPizza(b);
						}
						// jesli œrednia pizza
						else if ( wielkosc == 2 ){
						b = new SredniaPizza(b);
						}
						// jesli ma³a pizza
						else if ( wielkosc == 3 ){
						b = new MalaPizza(b);
						}
			
						// dodajemy sk³adniki
						b = new Pieczarki(b);
						b = new Sos(b);
						b = new Szynka(b);
				
						// tworzymy pizze wed³ug zamówienia
						b.makePizza();
						} 
							
							// jesli Pizza Pepperoni	
							else if( rodzaj == 3 ){
			
								// ustalamy wybór pizzy na Pizza Pepperoni
								Pizza c = new PepperoniPizza();
			
									// jesli du¿a pizza
									if(wielkosc == 1 ){
									c = new DuzaPizza(c);
									}
									// jesli œrednia pizza
									else if ( wielkosc == 2 ){
									c = new SredniaPizza(c);
									}
									// jesli ma³a pizza
									else if ( wielkosc == 3 ){
									c = new MalaPizza(c);
									}
			
									// dodajemy skladniki
									c = new Salami(c);
									c = new PaprykaOstra(c);
									c = new Cebula(c);
									c = new Ser(c);
			
									// tworzymy pizze wed³ug zamówienia
									c.makePizza();
									}
		
				}
				//jeœli dowóz do domu
				if (zamowienie == 2){
				// jesli Pizza Wegetarianska
				if(rodzaj==1){
					
					// ustalamy wybór pizzy na Pizza Wegetarianska
					Pizza a = new WegetarianskaPizza();
					
					// jesli du¿a pizza
					if(wielkosc == 1 ){
					a = new DuzaPizza(a);
					} 
					// jesli œrednia pizza
					else if ( wielkosc == 2 ){
					a = new SredniaPizza(a);
					} 
					// jesli ma³a pizza
					else if ( wielkosc == 3 ){
					a = new MalaPizza(a);
					}
					
					// dodajemy sk³adniki
					a = new Papryka(a);
					a = new Pomidor(a);
					a = new Ser(a);
					a = new Dowoz(a);
					// tworzymy pizze wed³ug zamówienia
					a.makePizza();
					} 
						
						// jesli Pizza Capricciosa
						else if( rodzaj == 2 ){
						
							// ustalamy wybór pizzy na Pizza Capricciosa
							Pizza b = new CapricciosaPizza();
							
								// jesli du¿a pizza
								if(wielkosc == 1 ){
								b = new DuzaPizza(b);
								}
								// jesli œrednia pizza
								else if ( wielkosc == 2 ){
								b = new SredniaPizza(b);
								}
								// jesli ma³a pizza
								else if ( wielkosc == 3 ){
								b = new MalaPizza(b);
								}
					
								// dodajemy sk³adniki
								b = new Pieczarki(b);
								b = new Sos(b);
								b = new Szynka(b);
								b = new Dowoz(b);
								// tworzymy pizze wed³ug zamówienia
								b.makePizza();
								} 
									
									// jesli Pizza Pepperoni	
									else if( rodzaj == 3 ){
					
										// ustalamy wybór pizzy na Pizza Pepperoni
										Pizza c = new PepperoniPizza();
					
											// jesli du¿a pizza
											if(wielkosc == 1 ){
											c = new DuzaPizza(c);
											}
											// jesli œrednia pizza
											else if ( wielkosc == 2 ){
											c = new SredniaPizza(c);
											}
											// jesli ma³a pizza
											else if ( wielkosc == 3 ){
											c = new MalaPizza(c);
											}
					
											// dodajemy skladniki
											c = new Salami(c);
											c = new PaprykaOstra(c);
											c = new Cebula(c);
											c = new Ser(c);
											c = new Dowoz(c);
											// tworzymy pizze wed³ug zamówienia
											c.makePizza();
											}
				}
			// zamykamy nasz czytnik z klawiatury
			odczyt.close();
			}
}


