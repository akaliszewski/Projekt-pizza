
//Klasa Sos dziedziczy pole po klasie PizzaDekorator
public class Sos extends PizzaDecorator{
	
	Pizza pizza;
	
	public Sos(Pizza x_pizza){
		super(x_pizza);
		this.pizza = x_pizza;
		}
		public String skladniki(){
		return pizza.skladniki() + "Sos, ";
		}
}
