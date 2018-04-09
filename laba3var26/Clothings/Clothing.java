package Clothings;
/** Clothing class is abstraction for different clothing items like pants and shirt */
public abstract class Clothing {
	private String client;
	private String cloth;
	private String color;
	//private String size;
	
	public Clothing (String _name, String _type, String _color) {
		client = _name;
		cloth = _type;
		color = _color;
	}
	
	public String getClient() {
		return  client;
	}
	
	public String getColor() {
		return  color;
	}
	
	public String getCloth() {
		return  cloth;
	}
}
