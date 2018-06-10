
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Player extends User {
	
	public Player(Game game, int Xcoordinate, int Ycoordinate) {
		super(game, Xcoordinate, Ycoordinate);
	}

	@Override
	public void render(Graphics g) {		//draw
		g.drawImage(Assets.cowboy, this.Xcoordinate, this.Ycoordinate, DEFAULT_WIDTH, DEFAULT_HEIGHT, null);

		
	}





	

}
