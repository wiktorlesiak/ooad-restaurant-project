

import java.awt.*;
import javax.swing.*;

public class capreseExecutor implements Executor {
   private JFrame frameJ;
   private JPanel pannelJ;
   private JLabel drinkImage, outputLabel, ingredientsLabel;
   private RestaurantInterface restaurantInterface;

   public capreseExecutor(RestaurantInterface coffeeFactory, JFrame frameJ, JPanel pannelJ, JLabel drinkImage, JLabel outputLabel, JLabel ingredientsLabel) {
      this.frameJ = frameJ;
      this.pannelJ = pannelJ;
      this.drinkImage = drinkImage;
      this.outputLabel = outputLabel;
      this.ingredientsLabel = ingredientsLabel;
      this.restaurantInterface = coffeeFactory;
   }
   public void Execute() {
	    outputLabel.setText(restaurantInterface.getCaprese().getName());
		ingredientsLabel.setText("Ingredients: " + restaurantInterface.getCaprese().getIngredients());
        ingredientsLabel.setFont(new Font("Bookman", Font.PLAIN, 20));
		Icon image = new ImageIcon(restaurantInterface.getCaprese().getImageurl());
		drinkImage.setIcon(image);
		
   }
}
