
import java.awt.Color;
import java.awt.Graphics;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;



public class ScoreState extends State{
	
	private Button returnButton;
	
	private PriorityQueue<ScoreData> highScores;
	
	private Comparator<ScoreData> scoreComparator;
	
	private ScoreData[] auxArray;
	
	public ScoreState() {
		returnButton = new Button(
				Assets.greyBtn,
				Assets.blueBtn,
				Assets.greyBtn.getHeight(),
				Constants.HEIGHT - Assets.greyBtn.getHeight() * 2,
				Constants.RETURN,
				new Action() {
					@Override
					public void doAction() {
						State.changeState(new MenuState());
					}
				}
			);
		
		scoreComparator = new Comparator<ScoreData>() {
			@Override
			public int compare(ScoreData e1, ScoreData e2) {
				return e1.getScore() < e2.getScore() ? -1: e1.getScore() > e2.getScore() ? 1: 0;
			}
		};
		
		highScores = new PriorityQueue<ScoreData>(10, scoreComparator);

		highScores.add(new ScoreData (1000));
		highScores.add(new ScoreData (500));
		highScores.add(new ScoreData (800));
		
	}
	
	@Override
	public void update() {
		returnButton.update();
	}

	@Override
	public void draw(Graphics g) {
		returnButton.draw(g);
		
		auxArray = highScores.toArray(new ScoreData[highScores.size()]);
		
		Arrays.sort(auxArray, scoreComparator);
		
		
		Vector2D scorePos = new Vector2D(
				Constants.WIDTH / 2 - 200,
				100
				);
		Vector2D datePos = new Vector2D(
				Constants.WIDTH / 2 + 200,
				100
				);
		
		Text.drawText(g, Constants.SCORE, scorePos, true, Color.GREEN, Assets.fontBig);
		Text.drawText(g, Constants.DATE, datePos, true, Color.GREEN, Assets.fontBig);
		
		scorePos.setY(scorePos.getY() + 40);
		datePos.setY(datePos.getY() + 40);
		
		for(int i = auxArray.length - 1; i > -1; i--) {
			
			ScoreData d = auxArray[i];
			
			Text.drawText(g, Integer.toString(d.getScore()), scorePos, true, Color.BLACK, Assets.fontMed);
			Text.drawText(g, d.getDate(), datePos, true, Color.BLACK, Assets.fontMed);
			
			scorePos.setY(scorePos.getY() + 40);
			datePos.setY(datePos.getY() + 40);
			
		}
		
	}
	
}
