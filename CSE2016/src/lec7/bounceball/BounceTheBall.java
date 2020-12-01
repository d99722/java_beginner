package lec7.bounceball;

import java.awt.*;

public class BounceTheBall {

	public static void main(String[] args) {
		int box_size = 200;
		int balls_radius = 6;
		Box box = new Box(box_size);
		
		MovingBall ball = new MovingBall((int)(box_size/3.0), (int)(box_size/5.0), balls_radius, box);
		BallWriter ball_writer = new BallWriter(ball,Color.red);
		BoxWriter box_writer = new BoxWriter(box);
		AnimationWriter writer = new AnimationWriter(box_writer, ball_writer, box_size);
		
		new BounceController(ball, writer).runAnimation();
	}

}
