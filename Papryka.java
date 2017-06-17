
//Klasa Papryka dziedziczy pole po klasie PizzaDekorator
public class Papryka extends PizzaDecorator{
	
	Pizza pizza;
	
	public Papryka(Pizza x_pizza){
		super(x_pizza);
		this.pizza = x_pizza;
		}
		public String skladniki(){
		return pizza.skladniki() + "Papryka, ";
		}
}
