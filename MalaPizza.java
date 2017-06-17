//Klasa MalaPizza dziedziczy pola z klasy PizzaDekorator
public class MalaPizza extends PizzaDecorator {
	
	Pizza pizza;
	
	public MalaPizza(Pizza x_pizza) {
		super(x_pizza);
		this.pizza = x_pizza;
		}
	
		public int cena(){
		if(pizza instanceof WegetarianskaPizza){
		return 20;
		} 
		else if(pizza instanceof CapricciosaPizza){
		return 22;
		} 
		else if(pizza instanceof PepperoniPizza){
		return 25;
		} 
		else{
		return 0;
		}
	}
}
