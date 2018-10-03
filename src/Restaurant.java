import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Restaurant extends JFrame implements ActionListener {

	JPanel optionSelectPanel, cardDrinkPanel, cardAppetizePanel, cardMainPanel, cardDessPanel, outputPanel; //uses actionPerformed
	newJButton cake1Button, cake2Button, cake3Button, antipastoButton, crostineButton, capreseButton, drinkButton, appetizeButton, mainButton, dessButton, sodaButton, juceButton;

	Drink drink;
	JLabel outputLabel, ingredientsLabel;
	JLabel drinkImage;
	antipastoExecutor antipas;
	capreseExecutor caprese;
	drinkExecutor drinkc, appetizec, mainc, dessc;
	crostinoExecutor crosin;
	sodaExe sodaDrinkc;
	cakeExe cake1;
	juceExe juceDrinkc;

	private RestaurantInterface appetizerRestaurantInterface = new Appetizer();
	private DessertInterface dessertInterface= new Dessert();


	public Restaurant() {
		Container c = getContentPane();

		//Panel declarations
		JPanel mainContentPanel = new JPanel(); //panel to hold all panels
		JPanel topPanel = new JPanel(); //panel to hold top buttons
		JPanel bottomPanel = new JPanel(); //panel to hold bottom content (output)

		optionSelectPanel = new JPanel(); //panel where user clicks options for drink
		outputPanel = new JPanel(); //panel to show finished drink

		//MAIN_BUTTONS
		appetizeButton = new newJButton("Appetizers", this);
		drinkButton = new newJButton("Drinks", this);
		mainButton = new newJButton("Main Course", this);
		dessButton = new newJButton("Dessert", this);

		//MAIN_BUTTON_FORMATTING
		buttonChange(appetizeButton);
		buttonChange(drinkButton);
		buttonChange(mainButton);
		buttonChange(dessButton);

		//MAIN_LABELS
		outputLabel = new JLabel();
		outputLabel.setFont(new Font("Impact", Font.PLAIN, 35));
		ingredientsLabel = new JLabel();
		drinkImage = new JLabel();


		//PANEL_SETTINGS
		mainContentPanel.setLayout(new BorderLayout());
		topPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
		bottomPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		topPanel.setPreferredSize(new Dimension(400, 100));
		topPanel.setLayout(new GridLayout(2, 2));
		bottomPanel.setBackground(Color.DARK_GRAY);
		topPanel.setBackground(Color.DARK_GRAY);
		bottomPanel.setLayout(new GridLayout(1, 2));
		outputPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		outputPanel.setLayout(new BorderLayout());
		optionSelectPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		optionSelectPanel.setLayout(new CardLayout());
		c.setBackground(Color.DARK_GRAY);
		outputPanel.add(outputLabel, BorderLayout.AFTER_LINE_ENDS);
		outputPanel.add(ingredientsLabel, BorderLayout.SOUTH);
		outputPanel.add(drinkImage, BorderLayout.WEST);




		//add components to panels
		mainContentPanel.add(topPanel, BorderLayout.NORTH);
		mainContentPanel.add(bottomPanel, BorderLayout.CENTER);
		topPanel.add(appetizeButton);
		topPanel.add(drinkButton);
		topPanel.add(mainButton);
		topPanel.add(dessButton);

		cardAppetizePanel = new JPanel();
		cardDrinkPanel = new JPanel();
		cardMainPanel = new JPanel();
		cardDessPanel = new JPanel();

		cardAppetizePanel = appetizeOptions();
		cardDrinkPanel = drinkOptions();
		cardDessPanel = dessertOption();

		optionSelectPanel.add(cardAppetizePanel, "appetizeCard");
		optionSelectPanel.add(cardDrinkPanel, "drinkCard");
		optionSelectPanel.add(cardMainPanel, "mainCard");
		optionSelectPanel.add(cardDessPanel, "dressCard");

		drinkc = new drinkExecutor("drinkCard", this, optionSelectPanel, drinkImage, outputLabel);
		drinkButton.setCommand(drinkc);

		appetizec = new drinkExecutor("appetizeCard", this, optionSelectPanel, drinkImage, outputLabel);
		appetizeButton.setCommand(appetizec);

		mainc = new drinkExecutor("mainCard", this, optionSelectPanel, drinkImage, outputLabel);
		mainButton.setCommand(mainc);

		dessc = new drinkExecutor("dessCard", this, optionSelectPanel, drinkImage, outputLabel);
		dessButton.setCommand(dessc);

		drinkButton.addActionListener(this);
		appetizeButton.addActionListener(this);
		mainButton.addActionListener(this);
		dessButton.addActionListener(this);

		bottomPanel.add(optionSelectPanel);
		bottomPanel.add(outputPanel);


		//add components to frame
		c.add(mainContentPanel);

		setSize(1200, 600);
		setVisible(true);
		setTitle("Coffee Shop");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		clear();
		CommSet obj = (CommSet) e.getSource();
		obj.getCommand().Execute();
	}

	public void clear() {
		outputLabel.setText("");
		ingredientsLabel.setText("");
	}

	public static void main(String[] args) {
		new Restaurant();
	}

	//BUTTON_DECORATION
	public JButton buttonChange(JButton newButton) {

		newButton.addActionListener(this);
		newButton.setFont(new Font("Impact", Font.BOLD, 40));
		newButton.setBackground(Color.GRAY);
		newButton.setForeground(Color.LIGHT_GRAY);
		newButton.setBorder(BorderFactory.createLineBorder(Color.RED));
		return newButton;
	}


	 //puts this panel into the optionSelectPanel if drinkButton is clicked


	//APPETIZERS_SETTINGS
	public JPanel appetizeOptions() {

		JPanel panel = new JPanel();
		JPanel panelContent = new JPanel();



		antipastoButton = new newJButton("Antipasto", this);
		antipas = new antipastoExecutor(appetizerRestaurantInterface, this, outputPanel, drinkImage, outputLabel, ingredientsLabel);
		antipastoButton.setCommand(antipas);

		crostineButton = new newJButton("Crostino", this);
		crosin = new crostinoExecutor(appetizerRestaurantInterface, this, outputPanel, drinkImage, outputLabel, ingredientsLabel);
		crostineButton.setCommand(crosin);

		capreseButton = new newJButton("Caprese salad", this);
		caprese = new capreseExecutor(appetizerRestaurantInterface, this, outputPanel, drinkImage, outputLabel, ingredientsLabel);
		capreseButton.setCommand(caprese);

		antipastoButton.addActionListener(this);
		crostineButton.addActionListener(this);
		capreseButton.addActionListener(this);

		//BUTTONS_SETTINGS
		antipastoButton.setFont(new Font("Impact", Font.BOLD, 30));
		antipastoButton.setBackground(Color.GRAY);

		crostineButton.setFont(new Font("Impact", Font.BOLD, 30));
		crostineButton.setBackground(Color.GRAY);

		capreseButton.setFont(new Font("Impact", Font.BOLD, 30));
		capreseButton.setBackground(Color.GRAY);


		panelContent.setLayout(new GridLayout(5, 2));
		panel.setLayout(new BorderLayout());
		JLabel label = new JLabel("Select your appetizer");
		label.setFont(new Font("Impact", Font.BOLD, 30));
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label, BorderLayout.NORTH);
		panelContent.add(antipastoButton);
		panelContent.add(crostineButton);
		panelContent.add(capreseButton);
		panel.add(panelContent, BorderLayout.CENTER);
		return panel;
	}
	//DRINKS_SETTINGS
	public JPanel drinkOptions() {
		DrinkFactory drinkFactory = new DrinkFactory();

		JPanel panel = new JPanel();
		JPanel panelContent = new JPanel();


		juceButton = new newJButton("Juice", this);
		juceDrinkc = new juceExe(this, outputPanel, drinkImage, outputLabel, ingredientsLabel);
		juceButton.setCommand(juceDrinkc);

		sodaButton = new newJButton("Soda", this);
		sodaDrinkc = new sodaExe(this, outputPanel, drinkImage, outputLabel, ingredientsLabel);
		sodaButton.setCommand(sodaDrinkc);


		juceButton.addActionListener(this);
		sodaButton.addActionListener(this);

		//BUTTON_SETTINGS
		juceButton.setFont(new Font("Impact", Font.BOLD, 30));
		juceButton.setBackground(Color.GRAY);

		sodaButton.setFont(new Font("Impact", Font.BOLD, 30));
		sodaButton.setBackground(Color.GRAY);

		//PANEL_SETTINGS
		panelContent.setLayout(new GridLayout(5, 2));
		panel.setLayout(new BorderLayout());
		JLabel label = new JLabel("Choose your drink");
		label.setFont(new Font("Impact", Font.BOLD, 30));
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label, BorderLayout.NORTH);
		panelContent.add(juceButton);
		panelContent.add(sodaButton);

		panel.add(panelContent, BorderLayout.CENTER);
		return panel;
	}

	public JPanel dessertOption() {

		DessertInterface dessert = new Dessert();

		JPanel panel = new JPanel();
		JPanel panelContent = new JPanel();

		cake1Button = new newJButton("Cake 1", this);
		cake1 = new cakeExe(dessertInterface, this, outputPanel, drinkImage, outputLabel, ingredientsLabel);
		cake1Button.setCommand(cake1);

		cake1Button.addActionListener(this);

		//BUTTON_SETTINGS
		cake1Button.setFont(new Font("Impact", Font.BOLD, 30));
		cake1Button.setBackground(Color.GRAY);




		//PANEL_SETTINGS
		panelContent.setLayout(new GridLayout(5, 2));
		panel.setLayout(new BorderLayout());
		JLabel label = new JLabel("Choose your cake");
		label.setFont(new Font("Impact", Font.BOLD, 30));
		label.setHorizontalAlignment(JLabel.CENTER);
		panel.add(label, BorderLayout.NORTH);
		panelContent.add(cake1Button);


		panel.add(panelContent, BorderLayout.CENTER);
		return panel;
	}


}
