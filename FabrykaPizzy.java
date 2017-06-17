//Klasa Main jako FabrykaPizzy

import java.util.Scanner;

// Fabryka Pizzy tworzy nowe obiekty typu Pizza z klasy Pizza
public class FabrykaPizzy {
	
	public static void main (String args[]){
		
		// "czytnik" klawiatury u�ytkownika
		Scanner odczyt = new Scanner(System.in);
		
		// przedstawiamy u�ytkownikowi menu dostepnych pizz
		System.out.println("Witaj w Pizzeri");
		System.out.println("               ");
		System.out.println("Wybierz pizz�: ");
		System.out.println("1 - Pizza Wegetaria�ska");
		System.out.println("2 - Pizza Capricciosa");
		System.out.println("3 - Pizza Pepperoni");
		
		// zapisujemy wyb�r rodzaju pizzy przez u�ytkownika pod zmienna liczbowa "rodzaj"
		int rodzaj = odczyt.nextInt();
		
		// przedstawiamy u�ytkownikowi wyb�r dostepnych rozmiar�w pizz
		System.out.println("Wybierz rozmiar: ");
		System.out.println("1 - Du�a");
		System.out.println("2 - �rednia");
		System.out.println("3 - Ma�a");
		
		// zapisujemy wyb�r wielko�� pizzy przez u�ytkownika pod zmienna liczbow� "wielkosc"
		int wielkosc = odczyt.nextInt();
		
		// przedstawiamy u�ytkownikowi mo�liwo�� odbioru pizzy
		System.out.println("Odbi�r Pizzy: ");
		System.out.println("1 - Odbi�r w Pizzeri");
		System.out.println("2 - Dow�z do klienta za dodatkow� op�at�");
							
		// zapisujemy wyb�r odbbioru pizzy przez u�ytkownika pod zmienna liczbow� "zam�wienie"
		int zamowienie = odczyt.nextInt();
		
		//je�li odbi�r w pizzeri
		if (zamowienie == 1){
		// jesli Pizza Wegetarianska
		if(rodzaj==1){
			
			// ustalamy wyb�r pizzy na Pizza Wegetarianska
			Pizza a = new WegetarianskaPizza();
			
			// jesli du�a pizza
			if(wielkosc == 1 ){
			a = new DuzaPizza(a);
			} 
			// jesli �rednia pizza
			else if ( wielkosc == 2 ){
			a = new SredniaPizza(a);
			} 
			// jesli ma�a pizza
			else if ( wielkosc == 3 ){
			a = new MalaPizza(a);
			}
			
			// dodajemy sk�adniki
			a = new Papryka(a);
			a = new Pomidor(a);
			a = new Ser(a);
			
			// tworzymy pizze wed�ug zam�wienia
			a.makePizza();
			} 
				
				// jesli Pizza Capricciosa
				else if( rodzaj == 2 ){
				
					// ustalamy wyb�r pizzy na Pizza Capricciosa
					Pizza b = new CapricciosaPizza();
					
						// jesli du�a pizza
						if(wielkosc == 1 ){
						b = new DuzaPizza(b);
						}
						// jesli �rednia pizza
						else if ( wielkosc == 2 ){
						b = new SredniaPizza(b);
						}
						// jesli ma�a pizza
						else if ( wielkosc == 3 ){
						b = new MalaPizza(b);
						}
			
						// dodajemy sk�adniki
						b = new Pieczarki(b);
						b = new Sos(b);
						b = new Szynka(b);
				
						// tworzymy pizze wed�ug zam�wienia
						b.makePizza();
						} 
							
							// jesli Pizza Pepperoni	
							else if( rodzaj == 3 ){
			
								// ustalamy wyb�r pizzy na Pizza Pepperoni
								Pizza c = new PepperoniPizza();
			
									// jesli du�a pizza
									if(wielkosc == 1 ){
									c = new DuzaPizza(c);
									}
									// jesli �rednia pizza
									else if ( wielkosc == 2 ){
									c = new SredniaPizza(c);
									}
									// jesli ma�a pizza
									else if ( wielkosc == 3 ){
									c = new MalaPizza(c);
									}
			
									// dodajemy skladniki
									c = new Salami(c);
									c = new PaprykaOstra(c);
									c = new Cebula(c);
									c = new Ser(c);
			
									// tworzymy pizze wed�ug zam�wienia
									c.makePizza();
									}
		
				}
				//je�li dow�z do domu
				if (zamowienie == 2){
				// jesli Pizza Wegetarianska
				if(rodzaj==1){
					
					// ustalamy wyb�r pizzy na Pizza Wegetarianska
					Pizza a = new WegetarianskaPizza();
					
					// jesli du�a pizza
					if(wielkosc == 1 ){
					a = new DuzaPizza(a);
					} 
					// jesli �rednia pizza
					else if ( wielkosc == 2 ){
					a = new SredniaPizza(a);
					} 
					// jesli ma�a pizza
					else if ( wielkosc == 3 ){
					a = new MalaPizza(a);
					}
					
					// dodajemy sk�adniki
					a = new Papryka(a);
					a = new Pomidor(a);
					a = new Ser(a);
					a = new Dowoz(a);
					// tworzymy pizze wed�ug zam�wienia
					a.makePizza();
					} 
						
						// jesli Pizza Capricciosa
						else if( rodzaj == 2 ){
						
							// ustalamy wyb�r pizzy na Pizza Capricciosa
							Pizza b = new CapricciosaPizza();
							
								// jesli du�a pizza
								if(wielkosc == 1 ){
								b = new DuzaPizza(b);
								}
								// jesli �rednia pizza
								else if ( wielkosc == 2 ){
								b = new SredniaPizza(b);
								}
								// jesli ma�a pizza
								else if ( wielkosc == 3 ){
								b = new MalaPizza(b);
								}
					
								// dodajemy sk�adniki
								b = new Pieczarki(b);
								b = new Sos(b);
								b = new Szynka(b);
								b = new Dowoz(b);
								// tworzymy pizze wed�ug zam�wienia
								b.makePizza();
								} 
									
									// jesli Pizza Pepperoni	
									else if( rodzaj == 3 ){
					
										// ustalamy wyb�r pizzy na Pizza Pepperoni
										Pizza c = new PepperoniPizza();
					
											// jesli du�a pizza
											if(wielkosc == 1 ){
											c = new DuzaPizza(c);
											}
											// jesli �rednia pizza
											else if ( wielkosc == 2 ){
											c = new SredniaPizza(c);
											}
											// jesli ma�a pizza
											else if ( wielkosc == 3 ){
											c = new MalaPizza(c);
											}
					
											// dodajemy skladniki
											c = new Salami(c);
											c = new PaprykaOstra(c);
											c = new Cebula(c);
											c = new Ser(c);
											c = new Dowoz(c);
											// tworzymy pizze wed�ug zam�wienia
											c.makePizza();
											}
				}
			// zamykamy nasz czytnik z klawiatury
			odczyt.close();
			}
}


