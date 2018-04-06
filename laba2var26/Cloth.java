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
		String color1 = "�������";
		String color2 = "������";
		String color3 = "�����";
		String color4 ="������";
		String color5 = "�������";
		
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
		String type1 = "�������";
		String type2 = "����";
		String type3 = "�����";
		String type4 = "������";
		String type5 = "�����";
		
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
