import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame { //sakjdhakjsdhakjshdkajsdhjkas

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtQuantityEspresso;
	private JTextField txtQuantityAmericano;
	private JTextField txtQuantityCaramel;
	private JTextField txtQuantityCappuccino;
	private JTextField txtQuantityMocha;
	private JTextField txtQuantityHotChoco;
	private JTextField txtQuantityLemonade;
	private JTextField txtQuantityMatcha;
	private JTextField txtQuantityStrawberry;
	private JTextField txtQuantityCroissant;
	private JTextField txtQuantityChocoCroissant;
	private JTextField txtQuantityBlueberry;
	private JTextField txtQuantityBanana;
	private JTextField txtQuantityCinnamon;
	private JTextField txtQuantityDonut;
	private JTextField txtQuantityBrownies;
	private JTextField CtxtQuantityChocoCake;
	private JTextField txtQuantityCheesecake;
	private JTextField txtQuantityIceCream;
	private JTextArea textArea;

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
		setBounds(100, 100, 1000, 841);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Cafe Ordering System");
		lblNewLabel.setBounds(332, 0, 192, 46);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(lblNewLabel);

		// ---------------- COFFEE ----------------

		JCheckBox cbC1 = new JCheckBox("Espresso");
		cbC1.setBounds(6, 94, 84, 20);
		contentPane.add(cbC1);

		txtQuantityEspresso = new JTextField();
		txtQuantityEspresso.setBounds(193, 100, 84, 20);
		contentPane.add(txtQuantityEspresso);

		JCheckBox cbC2 = new JCheckBox("Americano");
		cbC2.setBounds(6, 123, 91, 20);
		contentPane.add(cbC2);

		txtQuantityAmericano = new JTextField();
		txtQuantityAmericano.setBounds(193, 129, 84, 20);
		contentPane.add(txtQuantityAmericano);

		JCheckBox cbC3 = new JCheckBox("Cappuccino");
		cbC3.setBounds(6, 152, 97, 20);
		contentPane.add(cbC3);

		txtQuantityCappuccino = new JTextField();
		txtQuantityCappuccino.setBounds(193, 158, 84, 20);
		contentPane.add(txtQuantityCappuccino);

		JCheckBox cbC4 = new JCheckBox("Caramel");
		cbC4.setBounds(6, 181, 97, 20);
		contentPane.add(cbC4);

		txtQuantityCaramel = new JTextField();
		txtQuantityCaramel.setBounds(193, 187, 84, 20);
		contentPane.add(txtQuantityCaramel);

		JCheckBox cbC5 = new JCheckBox("Mocha");
		cbC5.setBounds(6, 211, 97, 20);
		contentPane.add(cbC5);

		txtQuantityMocha = new JTextField();
		txtQuantityMocha.setBounds(193, 217, 84, 20);
		contentPane.add(txtQuantityMocha);

		// ---------------- NON COFFEE ----------------

		JCheckBox cbNonCoffee1 = new JCheckBox("Hot Chocolate");
		cbNonCoffee1.setBounds(6, 305, 126, 20);
		contentPane.add(cbNonCoffee1);

		txtQuantityHotChoco = new JTextField();
		txtQuantityHotChoco.setBounds(193, 311, 84, 20);
		contentPane.add(txtQuantityHotChoco);

		JCheckBox cbNonCoffee2 = new JCheckBox("Fresh Lemonade");
		cbNonCoffee2.setBounds(6, 334, 129, 20);
		contentPane.add(cbNonCoffee2);

		txtQuantityLemonade = new JTextField();
		txtQuantityLemonade.setBounds(193, 340, 84, 20);
		contentPane.add(txtQuantityLemonade);

		JCheckBox cbNonCoffee3 = new JCheckBox("Matcha Latte");
		cbNonCoffee3.setBounds(6, 363, 126, 20);
		contentPane.add(cbNonCoffee3);

		txtQuantityMatcha = new JTextField();
		txtQuantityMatcha.setBounds(193, 369, 84, 20);
		contentPane.add(txtQuantityMatcha);

		JCheckBox cbNonCoffee4 = new JCheckBox("Strawberry Milk");
		cbNonCoffee4.setBounds(6, 392, 126, 20);
		contentPane.add(cbNonCoffee4);

		txtQuantityStrawberry = new JTextField();
		txtQuantityStrawberry.setBounds(193, 398, 84, 20);
		contentPane.add(txtQuantityStrawberry);

		// ---------------- PASRIES ----------------

		JCheckBox cbP1 = new JCheckBox("Croissant");
		cbP1.setBounds(327, 94, 159, 20);
		contentPane.add(cbP1);

		txtQuantityCroissant = new JTextField();
		txtQuantityCroissant.setBounds(547, 100, 84, 20);
		contentPane.add(txtQuantityCroissant);

		JCheckBox cbP2 = new JCheckBox("Chocolate Croissant");
		cbP2.setBounds(327, 123, 159, 20);
		contentPane.add(cbP2);

		txtQuantityChocoCroissant = new JTextField();
		txtQuantityChocoCroissant.setBounds(547, 129, 84, 20);
		contentPane.add(txtQuantityChocoCroissant);

		JCheckBox cbP3 = new JCheckBox("Blueberry Muffin");
		cbP3.setBounds(327, 152, 159, 20);
		contentPane.add(cbP3);

		txtQuantityBlueberry = new JTextField();
		txtQuantityBlueberry.setBounds(547, 158, 84, 20);
		contentPane.add(txtQuantityBlueberry);

		JCheckBox cbP4 = new JCheckBox("Banana Bread");
		cbP4.setBounds(327, 181, 159, 20);
		contentPane.add(cbP4);

		txtQuantityBanana = new JTextField();
		txtQuantityBanana.setBounds(547, 187, 84, 20);
		contentPane.add(txtQuantityBanana);

		JCheckBox cbP5 = new JCheckBox("Cinnamon Roll");
		cbP5.setBounds(327, 211, 159, 20);
		contentPane.add(cbP5);

		txtQuantityCinnamon = new JTextField();
		txtQuantityCinnamon.setBounds(547, 217, 84, 20);
		contentPane.add(txtQuantityCinnamon);

		// ---------------- DESSERTS ----------------

		JCheckBox cbD1 = new JCheckBox("Cheesecake");
		cbD1.setBounds(332, 305, 126, 20);
		contentPane.add(cbD1);

		txtQuantityCheesecake = new JTextField();
		txtQuantityCheesecake.setBounds(547, 311, 84, 20);
		contentPane.add(txtQuantityCheesecake);

		JCheckBox cbD2 = new JCheckBox("Chocolate Cake");
		cbD2.setBounds(332, 334, 129, 20);
		contentPane.add(cbD2);

		CtxtQuantityChocoCake = new JTextField();
		CtxtQuantityChocoCake.setBounds(547, 340, 84, 20);
		contentPane.add(CtxtQuantityChocoCake);

		JCheckBox cbD3 = new JCheckBox("Brownies");
		cbD3.setBounds(332, 363, 126, 20);
		contentPane.add(cbD3);

		txtQuantityBrownies = new JTextField();
		txtQuantityBrownies.setBounds(547, 369, 84, 20);
		contentPane.add(txtQuantityBrownies);

		JCheckBox cbD4 = new JCheckBox("Donut");
		cbD4.setBounds(332, 392, 126, 20);
		contentPane.add(cbD4);

		txtQuantityDonut = new JTextField();
		txtQuantityDonut.setBounds(547, 398, 84, 20);
		contentPane.add(txtQuantityDonut);

		JCheckBox cbD5 = new JCheckBox("Ice Cream");
		cbD5.setBounds(332, 422, 126, 20);
		contentPane.add(cbD5);

		txtQuantityIceCream = new JTextField();
		txtQuantityIceCream.setBounds(547, 428, 84, 20);
		contentPane.add(txtQuantityIceCream);

		// ---------------- RECEIPT AREA ----------------

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(679, 94, 297, 561);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		// ---------------- DISCOUNT ----------------

		JRadioButton rdbtnStudentDiscount = new JRadioButton("Student");
		rdbtnStudentDiscount.setBounds(332, 490, 142, 20);
		contentPane.add(rdbtnStudentDiscount);

		JRadioButton rdbtnSeniorCitizen = new JRadioButton("Senior Citizen");
		rdbtnSeniorCitizen.setBounds(332, 519, 142, 20);
		contentPane.add(rdbtnSeniorCitizen);

		// ---------------- PAYMENT ----------------

		JRadioButton rdbtnCash = new JRadioButton("Cash");
		rdbtnCash.setBounds(332, 593, 142, 20);
		contentPane.add(rdbtnCash);

		JRadioButton rdbtnOnline = new JRadioButton("Online");
		rdbtnOnline.setBounds(332, 622, 142, 20);
		contentPane.add(rdbtnOnline);

		// ---------------- DONE BUTTON ----------------

		JButton btnDone = new JButton("DONE");
		
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String[] itemNames = {
					"Espresso","Americano","Cappuccino","Caramel Latte","Mocha",
					"Hot Chocolate","Fresh Lemonade","Matcha Latte","Strawberry Milk",
					"Croissant","Chocolate Croissant","Blueberry Muffin","Banana Bread","Cinnamon Roll",
					"Cheesecake","Chocolate Cake","Brownies","Donut","Ice Cream"
				};

				double[] prices = {
					120,130,140,150,150,
					120,110,140,130,
					90,100,110,100,95,
					150,160,120,80,90
				};

				JCheckBox[] checkBoxes = {
					cbC1,cbC2,cbC3,cbC4,cbC5,
					cbNonCoffee1,cbNonCoffee2,cbNonCoffee3,cbNonCoffee4,
					cbP1,cbP2,cbP3,cbP4,cbP5,
					cbD1,cbD2,cbD3,cbD4,cbD5
				};

				JTextField[] quantities = {
					txtQuantityEspresso,txtQuantityAmericano,txtQuantityCappuccino,txtQuantityCaramel,txtQuantityMocha,
					txtQuantityHotChoco,txtQuantityLemonade,txtQuantityMatcha,txtQuantityStrawberry,
					txtQuantityCroissant,txtQuantityChocoCroissant,txtQuantityBlueberry,txtQuantityBanana,txtQuantityCinnamon,
					txtQuantityCheesecake,CtxtQuantityChocoCake,txtQuantityBrownies,txtQuantityDonut,txtQuantityIceCream
				};

				String receipt = "========== CAFE RECEIPT ==========\n\n";
				double total = 0;

				for(int i = 0; i < itemNames.length; i++) {

					if(checkBoxes[i].isSelected()) {

						String qtyText = quantities[i].getText();

						if(isNumber(qtyText)) {

							int qty = Integer.parseInt(qtyText);
							double cost = qty * prices[i];

							total += cost;

							receipt += itemNames[i] + " x" + qty + " = " + cost + "\n";
						}
					}
				}

				receipt += "\n-----------------------------\n";

				if(rdbtnStudentDiscount.isSelected()) {
					total *= 0.90;
					receipt += "Student Discount Applied (10%)\n";
				}

				if(rdbtnSeniorCitizen.isSelected()) {
					total *= 0.80;
					receipt += "Senior Citizen Discount Applied (20%)\n";
				}

				receipt += "\nTOTAL: " + total + "\n";

				if(rdbtnCash.isSelected())
					receipt += "Payment Mode: Cash\n";

				if(rdbtnOnline.isSelected())
					receipt += "Payment Mode: Online\n";

				textArea.setText(receipt);
			}
		});
		
		btnDone.setBounds(492, 480, 139, 46);
		contentPane.add(btnDone);

		

		// ---------------- CLEAR BUTTON ----------------

		JButton btnClear = new JButton("CLEAR");
		btnClear.setBounds(492, 537, 139, 46);
		contentPane.add(btnClear);

		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textArea.setText("");

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
			}
		});
	}

	public boolean isNumber(String input) {
		try {
			Integer.parseInt(input);
			return true;
		} catch (Exception e) {
			javax.swing.JOptionPane.showMessageDialog(this, "Please enter a valid number.");
			return false;
		}
	}
}