
import java.awt.*;
import javax.swing.*;

public class antipastoExecutor implements Executor {
   private JFrame frame;
   private JPanel p;
   private JLabel drinkImage, outputLabel, ingredientsLabel;
   private RestaurantInterface restaurantInterface;

   public antipastoExecutor(RestaurantInterface coffeeFactory, JFrame frame, JPanel p, JLabel drinkImage, JLabel outputLabel, JLabel ingredientsLabel) {
      this.frame = frame;
      this.p = p;
      this.drinkImage = drinkImage;
      this.outputLabel = outputLabel;
      this.ingredientsLabel = ingredientsLabel;
      this.restaurantInterface = coffeeFactory;
   }

    public antipastoExecutor(RestaurantInterface appetizerRestaurantInterface, Restaurant restaurant, JLabel drinkImage, JLabel outputLabel, JLabel ingredientsLabel) {
    }

    public void Execute() {
	    outputLabel.setText(restaurantInterface.getAntipasto().getName());
		ingredientsLabel.setText("Ingredients: " + restaurantInterface.getAntipasto().getIngredients());
		ingredientsLabel.setFont(new Font("Bookman", Font.PLAIN, 20));
		Icon image = new ImageIcon(restaurantInterface.getAntipasto().getImageurl());
		drinkImage.setIcon(image);
		
   }
}
