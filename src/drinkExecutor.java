import java.awt.*;
import javax.swing.*;

public class drinkExecutor implements Executor {
   private JFrame frameJ;
   private JPanel pannel;
   private JLabel drinkImage, outputLabel;
   private String panelName;
   

   public drinkExecutor(String panelName, JFrame frameJ, JPanel jpanne, JLabel drinkImage, JLabel outputLabel) {
      this.frameJ = frameJ;
      this.pannel = jpanne;
      this.drinkImage = drinkImage;
      this.outputLabel = outputLabel;
      this.panelName = panelName;
  
   }
   public void Execute() {
	   drinkImage.setIcon(null);
	   outputLabel.setText("");
	   CardLayout cardLayout = (CardLayout) pannel.getLayout();
	   cardLayout.show(pannel, panelName);
		
   }
}


