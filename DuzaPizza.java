//Klasa DuzaPizza dziedziczy pola z klasy PizzaDekorator
public class DuzaPizza extends PizzaDecorator{
	
	Pizza pizza;
	
	public DuzaPizza(Pizza x_pizza){
		//konstruktor który dziedziczy pola z klasy PizzaDecorator
		super(x_pizza);
		this.pizza = x_pizza;
		}
	
		public int cena(){
		if(pizza instanceof WegetarianskaPizza){
		return 30;
		} 
		else if(pizza instanceof CapricciosaPizza){
		return 32;
		} 
		else if(pizza instanceof PepperoniPizza){
		return 35;
		} 
		else{ 
		return 0; 
		}
	}
}
