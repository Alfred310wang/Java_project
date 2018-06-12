import java.util.Random;
import java.awt.Graphics;


public class Player extends User {
	int i;
	private Random random_num = new Random();
	int temp;
	int yo = 2;
	
	public Player(Game game, int Xcoordinate, int Ycoordinate, int i) {
		super(game, Xcoordinate, Ycoordinate,i);
		this.i = i;
	}

	@Override
	public void render(Graphics g) { // draw
		temp = random_num.nextInt(2);
		if(game.getKeyManager().up) {
			yo = temp;
			g.drawImage(Assets.p1[temp], Character.Xcoordinate[i], Character.Ycoordinate[i], DEFAULT_WIDTH, DEFAULT_HEIGHT, null);
		}
		else if(game.getKeyManager().down)	{
			yo = 2+temp;
			g.drawImage(Assets.p1[2+temp], Character.Xcoordinate[i], Character.Ycoordinate[i], DEFAULT_WIDTH, DEFAULT_HEIGHT, null);
		}
		else if(game.getKeyManager().left)	{
			yo = 4+temp;
			g.drawImage(Assets.p1[4+temp], Character.Xcoordinate[i], Character.Ycoordinate[i], DEFAULT_WIDTH, DEFAULT_HEIGHT, null);
		}
		else if(game.getKeyManager().right)	{
			yo = 6+temp;
			g.drawImage(Assets.p1[6+temp], Character.Xcoordinate[i], Character.Ycoordinate[i], DEFAULT_WIDTH, DEFAULT_HEIGHT, null);
		}
		else g.drawImage(Assets.p1[yo], Character.Xcoordinate[i], Character.Ycoordinate[i], DEFAULT_WIDTH, DEFAULT_HEIGHT, null);
		

	}

}
