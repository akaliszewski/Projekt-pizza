
//Klasa PaprykaOstra dziedziczy pole po klasie PizzaDekorator
public class PaprykaOstra extends PizzaDecorator{
	
	Pizza pizza;
	
	public PaprykaOstra(Pizza x_pizza){
		super(x_pizza);
		this.pizza = x_pizza;
		}
		public String skladniki(){
		return pizza.skladniki() + "Papryka ostra, ";
		}
}
