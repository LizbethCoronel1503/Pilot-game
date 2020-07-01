import java.awt.Font;
import java.awt.image.BufferedImage;
import javax.sound.sampled.Clip;

//alamacenar imagenes y sonidos
public class Assets {

	public static boolean loaded = false;
	public static float count = 0;
	public static float MAX_COUNT = 46;


	//piloto
	public static BufferedImage player;
	
	// efecto del piloto
	
	public static BufferedImage speed;
	
	// explosion
	
	public static BufferedImage[] exp = new BufferedImage[9];
	
	// disparos
	
	public static BufferedImage blueLaser, greenLaser, redLaser;
	
	// nubes
	
	public static BufferedImage[] bigs = new BufferedImage[4];
	public static BufferedImage[] meds = new BufferedImage[2];
	public static BufferedImage[] smalls = new BufferedImage[2];
	public static BufferedImage[] tinies = new BufferedImage[2];

	// enemigo
	
	public static BufferedImage enemy;

	// numeros (puntaje y vidas)
	
	public static BufferedImage[] numbers = new BufferedImage[11];
	
	public static BufferedImage life;

	// fonts (puntaje obtenido)
	public static Font fontBig;
	public static Font fontMed;

	//sonidos
	public static Clip backgroundMusic, explosion, playerLoose, playerShoot, enemyShoot;
	
	//botones del menu
	public static BufferedImage blueBtn;
	public static BufferedImage greyBtn;
	

	//se llama cuando el juego arancar
	//cargar imagenes
	public static void init()
	{
		player = Loader.ImageLoader("./Piloto1.png");
		
		speed = Loader.ImageLoader("./fire08.png");
		
		blueLaser = Loader.ImageLoader("./laserGreen11.png");
		
		greenLaser = Loader.ImageLoader("./laserGreen11.png");
		
		redLaser = Loader.ImageLoader("./laserRed01.png");

		enemy = Loader.ImageLoader("./Piloto2.png");
		
		life = Loader.ImageLoader("./corazon1.png");


		//font  desplegar mensaje 
		fontBig = Loader.loadFont("./futureFont.ttf", 42);
		//puntaje obtenido
		fontMed = Loader.loadFont("./futureFont.ttf", 20);



		//nubes, distintos tamanos
		
		for(int i = 0; i < bigs.length; i++)
			bigs[i] = Loader.ImageLoader("./big"+(i+1)+".png");
		
		for(int i = 0; i < meds.length; i++)
			meds[i] = Loader.ImageLoader("./med"+(i+1)+".png");
		
		for(int i = 0; i < smalls.length; i++)
			smalls[i] = Loader.ImageLoader("./small"+(i+1)+".png");
		
		for(int i = 0; i < tinies.length; i++)
			tinies[i] = Loader.ImageLoader("./tiny"+(i+1)+".png");
		
		for(int i = 0; i < exp.length; i++)
			exp[i] = Loader.ImageLoader("./"+i+".png");

		for(int i = 0; i < numbers.length; i++)
			numbers[i] = Loader.ImageLoader("./n"+i+".png");


		backgroundMusic = Loader.loadSound("./backgroundMusic.wav");
		explosion = Loader.loadSound("./explosion.wav");
		playerLoose = Loader.loadSound("./playerLoose.wav");
		playerShoot = Loader.loadSound("./playerShoot.wav");
		enemyShoot = Loader.loadSound("./ufoShoot.wav");


		greyBtn = loadImage("./grey_button.png");
		blueBtn = loadImage("./blue_button.png");

		
		
		// ===========================================================
		
		loaded = true;

		}

	public static BufferedImage loadImage(String path) {
		count ++;
		return Loader.ImageLoader(path);
	}
	public static Font loadFont(String path, int size) {
		count ++;
		return Loader.loadFont(path, size);
	}
	public static Clip loadSound(String path) {
		count ++;
		return Loader.loadSound(path);
	}


	
		
	}
	

