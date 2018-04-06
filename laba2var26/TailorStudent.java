package laba2var26;
/**
 * @author Vysotskaya
 * @version 1.0
 * <h1> Student Ordering Clothing to Tailor<h1>
 * <p>The TailorStudent recives paramerts of student(extended from class Human) pushes it to tailor
 * then tailor creates object of clothing with some type of cloth and color
 * */
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TailorStudent {
	public static void main(String[] args) {
		
		/** Create interface elements */
		JLabel student = new JLabel("Студент");
		JLabel name = new JLabel("Имя: ");
		JLabel waist = new JLabel("Талия: ");
		JLabel height = new JLabel("Рост: ");
		JLabel chest = new JLabel("Грудь: ");
		JButton makeOrder = new JButton("Сделать заказ");
		JTextField enterName = new JTextField(10);
		JTextField enterWaist = new JTextField(10);
		JTextField enterHeight = new JTextField(10);
		JTextField enterChest = new JTextField(10);
		JLabel clothing = new JLabel("Получена одежда");
		JLabel client = new JLabel("Клиент: ");
		JLabel cloth = new JLabel("Ткань: ");
		JLabel color = new JLabel("Цвет: ");
		JLabel clientName = new JLabel("");
		JLabel clothName = new JLabel("");
		JLabel colorName = new JLabel("");
		
		/** Add Frame and its elements */
		JFrame myWindow = new JFrame("Student Ordering Clothing");
		
		myWindow.setSize(500, 200);
		myWindow.setResizable(false);
		myWindow.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.fill = GridBagConstraints.VERTICAL;
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		myWindow.add(student, constraints);
		constraints.gridx = 0;
		constraints.gridy = 1;
		myWindow.add(name, constraints);
		constraints.gridx = 0;
		constraints.gridy = 2;
		myWindow.add(height, constraints);
		constraints.gridx = 0;
		constraints.gridy = 3;
		myWindow.add(waist, constraints);
		constraints.gridx = 0;
		constraints.gridy = 4;
		myWindow.add(chest, constraints);
		constraints.gridx = 1;
		constraints.gridy = 5;
		myWindow.add(makeOrder, constraints);
		constraints.gridx = 1;
		constraints.gridy = 1;
		myWindow.add(enterName, constraints);
		constraints.gridx = 1;
		constraints.gridy = 2;
		myWindow.add(enterHeight, constraints);
		constraints.gridx = 1;
		constraints.gridy = 3;
		myWindow.add(enterWaist, constraints);
		constraints.gridx = 1;
		constraints.gridy = 4;
		myWindow.add(enterChest, constraints);
		constraints.gridx = 2;
		constraints.gridy = 0;
		myWindow.add(clothing, constraints);
		constraints.gridx = 2;
		constraints.gridy = 1;
		myWindow.add(client, constraints);
		constraints.gridx = 2;
		constraints.gridy = 2;
		myWindow.add(cloth, constraints);
		constraints.gridx = 2;
		constraints.gridy = 3;
		myWindow.add(color, constraints);
		constraints.gridx = 3;
		constraints.gridy = 1;
		myWindow.add(clientName, constraints);
		constraints.gridx = 3;
		constraints.gridy = 2;
		myWindow.add(clothName, constraints);
		constraints.gridx = 3;
		constraints.gridy = 3;
		myWindow.add(colorName, constraints);
	
		/** Action of creating Clothing when user press "MakeOrder" 
		 * @exeption when there are simbols in double fields or other bad parametrs the order is error
		 * when the number is <0 tailor takes its by module
		 * */
		makeOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					/** Create object human and reading into it student parametrs */
					//Human student = new Human();
					Student student = new Student();
					student.setName(enterName.getText());
					student.setWaist(Math.abs(Double.parseDouble(enterWaist.getText())));
					student.setHeight(Math.abs(Double.parseDouble(enterHeight.getText())));
					student.setChest(Math.abs(Double.parseDouble(enterChest.getText())));
					/** Create clothing and showing it */
					Clothing item = student.MakeOrder();
					clientName.setText(item.getClient());
					clothName.setText(item.getCloth());
					colorName.setText(item.getColor());
					}
				catch(NumberFormatException ex) {
					clientName.setText("ERROR");
					clothName.setText("");
					colorName.setText("");
				}
			}
		});
		/** condition of exit and showing GUI */
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setVisible(true);
	}
}
