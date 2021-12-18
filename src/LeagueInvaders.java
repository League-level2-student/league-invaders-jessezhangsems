import javax.swing.JFrame;

public class LeagueInvaders {
	public static final int width=500;
	public static final int height=800; 
	JFrame frame; 
	GamePanel panel;
public static void main(String[] args) {
	LeagueInvaders leagueinvaders=new LeagueInvaders();
	
}

LeagueInvaders(){
	frame=new JFrame();
	panel=new GamePanel();
	
	setup();
	
}
void setup(){
	frame.setVisible(true); 
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(width,height);
	frame.setTitle("League Invaders Program");
	frame.add(panel);
	
}
}
