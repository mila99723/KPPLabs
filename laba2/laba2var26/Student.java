package laba2var26;
/** Student class is a student that makwes order to tailor, extends Human */
public class Student extends Human {
	/**
	 * Calling Tailors TakeMerch
	 * @param object student contains parametrs for tailor TakeMerch method
	 * @return item of prepered Clothing
	 * */
	public Clothing MakeOrder () {
		Clothing item = Tailor.TakeMerch(this);
		return item;
	}
}
