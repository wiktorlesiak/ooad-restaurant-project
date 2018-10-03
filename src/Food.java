
public class Food {

	private String name, ingredients, imageurl;


	public Food(String name, String ingredients, String imageurl){
		this.name = name;
		this.ingredients = ingredients;
		this.imageurl = imageurl;
	}
	//NAME
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}


	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}



}
