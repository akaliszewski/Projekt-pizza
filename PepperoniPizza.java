//Ta klasa dziedziczy pola z klasy Pizza
public class PepperoniPizza extends Pizza{
	
	public String nazwa(){
	return "Pizza Pepperoni";
	}
	public String skladniki(){
	return "";
	}
			
	public int ostrosc(){
	return 5;
	}
	
	@Override
	public int cena(){
	return 0;
	}
	public int dowoz(){
	return 0;
	}
}
