package laba2var26;
/** Tailor class is a tailor that takes student parametrs and creates ordered clothing, extends Human */
public class Tailor extends Human {
	/** 
	 * @param student contains object Student with student parametrs
	 * @param cloth creates object of Cloth with necessary for Clothing paramets
	 * @return item of created Clothing
	 *  */
	public static Clothing TakeMerch (Student student) {
		Cloth cloth = new Cloth();
		Clothing item = new Clothing(student.getName(), cloth.getCloth(), cloth.getColor());
		return item;
	}
}
