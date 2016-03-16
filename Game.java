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

	private BufferedReader img;
	public static final int APPLICATION_WIDTH = 600;
	public static final int APPLICATION_HEIGHT = 600;

	private static final int WIDTH = APPLICATION_WIDTH;
	private static final int HEIGHT = APPLICATION_HEIGHT;

	public static void main(String[] args) {
		Game game = new Game();
		game.slidingTriangles();
	}

	public void slidingTriangles() {
		createGame();
		executeGame();
	}
	public void createGame() {
		setFrameImgs();

	}
	private void setFrameImgs() {
	    JFrame window = new JFrame();
	    JPanel panel = new JPanel();
		window.setContentPane(panel);
        JLabel label = new JLabel();
        window.setTitle("Sliding Triangles");
		window.setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
        label.setIcon(new ImageIcon("Images/1.png"));
        panel.add(label);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
 


		private void executeGame() {

		}

}





















