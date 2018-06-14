package Mine;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class KeyManager implements KeyListener {
	private boolean[] keys;
	private int x = 300;
	private boolean next;
	public boolean left, right, enter;

	public KeyManager() {
		keys = new boolean[256];
	}

	
	public void tick() {
		left = keys[KeyEvent.VK_LEFT];
		right = keys[KeyEvent.VK_RIGHT];
		enter = keys[KeyEvent.VK_ENTER];

	}

	
	public void DisplayP2(JLabel arrow2) {
		try {
			// ImageIcon icon = new ImageIcon("/images/333.png");
			ImageIcon icon = new ImageIcon(new URL("https://i.imgur.com/fXbu8CJ.gif"));
			Character_page.arrow2.setIcon(icon);
			Character_page.arrow2.setFont(new Font("SansSerif", Font.ITALIC, 28));
			Character_page.arrow2.setText("P2");
			Character_page.arrow2.setLocation(x, 100);
			Character_page.arrow2.setSize(200, 100);
			Character_page.frame_C.add(Character_page.arrow2);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// keys[e.getKeyCode()] = true;
		
		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:
			if (next == false) {
				if (Start_Menu.character_choose1 < 4)
					Start_Menu.character_choose1 = Start_Menu.character_choose1 + 1;
								
				x=300 + (Start_Menu.character_choose1 -1)* 300; 
				Character_page.P1_arrow_move(x);
			} 
			else 
			{
				if (Start_Menu.character_choose2 < 4 && ((Start_Menu.character_choose2 +1 )!= Start_Menu.character_choose1  ))
					Start_Menu.character_choose2 = Start_Menu.character_choose2 + 1;
				else if(Start_Menu.character_choose2 < 3 &&((Start_Menu.character_choose2 +1 ) == Start_Menu.character_choose1))
					Start_Menu.character_choose2 = Start_Menu.character_choose2 + 2;

				x=300 + (Start_Menu.character_choose2 -1)* 300; 
				Character_page.P2_arrow_move(x);
			}
			
			break;

		case KeyEvent.VK_LEFT:
			if (next == false) {
				if (Start_Menu.character_choose1 > 1 )
					Start_Menu.character_choose1 = Start_Menu.character_choose1 - 1;
				x=300 + (Start_Menu.character_choose1 -1)* 300; 
				Character_page.P1_arrow_move(x);
			} else {
				
				if (Start_Menu.character_choose2 >1 &&( (Start_Menu.character_choose2 -1 )!= Start_Menu.character_choose1 ) )
					Start_Menu.character_choose2 = Start_Menu.character_choose2 - 1;
				else if(Start_Menu.character_choose2  > 2 &&( (Start_Menu.character_choose2 -1 ) == Start_Menu.character_choose1) )
					Start_Menu.character_choose2 = Start_Menu.character_choose2 - 2;
				
				
				x=300 + (Start_Menu.character_choose2 -1)* 300; 
				Character_page.P2_arrow_move(x);
			}
			break;

		case KeyEvent.VK_ENTER:
			if (Start_Menu.Player_Number == 2 &&next == false) {
				if(x!=300) 
				    x = 300;
				else 
					x=600;
				Start_Menu.character_choose2 =(x-300)/300+1;
				next = true;
				DisplayP2(Character_page.arrow2);
				DisplayP2(Character_page.arrow2);
			}
			else
				Character_page.frame_C.dispose();
			 System.out.println(Start_Menu.character_choose1);
			 System.out.println(Start_Menu.character_choose2);
			 
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}

