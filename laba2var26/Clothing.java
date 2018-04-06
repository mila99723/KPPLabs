package laba2var26;
/** Clothing class is a made by Tailor order of Student */
public class Clothing {
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
	
	public void setClient(String _client) {
		this.client = _client;
	}
	
	public void setColor(String _color) {
		this.color = _color;
	}
	
	public void setCloth(String _cloth) {
		this.cloth = _cloth;
	}
}
