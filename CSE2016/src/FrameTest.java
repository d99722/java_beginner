import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(300, 200);
		frame.setTitle("My");
		TestPanel tp = new TestPanel();
		frame.getContentPane().add(tp);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

}
