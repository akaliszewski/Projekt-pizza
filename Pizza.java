
//Klaasa g³ówna Pizza po której pola dziedzicza inne klasy np PizzaDecorators
public abstract class Pizza{
	
	public abstract String nazwa();
	public abstract String skladniki();
	public abstract int cena();
	public abstract int ostrosc();
	public abstract int dowoz();
		
		//wyœwietlanie obiektów "pizz"
		public void makePizza(){
			
			System.out.println(	"Nazwa: " + this.nazwa());
			System.out.println(	"Sk³adniki: " + this.skladniki());
			System.out.println(	"Ostrosc: " + this.ostrosc());
			System.out.println(	"Cena: " + this.cena() + " z³" );
			System.out.println(	"Op³ata za dowóz: " + this.dowoz() + " z³");
			}
}

