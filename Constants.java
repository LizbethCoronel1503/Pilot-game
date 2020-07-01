public class Constants {
	
	// frame dimensions, ancho y alto de la ventana
	public static final int WIDTH = 1000;
	public static final int HEIGHT = 600;
	
	// propiedades del piloto

	public static final int FIRERATE = 300;// velocidad de disparo
	public static final double DELTAANGLE = 0.1; // angulo con el que rota
	public static final double ACC = 0.2;        //constatante de acelereco
	public static final double PLAYER_MAX_VEL = 7.0;//velocidad maxima
	public static final long FLICKER_TIME = 200;//tiempo de parpadeo
	public static final long SPAWNING_TIME = 3000;//tiempo para reparecer
	public static final long GAME_OVER_TIME = 3000;
	
	// propiedades del disparo
	
	public static final double SHOTS_VEL = 15.0; //velocidad del disparo
	
	//propiedades de las nubes
	
	public static final double CLOUD_VEL = 2.0;
	
	public static final int CLOUD_SCORE = 20;
	
	// propiedades del enemigo
	
	public static final int NODE_RADIUS = 160;
	
	public static final double ENEMY_MASS = 60;
	
	public static final int ENEMY_MAX_VEL = 3;
	
	public static long ENEMY_FIRE_RATE = 1000;
	
	public static double ENEMY_ANGLE_RANGE = Math.PI / 2;
	
	public static final int ENEMY_SCORE = 40;
	
	public static final long ENEMY_SPAWN_RATE = 10000;


	//Botones del menu
	public static final String PLAY = "JUGAR";
	
	public static final String EXIT = "SALIR";
	
	public static final int LOADING_BAR_WIDTH = 500;
	public static final int LOADING_BAR_HEIGHT = 50;
	
	public static final String RETURN = "REGRESAR";
	public static final String HIGH_SCORES = "PUNTAJES";
	
	public static final String SCORE = "PUNTOS";
	public static final String DATE = "DIA";
	
	
	
}

