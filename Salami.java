
//Klasa Salami dziedziczy pole po klasie PizzaDekorator
public class Salami extends PizzaDecorator{
	
	Pizza pizza;
	
	public Salami(Pizza x_pizza){
		super(x_pizza);
		this.pizza = x_pizza;
		}
		public String skladniki(){
		return pizza.skladniki() + "Salami, ";
		}
}
