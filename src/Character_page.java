package Mine;

import javax.swing.*;
import java.net.URL;
import java.awt.image.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.awt.event.*;
import java.awt.*;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

public class Character_page extends JFrame implements ActionListener {
	static JLabel arrow = new JLabel();
	static JLabel arrow2 = new JLabel();
	private String title;
	static JFrame frame_C;
	private int width, height;
	private KeyManager keyManager;

	public Character_page(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		keyManager = new KeyManager();
		frame_C = new JFrame();
		frame_C.setSize(width, height);
		frame_C.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame_C.setLayout(null);
		DisplayP1(arrow);

		JLabel character_1 = new JLabel();
		ImageIcon character_1_icon = new ImageIcon("./res/images/p1270.png");
		character_1.setIcon(character_1_icon);
		character_1.setLocation(190, 200);
		character_1.setSize(300, 300);

		JLabel character_2 = new JLabel();
		ImageIcon character_2_icon = new ImageIcon("./res/images/hulk.png");
		character_2.setIcon(character_2_icon);
		character_2.setLocation(490, 200);
		character_2.setSize(300, 300);

		JLabel character_3 = new JLabel();
		ImageIcon character_3_icon = new ImageIcon("./res/images/cowboy.png");
		character_3.setIcon(character_3_icon);
		character_3.setLocation(790, 200);
		character_3.setSize(300, 300);

		JLabel character_4 = new JLabel();
		ImageIcon character_4_icon = new ImageIcon("./res/images/p1270.png");
		character_4.setIcon(character_4_icon);
		character_4.setLocation(1090, 200);
		character_4.setSize(300, 300);

		frame_C.add(character_4);
		frame_C.add(character_3);
		frame_C.add(character_2);
		frame_C.add(character_1);
		frame_C.setLocation(150, 50);
		frame_C.setVisible(true);
		frame_C.addKeyListener(keyManager);
		frame_C.setFocusable(true);
	}

	public KeyManager getKeyManager() {
		return keyManager;
	}

	static public void P1_arrow_move(int x) {
		arrow.setLocation(x, 100);
	}

	static public void P2_arrow_move(int x) {
		arrow2.setLocation(x, 100);
	}

	public void DisplayP1(JLabel arrow) {
		try {
			ImageIcon icon = new ImageIcon(new URL("https://i.imgur.com/fXbu8CJ.gif"));
			arrow.setIcon(icon);
			arrow.setFont(new Font("SansSerif", Font.ITALIC, 28));
			arrow.setText("P1");
			arrow.setLocation(300, 100);
			arrow.setSize(200, 100);
			frame_C.add(arrow);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void actionPerformed(ActionEvent e) {
	}
}