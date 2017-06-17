
//Klasa Pomidor dziedziczy pole po klasie PizzaDekorator
public class Pomidor extends PizzaDecorator{
	
	Pizza pizza;
	
	public Pomidor(Pizza x_pizza){
		super(x_pizza);
		this.pizza = x_pizza;
		}
		public String skladniki(){
		return pizza.skladniki() + "Pomidor, ";
		}
}
