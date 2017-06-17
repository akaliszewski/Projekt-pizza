//Ta klasa dziedziczy pola z klasy Pizza
public abstract class PizzaDecorator extends Pizza {

	protected Pizza pizza;
	
		public PizzaDecorator(Pizza x_pizza){
		pizza = x_pizza;
		}
	
		public String nazwa(){
		return pizza.nazwa();
		}
	
		public int cena(){
		return pizza.cena();
		}
	
		public int ostrosc(){
		return pizza.ostrosc();
		}
	
		public String skladniki(){
		return pizza.skladniki();
		}
		public int dowoz(){
		return pizza.dowoz();
		}
}
