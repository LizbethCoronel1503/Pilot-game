
import java.awt.Graphics;
import java.awt.image.BufferedImage;


//se almacena la posicion y textura de la imagen
public abstract class GameObject {

	//parametros en comun de los objetos de juego
	protected BufferedImage texture;
	protected Vector2D position;
	
	public GameObject(Vector2D position, BufferedImage texture)
	{
		this.position = position;
		this.texture = texture;
	}
	


	public abstract void update();
	
	public abstract void draw(Graphics g);



	public Vector2D getPosition() {
		return position;
	}

	public void setPosition(Vector2D position) {
		this.position = position;
	}
	
}
