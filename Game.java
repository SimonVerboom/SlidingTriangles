import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;

import javax.imageio.ImageIO;
import java.awt.event.MouseEvent;

public class Game extends JPanel{

	public static final int APPLICATION_WIDTH = 600;
	public static final int APPLICATION_HEIGHT = 600;

	public static void main(String[] args) {
		Game game = new Game();
		game.slidingTriangles();
	}

	public void slidingTriangles() {
		createGame();
	}
	public void createGame() {
		setFrameImgs();

	}
	private void setFrameImgs() {

		JFrame window = new JFrame();
		JPanel panel = new JPanel();
        

        for (int i=0;i<20; i++){
        	JLabel triangle = new JLabel();
        	String index = Integer.toString(i+1);

        	triangle.setIcon(new ImageIcon("Images/" + index + ".png"));
            panel.add(triangle);
        }

        window.setContentPane(panel);
        window.setTitle("Sliding Triangles");
		window.setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}





















