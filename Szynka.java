
//Klasa Szynka dziedziczy pole po klasie PizzaDekorator
public class Szynka extends PizzaDecorator{
	
	Pizza pizza;
	
	public Szynka(Pizza x_pizza) {
		super(x_pizza);
		this.pizza = x_pizza;
		}
		public String skladniki(){
		return pizza.skladniki() + "Szynka, ";
		}
}
