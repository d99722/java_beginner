package lec10.texteditor;

import java.awt.*; 
import javax.swing.*; 

public class EditModel extends JTextArea { 
	
	public EditModel(String initial_text, int rows, int cols) { 
		super(initial_text, rows, cols);	
		setLineWrap(true); 
		setFont(new Font("Courier", Font.PLAIN, 14));
	}
	
	public void clear() { 
		setText(""); 
	}
	
	private int find(String s, int position) { 
		int index = getText().indexOf(s, position);	
		if(index != -1) {
			setCaretPosition(index + s.length());  
			moveCaretPosition(index);	
		}
		return index;
	}
	
	public int findFromStart(String s) { 
		return find(s, 0); 
	}	
	
	public int findFromCaret(String s) { 
		return find(s, getCaretPosition()); 
	}
}