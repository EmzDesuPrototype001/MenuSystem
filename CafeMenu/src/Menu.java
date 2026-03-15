
import java.awt.EventQueue;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Menu extends JFrame {

	JPanel contentPane;

	// Quantity Text Fields
	JTextField txtQuantityEspresso;
	JTextField txtQuantityAmericano;
	JTextField txtQuantityCaramel;
	JTextField txtQuantityCappuccino;
	JTextField txtQuantityMocha;
	JTextField txtQuantityHotChoco;
	JTextField txtQuantityLemonade;
	JTextField txtQuantityMatcha;
	JTextField txtQuantityStrawberry;
	JTextField txtQuantityCroissant;
	JTextField txtQuantityChocoCroissant;
	JTextField txtQuantityBlueberry;
	JTextField txtQuantityBanana;
	JTextField txtQuantityCinnamon;
	JTextField txtQuantityDonut;
	JTextField txtQuantityBrownies;
	JTextField CtxtQuantityChocoCake;
	JTextField txtQuantityCheesecake;
	JTextField txtQuantityIceCream;

	// Add-on Quantity Text Fields
	JTextField txtQuantityExtraShot;
	JTextField txtQuantityExtraSyrup;
	JTextField txtQuantityWhippedCream;
	JTextField txtQuantityExtraIce;
	JTextField txtQuantityUpgradeLarge;

	JTextArea txaReceipt;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1050, 841); 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		//Title
		JLabel lblNewLabel = new JLabel("Cafe Ordering System");
		lblNewLabel.setBounds(332, 0, 286, 46);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		contentPane.add(lblNewLabel);

		// ---------------- PRICES ARRAY ----------------//
		double[] prices = { 100, 120, 140, 150, 150, // Coffee
				100, 130, 160, 110, // Non-Coffee
				100, 190, 120, 90, 95, // Pastries
				150, 160, 120, 70, 80, // Desserts
				40, 30, 20, 20, 40 // Add-ons
		};

		//-------------- ITEMS ARRAY--------------------//
		String[] itemNames = { "Espresso", "Americano", "Cappuccino", "Caramel Latte", "Mocha", "Hot Chocolate",
				"Fresh Lemonade", "Matcha Latte", "Strawberry Milk", "Croissant", "Chocolate Croissant",
				"Blueberry Muffin", "Banana Bread", "Cinnamon Roll", "Cheesecake", "Chocolate Cake", "Brownies",
				"Donut", "Ice Cream", "Extra Shot Espresso", "Extra Syrup", "Whipped Cream", "Extra Ice",
				"Upgrade to Large Size" };

		int labelXOffset = 280; // Where the price label starts
		int qtyFieldXOffset = 193; // Where the quantity field is

		// ---------------- COFFEE ----------------//
		JCheckBox cbC1 = new JCheckBox("Espresso");
		cbC1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbC1.setBounds(6, 94, 180, 20);
		contentPane.add(cbC1);

		JLabel lblPriceC1 = new JLabel("P " + (int) prices[0]);
		lblPriceC1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceC1.setBounds(labelXOffset, 94, 60, 20);
		contentPane.add(lblPriceC1);

		txtQuantityEspresso = new JTextField();
		txtQuantityEspresso.setBounds(qtyFieldXOffset, 100, 84, 20);
		contentPane.add(txtQuantityEspresso);

		JCheckBox cbC2 = new JCheckBox("Americano");
		cbC2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbC2.setBounds(6, 123, 180, 20);
		contentPane.add(cbC2);

		JLabel lblPriceC2 = new JLabel("P " + (int) prices[1]);
		lblPriceC2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceC2.setBounds(labelXOffset, 123, 60, 20);
		contentPane.add(lblPriceC2);

		txtQuantityAmericano = new JTextField();
		txtQuantityAmericano.setBounds(qtyFieldXOffset, 129, 84, 20);
		contentPane.add(txtQuantityAmericano);

		JCheckBox cbC3 = new JCheckBox("Cappuccino");
		cbC3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbC3.setBounds(6, 152, 180, 20);
		contentPane.add(cbC3);

		JLabel lblPriceC3 = new JLabel("P " + (int) prices[2]);
		lblPriceC3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceC3.setBounds(labelXOffset, 152, 60, 20);
		contentPane.add(lblPriceC3);

		txtQuantityCappuccino = new JTextField();
		txtQuantityCappuccino.setBounds(qtyFieldXOffset, 158, 84, 20);
		contentPane.add(txtQuantityCappuccino);

		JCheckBox cbC4 = new JCheckBox("Caramel");
		cbC4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbC4.setBounds(6, 181, 180, 20);
		contentPane.add(cbC4);

		JLabel lblPriceC4 = new JLabel("P " + (int) prices[3]);
		lblPriceC4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceC4.setBounds(labelXOffset, 181, 60, 20);
		contentPane.add(lblPriceC4);

		txtQuantityCaramel = new JTextField();
		txtQuantityCaramel.setBounds(qtyFieldXOffset, 187, 84, 20);
		contentPane.add(txtQuantityCaramel);

		JCheckBox cbC5 = new JCheckBox("Mocha");
		cbC5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbC5.setBounds(6, 211, 180, 20);
		contentPane.add(cbC5);

		JLabel lblPriceC5 = new JLabel("P " + (int) prices[4]);
		lblPriceC5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceC5.setBounds(labelXOffset, 211, 60, 20);
		contentPane.add(lblPriceC5);

		txtQuantityMocha = new JTextField();
		txtQuantityMocha.setBounds(qtyFieldXOffset, 217, 84, 20);
		contentPane.add(txtQuantityMocha);

		// ---------------- NON COFFEE ----------------
		JCheckBox cbNonCoffee1 = new JCheckBox("Hot Chocolate");
		cbNonCoffee1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbNonCoffee1.setBounds(6, 305, 180, 20);
		contentPane.add(cbNonCoffee1);

		JLabel lblPriceNC1 = new JLabel("P " + (int) prices[5]);
		lblPriceNC1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceNC1.setBounds(labelXOffset, 305, 60, 20);
		contentPane.add(lblPriceNC1);

		txtQuantityHotChoco = new JTextField();
		txtQuantityHotChoco.setBounds(qtyFieldXOffset, 311, 84, 20);
		contentPane.add(txtQuantityHotChoco);

		JCheckBox cbNonCoffee2 = new JCheckBox("Fresh Lemonade");
		cbNonCoffee2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbNonCoffee2.setBounds(6, 334, 180, 20);
		contentPane.add(cbNonCoffee2);

		JLabel lblPriceNC2 = new JLabel("P " + (int) prices[6]);
		lblPriceNC2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceNC2.setBounds(labelXOffset, 334, 60, 20);
		contentPane.add(lblPriceNC2);

		txtQuantityLemonade = new JTextField();
		txtQuantityLemonade.setBounds(qtyFieldXOffset, 340, 84, 20);
		contentPane.add(txtQuantityLemonade);

		JCheckBox cbNonCoffee3 = new JCheckBox("Matcha Latte");
		cbNonCoffee3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbNonCoffee3.setBounds(6, 363, 180, 20);
		contentPane.add(cbNonCoffee3);

		JLabel lblPriceNC3 = new JLabel("P " + (int) prices[7]);
		lblPriceNC3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceNC3.setBounds(labelXOffset, 363, 60, 20);
		contentPane.add(lblPriceNC3);

		txtQuantityMatcha = new JTextField();
		txtQuantityMatcha.setBounds(qtyFieldXOffset, 369, 84, 20);
		contentPane.add(txtQuantityMatcha);

		JCheckBox cbNonCoffee4 = new JCheckBox("Strawberry Milk");
		cbNonCoffee4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbNonCoffee4.setBounds(6, 392, 180, 20);
		contentPane.add(cbNonCoffee4);

		JLabel lblPriceNC4 = new JLabel("P " + (int) prices[8]);
		lblPriceNC4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceNC4.setBounds(labelXOffset, 392, 60, 20);
		contentPane.add(lblPriceNC4);

		txtQuantityStrawberry = new JTextField();
		txtQuantityStrawberry.setBounds(qtyFieldXOffset, 398, 84, 20);
		contentPane.add(txtQuantityStrawberry);

		// ---------------- PASTRIES ----------------
		int pastryLabelX = 580;
		int pastryQtyX = 490;

		JCheckBox cbP1 = new JCheckBox("Croissant");
		cbP1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbP1.setBounds(327, 94, 159, 20);
		contentPane.add(cbP1);

		JLabel lblPriceP1 = new JLabel("P " + (int) prices[9]);
		lblPriceP1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceP1.setBounds(pastryLabelX, 94, 60, 20);
		contentPane.add(lblPriceP1);

		txtQuantityCroissant = new JTextField();
		txtQuantityCroissant.setBounds(pastryQtyX, 100, 84, 20);
		contentPane.add(txtQuantityCroissant);

		JCheckBox cbP2 = new JCheckBox("Chocolate Croissant");
		cbP2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbP2.setBounds(327, 123, 159, 20);
		contentPane.add(cbP2);

		JLabel lblPriceP2 = new JLabel("P " + (int) prices[10]);
		lblPriceP2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceP2.setBounds(pastryLabelX, 123, 60, 20);
		contentPane.add(lblPriceP2);

		txtQuantityChocoCroissant = new JTextField();
		txtQuantityChocoCroissant.setBounds(pastryQtyX, 129, 84, 20);
		contentPane.add(txtQuantityChocoCroissant);

		JCheckBox cbP3 = new JCheckBox("Blueberry Muffin");
		cbP3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbP3.setBounds(327, 152, 159, 20);
		contentPane.add(cbP3);

		JLabel lblPriceP3 = new JLabel("P " + (int) prices[11]);
		lblPriceP3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceP3.setBounds(pastryLabelX, 152, 60, 20);
		contentPane.add(lblPriceP3);

		txtQuantityBlueberry = new JTextField();
		txtQuantityBlueberry.setBounds(pastryQtyX, 158, 84, 20);
		contentPane.add(txtQuantityBlueberry);

		JCheckBox cbP4 = new JCheckBox("Banana Bread");
		cbP4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbP4.setBounds(327, 181, 159, 20);
		contentPane.add(cbP4);

		JLabel lblPriceP4 = new JLabel("P " + (int) prices[12]);
		lblPriceP4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceP4.setBounds(pastryLabelX, 181, 60, 20);
		contentPane.add(lblPriceP4);

		txtQuantityBanana = new JTextField();
		txtQuantityBanana.setBounds(pastryQtyX, 187, 84, 20);
		contentPane.add(txtQuantityBanana);

		JCheckBox cbP5 = new JCheckBox("Cinnamon Roll");
		cbP5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbP5.setBounds(327, 211, 159, 20);
		contentPane.add(cbP5);

		JLabel lblPriceP5 = new JLabel("P " + (int) prices[13]);
		lblPriceP5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceP5.setBounds(pastryLabelX, 211, 60, 20);
		contentPane.add(lblPriceP5);

		txtQuantityCinnamon = new JTextField();
		txtQuantityCinnamon.setBounds(pastryQtyX, 217, 84, 20);
		contentPane.add(txtQuantityCinnamon);

		// ---------------- DESSERTS ----------------
		JCheckBox cbD1 = new JCheckBox("Cheesecake");
		cbD1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbD1.setBounds(332, 305, 126, 20);
		contentPane.add(cbD1);

		JLabel lblPriceD1 = new JLabel("P " + (int) prices[14]);
		lblPriceD1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceD1.setBounds(pastryLabelX, 305, 60, 20);
		contentPane.add(lblPriceD1);

		txtQuantityCheesecake = new JTextField();
		txtQuantityCheesecake.setBounds(pastryQtyX, 311, 84, 20);
		contentPane.add(txtQuantityCheesecake);

		JCheckBox cbD2 = new JCheckBox("Chocolate Cake");
		cbD2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbD2.setBounds(332, 334, 129, 20);
		contentPane.add(cbD2);

		JLabel lblPriceD2 = new JLabel("P " + (int) prices[15]);
		lblPriceD2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceD2.setBounds(pastryLabelX, 334, 60, 20);
		contentPane.add(lblPriceD2);

		CtxtQuantityChocoCake = new JTextField();
		CtxtQuantityChocoCake.setBounds(pastryQtyX, 340, 84, 20);
		contentPane.add(CtxtQuantityChocoCake);

		JCheckBox cbD3 = new JCheckBox("Brownies");
		cbD3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbD3.setBounds(332, 363, 126, 20);
		contentPane.add(cbD3);

		JLabel lblPriceD3 = new JLabel("P " + (int) prices[16]);
		lblPriceD3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceD3.setBounds(pastryLabelX, 363, 60, 20);
		contentPane.add(lblPriceD3);

		txtQuantityBrownies = new JTextField();
		txtQuantityBrownies.setBounds(pastryQtyX, 369, 84, 20);
		contentPane.add(txtQuantityBrownies);

		JCheckBox cbD4 = new JCheckBox("Donut");
		cbD4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbD4.setBounds(332, 392, 126, 20);
		contentPane.add(cbD4);

		JLabel lblPriceD4 = new JLabel("P " + (int) prices[17]);
		lblPriceD4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceD4.setBounds(pastryLabelX, 392, 60, 20);
		contentPane.add(lblPriceD4);

		txtQuantityDonut = new JTextField();
		txtQuantityDonut.setBounds(pastryQtyX, 398, 84, 20);
		contentPane.add(txtQuantityDonut);

		JCheckBox cbD5 = new JCheckBox("Ice Cream");
		cbD5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbD5.setBounds(332, 422, 126, 20);
		contentPane.add(cbD5);

		JLabel lblPriceD5 = new JLabel("P " + (int) prices[18]);
		lblPriceD5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPriceD5.setBounds(pastryLabelX, 422, 60, 20);
		contentPane.add(lblPriceD5);

		txtQuantityIceCream = new JTextField();
		txtQuantityIceCream.setBounds(pastryQtyX, 428, 84, 20);
		contentPane.add(txtQuantityIceCream);

		// ---------------- RECEIPT AREA ----------------
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(720, 94, 297, 561);
		contentPane.add(scrollPane);
		txaReceipt = new JTextArea();
		scrollPane.setViewportView(txaReceipt);

		ButtonGroup bg1 = new ButtonGroup();
		ButtonGroup bg2 = new ButtonGroup();

		// ---------------- ADD ONS ----------------
		// Text Fields for Add-ons
		txtQuantityExtraShot = new JTextField();
		txtQuantityExtraSyrup = new JTextField();
		txtQuantityWhippedCream = new JTextField();
		txtQuantityExtraIce = new JTextField();
		txtQuantityUpgradeLarge = new JTextField();

		int addOnLabelX = 200;
		int addOnQtyX = 260;

		JCheckBox cbA1 = new JCheckBox("Extra Shot Espresso");
		cbA1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbA1.setBounds(6, 506, 168, 20);
		contentPane.add(cbA1);

		JLabel a1Price = new JLabel("P " + (int) prices[19]);
		a1Price.setFont(new Font("Tahoma", Font.PLAIN, 14));
		a1Price.setBounds(addOnLabelX, 506, 50, 27);
		contentPane.add(a1Price);

		txtQuantityExtraShot.setBounds(addOnQtyX, 506, 40, 20);
		contentPane.add(txtQuantityExtraShot);

		JCheckBox cbA2 = new JCheckBox("Extra Syrup");
		cbA2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbA2.setBounds(6, 535, 168, 20);
		contentPane.add(cbA2);

		JLabel a2Price = new JLabel("P " + (int) prices[20]);
		a2Price.setFont(new Font("Tahoma", Font.PLAIN, 14));
		a2Price.setBounds(addOnLabelX, 535, 50, 27);
		contentPane.add(a2Price);

		txtQuantityExtraSyrup.setBounds(addOnQtyX, 535, 40, 20);
		contentPane.add(txtQuantityExtraSyrup);

		JCheckBox cbA3 = new JCheckBox("Whipped Cream");
		cbA3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbA3.setBounds(6, 564, 168, 20);
		contentPane.add(cbA3);

		JLabel a3Price = new JLabel("P " + (int) prices[21]);
		a3Price.setFont(new Font("Tahoma", Font.PLAIN, 14));
		a3Price.setBounds(addOnLabelX, 564, 50, 27);
		contentPane.add(a3Price);

		txtQuantityWhippedCream.setBounds(addOnQtyX, 564, 40, 20);
		contentPane.add(txtQuantityWhippedCream);

		JCheckBox cbA4 = new JCheckBox("Extra Ice");
		cbA4.setVerticalAlignment(SwingConstants.TOP);
		cbA4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbA4.setBounds(6, 593, 168, 20);
		contentPane.add(cbA4);

		JLabel a4Price = new JLabel("P " + (int) prices[22]);
		a4Price.setFont(new Font("Tahoma", Font.PLAIN, 14));
		a4Price.setBounds(addOnLabelX, 593, 50, 27);
		contentPane.add(a4Price);

		txtQuantityExtraIce.setBounds(addOnQtyX, 593, 40, 20);
		contentPane.add(txtQuantityExtraIce);

		JCheckBox cbA5 = new JCheckBox("Upgrade to Large Size");
		cbA5.setVerticalAlignment(SwingConstants.TOP);
		cbA5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cbA5.setBounds(6, 621, 168, 27);
		contentPane.add(cbA5);

		JLabel a5Price = new JLabel("P " + (int) prices[23]);
		a5Price.setFont(new Font("Tahoma", Font.PLAIN, 14));
		a5Price.setBounds(addOnLabelX, 621, 50, 27);
		contentPane.add(a5Price);

		txtQuantityUpgradeLarge.setBounds(addOnQtyX, 621, 40, 20);
		contentPane.add(txtQuantityUpgradeLarge);

		// ---------------- DISCOUNT ----------------
		JRadioButton rdbtnStudentDiscount = new JRadioButton("Student");
		rdbtnStudentDiscount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnStudentDiscount.setBounds(380, 506, 142, 20);
		contentPane.add(rdbtnStudentDiscount);

		JRadioButton rdbtnSeniorCitizen = new JRadioButton("Senior Citizen");
		rdbtnSeniorCitizen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnSeniorCitizen.setBounds(380, 535, 142, 20);
		contentPane.add(rdbtnSeniorCitizen);

		bg1.add(rdbtnStudentDiscount);
		bg1.add(rdbtnSeniorCitizen);

		// ---------------- PAYMENT ----------------
		JRadioButton rdbtnCash = new JRadioButton("Cash");
		rdbtnCash.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnCash.setBounds(380, 609, 142, 20);
		contentPane.add(rdbtnCash);

		JRadioButton rdbtnOnline = new JRadioButton("Online");
		rdbtnOnline.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnOnline.setBounds(380, 638, 142, 20);
		contentPane.add(rdbtnOnline);

		bg2.add(rdbtnCash);
		bg2.add(rdbtnOnline);

		// ---------------- DONE BUTTON ----------------
		JButton btnDone = new JButton("DONE");
		btnDone.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDone.setBounds(540, 480, 139, 46); // Shifted right
		contentPane.add(btnDone);

		// ---------------- CLEAR BUTTON ----------------
		JButton btnClear = new JButton("CLEAR");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClear.setBounds(540, 537, 139, 46); // Shifted right
		contentPane.add(btnClear);

		// Labels for Sections
		JLabel lblNewLabel_1 = new JLabel("Coffee");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(10, 62, 125, 31);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Non-Coffee");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(6, 267, 125, 31);
		contentPane.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Pastries");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_2.setBounds(333, 57, 125, 31);
		contentPane.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Dessert");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_3.setBounds(333, 267, 125, 31);
		contentPane.add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_3_1 = new JLabel("Add Ons");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_3_1.setBounds(6, 469, 125, 31);
		contentPane.add(lblNewLabel_1_3_1);

		JLabel lblNewLabel_1_3_2 = new JLabel("Discount");
		lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_3_2.setBounds(380, 469, 125, 31);
		contentPane.add(lblNewLabel_1_3_2);

		JLabel lblNewLabel_1_3_3 = new JLabel("Payment Mode");
		lblNewLabel_1_3_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1_3_3.setBounds(380, 570, 125, 31);
		contentPane.add(lblNewLabel_1_3_3);

		// ---------------- ACTION LISTENERS ----------------

		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox[] checkBoxes = { cbC1, cbC2, cbC3, cbC4, cbC5, cbNonCoffee1, cbNonCoffee2, cbNonCoffee3,
						cbNonCoffee4, cbP1, cbP2, cbP3, cbP4, cbP5, cbD1, cbD2, cbD3, cbD4, cbD5, cbA1, cbA2, cbA3,
						cbA4, cbA5 };

				JTextField[] quantities = { txtQuantityEspresso, txtQuantityAmericano, txtQuantityCappuccino,
						txtQuantityCaramel, txtQuantityMocha, txtQuantityHotChoco, txtQuantityLemonade,
						txtQuantityMatcha, txtQuantityStrawberry, txtQuantityCroissant, txtQuantityChocoCroissant,
						txtQuantityBlueberry, txtQuantityBanana, txtQuantityCinnamon, txtQuantityCheesecake,
						CtxtQuantityChocoCake, txtQuantityBrownies, txtQuantityDonut, txtQuantityIceCream,
						txtQuantityExtraShot, txtQuantityExtraSyrup, txtQuantityWhippedCream, txtQuantityExtraIce,
						txtQuantityUpgradeLarge };

				txaReceipt.setText(""); //Clears the textArea
				txaReceipt.append("=============== CAFE RECEIPT =============\n\n");

				double total = 0;

				for (int i = 0; i < itemNames.length; i++) {
					if (checkBoxes[i].isSelected()) {
						String qtyText = quantities[i].getText();
						int qty = 1; // Default

						if (!qtyText.trim().isEmpty()) {
							if (isNumber(qtyText)) {
								qty = Integer.parseInt(qtyText);
								if (qty <= 0)
									qty = 1; // Prevent negative or zero
							} else {
								// If user typed garbage, default to 1 but maybe warn?
								// For now, I'ma just defaulting to 1 to keep flow smooth.								
								qty = 1;
								return;
							}
						}

						double cost = qty * prices[i];
						total += cost;
						txaReceipt.append(String.format("%-25s x%-3d = %6.2f\n", itemNames[i], qty, cost));
						
					}
				}
				
				
				txaReceipt.append("\nSUBTOTAL: " + String.format("%.2f", total) + "\n");
				txaReceipt.append("\n=========================================\n");

				if (rdbtnStudentDiscount.isSelected()) {
					double discount = total * 0.10;
					total -= discount;
					txaReceipt.append(String.format("Student Discount (10%%): -%6.2f\n", discount));
				}

				if (rdbtnSeniorCitizen.isSelected()) {
					double discount = total * 0.20;
					total -= discount;
					txaReceipt.append(String.format("Senior Discount (20%%): -%6.2f\n", discount));
				}

				txaReceipt.append("\nTOTAL: " + String.format("%.2f", total) + "\n");

				if (rdbtnCash.isSelected())
					txaReceipt.append("Payment Mode: Cash\n");
				else if (rdbtnOnline.isSelected())
					txaReceipt.append("Payment Mode: Online\n");
				else
					txaReceipt.append("Payment Mode: Not Selected\n");
			}
		});

		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txaReceipt.setText("");

				// Clear Main Items
				txtQuantityEspresso.setText("");
				txtQuantityAmericano.setText("");
				txtQuantityCaramel.setText("");
				txtQuantityCappuccino.setText("");
				txtQuantityMocha.setText("");
				txtQuantityHotChoco.setText("");
				txtQuantityLemonade.setText("");
				txtQuantityMatcha.setText("");
				txtQuantityStrawberry.setText("");
				txtQuantityCroissant.setText("");
				txtQuantityChocoCroissant.setText("");
				txtQuantityBlueberry.setText("");
				txtQuantityBanana.setText("");
				txtQuantityCinnamon.setText("");
				txtQuantityCheesecake.setText("");
				CtxtQuantityChocoCake.setText("");
				txtQuantityBrownies.setText("");
				txtQuantityDonut.setText("");
				txtQuantityIceCream.setText("");

				// Clear Add-on Items
				txtQuantityExtraShot.setText("");
				txtQuantityExtraSyrup.setText("");
				txtQuantityWhippedCream.setText("");
				txtQuantityExtraIce.setText("");
				txtQuantityUpgradeLarge.setText("");

			}
		});
	}

	public boolean isNumber(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Please enter a valid number.");
			return false;
		}
	}
}