package lec8;

import javax.swing.JOptionPane;

public class PuzzleController {
	
	private SlidePuzzleBoard board;
	private PuzzleWriter writer;
	
	public PuzzleController(SlidePuzzleBoard b, PuzzleWriter w) {
		board = b;
		writer = w;
	}
	
	public void play() {
		boolean process = true;
		while (process) {
			writer.displayBoard();
			int i = Integer.parseInt(JOptionPane.showInputDialog("Your move : \n(0 = end)"));
			if(i==0) {
				process = false;
			} else if(!board.move(i)) {
				writer.printError("Wrong number");
			} 
		}
	}
}
