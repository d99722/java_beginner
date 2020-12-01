package lec10.tempconv;

/** TempFrame builds a completed view for a temperature converter */ 
public class TempFrame extends AbsTempFrame {
	
	public TempFrame() { 
		super();
	}
  
	public void displayError(String s) { 
		displayAnswer("Error: " + s); 
	} // invoke method in superclass
}