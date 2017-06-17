//Ta klasa dziedziczy pola z klasy Pizza
public class CapricciosaPizza extends Pizza{
	
	public String nazwa(){
	return "Pizza Capricciosa";
	}
	public String skladniki(){
	return "";
	}
			
	public int ostrosc(){
	return 1;
	}
	
	@Override
	public int cena(){
	return 0;
	}
	public int dowoz(){
	return 0;
	}
}
