import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyManager extends KeyAdapter {

	public boolean up, down, left, right;
	private int moveUp, moveDown, moveRight, moveLeft , put , k = 0;
	
	public KeyManager() {
		moveUp = KeyEvent.VK_UP;
		moveDown = KeyEvent.VK_DOWN;
		moveLeft = KeyEvent.VK_LEFT;
		moveRight = KeyEvent.VK_RIGHT;
		put = KeyEvent.VK_SPACE;
	}
	
	@Override
	public void keyPressed(KeyEvent e) {	
		super.keyPressed(e);
		if(e.getKeyCode() == moveUp) {
			up = true;
			down = false;
			left = false;
			right = false;
		} else if(e.getKeyCode() == moveDown) {
			up = false;
			down = true;
			left = false;
			right = false;
		} else if(e.getKeyCode() == moveRight) {
			up = false;
			down = false;
			left = false;
			right = true;
		} else if(e.getKeyCode() == moveLeft) {
			up = false;
			down = false;
			left = true;
			right = false;
		}else if(e.getKeyCode() == put) {
			if (k == 50)	k = 0;
			GameState.bomb[k] = new Bomb(2,2,3);
			k += 1;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		super.keyReleased(e);
		if(e.getKeyCode() == moveUp) {
			up = false;
		} else if(e.getKeyCode() == moveDown) {
			down = false;
		} else if(e.getKeyCode() == moveRight) {
			right = false;
		} else if(e.getKeyCode() == moveLeft) {
			left = false;
		}
	}

	public int getMoveUp() {
		return moveUp;
	}

	public void setMoveUp(int moveUp) {
		this.moveUp = moveUp;
	}

	public void setMoveDown(int moveDown) {
		this.moveDown = moveDown;
	}

	public void setMoveRight(int moveRight) {
		this.moveRight = moveRight;
	}

	public void setMoveLeft(int moveLeft) {
		this.moveLeft = moveLeft;
	}

	
	
	
	
}