import java.awt.Graphics;
import javax.swing.JComponent;

public abstract class Character implements GameStateDefault{
	
	protected int Xcoordinate;
	protected int Ycoordinate;
	private int moveSpeed;
	private int bombTotal;	/* total bomb number can put */
	private int bombNum;	
	private int score;
	
	public Character(int Xcoordinate, int Ycoordinate) {
		this.Xcoordinate = Xcoordinate;
		this.Ycoordinate = Ycoordinate;
		moveSpeed = DEFAULT_MOVESPEED;
		bombTotal = DEFAULT_BOMBTOTAL;
		bombNum = DEFAULT_BOMBTOTAL;
		score = DEFAULT_SCORE;
	}

	public abstract void move(int Xcoordinate, int Ycoordinate);
	
	public abstract void render(Graphics g) ;
	public abstract void tick() ;

	public abstract void putBomb();
	
	public void setXcoordinate(int xcoordinate) {
		Xcoordinate = xcoordinate;
	}

	public void setYcoordinate(int ycoordinate) {
		Ycoordinate = ycoordinate;
	}

	public int getYcoordinate() {
		return Ycoordinate;
	}

	public int getXcoordinate() {
		return Xcoordinate;
	}


}
