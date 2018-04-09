package Humans;
/** Student class is a student that makwes order to tailor, extends Human */
public class Student extends Human {
	/**
	 * @param object of Tailor, to whom student makes order
	 * Calling Tailors TakeMerch
	 * */
	public void MakeOrder (Tailor tailor) {
		/** @param of TakeMerch - this object of Student with parametrs */
		tailor.TakeMerch (this);
	}
}
