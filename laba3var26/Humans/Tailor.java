package Humans;
import Clothings.*;

/** Tailor class is a tailor that takes student parametrs and creates ordered clothing, extends Human */
public class Tailor extends Human {
	/** 
	 * @param student contains object Student with student parametrs
	 * sets student parametrs to object of Tailor class
	 *  */
	public void TakeMerch (Student student) {
		this.setName (student.getName());
		this.setHeight (student.getHeight());
		this.setWaist (student.getWaist());
		this.setChest (student.getChest());
	}
	/**
	 * creates object of Shirt
	 * reduces cloth quantity
	 * @return item of Shirt
	 * */
	public Shirt makeShirt () {
		Cloth cloth = new Cloth();
		cloth.reduceQuantity();
		Shirt shirt = new Shirt(this.getName(), cloth.getCloth(), cloth.getColor());
		return shirt;
	}
	/**
	 * creates object of Pants
	 * reduces cloth quantity
	 * @return item of Pants
	 * */
	public Pants makePants () {
		Cloth cloth = new Cloth();
		cloth.reduceQuantity();
		Pants pants = new Pants(this.getName(), cloth.getCloth(), cloth.getColor()); 
		return pants;
	}
}
