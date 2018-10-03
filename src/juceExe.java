import javax.swing.*;

public class juceExe implements Executor {
   private JFrame frame;
   private JPanel pannel;
   private JLabel drinkImage, outputLabel, ingredientsLabel;
   
   

   public juceExe(JFrame frame, JPanel pannel, JLabel drinkImage, JLabel outputLabel, JLabel ingredientsLabel) {
      this.frame = frame;
      this.pannel = pannel;
      this.drinkImage = drinkImage;
      this.outputLabel = outputLabel;
      this.ingredientsLabel = ingredientsLabel;
      
  
   }
   public void Execute() {
	   DrinkFactory fac = new DrinkFactory();
		outputLabel.setText(fac.getDrink("juice").getName());
		Icon image = new ImageIcon(fac.getDrink("juice").getImage());
		drinkImage.setIcon(image);
		ingredientsLabel.setText("Juces: Orange, Apple, Vegetable, Grape");
		
   }
}


