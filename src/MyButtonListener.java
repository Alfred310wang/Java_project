package Mine;

// MyButtonListener.Player_Number 是玩家數量
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;

public class MyButtonListener implements ActionListener {
	public Start_Menu s;

	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		if (str.equals("1 Player")) // 1 players
		// if (e.getSource().equals(s.getBtn1())) // 1 players
		{

			Start_Menu.Player_Number = 1;
			new Character_page("Game!", 1600, 1000);
			Main.Closebybutton(Start_Menu.startframe);
		}

		else if (str.equals("2 Player"))
		// else if (e.getSource().equals(s.btn2)) // 1 players
		{
			
			Start_Menu.Player_Number = 2;
			new Character_page("Game!", 1600, 1000);
			Main.Closebybutton(Start_Menu.startframe);
		}

		System.out.println("Start_Menu.Player_Number :");
		System.out.println(Start_Menu.Player_Number);
		System.out.print("\n");

	}
}
