package Signal;
/** class Signal is a structure for signals and dotts that consists of real and immaginary parts */
public class Signal {
	private double real;
	private double imaginary;
	
	public Signal () {
		real = 0;
		imaginary = 0;
	}
	
	public double getReal () {
		return real;
	}
	
	public double getImaginary () {
		return imaginary;
	}
	
	public void setImaginary (double im) {
		imaginary = im;
	}
	
	public void setReal (double re) {
		real = re;
	}
	
	public void addReal (double re) {
		real += re;
	}
	
	public void addImaginary (double im) {
		imaginary += im;
	}
}
