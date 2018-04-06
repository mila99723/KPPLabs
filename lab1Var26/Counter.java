/** This class counts cylinder dimention */
public class Counter {
	/** ParametrFields height and radius */
	private ParametrField height;
	private ParametrField radius;
	
	public Counter (ParametrField height, ParametrField radius) {
		this.height = height;
		this.radius = radius;
	}
	/** 
	 * @return dimention (V = r^2*PI*H) with 2 numbers after dott
	 *  */
	public double countDimension() {
		return Math.rint(100.0 * height.getParametr()*Math.PI*Math.pow(radius.getParametr(), 2)) / 100.0;
	}
}
