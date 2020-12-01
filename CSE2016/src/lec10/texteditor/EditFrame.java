package lec10.texteditor;

import java.awt.*; 
import javax.swing.*; 

public class EditFrame extends JFrame { 
	private EditModel buffer = new EditModel("", 15, 50);
	
	public EditFrame() { 		
		ReplaceFrame second_frame = new ReplaceFrame(buffer); 
		Container cp = getContentPane(); 
		cp.setLayout(new BorderLayout()); 
		JMenuBar mbar = new JMenuBar();
		JMenu file = new JMenu("File");	
		file.add(new ClearMenuItem("New", buffer)); 
		file.add(new QuitMenuItem("Exit"));
		mbar.add(file);	
		JMenu edit = new JMenu("Edit");	 
		edit.add(new CutMenuItem("Cut", buffer)); 
		edit.add(new CopyMenuItem("Copy", buffer)); 
		edit.add(new PasteMenuItem("Paste", buffer)); 
		edit.addSeparator();
		JMenu search = new JMenu("Search"); 
		search.add(new FindMenuItem("Find", buffer)); 
		search.add(new ReplaceMenuItem("Replace", second_frame));
		edit.add(search); 
		mbar.add(edit); 
		setJMenuBar(mbar); 
		JScrollPane sp = new JScrollPane(buffer); 
		cp.add(sp, BorderLayout.CENTER); 
		setTitle("EditFrame"); 
		pack(); 
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new EditFrame();
	}
}