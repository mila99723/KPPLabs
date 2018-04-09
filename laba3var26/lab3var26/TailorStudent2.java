package lab3var26;
import Humans.*;
import Clothings.*;

/** @author Vysotskaya
* @version 2.0
* <h1> Student Ordering Clothing Shirt and Pants to Tailor<h1>
* <p>The TailorStudent recives paramerts of student(extended from class Human) pushes it to tailor
* then tailor creates object of pants and shirt with some type of cloth and color
* */
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TailorStudent2 {
	public static void main (String[] args) {
		
		/** Create interface elements */
		JLabel student = new JLabel ("Студент");
		JLabel name = new JLabel ("Имя: ");
		JLabel waist = new JLabel ("Талия: ");
		JLabel height = new JLabel ("Рост: ");
		JLabel chest = new JLabel ("Грудь: ");
		JButton makeOrder = new JButton ("Сделать заказ");
		JButton moreCloth = new JButton ("Пополнить");
		JTextField enterName = new JTextField (10);
		JTextField enterWaist = new JTextField (10);
		JTextField enterHeight = new JTextField (10);
		JTextField enterChest = new JTextField (10);
		JLabel clothing = new JLabel ("ПОЛУЧЕНА ОДЕЖДА:");
		JLabel client = new JLabel ("Клиент: ");
		JLabel cloth = new JLabel ("Ткань: ");
		JLabel color = new JLabel ("Цвет: ");
		JLabel pants = new JLabel ("Штаны: ");
		JLabel shirt = new JLabel ("Рубашка: ");
		JLabel size = new JLabel ("Плечи/Длина: ");
		JLabel clothQuantity = new JLabel ("Ткани осталось: ");
		JLabel clientNameS = new JLabel ("");
		JLabel clothNameS = new JLabel ("");
		JLabel colorNameS = new JLabel ("");
		JLabel shouldersS = new JLabel ("");
		JLabel clientNameP = new JLabel ("");
		JLabel clothNameP = new JLabel ("");
		JLabel colorNameP = new JLabel ("");
		JLabel lengthP = new JLabel ("");
		JLabel quantity = new JLabel ("");
		quantity.setText (Double.toString (Cloth.getQuantity()));
		
		
		/** Add Frame and its elements */
		JFrame myWindow = new JFrame ("Student Ordering Clothing");
		
		myWindow.setSize (500, 200);
		myWindow.setResizable (false);
		myWindow.setLayout (new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.fill = GridBagConstraints.VERTICAL;
		
		constraints.gridx = 0;
		constraints.gridy = 0;
		myWindow.add (student, constraints);
		constraints.gridx = 0;
		constraints.gridy = 1;
		myWindow.add (name, constraints);
		constraints.gridx = 0;
		constraints.gridy = 2;
		myWindow.add (height, constraints);
		constraints.gridx = 0;
		constraints.gridy = 3;
		myWindow.add (waist, constraints);
		constraints.gridx = 0;
		constraints.gridy = 4;
		myWindow.add (chest, constraints);
		constraints.gridx = 1;
		constraints.gridy = 6;
		myWindow.add (makeOrder, constraints);
		constraints.gridx = 1;
		constraints.gridy = 1;
		myWindow.add(enterName, constraints);
		constraints.gridx = 1;
		constraints.gridy = 2;
		myWindow.add (enterHeight, constraints);
		constraints.gridx = 1;
		constraints.gridy = 3;
		myWindow.add (enterWaist, constraints);
		constraints.gridx = 1;
		constraints.gridy = 4;
		myWindow.add (enterChest, constraints);
		constraints.gridx = 2;
		constraints.gridy = 2;
		myWindow.add (client, constraints);
		constraints.gridx = 2;
		constraints.gridy = 3;
		myWindow.add (cloth, constraints);
		constraints.gridx = 2;
		constraints.gridy = 4;
		myWindow.add (color, constraints);
		constraints.gridx = 2;
		constraints.gridy = 5;
		myWindow.add (size, constraints);
		constraints.gridx = 3;
		constraints.gridy = 0;
		myWindow.add (clothing, constraints);
		constraints.gridx = 3;
		constraints.gridy = 1;
		myWindow.add (shirt, constraints);
		constraints.gridx = 3;
		constraints.gridy = 2;
		myWindow.add (clientNameS, constraints);
		constraints.gridx = 3;
		constraints.gridy = 3;
		myWindow.add (clothNameS, constraints);
		constraints.gridx = 3;
		constraints.gridy = 4;
		myWindow.add (colorNameS, constraints);
		constraints.gridx = 3;
		constraints.gridy = 5;
		myWindow.add (shouldersS, constraints);
		constraints.gridx = 4;
		constraints.gridy = 1;
		myWindow.add (pants, constraints);
		constraints.gridx = 4;
		constraints.gridy = 2;
		myWindow.add (clientNameP, constraints);
		constraints.gridx = 4;
		constraints.gridy = 3;
		myWindow.add (clothNameP, constraints);
		constraints.gridx = 4;
		constraints.gridy = 4;
		myWindow.add (colorNameP, constraints);
		constraints.gridx = 4;
		constraints.gridy = 5;
		myWindow.add (lengthP, constraints);
		constraints.gridx = 2;
		constraints.gridy = 6;
		myWindow.add (clothQuantity, constraints);
		constraints.gridx = 3;
		constraints.gridy = 6;
		myWindow.add (quantity, constraints);
		constraints.gridx = 4;
		constraints.gridy = 6;
		myWindow.add (moreCloth, constraints);
		moreCloth.setEnabled(false);
	
		/** Action of creating Clothing when user press "MakeOrder" 
		 * @exeption when there are simbols in double fields or other bad parametrs the order is error
		 * when the number is <0 tailor takes its by module
		 * */
		makeOrder.addActionListener (new ActionListener() {
			public void actionPerformed (ActionEvent e) {
				try {
					/** 
					 * if cloth is over no more clothing items are created
					 * but the button of adding cloth is enabled
					 *  */
					if (Cloth.getQuantity() <= 0) {
						clientNameS.setText("NO MORE CLOTH");
						clothNameS.setText("");
						colorNameS.setText("");
						shouldersS.setText("");
						clientNameP.setText("NO MORE CLOTH");
						clothNameP.setText("");
						colorNameP.setText("");
						lengthP.setText("");
						moreCloth.setEnabled(true);
						
					}
					else {
						/** 
						 * Create object student and reading into it student parametrs 
						 * Create object of tailor, who would make the order
						 * */
						Student student = new Student();
						Tailor tailor = new Tailor();
						student.setName (enterName.getText());
						student.setWaist (Math.abs (Double.parseDouble (enterWaist.getText())));
						student.setHeight (Math.abs (Double.parseDouble (enterHeight.getText())));
						student.setChest (Math.abs (Double.parseDouble (enterChest.getText())));
						/** Create clothing and showing it */
						tailor.TakeMerch (student);
						Shirt shirt = tailor.makeShirt();
						clientNameS.setText (shirt.getClient());
						clothNameS.setText (shirt.getCloth());
						colorNameS.setText (shirt.getColor());
						shouldersS.setText (Double.toString (shirt.getShoulders()));
						Pants pants = tailor.makePants();
						clientNameP.setText (pants.getClient());
						clothNameP.setText (pants.getCloth());
						colorNameP.setText (pants.getColor());
						lengthP.setText (Double.toString (pants.getLength()));
						quantity.setText (Double.toString (Cloth.getQuantity()));
					}
				}
				catch(NumberFormatException ex) {
					clientNameS.setText ("ERROR");
					clothNameS.setText ("");
					colorNameS.setText ("");
					shouldersS.setText ("");
					clientNameP.setText ("ERROR");
					clothNameP.setText ("");
					colorNameP.setText ("");
					lengthP.setText ("");
				}
			}
		});
		/** 
		 * Action of adding more cloth, if it is already over 
		 * and again disabling the button
		 * */
		moreCloth.addActionListener (new ActionListener() {
			public void actionPerformed (ActionEvent e) { 
				Cloth.addQuantity();
				quantity.setText (Double.toString (Cloth.getQuantity()));
				moreCloth.setEnabled(false);
			}
		});
		
		/** condition of exit and showing GUI */
		myWindow.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		myWindow.setVisible (true);
	}
}
