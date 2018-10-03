
public class DrinkFactory {
	
	
	public Drink getDrink(String name){

		if (name.equals("juice")) {
			return new Juice();
		} else {
			return new Soda();
		}
	}


}
