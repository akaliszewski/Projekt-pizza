
//Klaasa g��wna Pizza po kt�rej pola dziedzicza inne klasy np PizzaDecorators
public abstract class Pizza{
	
	public abstract String nazwa();
	public abstract String skladniki();
	public abstract int cena();
	public abstract int ostrosc();
	public abstract int dowoz();
		
		//wy�wietlanie obiekt�w "pizz"
		public void makePizza(){
			
			System.out.println(	"Nazwa: " + this.nazwa());
			System.out.println(	"Sk�adniki: " + this.skladniki());
			System.out.println(	"Ostrosc: " + this.ostrosc());
			System.out.println(	"Cena: " + this.cena() + " z�" );
			System.out.println(	"Op�ata za dow�z: " + this.dowoz() + " z�");
			}
}

