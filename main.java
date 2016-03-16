import java.io.File;
import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Game {
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
		private void createGame() {
			setFrame();
		}
			private void setFrame() {
			    Frame f = new Frame("Ex. 9.1");
			    f.setSize(APPLICATION_WIDTH,APPLICATION_HEIGHT);
			    f.setVisible(true);
			    readImgs();
			}
			private void readImgs() {
				BufferedImage img = null;
				try {
    				img = ImageIO.read(new File("Images/1.png"));
				} catch (IOException e) {
				}				
			}
		private void executeGame() {

		}

}





















