
import javax.swing.*;

public class sodaExe implements Executor {
   private JFrame frameJ;
   private JPanel pannelJ;
   private JLabel drinkImage, outputLabel, ingredientsLabel;
   
   

   public sodaExe(JFrame frameJ, JPanel pannelJ, JLabel drinkImage, JLabel outputLabel, JLabel ingredientsLabel) {
      this.frameJ = frameJ;
      this.pannelJ = pannelJ;
      this.drinkImage = drinkImage;
      this.outputLabel = outputLabel;
      this.ingredientsLabel = ingredientsLabel;
      
  
   }
   public void Execute() {
	   DrinkFactory fac = new DrinkFactory();
		outputLabel.setText(fac.getDrink("soda").getName());
        Icon image = new ImageIcon(fac.getDrink("soda").getImage());
		drinkImage.setIcon(image);
		ingredientsLabel.setText("Drinks: Cola, Fanta, Sprite");

   }
}


