import javafx.scene.layout.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.application.*;
import javafx.event.*;

import Signal.Signal;
import Transformer.Transformer;

/** @author Vysotskaya
* @version 2.0
* <h1> Counting Fourier Transform of discrete signal<h1>
* <p> programm generates number of counts N (1-10) 
* and values for appropriete number of signals (complex number real and immaginary part -100 - 100)
* <p> than each dott is counted in new thread
* */

public class FourierTransformVer2 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			/** creat gridPane and it elements */
			GridPane root = new GridPane();
			Scene scene = new Scene(root,350,250);
			
			Label counterN = new Label ("Число отсчетов N: ");
			root.add(counterN, 0, 0);
			Label[] x = new Label[10];
			for (int i = 0; i < 10; i++) {
				Label temp = new Label("");
				x[i] = temp;
				root.add(x[i], 0, i+1);
			}
			Label[] res = new Label[10];
			for (int i = 0; i < 10; i++) {
				Label temp = new Label("");
				res[i] = temp;
				root.add(res[i], 1, i+1);
			}
		    Button generate = new Button ("Сгенерировать сигнал");
		    root.add(generate, 1, 11);
		    
		    /** Action of  generating signal, counting Fourier in each dott and displaing result */
		    generate.setOnAction(new EventHandler<ActionEvent>() {
				@Override
				public void handle(ActionEvent e) {
					/** generating counter and each signal */
					int counter =  (int) (1 + Math.random() * 9);
					counterN.setText("Число отсчетов N: " + counter);
					 Signal[] signMas = new Signal[counter];
					
					for (int i = 0; i < counter; i++) {
						Signal temp = new Signal();
						temp.setReal(Math.random() * 200 - 100);
						temp.setImaginary(Math.random() * 200 - 100);
						signMas[i] = temp;
					}
					/** displaing signals values */
					for (int i = 0; i < counter; i++) {
						
						String resMinus = "x" + Integer.toString(i) + " = " + Double.toString(Math.rint(100.0 * signMas[i].getReal())/100.0)  + Double.toString(Math.rint(100.0 *signMas[i].getImaginary())/100.0) + "i";
						String resPlus = "x" + Integer.toString(i) + " = " + Double.toString(Math.rint(100.0 * signMas[i].getReal())/100.0) + "+" + Double.toString(Math.rint(100.0 *signMas[i].getImaginary())/100.0) + "i";
						if (signMas[i].getImaginary() < 0) {
							x[i].setText(resMinus);
						}
						else {
							x[i].setText(resPlus);
						}
					}
					for (int j = counter; j < 10; j++) {
						x[j].setText("");
					}
					/** counting each dott in a new thread */
					Signal[] resMas = new Signal[counter];
					
					for (int i = 0; i < counter; i++) {
						
						Signal temp = new Signal();
						Transformer iteration = new Transformer(counter, i, signMas, temp);
						iteration.start();
						while (iteration.isAlive() == true) { }
						resMas[i] = temp;
					}
					/** displaing result for each dott */
					for (int i = 0; i < counter; i++) {
						
						String resMinus = "X(" + Integer.toString(i) + ") = " + Double.toString(Math.rint(100.0 * resMas[i].getReal())/100.0)  + Double.toString(Math.rint(100.0 *resMas[i].getImaginary())/100.0) + "i";
						String resPlus = "X(" + Integer.toString(i) + ") = " + Double.toString(Math.rint(100.0 * resMas[i].getReal())/100.0) + "+" + Double.toString(Math.rint(100.0 *resMas[i].getImaginary())/100.0) + "i";
						if (resMas[i].getImaginary() < 0) {
							res[i].setText(resMinus);
						}
						else {
							res[i].setText(resPlus);
						}
					}
					for (int j = counter; j < 10; j++) {
						res[j].setText("");
					}
				}
			});
		    /**Showing stage*/
			primaryStage.setScene(scene);
			primaryStage.show();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
