package Clothings;
/** Class Shirt extends Clothing, contain extra field shoulders width */
public class Shirt extends Clothing {
	
	private double shoulders;
	
	public double getShoulders() {
		return Math.rint (100.0 * shoulders) / 100.0;
	}
	/** 
	 * initializes Clothing item
	 * width is generated randomly in interval 40 - 60 cm 
	 * */
	public Shirt(String _name, String _type, String _color) {
		super (_name, _type, _color);
		shoulders = 40 + Math.random() * 25; //интервал 40-60 см
	}

}
