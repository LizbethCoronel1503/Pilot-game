
public class Chronometer {
	
	//parametros iniciales
	private long delta, lastTime; //delta acumula last time
	private long time; //acumular tiempo en el que conometro debe detenerse
	private boolean running; //para saber si en conometro esta corriendo
	
	public Chronometer(){
		delta = 0;
		lastTime = System.currentTimeMillis();
		running = false;
	}

	//arrancar el conomertro
	public void run(long time){
		running = true;
		this.time = time;
	}
	
	//actualizar
	public void update(){	
		if(running)
			delta += System.currentTimeMillis() - lastTime;
		if(delta >= time){
			running = false;
			delta = 0;
		}
		 
		lastTime = System.currentTimeMillis(); //tiempo que vata pasando
	}
	
	//para saber si esta corriendo
	public boolean isRunning(){
		return running;
	}
	
}