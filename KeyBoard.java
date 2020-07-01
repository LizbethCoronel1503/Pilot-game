
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


//manejar todo lo que tenga que ver con el teclado
public class KeyBoard implements KeyListener{
	
	private boolean[] keys = new boolean[256];
	
	public static boolean UP, LEFT, RIGHT, SHOOT;
	
	public KeyBoard()
	{
		UP = false;
		LEFT = false;
		RIGHT = false;
		SHOOT = false;
	}
	
	public void update()
	{
		//movimiento con las flechas
		UP = keys[KeyEvent.VK_UP];
		LEFT = keys[KeyEvent.VK_LEFT];
		RIGHT = keys[KeyEvent.VK_RIGHT];
		//disparos con el espacio
		SHOOT = keys[KeyEvent.VK_SPACE];
	}
	
	//tecla preionada
	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	//leer
	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {}
	
}
