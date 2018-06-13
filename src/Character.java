
import java.awt.Graphics;
import java.awt.event.KeyEvent;


public abstract class Character implements GameStateDefault {

	private Game game;
	protected int Xcoordinate, Ycoordinate;
	protected boolean left_movable, right_movable, up_movable, down_movable;
	protected int pace, pace_cnt=0;
	protected int[] ideal_up = new int[2];
	protected int[] ideal_down = new int[2]; 
	protected int[] ideal_left = new int[2]; 
	protected int[] ideal_right = new int[2];
	protected int ideal_X, ideal_Y;
	
	public Character(Game game, int Xcoordinate, int Ycoordinate) {
		this.game = game;
		this.Xcoordinate = Xcoordinate;
		this.Ycoordinate = Ycoordinate;
		this.pace = DEFAULT_PACE;
		ideal_X = Xcoordinate;
		ideal_Y = Ycoordinate;
	}
	

	
	public abstract void render(Graphics g) ;
	
	public abstract void tick() ;

	
	public void movable() {

		this.up_movable = true;
		this.down_movable = true;
		this.left_movable = true;
		this.right_movable = true;
		
		// out border
		if(this.ideal_up[1] < DEFAULT_MIN_Y){
				this.up_movable = false;
		}
		if(this.ideal_down[1] > DEFAULT_MAX_Y) {
				this.down_movable = false;
		}
		if(this.ideal_left[0] < DEFAULT_MIN_X) {
				this.left_movable = false;
		}
		if(this.ideal_right[0] > DEFAULT_MAX_X) {
				this.right_movable = false;
		}
		

		if(this.up_movable) {
			if(!Game.go[(this.ideal_up[0]-400)/100][(this.ideal_up[1])/100])
				this.up_movable = false;
		}
		if(this.down_movable) {
			if(!Game.go[(this.ideal_down[0]-400)/100][(this.ideal_down[1])/100])
				this.down_movable = false;
		}
		if(this.left_movable) {
			if(!Game.go[(this.ideal_left[0]-400)/100][(this.ideal_left[1])/100])
				this.left_movable = false;
		}
		if(this.right_movable) {
			if(!Game.go[(this.ideal_right[0]-400)/100][(this.ideal_right[1])/100])
				this.right_movable = false;
		}
		
	}
	
	public void testIdealLocation(int state) {
		if(ideal_X==this.Xcoordinate && ideal_Y==this.Ycoordinate) {
			ideal_up[0] = ideal_X;
			ideal_up[1] = ideal_Y - 100;
			ideal_down[0] = ideal_X;
			ideal_down[1] = ideal_Y + 100;
			ideal_left[0] = ideal_X - 100;
			ideal_left[1] = ideal_Y;
			ideal_right[0] = ideal_X + 100;
			ideal_right[1] = ideal_Y;
			this.movable();
		}
		this.setIdealLocation(state);
	}
	
	public void setIdealLocation(int direction) {
		if(direction == KeyEvent.VK_UP && this.up_movable) {
			ideal_X = ideal_up[0];
			ideal_Y = ideal_up[1];
		} else if(direction == KeyEvent.VK_DOWN && this.down_movable) {
			ideal_X = ideal_down[0];
			ideal_Y = ideal_down[1];
		} else if(direction == KeyEvent.VK_RIGHT && this.right_movable) {
			ideal_X = ideal_right[0];
			ideal_Y = ideal_right[1];
		} else if(direction == KeyEvent.VK_LEFT && this.left_movable) {
			ideal_X = ideal_left[0];
			ideal_Y = ideal_left[1];
		} else {
			this.game.getKeyManager().state_now = 0;
		}
	}

	

}
