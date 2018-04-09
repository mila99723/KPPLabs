package Clothings;
/** Cloth class generates random type of color and cloth for making Clothing 
 * and contains field of cloth quantity. When new clothing is made quantity diminish
 * */
public class Cloth {
	private String color = GetRandColor ();
	private String type = GetRandCloth ();
	private static double quantity = 966;  //���� �������� �� 6 (3 �������, 3 �����) � �� ���������� <0
	
	public String getColor () {
		return color;
	}
	
	public String getCloth () {
		return type;
	}
	
	public static double getQuantity () {
		return Math.rint (100.0 * quantity) / 100.0;
	}
	/** diminish cloth quantity for 3 metres for each clothing item*/
	public void reduceQuantity () {
		quantity -= 3;
	}
	/** adds 966 metres to cloth quantity */
	public static void addQuantity () {
		quantity += 966.0;
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
