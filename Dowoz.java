
//Klasa Dowoz dziedziczy pole po klasie PizzaDekorator
public class Dowoz extends PizzaDecorator{

	Pizza pizza;
		
		public Dowoz(Pizza x_pizza) {
			super(x_pizza);
			this.pizza = x_pizza;
			}
			public int dowoz(){
			return pizza.dowoz() + 5;
			}
	}
	


