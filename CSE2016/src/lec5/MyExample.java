package lec5;

import javax.swing.JOptionPane;

public class MyExample {

	public static void main(String[] args) {
		int width = 300;
		int height = 200;
		MyWriter w = new MyWriter(width, height);
		String s = JOptionPane.showInputDialog("보고 싶은 단어를 입력하세요");
		w.writeSentence(s);
		w.positionSentence(150,150);
	}

}
