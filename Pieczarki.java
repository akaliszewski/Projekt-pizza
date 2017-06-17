
//Klasa Pieczarki dziedziczy pole po klasie PizzaDekorator
public class Pieczarki extends PizzaDecorator{
	
	Pizza pizza;
	
	public Pieczarki(Pizza x_pizza){
		super(x_pizza);
		this.pizza = x_pizza;
		}
		public String skladniki(){
		return pizza.skladniki() + "Pieczarki, ";
		}
}
