package lec8;

import javax.swing.JOptionPane;

public class VoteCount {

	public static void main(String[] args) {
		int num_candidates = 4;
		int[] votes = new int[num_candidates];
		
		boolean processing = true;
		while(processing) {
			int v = Integer.parseInt(JOptionPane.showInputDialog("원하는 후보에 투표하세요."));
			if (v>=0&&v<votes.length)
				votes[v] = votes[v]+1;
			else
				processing = false;
		}
		for (int i = 0; i !=votes.length; i++)
			System.out.println("후보 "+i+"번이 "+votes[i]+"표를 득표하였습니다.");
		
	}

}
