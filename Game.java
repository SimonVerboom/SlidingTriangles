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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game extends JPanel {

	public static final int APPLICATION_WIDTH = 800;
	public static final int APPLICATION_HEIGHT = 1000;
	private List<Integer> oddList = new ArrayList<Integer>(Arrays.asList(
		1,3,5,7,9,11,13,15,17));
	private List<Integer> evenList = new ArrayList<Integer>(Arrays.asList(
		2,4,6,8,10,12,14,16,18));
	private ArrayList<Integer> currentList = new ArrayList<Integer>();

	private Scanner scanner = new Scanner(System.in);
	private JFrame window = new JFrame();
	private JPanel panel = new JPanel();

	public static void main(String[] args) {
		Game game = new Game();
		game.slidingTriangles();
	}
	
	public void slidingTriangles() {
		createGame();
		executeGame();
	}
	
	public void createGame() {
		shuffleLists();
		setFrameImgs();
	}
	
	public void shuffleLists() {
		Collections.shuffle(oddList);
		Collections.shuffle(evenList);
	}

	private void executeGame(){
		System.out.println("What triangle do you want to move?");
		int userInput = scanner.nextInt();

		System.out.println(currentList);

		for(int i=2; i<currentList.size(); i++){
			if((currentList.get(i) == userInput) && ((currentList.get(i-2) == 19) || (currentList.get(i-2) == 20)) ){
				if(isEven(currentList.get(i)) == true){
					swapInteger(currentList.indexOf(20), i);
				}
				else{
					swapInteger(currentList.indexOf(19), i);
				}
			}
		}
		System.out.println(currentList);
		refillFrame(currentList);
	}

	private void swapInteger(int base, int userInput){
		Collections.swap(currentList, base, userInput);
	}

	private void setFrameImgs() {
		panelAdd(Integer.toString(19));
		panelAdd(Integer.toString(20));
		
		currentList.add(0, 19);
		currentList.add(1, 20);
        
        for (int i=1;i<19; i++){
        	int random;
        	if(isEven(i) == false) {
        		random = oddList.get(0);
        		oddList.remove(0);
        		String index = Integer.toString(random);
        		panelAdd(index);
        	} else {
        		random = evenList.get(0);
        		evenList.remove(0);
        		String index = Integer.toString(random);
        		panelAdd(index);
        	}
        	currentList.add(currentList.size(), random);
        }
        window.setContentPane(panel);
        window.setTitle("Sliding Triangles");
        window.setResizable(false);
		window.setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public boolean isEven(int i) {
		if(i % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void refillFrame(List<Integer> triangles){
		panel.removeAll();
		for(int entry : triangles){
			String index = Integer.toString(entry);
			panelAdd(index);
		}
	}

	public void panelAdd(String index) {
    	JLabel triangle = new JLabel();
    	triangle.setIcon(new ImageIcon("Images/" + index + ".png"));
        panel.add(triangle);
	}
}



