/**
 * @author Vysotskaya
 * @version 1.0
 * <h1> CylinderDimentionCounter<h1>
 * <p>The CylinderDimentionCounter recives two numbers: Hight and radius of a cylinder
 * then counts its dimention and displays it
 * */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CylinderDimensionCounter {

	public static void main(String[] args) {
		/** Create interface elements */
		ParametrField height = new ParametrField(20);
		ParametrField radius = new ParametrField(20);
		JLabel heightLabel = new JLabel("Высота цилиндра: ");
		JLabel radiusLabel = new JLabel("Радиус вращения: ");
		JLabel resultString = new JLabel("Объем цилиндра: ");
		JLabel resultNumber = new JLabel("");
		JButton counter = new JButton("Вычислить");
		JButton clean = new JButton("Отчистить");
		
		/** Add Frame and its elements*/
		JFrame myWindow = new JFrame("Cylinder Dimension Counter");
		myWindow.setSize(400, 150);
		myWindow.setResizable(false);
		
		myWindow.setLayout(new FlowLayout());
		myWindow.add(heightLabel);
		myWindow.add(height);
		myWindow.add(radiusLabel);
		myWindow.add(radius);
		myWindow.add(resultString);
		myWindow.add(resultNumber);
		myWindow.add(counter);
		myWindow.add(clean);
		
		Counter count = new Counter (height, radius);
		/** Action of counting and showing result when user press "Count" */
		counter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String res = Double.toString(count.countDimension());
				resultNumber.setText(res);
			}
		});
		
		clean.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				height.setText("");
				radius.setText("");
			}
		});
		
		/** condition of exit and showing GUI */
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.setVisible(true);
	}
}
