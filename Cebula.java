
//Klasa Cebula dziedziczy pole po klasie PizzaDekorator
public class Cebula extends PizzaDecorator{
	
	Pizza pizza;
	
	public Cebula(Pizza x_pizza){
		super(x_pizza);
		this.pizza = x_pizza;
		}
		public String skladniki(){
		return pizza.skladniki() + "Cebula, ";
		}
}
