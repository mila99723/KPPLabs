import javax.swing.JTextField;
/** This class takes data from text fields */
public class ParametrField extends JTextField{
	public ParametrField(int columns) {
		super(columns);
	}
	/**
	 * Getting parametr from TextField
	 * @param paremetr gets text from TextField and changes to doudle
	 * @return parametr double number of hight or radius
	 * @exception if in TextField is not a number or <0 number parametr return 0 
	 * */
	public double getParametr() {
		try {
			double parametr = Double.parseDouble(getText());
			if (parametr<0) return 0;
			else return parametr;
		}
		catch (NumberFormatException ex) {
			return 0;
		}
	}
}
