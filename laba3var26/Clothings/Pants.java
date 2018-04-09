package Clothings;
/** Class Pants extends Clothing, contain extra field length */
public class Pants extends Clothing {
	
	private double length;
	
	public double getLength() {
		return Math.rint (100.0 * length) / 100.0;
	}
	/** 
	 * initializes Clothing item
	 * length is generated randomly in interval 90 - 110 cm 
	 * */
	public Pants(String _name, String _type, String _color) {
		super(_name, _type, _color);
		length = 90 + Math.random() * 20;
	}
}
