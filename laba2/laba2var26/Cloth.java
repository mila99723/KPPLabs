package laba2var26;
/** Cloth class generates random type of color and cloth for making Clothing */
public class Cloth {
	private String color = GetRandColor ();
	private String type = GetRandCloth ();
	
	public String getColor () {
		return color;
	}
	
	public String getCloth () {
		return type;
	}
	/** 
	 * @return randomly 1 of 5 variants of color
	 *  */
	public String GetRandColor() {
		String color1 = "Красный";
		String color2 = "Черный";
		String color3 = "Синий";
		String color4 ="Желтый";
		String color5 = "Зеленый";
		
		int rand = (int)(Math.random()*5);
		
		switch (rand) {
			case 0: return color1;
			case 1: return color2;
			case 2: return color3;
			case 3: return color4;
			case 4: return color5;
			default: return color1;
		}
	}
	/** 
	 * @return randomly 1 of 5 variants of clothType
	 *  */
	public String GetRandCloth() {
		String type1 = "Вельвет";
		String type2 = "Твид";
		String type3 = "Атлас";
		String type4 = "Хлопок";
		String type5 = "Шифон";
		
		int rand = (int)(Math.random()*5);
		
		switch (rand) {
			case 0: return type1;
			case 1: return type2;
			case 2: return type3;
			case 3: return type4;
			case 4: return type5;
			default: return type1;
		}
	}
}
