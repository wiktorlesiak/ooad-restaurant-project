public class Appetizer implements RestaurantInterface {


	public Food getCaprese() {
		// TODO Auto-generated method stub
		return new Food("Caprese salad", "mozzarella, tomatoes, basil","images/caprese.jpg");
	}


	public Food getCrostino() {
		// TODO Auto-generated method stub
		return new Food("Crostino", "bread, tomatoes, cheese","images/crostino.jpg");
	}


	public Food getAntipasto() {
		// TODO Auto-generated method stub
		return new Food("Antipasto", "meats, olives, peperoncini, mushrooms","images/antipasto.jpg");
	}


}
