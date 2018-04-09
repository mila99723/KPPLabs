package Transformer;
import Signal.Signal;
/**
 *  Class Transformer extends Thread
 *  would be executed as a new thread
 *  counts Fourier Transform for one dott
 *  */
public class Transformer extends Thread{
	private int counter;
	private int resNumber;
	private Signal[] x;
	private Signal dott;
	/** 
	 *@param counter N
	 *@param number of dott in result massive
	 *@param massive of signals
	 *@param link to dott
	 * */
	public Transformer (int _counter, int resN, Signal[] sign, Signal _dott) {
		counter = _counter;
		resNumber = resN;
		x = sign;
		dott = _dott;
	}
	/** 
	 * thread executed 
	 * changes value of dott into the link
	 * */
	public void run () {

		for (int j = 0; j < counter; j++) {	
			if (x[j].getImaginary() == 0) {
				dott.addReal( x[j].getReal() * Math.cos(2 * Math.PI * resNumber * j / counter));
				dott.addImaginary(-1 * x[j].getReal() * Math.sin(2 * Math.PI * resNumber * j / counter));
			}
			else {
				dott.addReal( x[j].getReal() * Math.cos(2 * Math.PI * resNumber * j / counter));
				dott.addImaginary(-1 * x[j].getReal() * Math.sin(2 * Math.PI * resNumber * j / counter));
				dott.addReal( x[j].getImaginary() * Math.sin(2 * Math.PI * resNumber * j / counter));
				dott.addImaginary(x[j].getImaginary() * Math.cos(2 * Math.PI * resNumber * j / counter));
			}
		}
		
	}
}
