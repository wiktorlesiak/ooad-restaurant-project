
import java.awt.*;
import javax.swing.*;

public class crostinoExecutor implements Executor {
   private JFrame frameJ;
   private JPanel panelJ;
   private JLabel drinkImage, outputLabel, ingredientsLabel;
   private RestaurantInterface restaurantInterface;

   public crostinoExecutor(RestaurantInterface c, JFrame frameJ, JPanel panelJ, JLabel drinkImage, JLabel outputLabel, JLabel ingredientsLabel) {
      this.frameJ = frameJ;
      this.panelJ = panelJ;
      this.drinkImage = drinkImage;
      this.outputLabel = outputLabel;
      this.ingredientsLabel = ingredientsLabel;
      this.restaurantInterface = c;
   }
   public void Execute() {
	    outputLabel.setText(restaurantInterface.getCrostino().getName());
		ingredientsLabel.setText("Ingredients: " + restaurantInterface.getCrostino().getIngredients());
        ingredientsLabel.setFont(new Font("Bookman", Font.PLAIN, 20));
		Icon image = new ImageIcon(restaurantInterface.getCrostino().getImageurl());
		drinkImage.setIcon(image);
		
   }
}
