package Mine;

import javax.swing.JButton;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Main {
	public static void Closebybutton(JFrame f) { // ������
		f.dispose();
	}

	public static void main(String[] args) {
		new Start_Menu("Game!", 1600, 1000);
	}
}
