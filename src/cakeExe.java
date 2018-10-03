
import java.awt.*;
import javax.swing.*;

public class cakeExe implements Executor {
    private JFrame frameJ;
    private JPanel panelJ;
    private JLabel drinkImage, outputLabel, ingredientsLabel;
    private DessertInterface dessertInterface;

    public cakeExe(DessertInterface dessertInterface, JFrame frameJ, JPanel p, JLabel drinkImage, JLabel outputLabel, JLabel ingredientsLabel) {
        this.frameJ = frameJ;
        this.panelJ = panelJ;
        this.drinkImage = drinkImage;
        this.outputLabel = outputLabel;
        this.ingredientsLabel = ingredientsLabel;
        this.dessertInterface = dessertInterface;
    }
    public void Execute() {
        outputLabel.setText(dessertInterface.getCake1().getName());
        ingredientsLabel.setText("Ingredients: " + dessertInterface.getCake1().getIngredients());
        ingredientsLabel.setFont(new Font("Bookman", Font.PLAIN, 20));
        Icon image = new ImageIcon(dessertInterface.getCake1().getImageurl());
        drinkImage.setIcon(image);

    }
}
