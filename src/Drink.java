
public abstract class Drink {
	private String name, image;


	public void setName(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void displayDrink() {
		System.out.println("" + getName());
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	 

}
