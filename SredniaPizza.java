//Klasa SredniaPizza dziedziczy pola z klasy PizzaDekorator
public class SredniaPizza extends PizzaDecorator{
	
	Pizza pizza;
	
	public SredniaPizza(Pizza x_pizza){
		super(x_pizza);
		this.pizza = x_pizza;
		}
		
		public int cena(){
		if(pizza instanceof WegetarianskaPizza){
		return 25;
		} 
		else if(pizza instanceof CapricciosaPizza){
		return 27;
		} 
		else if(pizza instanceof PepperoniPizza){
		return 30;
		} 
		else{ 
		return 0; 
		}
	}
}
