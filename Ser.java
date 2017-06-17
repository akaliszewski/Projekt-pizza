
//Klasa Ser dziedziczy pole po klasie PizzaDekorator
public class Ser extends PizzaDecorator{
	
	Pizza pizza;
	
	public Ser(Pizza x_pizza){
		super(x_pizza);
		this.pizza = x_pizza;
		}
		public String skladniki(){
		return pizza.skladniki() + "Ser, ";
		}
}
