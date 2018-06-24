import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class TwoPlayer {

	public static int dice;
	public static int P1Leader=0,P1Ck=0,P2Leader=0,P2Ck=0,P3Leader=0,P3Ck,P4Leader=0,P4Ck=0;
	public static int[] P1Driver = new int[501];
	public static int[] P2Driver = new int[501];
	public static int[] P3Driver = new int[501];
	public static int[] P4Driver = new int[501];
	public static boolean P1=true,P2=false ,P3=false,P4=false;
	public static boolean Sound=true,Guti1Ck=false,Guti3Ck=false;
	public static 	int TP3L,TP1L,P1Dice=0,P3Dice=0;
	public  void  test() throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		URL url = this.getClass().getClassLoader().getResource("Beep3.mp4");
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
		// Get a sound clip resource.
		Clip clip = AudioSystem.getClip();
		// Open audio clip and load samples from the audio input stream.
		clip.open(audioIn);
		clip.start();
	}
	public  void  test1() throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		URL url = this.getClass().getClassLoader().getResource("Beep6.mp4");
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
		// Get a sound clip resource.
		Clip clip = AudioSystem.getClip();
		// Open audio clip and load samples from the audio input stream.
		clip.open(audioIn);
		clip.start();
	}
	
	public  void  DiceThrow() throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		URL url = this.getClass().getClassLoader().getResource("Rolling Dice.wav");
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
		// Get a sound clip resource.
		Clip clip = AudioSystem.getClip();
		// Open audio clip and load samples from the audio input stream.
		clip.open(audioIn);
		clip.start();
	}
	
	public  void  GameOverSong() throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		URL url = this.getClass().getClassLoader().getResource("beep-01a.wav");
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
		// Get a sound clip resource.
		Clip clip = AudioSystem.getClip();
		// Open audio clip and load samples from the audio input stream.
		clip.open(audioIn);
		clip.start();
	}
	
	public  void  SetGutiSound() throws UnsupportedAudioFileException, IOException, LineUnavailableException
	{
		URL url = this.getClass().getClassLoader().getResource("beep-08b.wav");
		AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
		// Get a sound clip resource.
		Clip clip = AudioSystem.getClip();
		// Open audio clip and load samples from the audio input stream.
		clip.open(audioIn);
		clip.start();
	}


	
	public TwoPlayer(){
		
		
		
   
		for(int I=1; I<=100; I++)
			{
				P1Driver[I]=0;
			
			
			}

	 JFrame Mainframe= new JFrame("SnakeLudo");
	Mainframe.getContentPane().setBackground(Color.green);
	Mainframe.setDefaultCloseOperation( Mainframe.EXIT_ON_CLOSE);
	 //Mainframe.setBackground(Color.);
	 JPanel panel1= new JPanel();
	 panel1.setBounds(1, 50, 900,2000);
	 panel1.setBackground(Color.gray);
	 JLabel label1= new JLabel();
  	JLabel[] Board= new JLabel[1000]; 
  	JLabel[] Board1 = new JLabel[1000];
	JLabel[] Board2 = new JLabel[1000];
	JLabel[] Board3= new JLabel[1000];
	JLabel[] Board4 = new JLabel[1000];
	  ImageIcon Author = new ImageIcon("src\\Author1.png");
     ImageIcon imageicon = new ImageIcon("src\\S.png");
     ImageIcon Ninety7 = new ImageIcon("src\\97.png");
     ImageIcon p1 = new ImageIcon("src\\Player1_1.png");
     ImageIcon p2 = new ImageIcon("src\\Player2_1.png");
     ImageIcon p3 = new ImageIcon("src\\Player3_1.png");
     ImageIcon p4 = new ImageIcon("src\\Player4_1.png");
  
     ImageIcon dice1 = new ImageIcon("src\\1.png");
     ImageIcon dice2 = new ImageIcon("src\\2.png");
     ImageIcon dice3 = new ImageIcon("src\\3.png");
     ImageIcon dice4 = new ImageIcon("src\\4.png");
     ImageIcon dice5 = new ImageIcon("src\\5.png");
     ImageIcon dice6 = new ImageIcon("src\\6.png");
     ImageIcon soundon = new ImageIcon("src\\Speaker.png");
     ImageIcon soundof = new ImageIcon("src\\Soundof.png");
     ImageIcon up33 = new ImageIcon("src\\33up.png");
     ImageIcon up2 = new ImageIcon("src\\2up.png");
     ImageIcon up4 = new ImageIcon("src\\4up.png");
     ImageIcon down51 = new ImageIcon("src\\51Down.png");
     ImageIcon up52 = new ImageIcon("src\\52up.png");
     ImageIcon down56 = new ImageIcon("src\\56Down.png");
     ImageIcon down62 = new ImageIcon("src\\62Down.png");
     ImageIcon up80 = new ImageIcon("src\\80up.png");
     ImageIcon down92 = new ImageIcon("src\\92Down.png");
     ImageIcon up9 = new ImageIcon("src\\9up.png");
     ImageIcon down98= new ImageIcon("src\\98Down.png");
     ImageIcon GameOver = new ImageIcon("src\\Game Over.png");
     
     JLabel GOver = new JLabel();
     
     GOver.setBounds(150, 100, 600,500);
     Mainframe.add(GOver);
     
     
     
     JLabel actionshow = new JLabel();
     actionshow.setBounds(750, 100, 500, 500);
     Mainframe.add(actionshow);
     
     JButton button1= new JButton();
     Mainframe.setSize(1200, 1200);
    Mainframe.setLayout(null);
    label1.setIcon(imageicon);
    JLabel Speaker = new JLabel();
    Speaker.setBounds(10, 30, 40, 40);
    Speaker.setIcon(soundon);
    Mainframe.add(Speaker);
    JTextField D1= new JTextField() ;
    JTextField D2= new JTextField() ;
	D1.setBounds(900,120,100,30);
	D2.setBounds(900,150-2,100,30);
	D1.setBackground(Color.red);
	D2.setBackground(Color.yellow);
	Mainframe.add(D1);
	Mainframe.add(D2);
	D1.setEditable(false);
	D2.setEditable(false);
	JTextField Result = new JTextField();
	Result.setBounds(900,50,100,80);
	Result.setText(" Score Board ");
	Result.setEditable(false);
	Result.setBackground(Color.ORANGE);
	Mainframe.add(Result);
	
	JButton NewGame = new JButton("New Game");
	NewGame.setBounds(10,580, 100, 30);
	NewGame.setBackground(Color.ORANGE);
	Mainframe.add(NewGame);
	
	JLabel AuthorsPickGhor = new  JLabel();
    
    AuthorsPickGhor.setBounds(1000, 20, 200, 200);
    Mainframe.add(AuthorsPickGhor);
    AuthorsPickGhor.setIcon(Author);

    
   
	NewGame.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
	  new TwoPlayer();
			
		}
	});
	
    Speaker.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
			if(Sound==true)
			{
				Speaker.setIcon(null);
				 Speaker.setIcon(soundof);
				 Sound=false;
			}
			else
			{
				Speaker.setIcon(null);
				 Speaker.setIcon(soundon);
				 Sound=true;
			}
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	});
    Board[100] = new JLabel();
    Board1[100]=new JLabel();
    Board2[100]=new JLabel();
    Board3[100]=new JLabel();
    Board4[100]=new JLabel();
    Board[100].setBounds(170, 60, 80, 80);
    Board1[100].setBounds(160,50, 80, 80);
    Board2[100].setBounds(170,50, 80, 80);
    Board3[100].setBounds(170,58, 80, 80);
    Board4[100].setBounds(175,60, 80, 80);
    Mainframe.add(Board[100]);
    Mainframe.add(Board1[100]);
    Mainframe.add(Board2[100]);
    Mainframe.add(Board3[100]);
    Mainframe.add(Board4[100]);
    /*Board1[100].setIcon(p1);
    Board2[100].setIcon(p2);
    Board3[100].setIcon(p3);
    Board4[100].setIcon(p4);*/
    
    Board[81] = new JLabel();
    Board1[81] = new JLabel();
    Board2[81] = new JLabel();
    Board3[81] = new JLabel();
    Board4[81] = new JLabel();
    Board[81].setBounds(170, 110, 80, 80);
    Board1[81].setBounds(160, 100, 80, 80);
    Board2[81].setBounds(170, 100, 80, 80);
    Board3[81].setBounds(170, 108, 80, 80);
    Board4[81].setBounds(175, 110, 80, 80);
    Mainframe.add(Board1[81]);
    Mainframe.add(Board2[81]);
    Mainframe.add(Board3[81]);
    Mainframe.add(Board4[81]);
   /* Board1[81].setIcon(p1);
    Board2[81].setIcon(p2);
    Board3[81].setIcon(p3);
    Board4[81].setIcon(p4);*/
    Board[80] = new JLabel();
    Board1[80] = new JLabel();
    Board2[80] = new JLabel();
    Board3[80] = new JLabel();
    Board4[80] = new JLabel();
    //Board[80].setBounds(170, 110+50, 80, 80);
    Board[80].setBounds(170, 160, 80, 80);
    Board1[80].setBounds(160,154, 80, 80);
    Board2[80].setBounds(167,154, 80, 80);
    Board3[80].setBounds(170,164, 80, 80);
    Board4[80].setBounds(175,155, 80, 80);
    Mainframe.add(Board1[80]);
    Mainframe.add(Board2[80]);
    Mainframe.add(Board3[80]);
    Mainframe.add(Board4[80]);
    /*Board1[80].setIcon(p1);
    Board2[80].setIcon(p2);
    Board3[80].setIcon(p3);
    Board4[80].setIcon(p4);  */
    Board[61] = new JLabel();
    Board1[61] = new JLabel();
    Board2[61] = new JLabel();
    Board3[61] = new JLabel();
    Board4[61] = new JLabel();
    Board[61].setBounds(170, 214, 80, 80);
    Board1[61].setBounds(160, 206, 80, 80);
    Board2[61].setBounds(167, 208, 80, 80);
    Board3[61].setBounds(170, 214, 80, 80);
    Board4[61].setBounds(175, 205, 80, 80);
    Mainframe.add(Board1[61]);
    Mainframe.add(Board2[61]);    
    Mainframe.add(Board3[61]);
    Mainframe.add(Board4[61]);
    /*Board1[61].setIcon(p1);
    Board2[61].setIcon(p2);
    Board3[61].setIcon(p3);
    Board4[61].setIcon(p4);*/
    Board[60] = new JLabel();
    Board1[60] = new JLabel();
    Board2[60] = new JLabel();
    Board3[60] = new JLabel();
    Board4[60] = new JLabel();
    Board[60].setBounds(170,260, 80, 80);
    Board1[60].setBounds(160,256, 80, 80);
    Board2[60].setBounds(167,256, 80, 80);
    Board3[60].setBounds(170,264, 80, 80);
    Board4[60].setBounds(175,255, 80, 80);
    Mainframe.add(Board1[60]);
    Mainframe.add(Board2[60]);
    Mainframe.add(Board3[60]);
    Mainframe.add(Board4[60]);
    /*Board1[60].setIcon(p1);
    Board2[60].setIcon(p2);
    Board3[60].setIcon(p3);
    Board4[60].setIcon(p4);*/
    Board[41] = new JLabel();
    Board1[41] = new JLabel();
    Board2[41] = new JLabel();
    Board3[41] = new JLabel();
    Board4[41] = new JLabel();
    Board[41].setBounds(170,315, 80, 80);
    Board1[41].setBounds(160,308, 80, 80);
    Board2[41].setBounds(167,309, 80, 80);
    Board3[41].setBounds(170,318, 80, 80);
    Board4[41].setBounds(175,308, 80, 80);
    Mainframe.add(Board1[41]);
    Mainframe.add(Board2[41]);
    Mainframe.add(Board3[41]);
    Mainframe.add(Board4[41]);
    /*Board1[41].setIcon(p1);
    Board2[41].setIcon(p2);
    Board3[41].setIcon(p3);
    Board4[41].setIcon(p4);*/
    Board[40] = new JLabel();
    Board1[40] = new JLabel();
    Board2[40] = new JLabel();
    Board3[40] = new JLabel();
    Board4[40] = new JLabel();
    Board[40].setBounds(170,365, 80, 80);
    Board1[40].setBounds(160,360, 80, 80);
    Board2[40].setBounds(167,362, 80, 80);
    Board3[40].setBounds(170,370, 80, 80);
    Board4[40].setBounds(175,360, 80, 80);
    Mainframe.add(Board1[40]);
    Mainframe.add(Board2[40]);
    Mainframe.add(Board3[40]);
    Mainframe.add(Board4[40]);
    /*Board1[40].setIcon(p1);
    Board2[40].setIcon(p2);
    Board3[40].setIcon(p3);
    Board4[40].setIcon(p4);*/
    Board[21] = new JLabel();
    Board1[21] = new JLabel();
    Board2[21] = new JLabel();
    Board3[21] = new JLabel();
    Board4[21] = new JLabel();
    Board[21].setBounds(170, 415, 80, 80);
    Board1[21].setBounds(160, 412, 80, 80);
    Board2[21].setBounds(165, 420, 80, 80);
    Board3[21].setBounds(170, 412, 80, 80);
    Board4[21].setBounds(175, 420, 80, 80);
    Mainframe.add(Board1[21]);
    Mainframe.add(Board2[21]);
    Mainframe.add(Board3[21]);
    Mainframe.add(Board4[21]);
    /*Board1[21].setIcon(p1);
    Board2[21].setIcon(p2);
    Board3[21].setIcon(p3);
    Board4[21].setIcon(p4);*/
    Board[20] = new JLabel();
    Board1[20] = new JLabel();
    Board2[20] = new JLabel();
    Board3[20] = new JLabel();
    Board4[20] = new JLabel();
    Board[20].setBounds(170, 465, 80, 80);
    Board1[20].setBounds(160, 462, 80, 80);
    Board2[20].setBounds(162, 472, 80, 80);
    Board3[20].setBounds(170, 462, 80, 80);
    Board4[20].setBounds(175, 472, 80, 80);
    Mainframe.add(Board1[20]);
    Mainframe.add(Board2[20]);
    Mainframe.add(Board3[20]);
    Mainframe.add(Board4[20]);
    /*Board1[20].setIcon(p1);
    Board2[20].setIcon(p2);
    Board3[20].setIcon(p3);
    Board4[20].setIcon(p4);*/
    Board[1] = new JLabel();
    Board1[1] = new JLabel();
    Board2[1] = new JLabel();
    Board3[1] = new JLabel();
    Board4[1] = new JLabel();
    Board[1].setBounds(170, 515, 80, 80);
    Board1[1].setBounds(160, 515, 80, 80);
    Board2[1].setBounds(165, 524, 80, 80);
    Board3[1].setBounds(170, 513, 80, 80);
    Board4[1].setBounds(175, 526, 80, 80);
    Mainframe.add(Board1[1]);
    Mainframe.add(Board2[1]);
    Mainframe.add(Board3[1]);
    Mainframe.add(Board4[1]);
    /*Board1[1].setIcon(p1);
    Board2[1].setIcon(p2);
    Board3[1].setIcon(p3);
    Board4[1].setIcon(p4);*/
    Board[99] = new JLabel();
    Board1[99] = new JLabel();
    Board2[99] = new JLabel();
    Board3[99] = new JLabel();
    Board4[99] = new JLabel();
    Board[99].setBounds(220, 60, 80, 80);
    Board1[99].setBounds(214, 50, 80, 80);
    Board2[99].setBounds(217, 60, 80, 80);
    Board3[99].setBounds(224, 50, 80, 80);
    Board4[99].setBounds(225, 62, 80, 80);
    Mainframe.add(Board1[99]);
    Mainframe.add(Board2[99]);
    Mainframe.add(Board3[99]);
    Mainframe.add(Board4[99]);
    /*Board1[99].setIcon(p1);
    Board2[99].setIcon(p2);
    Board3[99].setIcon(p3);
    Board4[99].setIcon(p4);*/
    Board[82] = new JLabel();
    Board1[82] = new JLabel();
    Board2[82] = new JLabel();
    Board3[82] = new JLabel();
    Board4[82] = new JLabel();
    
    Board[82].setBounds(220,110, 80, 80);
    Board1[82].setBounds(213,102, 80, 80);
    Board2[82].setBounds(215,114, 80, 80);
    Board3[82].setBounds(223,105, 80, 80);
    Board4[82].setBounds(225,118, 80, 80);
    Mainframe.add(Board1[82]);
    Mainframe.add(Board2[82]);
    Mainframe.add(Board3[82]);
    Mainframe.add(Board4[82]);
    /*Board1[82].setIcon(p1);
    Board2[82].setIcon(p2);
    Board3[82].setIcon(p3);
    Board4[82].setIcon(p4);*/
    Board[79] = new JLabel();
    Board1[79] = new JLabel();
    Board2[79] = new JLabel();
    Board3[79] = new JLabel();
    Board4[79] = new JLabel();
    Board[79].setBounds(220,160, 80, 80);
    Board1[79].setBounds(215,155, 80, 80);
    Board2[79].setBounds(215,165, 80, 80);
    Board3[79].setBounds(225,155, 80, 80);
    Board4[79].setBounds(227,165, 80, 80);
    Mainframe.add(Board1[79]);
    Mainframe.add(Board2[79]);
    Mainframe.add(Board3[79]);
    Mainframe.add(Board4[79]);
  /*  Board1[79].setIcon(p1);
    Board2[79].setIcon(p2);
    Board3[79].setIcon(p3);
    Board4[79].setIcon(p4);*/
    Board[62] = new JLabel();
    Board1[62] = new JLabel();
    Board2[62] = new JLabel();
    Board3[62] = new JLabel();
    Board4[62] = new JLabel();
    Board[62].setBounds(220,210,80,80);
    Board1[62].setBounds(215,205,80,80);
    Board2[62].setBounds(215,215,80,80);
    Board3[62].setBounds(224,215,80,80);
    Board4[62].setBounds(227,205,80,80);
    Mainframe.add(Board1[62]);
    Mainframe.add(Board2[62]);
    Mainframe.add(Board3[62]);
    Mainframe.add(Board4[62]);
   /*Board1[62].setIcon(p1);
    Board2[62].setIcon(p2);
    Board3[62].setIcon(p3);
    Board4[62].setIcon(p4);*/
    Board[59] = new JLabel();
    Board1[59] = new JLabel();
    Board2[59] = new JLabel();
    Board3[59] = new JLabel();
    Board4[59] = new JLabel();
    Board[59].setBounds(220,260, 80, 80);
    Board1[59].setBounds(214,255, 80, 80);
    Board2[59].setBounds(215,265, 80, 80);
    Board3[59].setBounds(222,255, 80, 80);
    Board4[59].setBounds(225,268, 80, 80);
    Mainframe.add(Board1[59]);
    Mainframe.add(Board2[59]);
    Mainframe.add(Board3[59]);
    Mainframe.add(Board4[59]);
   /* Board1[59].setIcon(p1);
    Board2[59].setIcon(p2);
    Board3[59].setIcon(p3);
    Board4[59].setIcon(p4);*/
    Board[42] = new JLabel();
    Board1[42] = new JLabel();
    Board2[42] = new JLabel();
    Board3[42] = new JLabel();
    Board4[42] = new JLabel();
    Board[42].setBounds(220,310, 80, 80);
    Board1[42].setBounds(215,308, 80, 80);
    Board2[42].setBounds(215,320, 80, 80);
    Board3[42].setBounds(225,310, 80, 80);
    Board4[42].setBounds(228,320, 80, 80);
    Mainframe.add(Board[42]);
    Mainframe.add(Board1[42]);
    Mainframe.add(Board2[42]);
    Mainframe.add(Board3[42]);
    Mainframe.add(Board4[42]);
   /*Board1[42].setIcon(p1);
    Board2[42].setIcon(p2);
    Board3[42].setIcon(p3);
    Board4[42].setIcon(p4);*/
    Board[39] = new JLabel();
    Board1[39] = new JLabel();
    Board2[39] = new JLabel();
    Board3[39] = new JLabel();
    Board4[39] = new JLabel();
    Board[39].setBounds(220,365,80,80);
    Board1[39].setBounds(215,370,80,80);
    Board2[39].setBounds(215,360,80,80);
    Board3[39].setBounds(225,360,80,80);
    Board4[39].setBounds(225,372,80,80);
    Mainframe.add(Board[39]);
    Mainframe.add(Board1[39]);
    Mainframe.add(Board2[39]);
    Mainframe.add(Board3[39]);
    Mainframe.add(Board4[39]);
  /* Board1[39].setIcon(p1);
    Board2[39].setIcon(p2);
    Board3[39].setIcon(p3);
    Board4[39].setIcon(p4);*/
    Mainframe.add(Board[39]);
    Board[22] = new JLabel();
    Board1[22] = new JLabel();
    Board2[22] = new JLabel();
    Board3[22] = new JLabel();
    Board4[22] = new JLabel();
    Board[22].setBounds(220,420,80,80);
    Board1[22].setBounds(212,410,80,80);
    Board2[22].setBounds(215,420,80,80);
    Board3[22].setBounds(222,410,80,80);
    Board4[22].setBounds(228,415,80,80);
    Mainframe.add(Board[39]);
    Mainframe.add(Board1[22]);
    Mainframe.add(Board2[22]);
    Mainframe.add(Board3[22]);
    Mainframe.add(Board4[22]);
    /*Board1[22].setIcon(p1);
    Board2[22].setIcon(p2);
    Board3[22].setIcon(p3);
    Board4[22].setIcon(p4);*/
    Mainframe.add(Board[22]);
    Board[19] = new JLabel();
    Board1[19] = new JLabel();
    Board2[19] = new JLabel();
    Board3[19] = new JLabel();
    Board4[19] = new JLabel();
    
    Board[19].setBounds(220,470,80,80);
    Board1[19].setBounds(212,460,80,80);
    Board2[19].setBounds(215,470,80,80);
    Board3[19].setBounds(222,460,80,80);
    Board4[19].setBounds(225,475,80,80);
    Mainframe.add(Board[19]);
    Mainframe.add(Board1[19]);
    Mainframe.add(Board2[19]);
    Mainframe.add(Board3[19]);
    Mainframe.add(Board4[19]);
   /* Board1[19].setIcon(p1);
    Board2[19].setIcon(p2);
    Board3[19].setIcon(p3);
    Board4[19].setIcon(p4);*/
    Board[2] = new JLabel();
    Board1[2] = new JLabel();
    Board2[2] = new JLabel();
    Board3[2] = new JLabel();
    Board4[2] = new JLabel();
    Board[2].setBounds(220,520,80,80);
    Board1[2].setBounds(212,512,80,80);
    Board2[2].setBounds(215,525,80,80);
    Board3[2].setBounds(223,515,80,80);
    Board4[2].setBounds(225,525,80,80);
    Mainframe.add(Board1[2]);
    Mainframe.add(Board2[2]);
    Mainframe.add(Board3[2]);
    Mainframe.add(Board4[2]);
   /* Board1[2].setIcon(p1);
    Board2[2].setIcon(p2);
    Board3[2].setIcon(p3);
    Board4[2].setIcon(p4);*/
    Board[98] = new JLabel();
    Board1[98] = new JLabel();
    Board2[98] = new JLabel();
    Board3[98] = new JLabel();
    Board4[98] = new JLabel();
    Board[98].setBounds(270, 60, 80, 80);
    Board1[98].setBounds(265, 50, 80, 80);
    Board2[98].setBounds(265, 60, 80, 80);
    Board3[98].setBounds(274, 50, 80, 80);
    Board4[98].setBounds(275, 62, 80, 80);
    Mainframe.add(Board1[98]);
    Mainframe.add(Board2[98]);
    Mainframe.add(Board3[98]);
    Mainframe.add(Board4[98]);
    /*Board1[98].setIcon(p1);
    Board2[98].setIcon(p2);
    Board3[98].setIcon(p3);
    Board4[98].setIcon(p4);*/
    Mainframe.add(Board[98]);
    Board[83] = new JLabel();
    Board1[83] = new JLabel();
    Board2[83] = new JLabel();
    Board3[83] = new JLabel();
    Board4[83] = new JLabel();
    Board[83].setBounds(270, 110, 80, 80);
    Board1[83].setBounds(263,105, 80, 80);
    Board2[83].setBounds(265,115, 80, 80);
    Board3[83].setBounds(275,115, 80, 80);
    Board4[83].setBounds(275,105, 80, 80);
    Mainframe.add(Board1[83]);
    Mainframe.add(Board2[83]);
    Mainframe.add(Board3[83]);
    Mainframe.add(Board4[83]);
    /*Board1[83].setIcon(p1);
    Board2[83].setIcon(p2);
    Board3[83].setIcon(p3);
    Board4[83].setIcon(p4);*/
    Mainframe.add(Board[83]);
    Board[78] = new JLabel();
    Board1[78] = new JLabel();
    Board2[78] = new JLabel();
    Board3[78] = new JLabel();
    Board4[78] = new JLabel();
    Board[78].setBounds(270,160, 80, 80);
    Board1[78].setBounds(263,105+50, 80, 80);
    Board2[78].setBounds(265,115+50, 80, 80);
    Board3[78].setBounds(275,115+50, 80, 80);
    Board4[78].setBounds(275,105+50, 80, 80);
    Mainframe.add(Board1[78]);
    Mainframe.add(Board2[78]);
    Mainframe.add(Board3[78]);
    Mainframe.add(Board4[78]);
   /* Board1[78].setIcon(p1);
    Board2[78].setIcon(p2);
    Board3[78].setIcon(p3);
    Board4[78].setIcon(p4);*/
    Mainframe.add(Board[78]);
    Board[63] = new JLabel();
    Board1[63] = new JLabel();
    Board2[63] = new JLabel();
    Board3[63] = new JLabel();
    Board4[63] = new JLabel();
    Board[63].setBounds(170+50+50, 60+50+50+50, 80, 80);
    Board1[63].setBounds(263,105+50+50, 80, 80);
    Board2[63].setBounds(265,115+50+50, 80, 80);
    Board3[63].setBounds(275,115+50+50, 80, 80);
    Board4[63].setBounds(275,105+50+50, 80, 80);
    Mainframe.add(Board[63]);
    Mainframe.add(Board1[63]);
    Mainframe.add(Board2[63]);
    Mainframe.add(Board3[63]);
    Mainframe.add(Board4[63]);
    /*Board1[63].setIcon(p1);
    Board2[63].setIcon(p2);
    Board3[63].setIcon(p3);
    Board4[63].setIcon(p4);*/
    Board[58] = new JLabel();
    Board1[58] = new JLabel();
    Board2[58] = new JLabel();
    Board3[58] = new JLabel();
    Board4[58] = new JLabel();
    Board[58].setBounds(170+50+50, 60+50+50+50+50, 80, 80);
    Board1[58].setBounds(263,105+50+50+50+3, 80, 80);
    Board2[58].setBounds(265,115+50+50+50+3, 80, 80);
    Board3[58].setBounds(275,115+50+50+50+3, 80, 80);
    Board4[58].setBounds(275,105+50+50+50+3, 80, 80);
    Mainframe.add(Board1[58]);
    Mainframe.add(Board2[58]);
    Mainframe.add(Board3[58]);
    Mainframe.add(Board4[58]);
   /* Board1[58].setIcon(p1);
    Board2[58].setIcon(p2);
    Board3[58].setIcon(p3);
    Board4[58].setIcon(p4);*/
    Mainframe.add(Board[58]);
    Board[43] = new JLabel();
    Board1[43] = new JLabel();
    Board2[43] = new JLabel();
    Board3[43] = new JLabel();
    Board4[43] = new JLabel();
    Board[43].setBounds(170+50+50, 60+50+50+50+50+50, 80, 80);
    Board1[43].setBounds(263,105+50+50+50+3+50, 80, 80);
    Board2[43].setBounds(265,115+50+50+50+3+50, 80, 80);
    Board3[43].setBounds(275,115+50+50+50+3+50, 80, 80);
    Board4[43].setBounds(275,105+50+50+50+3+50, 80, 80);
    Mainframe.add(Board1[43]);
    Mainframe.add(Board2[43]);
    Mainframe.add(Board3[43]);
    Mainframe.add(Board4[43]);
   /* Board1[43].setIcon(p1);
    Board2[43].setIcon(p2);
    Board3[43].setIcon(p3);
    Board4[43].setIcon(p4);*/
    Mainframe.add(Board[43]);
    Board[38] = new JLabel();
    Board1[38] = new JLabel();
    Board2[38] = new JLabel();
    Board3[38] = new JLabel();
    Board4[38] = new JLabel();
    Board[38].setBounds(170+50+50, 60+50+50+50+50+50+50+5, 80, 80);
    Board1[38].setBounds(263,105+50+50+50+3+50+50, 80, 80);
    Board2[38].setBounds(265,115+50+50+50+3+50+50, 80, 80);
    Board3[38].setBounds(275,115+50+50+50+3+50+50, 80, 80);
    Board4[38].setBounds(275,105+50+50+50+3+50+50, 80, 80);
    Mainframe.add(Board1[38]);
    Mainframe.add(Board2[38]);
    Mainframe.add(Board3[38]);
    Mainframe.add(Board4[38]);
    /*Board1[38].setIcon(p1);
    Board2[38].setIcon(p2);
    Board3[38].setIcon(p3);
    Board4[38].setIcon(p4);*/
    Mainframe.add(Board[38]);
    Board[23] = new JLabel();
    Board1[23] = new JLabel();
    Board2[23] = new JLabel();
    Board3[23] = new JLabel();
    Board4[23] = new JLabel();
    Board[23].setBounds(170+50+50, 60+50+50+50+50+50+50+5+50+5, 80, 80);
    Board1[23].setBounds(263,105+50+50+50+3+50+50+50+3, 80, 80);
    Board2[23].setBounds(265,115+50+50+50+3+50+50+50+3, 80, 80);
    Board3[23].setBounds(275,115+50+50+50+3+50+50+50+3, 80, 80);
    Board4[23].setBounds(275,105+50+50+50+3+50+50+50+3, 80, 80);
    Mainframe.add(Board1[23]);
    Mainframe.add(Board2[23]);
    Mainframe.add(Board3[23]);
    Mainframe.add(Board4[23]);
   /* Board1[23].setIcon(p1);
    Board2[23].setIcon(p2);
    Board3[23].setIcon(p3);
    Board4[23].setIcon(p4);*/
    Mainframe.add(Board[23]);
    Board[18] = new JLabel();
    Board1[18] = new JLabel();
    Board2[18] = new JLabel();
    Board3[18] = new JLabel();
    Board4[18] = new JLabel();
    Board[18].setBounds(170+50+50, 60+50+50+50+50+50+50+5+50+50+5, 80, 80);
    Board1[18].setBounds(263,105+50+50+50+3+50+50+50+3+50, 80, 80);
    Board2[18].setBounds(265,115+50+50+50+3+50+50+50+3+50, 80, 80);
    Board3[18].setBounds(275,115+50+50+50+3+50+50+50+3+50, 80, 80);
    Board4[18].setBounds(275,105+50+50+50+3+50+50+50+3+50, 80, 80);
    Mainframe.add(Board1[18]);
    Mainframe.add(Board2[18]);
    Mainframe.add(Board3[18]);
    Mainframe.add(Board4[18]);
    /*Board1[18].setIcon(p1);
    Board2[18].setIcon(p2);
    Board3[18].setIcon(p3);
    Board4[18].setIcon(p4);*/
    Mainframe.add(Board[18]);
    Board[3] = new JLabel();
    Board1[3] = new JLabel();
    Board2[3] = new JLabel();
    Board3[3] = new JLabel();
    Board4[3] = new JLabel();
    Board[3].setBounds(170+50+50, 60+50+50+50+50+50+50+5+50+50+50+5, 80, 80);
    Board1[3].setBounds(263,105+50+50+50+3+50+50+50+3+50+50+3, 80, 80);
    Board2[3].setBounds(265,115+50+50+50+3+50+50+50+3+50+50+3, 80, 80);
    Board3[3].setBounds(275,115+50+50+50+3+50+50+50+3+50+50+3, 80, 80);
    Board4[3].setBounds(275,105+50+50+50+3+50+50+50+3+50+50+3, 80, 80);
    Mainframe.add(Board1[3]);
    Mainframe.add(Board2[3]);
    Mainframe.add(Board3[3]);
    Mainframe.add(Board4[3]);
    /*Board1[3].setIcon(p1);
    Board2[3].setIcon(p2);
    Board3[3].setIcon(p3);
    Board4[3].setIcon(p4);*/
    Board[97] = new JLabel();
    Board1[97] = new JLabel();
    Board2[97] = new JLabel();
    Board3[97] = new JLabel();
    Board4[97] = new JLabel();
    Board[97].setBounds(170+50+50+50, 60, 80, 80);
    Board[97].setBounds(270, 60, 80, 80);
    Board1[97].setBounds(265+50, 50, 80, 80);
    Board2[97].setBounds(265+50, 60, 80, 80);
    Board3[97].setBounds(274+50, 50, 80, 80);
    Board4[97].setBounds(275+50+5, 62, 80, 80);
    Mainframe.add(Board1[97]);
    Mainframe.add(Board2[97]);
    Mainframe.add(Board3[97]);
    Mainframe.add(Board4[97]);
    /*Board1[97].setIcon(p1);
    Board2[97].setIcon(p2);
    Board3[97].setIcon(p3);
    Board4[97].setIcon(p4);*/
    Mainframe.add(Board[97]);
    Board[84] = new JLabel();
    Board1[84] = new JLabel();
    Board2[84] = new JLabel();
    Board3[84] = new JLabel();
    Board4[84] = new JLabel();
    Board[84].setBounds(170+50+50+50, 60+50, 80, 80);
    Board1[84].setBounds(265+50, 50+50+3, 80, 80);
    Board2[84].setBounds(265+50, 60+50+3, 80, 80);
    Board3[84].setBounds(274+50, 50+50+3, 80, 80);
    Board4[84].setBounds(275+50, 62+50+3, 80, 80);
    Mainframe.add(Board1[84]);
    Mainframe.add(Board2[84]);
    Mainframe.add(Board3[84]);
    Mainframe.add(Board4[84]);
    /*Board1[84].setIcon(p1);
    Board2[84].setIcon(p2);
    Board3[84].setIcon(p3);
    Board4[84].setIcon(p4);*/
    Mainframe.add(Board[84]);
    Board[77] = new JLabel();
    Board1[77] = new JLabel();
    Board2[77] = new JLabel();
    Board3[77] = new JLabel();
    Board4[77] = new JLabel();
   
    Board[77].setBounds(170+50+50+50, 60+50+50, 80, 80);
    Board1[77].setBounds(265+50, 50+50+3+50+3, 80, 80);
    Board2[77].setBounds(265+50, 60+50+3+50+3, 80, 80);
    Board3[77].setBounds(274+50, 50+50+3+50+3, 80, 80);
    Board4[77].setBounds(275+50, 62+50+3+50+3, 80, 80);
    Mainframe.add(Board1[77]);
    Mainframe.add(Board2[77]);
    Mainframe.add(Board3[77]);
    Mainframe.add(Board4[77]);
    /*Board1[77].setIcon(p1);
    Board2[77].setIcon(p2);
    Board3[77].setIcon(p3);
    Board4[77].setIcon(p4);*/
    Mainframe.add(Board[77]);
    Board[64] = new JLabel();
    Board1[64] = new JLabel();
    Board2[64] = new JLabel();
    Board3[64] = new JLabel();
    Board4[64] = new JLabel();
    Board[64].setBounds(170+50+50+50, 60+50+50+50, 80, 80);
    Board1[64].setBounds(265+50, 50+50+3+50+3+50, 80, 80);
    Board2[64].setBounds(265+50, 60+50+3+50+3+50, 80, 80);
    Board3[64].setBounds(274+50, 50+50+3+50+3+50, 80, 80);
    Board4[64].setBounds(275+50, 62+50+3+50+3+50, 80, 80);
    Mainframe.add(Board1[64]);
    Mainframe.add(Board2[64]);
    Mainframe.add(Board3[64]);
    Mainframe.add(Board4[64]);
    /*Board1[64].setIcon(p1);
    Board2[64].setIcon(p2);
    Board3[64].setIcon(p3);
    Board4[64].setIcon(p4);*/
    Mainframe.add(Board[64]);
    Board[57] = new JLabel();
    Board1[57] = new JLabel();
    Board2[57] = new JLabel();
    Board3[57] = new JLabel();
    Board4[57] = new JLabel();
    Board[57].setBounds(170+50+50+50, 60+50+50+50+50, 80, 80);
    Mainframe.add(Board[57]);
    Board1[57].setBounds(265+50, 50+50+3+50+3+50+50, 80, 80);
    Board2[57].setBounds(265+50, 60+50+3+50+3+50+50, 80, 80);
    Board3[57].setBounds(274+50, 50+50+3+50+3+50+50, 80, 80);
    Board4[57].setBounds(275+50, 62+50+3+50+3+50+50, 80, 80);
    Mainframe.add(Board1[57]);
    Mainframe.add(Board2[57]);
    Mainframe.add(Board3[57]);
    Mainframe.add(Board4[57]);
   /* Board1[57].setIcon(p1);
    Board2[57].setIcon(p2);
    Board3[57].setIcon(p3);
    Board4[57].setIcon(p4);*/
    Board[44] = new JLabel();
    Board1[44] = new JLabel();
    Board2[44] = new JLabel();
    Board3[44] = new JLabel();
    Board4[44] = new JLabel();
    Board[44].setBounds(170+50+50+50, 60+50+50+50+50+50+5, 80, 80);
    Mainframe.add(Board[44]);
    Board1[44].setBounds(265+50, 50+50+3+50+3+50+50+50+3, 80, 80);
    Board2[44].setBounds(265+50, 60+50+3+50+3+50+50+50+3, 80, 80);
    Board3[44].setBounds(274+50, 50+50+3+50+3+50+50+50+3, 80, 80);
    Board4[44].setBounds(275+50, 62+50+3+50+3+50+50+50+3, 80, 80);
    Mainframe.add(Board1[44]);
    Mainframe.add(Board2[44]);
    Mainframe.add(Board3[44]);
    Mainframe.add(Board4[44]);
    /*Board1[44].setIcon(p1);
    Board2[44].setIcon(p2);
    Board3[44].setIcon(p3);
    Board4[44].setIcon(p4);*/
    Board[37] = new JLabel();
    Board1[37] = new JLabel();
    Board2[37] = new JLabel();
    Board3[37] = new JLabel();
    Board4[37] = new JLabel();
    Board[37].setBounds(170+50+50+50, 60+50+50+50+50+50+50+5, 80, 80);
    Board1[37].setBounds(265+50, 50+50+3+50+3+50+50+50+3+50+3, 80, 80);
    Board2[37].setBounds(265+50, 60+50+3+50+3+50+50+50+3+50+3, 80, 80);
    Board3[37].setBounds(274+50, 50+50+3+50+3+50+50+50+3+50+3, 80, 80);
    Board4[37].setBounds(275+50, 62+50+3+50+3+50+50+50+3+50+3, 80, 80);
    Mainframe.add(Board1[37]);
    Mainframe.add(Board2[37]);
    Mainframe.add(Board3[37]);
    Mainframe.add(Board4[37]);
   /* Board1[37].setIcon(p1);
    Board2[37].setIcon(p2);
    Board3[37].setIcon(p3);
    Board4[37].setIcon(p4);*/
    Mainframe.add(Board[37]);
    Board[24] = new JLabel();
    Board1[24] = new JLabel();
    Board2[24] = new JLabel();
    Board3[24] = new JLabel();
    Board4[24] = new JLabel();
    Board[24].setBounds(170+50+50+50+50, 60+50+50+50+50+50+50+50+5, 80, 80);
    Board1[24].setBounds(265+50, 50+50+3+50+3+50+50+50+3+50+3+50, 80, 80);
    Board2[24].setBounds(265+50, 60+50+3+50+3+50+50+50+3+50+3+50, 80, 80);
    Board3[24].setBounds(274+50, 50+50+3+50+3+50+50+50+3+50+3+50, 80, 80);
    Board4[24].setBounds(275+50, 62+50+3+50+3+50+50+50+3+50+3+50, 80, 80);
    Mainframe.add(Board1[24]);
    Mainframe.add(Board2[24]);
    Mainframe.add(Board3[24]);
    Mainframe.add(Board4[24]);
   /* Board1[24].setIcon(p1);
    Board2[24].setIcon(p2);
    Board3[24].setIcon(p3);
    Board4[24].setIcon(p4);*/
    Mainframe.add(Board[24]);
    Board[17] = new JLabel();
    Board1[17] = new JLabel();
    Board2[17] = new JLabel();
    Board3[17] = new JLabel();
    Board4[17] = new JLabel();
    Board[17].setBounds(170+50+50+50, 60+50+50+50+50+50+50+50+50+5, 80, 80);
    Board1[17].setBounds(265+50, 50+50+3+50+3+50+50+50+3+50+3+50+50, 80, 80);
    Board2[17].setBounds(265+50, 60+50+3+50+3+50+50+50+3+50+3+50+50, 80, 80);
    Board3[17].setBounds(274+50, 50+50+3+50+3+50+50+50+3+50+3+50+50, 80, 80);
    Board4[17].setBounds(275+50, 62+50+3+50+3+50+50+50+3+50+3+50+50+3, 80, 80);
    Mainframe.add(Board1[17]);
    Mainframe.add(Board2[17]);
    Mainframe.add(Board3[17]);
    Mainframe.add(Board4[17]);
   /* Board1[17].setIcon(p1);
    Board2[17].setIcon(p2);
    Board3[17].setIcon(p3);
    Board4[17].setIcon(p4);*/
    Mainframe.add(Board[17]);
    Board[4] = new JLabel();
    Board1[4] = new JLabel();
    Board2[4] = new JLabel();
    Board3[4] = new JLabel();
    Board4[4] = new JLabel();
    Board[4].setBounds(170+50+50+50, 60+50+50+50+50+50+50+50+50+50+5+4, 80, 80);
    Board1[4].setBounds(265+50, 50+50+3+50+3+50+50+50+3+50+3+50+50+50+3, 80, 80);
    Board2[4].setBounds(265+50, 60+50+3+50+3+50+50+50+3+50+3+50+50+50+3, 80, 80);
    Board3[4].setBounds(274+50, 50+50+3+50+3+50+50+50+3+50+3+50+50+50+3, 80, 80);
    Board4[4].setBounds(275+50, 62+50+3+50+3+50+50+50+3+50+3+50+50+3+50, 80, 80);
    Mainframe.add(Board1[4]);
    Mainframe.add(Board2[4]);
    Mainframe.add(Board3[4]);
    Mainframe.add(Board4[4]);
   /* Board1[4].setIcon(p1);
    Board2[4].setIcon(p2);
    Board3[4].setIcon(p3);
    Board4[4].setIcon(p4);*/
    Mainframe.add(Board[4]);
    Mainframe.add(Board[3]);
    Mainframe.add(Board[2]);
    Mainframe.add(Board[22]);
    Mainframe.add(Board[59]);
    Mainframe.add(Board[79]);
    Mainframe.add(Board[62]);
    Mainframe.add(Board[82]);
    Mainframe.add(Board[99]);
    Mainframe.add(Board[1]);
    Mainframe.add(Board[20]);
    Mainframe.add(Board[21]);
    Mainframe.add(Board[40]);
    Mainframe.add(Board[41]);
    Mainframe.add(Board[61]);
    Mainframe.add(Board[60]);
    Mainframe.add(Board[81]);
    Mainframe.add(Board[100]);
    Mainframe.add(Board[80]);
    
    Board[96] = new JLabel();
    Board1[96] = new JLabel();
    Board2[96] = new JLabel();
    Board3[96] = new JLabel();
    Board4[96] = new JLabel();
    Board[96].setBounds(170+50+50+50+50+50, 60, 80, 80);
    Board1[96].setBounds(265+50+50, 50, 80, 80);
    Board2[96].setBounds(265+50+50, 60, 80, 80);
    Board3[96].setBounds(274+50+50, 50, 80, 80);
    Board4[96].setBounds(275+50+5+50, 62, 80, 80);
    Mainframe.add(Board1[96]);
    Mainframe.add(Board2[96]);
    Mainframe.add(Board3[96]);
    Mainframe.add(Board4[96]);
  /*  Board1[96].setIcon(p1);
    Board2[96].setIcon(p2);
    Board3[96].setIcon(p3);
    Board4[96].setIcon(p4);*/
    Mainframe.add(Board[96]);
    Board[85] = new JLabel();
    Board1[85] = new JLabel();
    Board2[85] = new JLabel();
    Board3[85] = new JLabel();
    Board4[85] = new JLabel();
    Board[85].setBounds(170+50+50+50+50, 60+50, 80, 80);
    Board1[85].setBounds(265+50+50, 50+50, 80, 80);
    Board2[85].setBounds(265+50+50, 60+50, 80, 80);
    Board3[85].setBounds(274+50+50, 50+50, 80, 80);
    Board4[85].setBounds(275+50+5+50, 62+50, 80, 80);
    Mainframe.add(Board1[85]);
    Mainframe.add(Board2[85]);
    Mainframe.add(Board3[85]);
    Mainframe.add(Board4[85]);
    /*Board1[85].setIcon(p1);
    Board2[85].setIcon(p2);
    Board3[85].setIcon(p3);
    Board4[85].setIcon(p4);*/
    Mainframe.add(Board[85]);
    Board[76] = new JLabel();
    Board1[76] = new JLabel();
    Board2[76] = new JLabel();
    Board3[76] = new JLabel();
    Board4[76] = new JLabel();
    Board[76].setBounds(170+50+50+50+50, 60+50+50+50, 80, 80);
    Board1[76].setBounds(265+50+50, 50+50+50+3, 80, 80);
    Board2[76].setBounds(265+50+50, 60+50+50+3, 80, 80);
    Board3[76].setBounds(274+50+50, 50+50+50+5, 80, 80);
    Board4[76].setBounds(275+50+5+50, 62+50+50+3, 80, 80);
    Mainframe.add(Board1[76]);
    Mainframe.add(Board2[76]);
    Mainframe.add(Board3[76]);
    Mainframe.add(Board4[76]);
    /*Board1[76].setIcon(p1);
    Board2[76].setIcon(p2);
    Board3[76].setIcon(p3);
    Board4[76].setIcon(p4);*/
    Mainframe.add(Board[76]);
    Board[65] = new JLabel();
    Board1[65] = new JLabel();
    Board2[65] = new JLabel();
    Board3[65] = new JLabel();
    Board4[65] = new JLabel();
    Board[65].setBounds(170+50+50+50+50, 60+50+50+50, 80, 80);
    Board1[65].setBounds(265+50+50, 50+50+50+3+50, 80, 80);
    Board2[65].setBounds(265+50+50, 60+50+50+3+50, 80, 80);
    Board3[65].setBounds(274+50+50, 50+50+50+5+50, 80, 80);
    Board4[65].setBounds(275+50+5+50, 62+50+50+3+50, 80, 80);
    Mainframe.add(Board1[65]);
    Mainframe.add(Board2[65]);
    Mainframe.add(Board3[65]);
    Mainframe.add(Board4[65]);
    /*Board1[65].setIcon(p1);
    Board2[65].setIcon(p2);
    Board3[65].setIcon(p3);
    Board4[65].setIcon(p4);*/
    Mainframe.add(Board[65]);
    Board[56] = new JLabel();
    Board1[56] = new JLabel();
    Board2[56] = new JLabel();
    Board3[56] = new JLabel();
    Board4[56] = new JLabel();
    Board[56].setBounds(170+50+50+50+50, 60+50+50+50+50, 80, 80);
    Board1[56].setBounds(265+50+50, 50+50+50+3+50+50, 80, 80);
    Board2[56].setBounds(265+50+50, 60+50+50+3+50+50, 80, 80);
    Board3[56].setBounds(274+50+50, 50+50+50+5+50+50, 80, 80);
    Board4[56].setBounds(275+50+5+50, 62+50+50+3+50+50, 80, 80);
    Mainframe.add(Board1[56]);
    Mainframe.add(Board2[56]);
    Mainframe.add(Board3[56]);
    Mainframe.add(Board4[56]);
    /*Board1[56].setIcon(p1);
    Board2[56].setIcon(p2);
    Board3[56].setIcon(p3);
    Board4[56].setIcon(p4);*/
    Mainframe.add(Board[56]);
    Board[45] = new JLabel();
    Board1[45] = new JLabel();
    Board2[45] = new JLabel();
    Board3[45] = new JLabel();
    Board4[45] = new JLabel();
    Board[45].setBounds(170+50+50+50+50, 60+50+50+50+50+50+5, 80, 80);
    Board1[45].setBounds(265+50+50, 50+50+50+3+50+50+50+3, 80, 80);
    Board2[45].setBounds(265+50+50, 60+50+50+3+50+50+50+3, 80, 80);
    Board3[45].setBounds(274+50+50, 50+50+50+5+50+50+50+3, 80, 80);
    Board4[45].setBounds(275+50+5+50, 62+50+50+3+50+50+50+3, 80, 80);
    Mainframe.add(Board1[45]);
    Mainframe.add(Board2[45]);
    Mainframe.add(Board3[45]);
    Mainframe.add(Board4[45]);
    /*Board1[45].setIcon(p1);
    Board2[45].setIcon(p2);
    Board3[45].setIcon(p3);
    Board4[45].setIcon(p4);*/
    Mainframe.add(Board[45]);
    Board[36] = new JLabel();
    Board1[36] = new JLabel();
    Board2[36] = new JLabel();
    Board3[36] = new JLabel();
    Board4[36] = new JLabel();
    Board[36].setBounds(170+50+50+50+50, 60+50+50+50+50+50+50+5, 80, 80);
    Board1[36].setBounds(265+50+50, 50+50+50+3+50+50+50+3+50+3, 80, 80);
    Board2[36].setBounds(265+50+50, 60+50+50+3+50+50+50+3+50+3, 80, 80);
    Board3[36].setBounds(274+50+50, 50+50+50+5+50+50+50+3+50+3, 80, 80);
    Board4[36].setBounds(275+50+5+50, 62+50+50+3+50+50+50+3+50+3, 80, 80);
    Mainframe.add(Board1[36]);
    Mainframe.add(Board2[36]);
    Mainframe.add(Board3[36]);
    Mainframe.add(Board4[36]);
   /* Board1[36].setIcon(p1);
    Board2[36].setIcon(p2);
    Board3[36].setIcon(p3);
    Board4[36].setIcon(p4);*/
    Mainframe.add(Board[36]);
    Board[25] = new JLabel();
    Board1[25] = new JLabel();
    Board2[25] = new JLabel();
    Board3[25] = new JLabel();
    Board4[25] = new JLabel();
    Board[25].setBounds(170+50+50+50+50, 60+50+50+50+50+50+50+50+5+50, 80, 80);
    Board1[25].setBounds(265+50+50, 50+50+50+3+50+50+50+3+50+3+50, 80, 80);
    Board2[25].setBounds(265+50+50, 60+50+50+3+50+50+50+3+50+3+50, 80, 80);
    Board3[25].setBounds(274+50+50, 50+50+50+5+50+50+50+3+50+3+50, 80, 80);
    Board4[25].setBounds(275+50+5+50, 62+50+50+3+50+50+50+3+50+3+50, 80, 80);
    Mainframe.add(Board1[25]);
    Mainframe.add(Board2[25]);
    Mainframe.add(Board3[25]);
    Mainframe.add(Board4[25]);
   /* Board1[25].setIcon(p1);
    Board2[25].setIcon(p2);
    Board3[25].setIcon(p3);
    Board4[25].setIcon(p4);*/
    Mainframe.add(Board[25]);
    Board[16] = new JLabel();
    Board1[16] = new JLabel();
    Board2[16] = new JLabel();
    Board3[16] = new JLabel();
    Board4[16] = new JLabel();
    Board[16].setBounds(170+50+50+50+50, 60+50+50+50+50+50+50+50+50+5, 80, 80);
    Board1[16].setBounds(265+50+50, 50+50+50+3+50+50+50+3+50+3+50+50+3, 80, 80);
    Board2[16].setBounds(265+50+50, 60+50+50+3+50+50+50+3+50+3+50+50+3, 80, 80);
    Board3[16].setBounds(274+50+50, 50+50+50+5+50+50+50+3+50+3+50+50+3, 80, 80);
    Board4[16].setBounds(275+50+5+50, 62+50+50+3+50+50+50+3+50+3+50+50+3, 80, 80);
    Mainframe.add(Board1[16]);
    Mainframe.add(Board2[16]);
    Mainframe.add(Board3[16]);
    Mainframe.add(Board4[16]);
    /*Board1[16].setIcon(p1);
    Board2[16].setIcon(p2);
    Board3[16].setIcon(p3);
    Board4[16].setIcon(p4);*/
    Mainframe.add(Board[16]);
    Board[5] = new JLabel();
    Board1[5] = new JLabel();
    Board2[5] = new JLabel();
    Board3[5] = new JLabel();
    Board4[5] = new JLabel();
    Board[5].setBounds(170+50+50+50+50, 60+50+50+50+50+50+50+50+50+50+5+5, 80, 80);
    Board1[5].setBounds(265+50+50, 50+50+50+3+50+50+50+3+50+3+50+50+3+50, 80, 80);
    Board2[5].setBounds(265+50+50, 60+50+50+3+50+50+50+3+50+3+50+50+3+50, 80, 80);
    Board3[5].setBounds(274+50+50, 50+50+50+5+50+50+50+3+50+3+50+50+3+50, 80, 80);
    Board4[5].setBounds(275+50+5+50, 62+50+50+3+50+50+50+3+50+3+50+50+3+50, 80, 80);
    Mainframe.add(Board1[5]);
    Mainframe.add(Board2[5]);
    Mainframe.add(Board3[5]);
    Mainframe.add(Board4[5]);
    /*Board1[5].setIcon(p1);
    Board2[5].setIcon(p2);
    Board3[5].setIcon(p3);
    Board4[5].setIcon(p4);*/
    Mainframe.add(Board[5]);
    Board[95] = new JLabel();
    Board1[95] = new JLabel();
    Board2[95] = new JLabel();
    Board3[95] = new JLabel();
    Board4[95] = new JLabel();
    Board[95].setBounds(170+50+50+50+50+50, 60, 80, 80);
    Board1[95].setBounds(265+50+50+50, 50, 80, 80);
    Board2[95].setBounds(265+50+50+50, 60, 80, 80);
    Board3[95].setBounds(274+50+50+50, 50, 80, 80);
    Board4[95].setBounds(275+50+5+50+50, 62, 80, 80);
    Mainframe.add(Board1[95]);
    Mainframe.add(Board2[95]);
    Mainframe.add(Board3[95]);
    Mainframe.add(Board4[95]);
   /* Board1[95].setIcon(p1);
    Board2[95].setIcon(p2);
    Board3[95].setIcon(p3);
    Board4[95].setIcon(p4);*/
    Mainframe.add(Board[95]);
    
    Board[86] = new JLabel();
    Board1[86] = new JLabel();
    Board2[86] = new JLabel();
    Board3[86] = new JLabel();
    Board4[86] = new JLabel();
    Board[86].setBounds(170+50+50+50+50+50, 60+50, 80, 80);
    Board1[86].setBounds(265+50+50+50, 50+50, 80, 80);
    Board2[86].setBounds(265+50+50+50, 60+50, 80, 80);
    Board3[86].setBounds(274+50+50+50, 50+50, 80, 80);
    Board4[86].setBounds(275+50+5+50+50, 62+50, 80, 80);
    Mainframe.add(Board1[86]);
    Mainframe.add(Board2[86]);
    Mainframe.add(Board3[86]);
    Mainframe.add(Board4[86]);
    /*Board1[86].setIcon(p1);
    Board2[86].setIcon(p2);
    Board3[86].setIcon(p3);
    Board4[86].setIcon(p4);*/
    Mainframe.add(Board[86]);
    
    Board[75] = new JLabel();
    Board1[75] = new JLabel();
    Board2[75] = new JLabel();
    Board3[75] = new JLabel();
    Board4[75] = new JLabel();
    Board[75].setBounds(170+50+50+50+50+50, 60+50+50+50, 80, 80);
    Board1[75].setBounds(265+50+50+50, 50+50+50+3, 80, 80);
    Board2[75].setBounds(265+50+50+50, 60+50+50+3, 80, 80);
    Board3[75].setBounds(274+50+50+50, 50+50+50+3, 80, 80);
    Board4[75].setBounds(275+50+5+50+50, 62+50+50+3, 80, 80);
    Mainframe.add(Board1[75]);
    Mainframe.add(Board2[75]);
    Mainframe.add(Board3[75]);
    Mainframe.add(Board4[75]);
   /* Board1[75].setIcon(p1);
    Board2[75].setIcon(p2);
    Board3[75].setIcon(p3);
    Board4[75].setIcon(p4);*/
    Mainframe.add(Board[75]);
    
    Board[66] = new JLabel();
    Board1[66] = new JLabel();
    Board2[66] = new JLabel();
    Board3[66] = new JLabel();
    Board4[66] = new JLabel();
    Board[66].setBounds(170+50+50+50+50+50, 60+50+50+50, 80, 80);
    Board1[66].setBounds(265+50+50+50, 50+50+50+3+50+3, 80, 80);
    Board2[66].setBounds(265+50+50+50, 60+50+50+3+50+3, 80, 80);
    Board3[66].setBounds(274+50+50+50, 50+50+50+3+50+3, 80, 80);
    Board4[66].setBounds(275+50+5+50+50, 62+50+50+3+50+3, 80, 80);
    Mainframe.add(Board1[66]);
    Mainframe.add(Board2[66]);
    Mainframe.add(Board3[66]);
    Mainframe.add(Board4[66]);
   /* Board1[66].setIcon(p1);
    Board2[66].setIcon(p2);
    Board3[66].setIcon(p3);
    Board4[66].setIcon(p4);*/
    Mainframe.add(Board[66]);
    
    Board[55] = new JLabel();
    Board1[55] = new JLabel();
    Board2[55] = new JLabel();
    Board3[55] = new JLabel();
    Board4[55] = new JLabel();
    Board[55].setBounds(170+50+50+50+50+50, 60+50+50+50+50+50, 80, 80);
    Board1[55].setBounds(265+50+50+50, 50+50+50+3+50+3+50, 80, 80);
    Board2[55].setBounds(265+50+50+50, 60+50+50+3+50+3+50, 80, 80);
    Board3[55].setBounds(274+50+50+50, 50+50+50+3+50+3+50, 80, 80);
    Board4[55].setBounds(275+50+5+50+50, 62+50+50+3+50+3+50, 80, 80);
    Mainframe.add(Board1[55]);
    Mainframe.add(Board2[55]);
    Mainframe.add(Board3[55]);
    Mainframe.add(Board4[55]);
    /*Board1[55].setIcon(p1);
    Board2[55].setIcon(p2);
    Board3[55].setIcon(p3);
    Board4[55].setIcon(p4);*/
    Mainframe.add(Board[55]);
    Board[46] = new JLabel();
    Board1[46] = new JLabel();
    Board2[46] = new JLabel();
    Board3[46] = new JLabel();
    Board4[46] = new JLabel();
    Board[46].setBounds(170+50+50+50+50+50, 60+50+50+50+50+50+5, 80, 80);
    Board1[46].setBounds(265+50+50+50, 50+50+50+3+50+3+50+50, 80, 80);
    Board2[46].setBounds(265+50+50+50, 60+50+50+3+50+3+50+50, 80, 80);
    Board3[46].setBounds(274+50+50+50, 50+50+50+3+50+3+50+50, 80, 80);
    Board4[46].setBounds(275+50+5+50+50, 62+50+50+3+50+3+50+50, 80, 80);
    Mainframe.add(Board1[46]);
    Mainframe.add(Board2[46]);
    Mainframe.add(Board3[46]);
    Mainframe.add(Board4[46]);
   /* Board1[46].setIcon(p1);
    Board2[46].setIcon(p2);
    Board3[46].setIcon(p3);
    Board4[46].setIcon(p4);*/
    Mainframe.add(Board[46]);
    Board[35] = new JLabel();
    Board1[35] = new JLabel();
    Board2[35] = new JLabel();
    Board3[35] = new JLabel();
    Board4[35] = new JLabel();
    Board[35].setBounds(170+50+50+50+50+50, 60+50+50+50+50+50+50+5, 80, 80);
    Board1[35].setBounds(265+50+50+50, 50+50+50+3+50+3+50+50+50+3, 80, 80);
    Board2[35].setBounds(265+50+50+50, 60+50+50+3+50+3+50+50+50+3, 80, 80);
    Board3[35].setBounds(274+50+50+50, 50+50+50+3+50+3+50+50+50+3, 80, 80);
    Board4[35].setBounds(275+50+5+50+50, 62+50+50+3+50+3+50+50+50+3, 80, 80);
    Mainframe.add(Board1[35]);
    Mainframe.add(Board2[35]);
    Mainframe.add(Board3[35]);
    Mainframe.add(Board4[35]);
   /* Board1[35].setIcon(p1);
    Board2[35].setIcon(p2);
    Board3[35].setIcon(p3);
    Board4[35].setIcon(p4);*/
    Mainframe.add(Board[35]);
    Board[26] = new JLabel();
    Board1[26] = new JLabel();
    Board2[26] = new JLabel();
    Board3[26] = new JLabel();
    Board4[26] = new JLabel();
    Board[26].setBounds(170+50+50+50+50+50, 60+50+50+50+50+50+5+50+50, 80, 80);
    Board1[26].setBounds(265+50+50+50, 50+50+50+3+50+3+50+50+50+3+50, 80, 80);
    Board2[26].setBounds(265+50+50+50, 60+50+50+3+50+3+50+50+50+3+50, 80, 80);
    Board3[26].setBounds(274+50+50+50, 50+50+50+3+50+3+50+50+50+3+50, 80, 80);
    Board4[26].setBounds(275+50+5+50+50, 62+50+50+3+50+3+50+50+50+3+50, 80, 80);
    Mainframe.add(Board1[26]);
    Mainframe.add(Board2[26]);
    Mainframe.add(Board3[26]);
    Mainframe.add(Board4[26]);
   /* Board1[26].setIcon(p1);
    Board2[26].setIcon(p2);
    Board3[26].setIcon(p3);
    Board4[26].setIcon(p4);*/
    Mainframe.add(Board[26]); 
    Board[15] = new JLabel();
    Board1[15] = new JLabel();
    Board2[15] = new JLabel();
    Board3[15] = new JLabel();
    Board4[15] = new JLabel();
    Board[15].setBounds(170+50+50+50+50+50, 60+50+50+50+50+50+5+50+50+50+5, 80, 80);
    Board1[15].setBounds(265+50+50+50, 50+50+50+3+50+3+50+50+50+3+50+50+3, 80, 80);
    Board2[15].setBounds(265+50+50+50, 60+50+50+3+50+3+50+50+50+3+50+50+3, 80, 80);
    Board3[15].setBounds(274+50+50+50, 50+50+50+3+50+3+50+50+50+3+50+50+3, 80, 80);
    Board4[15].setBounds(275+50+5+50+50, 62+50+50+3+50+3+50+50+50+3+50+50+3, 80, 80);
    Mainframe.add(Board1[15]);
    Mainframe.add(Board2[15]);
    Mainframe.add(Board3[15]);
    Mainframe.add(Board4[15]);
   /* Board1[15].setIcon(p1);
    Board2[15].setIcon(p2);
    Board3[15].setIcon(p3);
    Board4[15].setIcon(p4);*/
    Mainframe.add(Board[15]);
    Board[6] = new JLabel();
    Board1[6] = new JLabel();
    Board2[6] = new JLabel();
    Board3[6] = new JLabel();
    Board4[6] = new JLabel();
    Board[6].setBounds(170+50+50+50+50+50, 60+50+50+50+50+50+5+50+50+50+50+5, 80, 80);
    Board1[6].setBounds(265+50+50+50, 50+50+50+3+50+3+50+50+50+3+50+50+3+50, 80, 80);
    Board2[6].setBounds(265+50+50+50, 60+50+50+3+50+3+50+50+50+3+50+50+3+50, 80, 80);
    Board3[6].setBounds(274+50+50+50, 50+50+50+3+50+3+50+50+50+3+50+50+3+50, 80, 80);
    Board4[6].setBounds(275+50+5+50+50, 62+50+50+3+50+3+50+50+50+3+50+50+3+50, 80, 80);
    Mainframe.add(Board1[6]);
    Mainframe.add(Board2[6]);
    Mainframe.add(Board3[6]);
    Mainframe.add(Board4[6]);
    /*Board1[6].setIcon(p1);
    Board2[6].setIcon(p2);
    Board3[6].setIcon(p3);
    Board4[6].setIcon(p4);*/
   Mainframe.add(Board[6]); 
   Board[94] = new JLabel();
   Board1[94] = new JLabel();
   Board2[94] = new JLabel();
   Board3[94] = new JLabel();
   Board4[94] = new JLabel();
   Board[94].setBounds(170+50+50+50+50+50+50+50, 60, 80, 80);
   Board1[94].setBounds(265+50+50+50+50, 50, 80, 80);
   Board2[94].setBounds(265+50+50+50+50, 60, 80, 80);
   Board3[94].setBounds(274+50+50+50+50, 50, 80, 80);
   Board4[94].setBounds(275+50+5+50+50+50, 62, 80, 80);
   Mainframe.add(Board1[94]);
   Mainframe.add(Board2[94]);
   Mainframe.add(Board3[94]);
   Mainframe.add(Board4[94]);
   /*Board1[94].setIcon(p1);
   Board2[94].setIcon(p2);
   Board3[94].setIcon(p3);
   Board4[94].setIcon(p4);*/
   Mainframe.add(Board[94]);
   Board[87] = new JLabel();
   Board1[87] = new JLabel();
   Board2[87] = new JLabel();
   Board3[87] = new JLabel();
   Board4[87] = new JLabel();
   Board[87].setBounds(170+50+50+50+50+50+50, 60+50, 80, 80);
   Board1[87].setBounds(265+50+50+50+50, 50+50, 80, 80);
   Board2[87].setBounds(265+50+50+50+50, 60+50, 80, 80);
   Board3[87].setBounds(274+50+50+50+50, 50+50, 80, 80);
   Board4[87].setBounds(275+50+5+50+50+50, 62+50, 80, 80);
   Mainframe.add(Board1[87]);
   Mainframe.add(Board2[87]);
   Mainframe.add(Board3[87]);
   Mainframe.add(Board4[87]);
   /*Board1[87].setIcon(p1);
   Board2[87].setIcon(p2);
   Board3[87].setIcon(p3);
   Board4[87].setIcon(p4);*/
   Mainframe.add(Board[87]);
   Board[74] = new JLabel();
   Board1[74] = new JLabel();
   Board2[74] = new JLabel();
   Board3[74] = new JLabel();
   Board4[74] = new JLabel();
   Board[74].setBounds(170+50+50+50+50+50+50, 60+50+50, 80, 80);
   Board1[74].setBounds(265+50+50+50+50, 50+50+50+3, 80, 80);
   Board2[74].setBounds(265+50+50+50+50, 60+50+50+3, 80, 80);
   Board3[74].setBounds(274+50+50+50+50, 50+50+50+3, 80, 80);
   Board4[74].setBounds(275+50+5+50+50+50, 62+50+50+3, 80, 80);
   Mainframe.add(Board1[74]);
   Mainframe.add(Board2[74]);
   Mainframe.add(Board3[74]);
   Mainframe.add(Board4[74]);
   /*Board1[74].setIcon(p1);
   Board2[74].setIcon(p2);
   Board3[74].setIcon(p3);
   Board4[74].setIcon(p4);*/
   Mainframe.add(Board[74]);
   Board[67] = new JLabel();
   Board1[67] = new JLabel();
   Board2[67] = new JLabel();
   Board3[67] = new JLabel();
   Board4[67] = new JLabel();
   Board[67].setBounds(170+50+50+50+50+50+50, 60+50+50+50, 80, 80);
   Board1[67].setBounds(265+50+50+50+50, 50+50+50+3+50, 80, 80);
   Board2[67].setBounds(265+50+50+50+50, 60+50+50+3+50, 80, 80);
   Board3[67].setBounds(274+50+50+50+50, 50+50+50+3+50, 80, 80);
   Board4[67].setBounds(275+50+5+50+50+50, 62+50+50+3+50, 80, 80);
   Mainframe.add(Board1[67]);
   Mainframe.add(Board2[67]);
   Mainframe.add(Board3[67]);
   Mainframe.add(Board4[67]);
  /* Board1[67].setIcon(p1);
   Board2[67].setIcon(p2);
   Board3[67].setIcon(p3);
   Board4[67].setIcon(p4);*/
   Mainframe.add(Board[67]);
   Board[54] = new JLabel();
   Board1[54] = new JLabel();
   Board2[54] = new JLabel();
   Board3[54] = new JLabel();
   Board4[54] = new JLabel();
   Board[54].setBounds(170+50+50+50+50+50+50, 60+50+50+50+50, 80, 80);
   Board1[54].setBounds(265+50+50+50+50, 50+50+50+3+50+50+3, 80, 80);
   Board2[54].setBounds(265+50+50+50+50, 60+50+50+3+50+50+3, 80, 80);
   Board3[54].setBounds(274+50+50+50+50, 50+50+50+3+50+50+3, 80, 80);
   Board4[54].setBounds(275+50+5+50+50+50, 62+50+50+3+50+50+3, 80, 80);
   Mainframe.add(Board1[54]);
   Mainframe.add(Board2[54]);
   Mainframe.add(Board3[54]);
   Mainframe.add(Board4[54]);
   /*Board1[54].setIcon(p1);
   Board2[54].setIcon(p2);
   Board3[54].setIcon(p3);
   Board4[54].setIcon(p4);*/
   Mainframe.add(Board[54]);
   Board[47]=new JLabel();
   Board1[47]=new JLabel();
   Board2[47]=new JLabel();
   Board3[47]=new JLabel();
   Board4[47]=new JLabel();
   Board[47].setBounds(170+50+50+50+50+50+50, 60+50+50+50+50+50+5, 80, 80);
   Board1[47].setBounds(265+50+50+50+50, 50+50+50+3+50+50+3+50, 80, 80);
   Board2[47].setBounds(265+50+50+50+50, 60+50+50+3+50+50+3+50, 80, 80);
   Board3[47].setBounds(274+50+50+50+50, 50+50+50+3+50+50+3+50, 80, 80);
   Board4[47].setBounds(275+50+5+50+50+50, 62+50+50+3+50+50+3+50, 80, 80);
   Mainframe.add(Board1[47]);
   Mainframe.add(Board2[47]);
   Mainframe.add(Board3[47]);
   Mainframe.add(Board4[47]);
   /*Board1[47].setIcon(p1);
   Board2[47].setIcon(p2);
   Board3[47].setIcon(p3);
   Board4[47].setIcon(p4);*/
   Mainframe.add(Board[47]);
   Board[34]=new JLabel();
   Board1[34]=new JLabel();
   Board2[34]=new JLabel();
   Board3[34]=new JLabel();
   Board4[34]=new JLabel();
   Board[34].setBounds(170+50+50+50+50+50+50, 60+50+50+50+50+50+50+5, 80, 80);
   Board1[34].setBounds(265+50+50+50+50, 50+50+50+3+50+50+3+50+50+3, 80, 80);
   Board2[34].setBounds(265+50+50+50+50, 60+50+50+3+50+50+3+50+50+3, 80, 80);
   Board3[34].setBounds(274+50+50+50+50, 50+50+50+3+50+50+3+50+50+3, 80, 80);
   Board4[34].setBounds(275+50+5+50+50+50, 62+50+50+3+50+50+3+50+50+3, 80, 80);
   Mainframe.add(Board1[34]);
   Mainframe.add(Board2[34]);
   Mainframe.add(Board3[34]);
   Mainframe.add(Board4[34]);
  /* Board1[34].setIcon(p1);
   Board2[34].setIcon(p2);
   Board3[34].setIcon(p3);
   Board4[34].setIcon(p4);*/
   Mainframe.add(Board[34]);
   Board[27]=new JLabel();
   Board1[27]=new JLabel();
   Board2[27]=new JLabel();
   Board3[27]=new JLabel();
   Board4[27]=new JLabel();
   Board[27].setBounds(170+50+50+50+50+50+50, 60+50+50+50+50+50+50+50+5, 80, 80);
   Board1[27].setBounds(265+50+50+50+50, 50+50+50+3+50+50+3+50+50+3+50, 80, 80);
   Board2[27].setBounds(265+50+50+50+50, 60+50+50+3+50+50+3+50+50+3+50, 80, 80);
   Board3[27].setBounds(274+50+50+50+50, 50+50+50+3+50+50+3+50+50+3+50, 80, 80);
   Board4[27].setBounds(275+50+5+50+50+50, 62+50+50+3+50+50+3+50+50+3+50, 80, 80);
   Mainframe.add(Board1[27]);
   Mainframe.add(Board2[27]);
   Mainframe.add(Board3[27]);
   Mainframe.add(Board4[27]);
   /*Board1[27].setIcon(p1);
   Board2[27].setIcon(p2);
   Board3[27].setIcon(p3);
   Board4[27].setIcon(p4);*/
   Mainframe.add(Board[27]);
   Board[14]=new JLabel();
   Board1[14]=new JLabel();
   Board2[14]=new JLabel();
   Board3[14]=new JLabel();
   Board4[14]=new JLabel();
   Board[14].setBounds(170+50+50+50+50+50+50, 60+50+50+50+50+50+50+50+50+5, 80, 80);
   Board1[14].setBounds(265+50+50+50+50, 50+50+50+3+50+50+3+50+50+3+50+50+3, 80, 80);
   Board2[14].setBounds(265+50+50+50+50, 60+50+50+3+50+50+3+50+50+3+50+50+3, 80, 80);
   Board3[14].setBounds(274+50+50+50+50, 50+50+50+3+50+50+3+50+50+3+50+50+3, 80, 80);
   Board4[14].setBounds(275+50+5+50+50+50, 62+50+50+3+50+50+3+50+50+3+50+50+3, 80, 80);
   Mainframe.add(Board1[14]);
   Mainframe.add(Board2[14]);
   Mainframe.add(Board3[14]);
   Mainframe.add(Board4[14]);
   /*Board1[14].setIcon(p1);
   Board2[14].setIcon(p2);
   Board3[14].setIcon(p3);
   Board4[14].setIcon(p4);*/
   Mainframe.add(Board[14]);
   Board[7]=new JLabel();
   Board1[7]=new JLabel();
   Board2[7]=new JLabel();
   Board3[7]=new JLabel();
   Board4[7]=new JLabel();
   Board[7].setBounds(170+50+50+50+50+50+50, 60+50+50+50+50+50+50+50+50+50+10, 80, 80);
   Board1[7].setBounds(265+50+50+50+50+5, 50+50+50+3+50+50+3+50+50+3+50+50+3+50+3+5, 80, 80);
   Board2[7].setBounds(265+50+50+50+50+5, 60+50+50+3+50+50+3+50+50+3+50+50+3+50+3+5, 80, 80);
   Board3[7].setBounds(274+50+50+50+50+5, 50+50+50+3+50+50+3+50+50+3+50+50+3+50+3+5, 80, 80);
   Board4[7].setBounds(275+50+5+50+50+50+5, 62+50+50+3+50+50+3+50+50+3+50+50+3+50+3+5, 80, 80);
   Mainframe.add(Board1[7]);
   Mainframe.add(Board2[7]);
   Mainframe.add(Board3[7]);
   Mainframe.add(Board4[7]);
   /*Board1[7].setIcon(p1);
   Board2[7].setIcon(p2);
   Board3[7].setIcon(p3);
   Board4[7].setIcon(p4);*/
   Mainframe.add(Board[7]);  
    
   
   Board[93] = new JLabel();
   Board1[93] = new JLabel();
   Board2[93] = new JLabel();
   Board3[93] = new JLabel();
   Board4[93] = new JLabel();
   Board[93].setBounds(170+50+50+50+50+50+50+50, 60, 80, 80);
   Board1[93].setBounds(265+50+50+50+50+50, 50, 80, 80);
   Board2[93].setBounds(265+50+50+50+50+50, 60, 80, 80);
   Board3[93].setBounds(274+50+50+50+50+50, 50, 80, 80);
   Board4[93].setBounds(275+50+5+50+50+50+50, 62, 80, 80);
   Mainframe.add(Board1[93]);
   Mainframe.add(Board2[93]);
   Mainframe.add(Board3[93]);
   Mainframe.add(Board4[93]);
   /*Board1[93].setIcon(p1);
   Board2[93].setIcon(p2);
   Board3[93].setIcon(p3);
   Board4[93].setIcon(p4);*/
   Mainframe.add(Board[93]);
   Board[88] = new JLabel();
   Board1[88] = new JLabel();
   Board2[88] = new JLabel();
   Board3[88] = new JLabel();
   Board4[88] = new JLabel();
   Board[88].setBounds(170+50+50+50+50+50+50+50, 60+50, 80, 80);
   Board1[88].setBounds(265+50+50+50+50+50, 50+50, 80, 80);
   Board2[88].setBounds(265+50+50+50+50+50, 60+50, 80, 80);
   Board3[88].setBounds(274+50+50+50+50+50, 50+50, 80, 80);
   Board4[88].setBounds(275+50+5+50+50+50+50, 62+50, 80, 80);
   Mainframe.add(Board1[88]);
   Mainframe.add(Board2[88]);
   Mainframe.add(Board3[88]);
   Mainframe.add(Board4[88]);
   /*Board1[88].setIcon(p1);
   Board2[88].setIcon(p2);
   Board3[88].setIcon(p3);
   Board4[88].setIcon(p4);*/
   Mainframe.add(Board[88]);
   Board[73] = new JLabel();
   Board1[73] = new JLabel();
   Board2[73] = new JLabel();
   Board3[73] = new JLabel();
   Board4[73] = new JLabel();
   Board[73].setBounds(170+50+50+50+50+50+50+50, 60+50+50, 80, 80);
   Board1[73].setBounds(265+50+50+50+50+50, 50+50+50+3, 80, 80);
   Board2[73].setBounds(265+50+50+50+50+50, 60+50+50+3, 80, 80);
   Board3[73].setBounds(274+50+50+50+50+50, 50+50+50+3, 80, 80);
   Board4[73].setBounds(275+50+5+50+50+50+50, 62+50+50+3, 80, 80);
   Mainframe.add(Board1[73]);
   Mainframe.add(Board2[73]);
   Mainframe.add(Board3[73]);
   Mainframe.add(Board4[73]);
 /*  Board1[73].setIcon(p1);
   Board2[73].setIcon(p2);
   Board3[73].setIcon(p3);
   Board4[73].setIcon(p4);*/
   Mainframe.add(Board[73]);
   Board[68] = new JLabel();
   Board1[68] = new JLabel();
   Board2[68] = new JLabel();
   Board3[68] = new JLabel();
   Board4[68] = new JLabel();
   Board[68].setBounds(170+50+50+50+50+50+50+50, 60+50+50+50, 80, 80);
   Board1[68].setBounds(265+50+50+50+50+50, 50+50+50+3+50, 80, 80);
   Board2[68].setBounds(265+50+50+50+50+50, 60+50+50+3+50, 80, 80);
   Board3[68].setBounds(274+50+50+50+50+50, 50+50+50+3+50, 80, 80);
   Board4[68].setBounds(275+50+5+50+50+50+50, 62+50+50+3+50, 80, 80);
   Mainframe.add(Board1[68]);
   Mainframe.add(Board2[68]);
   Mainframe.add(Board3[68]);
   Mainframe.add(Board4[68]);
   /*Board1[68].setIcon(p1);
   Board2[68].setIcon(p2);
   Board3[68].setIcon(p3);
   Board4[68].setIcon(p4);*/
   Mainframe.add(Board[68]);
   Board[53] = new JLabel();
   Board1[53] = new JLabel();
   Board2[53] = new JLabel();
   Board3[53] =new JLabel(); 
   Board4[53] =new JLabel(); 
   Board[53].setBounds(170+50+50+50+50+50+50+50, 60+50+50+50+50, 80, 80);
   Board1[53].setBounds(265+50+50+50+50+50, 50+50+50+3+50+50, 80, 80);
   Board2[53].setBounds(265+50+50+50+50+50, 60+50+50+3+50+50, 80, 80);
   Board3[53].setBounds(274+50+50+50+50+50, 50+50+50+3+50+50, 80, 80);
   Board4[53].setBounds(275+50+5+50+50+50+50, 62+50+50+3+50+50, 80, 80);
   Mainframe.add(Board1[53]);
   Mainframe.add(Board2[53]);
   Mainframe.add(Board3[53]);
   Mainframe.add(Board4[53]);
   /*Board1[53].setIcon(p1);
   Board2[53].setIcon(p2);
   Board3[53].setIcon(p3);
   Board4[53].setIcon(p4);*/
   Mainframe.add(Board[53]);
   Board[48]=new JLabel();
   Board1[48]=new JLabel();
   Board2[48]=new JLabel();
   Board3[48]=new JLabel();
   Board4[48]=new JLabel();
   Board[48].setBounds(170+50+50+50+50+50+50+50, 60+50+50+50+50+50+5, 80, 80);
   Board1[48].setBounds(265+50+50+50+50+50, 50+50+50+3+50+50+50+3, 80, 80);
   Board2[48].setBounds(265+50+50+50+50+50, 60+50+50+3+50+50+50+3, 80, 80);
   Board3[48].setBounds(274+50+50+50+50+50, 50+50+50+3+50+50+50+3, 80, 80);
   Board4[48].setBounds(275+50+5+50+50+50+50, 62+50+50+3+50+50+50+3, 80, 80);
   Mainframe.add(Board1[48]);
   Mainframe.add(Board2[48]);
   Mainframe.add(Board3[48]);
   Mainframe.add(Board4[48]);
   /*Board1[48].setIcon(p1);
   Board2[48].setIcon(p2);
   Board3[48].setIcon(p3);
   Board4[48].setIcon(p4);*/
   Mainframe.add(Board[48]);
   Board[33]=new JLabel();
   Board1[33]=new JLabel();
   Board2[33]=new JLabel();
   Board3[33]=new JLabel();
   Board4[33]=new JLabel();
   Board[33].setBounds(170+50+50+50+50+50+50+50, 60+50+50+50+50+50+50+5, 80, 80);
   Board1[33].setBounds(265+50+50+50+50+50, 50+50+50+3+50+50+50+3+50+3, 80, 80);
   Board2[33].setBounds(265+50+50+50+50+50, 60+50+50+3+50+50+50+3+50+3, 80, 80);
   Board3[33].setBounds(274+50+50+50+50+50, 50+50+50+3+50+50+50+3+50+3, 80, 80);
   Board4[33].setBounds(275+50+5+50+50+50+50, 62+50+50+3+50+50+50+3+50+3, 80, 80);
   Mainframe.add(Board1[33]);
   Mainframe.add(Board2[33]);
   Mainframe.add(Board3[33]);
   Mainframe.add(Board4[33]);
  /* Board1[33].setIcon(p1);
   Board2[33].setIcon(p2);
   Board3[33].setIcon(p3);
   Board4[33].setIcon(p4);*/
   Mainframe.add(Board[33]);
   Board[28]=new JLabel();
   Board1[28]=new JLabel();
   Board2[28]=new JLabel();
   Board3[28]=new JLabel();
   Board4[28]=new JLabel();
   Board[28].setBounds(170+50+50+50+50+50+50+50, 60+50+50+50+50+50+50+50+5, 80, 80);
   Board1[28].setBounds(265+50+50+50+50+50, 50+50+50+3+50+50+50+3+50+3+50, 80, 80);
   Board2[28].setBounds(265+50+50+50+50+50, 60+50+50+3+50+50+50+3+50+3+50, 80, 80);
   Board3[28].setBounds(274+50+50+50+50+50, 50+50+50+3+50+50+50+3+50+3+50, 80, 80);
   Board4[28].setBounds(275+50+5+50+50+50+50, 62+50+50+3+50+50+50+3+50+3+50, 80, 80);
   Mainframe.add(Board1[28]);
   Mainframe.add(Board2[28]);
   Mainframe.add(Board3[28]);
   Mainframe.add(Board4[28]);
  /* Board1[28].setIcon(p1);
   Board2[28].setIcon(p2);
   Board3[28].setIcon(p3);
   Board4[28].setIcon(p4);*/
   Mainframe.add(Board[28]);
   Board[13]=new JLabel();
   Board1[13]=new JLabel();
   Board2[13]=new JLabel();
   Board3[13]=new JLabel();
   Board4[13]=new JLabel();
   Board[13].setBounds(170+50+50+50+50+50+50+50, 60+50+50+50+50+50+50+50+50+5, 80, 80);
   Board1[13].setBounds(265+50+50+50+50+50, 50+50+50+3+50+50+50+3+50+3+50+50+3, 80, 80);
   Board2[13].setBounds(265+50+50+50+50+50, 60+50+50+3+50+50+50+3+50+3+50+50+3, 80, 80);
   Board3[13].setBounds(274+50+50+50+50+50, 50+50+50+3+50+50+50+3+50+3+50+50+3, 80, 80);
   Board4[13].setBounds(275+50+5+50+50+50+50, 62+50+50+3+50+50+50+3+50+3+50+50+3, 80, 80);
   Mainframe.add(Board1[13]);
   Mainframe.add(Board2[13]);
   Mainframe.add(Board3[13]);
   Mainframe.add(Board4[13]);
  /* Board1[13].setIcon(p1);
   Board2[13].setIcon(p2);
   Board3[13].setIcon(p3);
   Board4[13].setIcon(p4);*/
   Mainframe.add(Board[13]);
   Board[8]=new JLabel();
   Board1[8]=new JLabel();
   Board2[8]=new JLabel();
   Board3[8]=new JLabel();
   Board4[8]=new JLabel();
   Board[8].setBounds(170+50+50+50+50+50+50+50, 60+50+50+50+50+50+50+50+50+50+10, 80, 80);
   Board1[8].setBounds(265+50+50+50+50+50, 50+50+50+3+50+50+50+3+50+3+50+50+6+50, 80, 80);
   Board2[8].setBounds(265+50+50+50+50+50, 60+50+50+3+50+50+50+3+50+3+50+50+6+50, 80, 80);
   Board3[8].setBounds(274+50+50+50+50+50, 50+50+50+3+50+50+50+3+50+3+50+50+6+50, 80, 80);
   Board4[8].setBounds(275+50+5+50+50+50+50,62+50+50+3+50+50+50+3+50+3+50+50+6+50, 80, 80);
   Mainframe.add(Board1[8]);
   Mainframe.add(Board2[8]);
   Mainframe.add(Board3[8]);
   Mainframe.add(Board4[8]);
   /*Board1[8].setIcon(p1);
   Board2[8].setIcon(p2);
   Board3[8].setIcon(p3);
   Board4[8].setIcon(p4);*/
   Mainframe.add(Board[8]);
   
   
   Board[92] = new JLabel();
   Board1[92] = new JLabel();
   Board2[92] = new JLabel();
   Board3[92] = new JLabel();
   Board4[92] = new JLabel();
   
   Board[92].setBounds(170+50+50+50+50+50+50+50+50, 60, 80, 80);
   Board1[92].setBounds(265+50+50+50+50+50+50, 50, 80, 80);
   Board2[92].setBounds(265+50+50+50+50+50+50, 60, 80, 80);
   Board3[92].setBounds(274+50+50+50+50+50+50, 50, 80, 80);
   Board4[92].setBounds(275+50+5+50+50+50+50+50, 62, 80, 80);
   Mainframe.add(Board1[92]);
   Mainframe.add(Board2[92]);
   Mainframe.add(Board3[92]);
   Mainframe.add(Board4[92]);
   /*Board1[92].setIcon(p1);
   Board2[92].setIcon(p2);
   Board3[92].setIcon(p3);
   Board4[92].setIcon(p4);*/
   Mainframe.add(Board[92]);
   Board[89] = new JLabel();
   Board1[89] = new JLabel();
   Board2[89] = new JLabel();
   Board3[89] = new JLabel();
   Board4[89] = new JLabel();
   Board[89].setBounds(170+50+50+50+50+50+50+50+50, 60+50, 80, 80);
   Board1[89].setBounds(265+50+50+50+50+50+50, 50+50, 80, 80);
   Board2[89].setBounds(265+50+50+50+50+50+50, 60+50, 80, 80);
   Board3[89].setBounds(274+50+50+50+50+50+50, 50+50, 80, 80);
   Board4[89].setBounds(275+50+5+50+50+50+50+50, 62+50, 80, 80);
   Mainframe.add(Board1[89]);
   Mainframe.add(Board2[89]);
   Mainframe.add(Board3[89]);
   Mainframe.add(Board4[89]);
  /* Board1[89].setIcon(p1);
   Board2[89].setIcon(p2);
   Board3[89].setIcon(p3);
   Board4[89].setIcon(p4);*/
   Mainframe.add(Board[89]);
   Board[72] = new JLabel();
   Board1[72] = new JLabel();
   Board2[72] = new JLabel();
   Board3[72] = new JLabel();
   Board4[72] = new JLabel();
   Board[72].setBounds(170+50+50+50+50+50+50+50+50, 60+50+50, 80, 80);
   Board1[72].setBounds(265+50+50+50+50+50+50, 50+50+50, 80, 80);
   Board2[72].setBounds(265+50+50+50+50+50+50, 60+50+50, 80, 80);
   Board3[72].setBounds(274+50+50+50+50+50+50, 50+50+50, 80, 80);
   Board4[72].setBounds(275+50+5+50+50+50+50+50, 62+50+50, 80, 80);
   Mainframe.add(Board1[72]);
   Mainframe.add(Board2[72]);
   Mainframe.add(Board3[72]);
   Mainframe.add(Board4[72]);
   /*Board1[72].setIcon(p1);
   Board2[72].setIcon(p2);
   Board3[72].setIcon(p3);
   Board4[72].setIcon(p4);*/
   Mainframe.add(Board[72]);
   Board[69] = new JLabel();

   Board1[69] = new JLabel();
   Board2[69] = new JLabel();
   Board3[69] = new JLabel();
   Board4[69] = new JLabel();
   Board[69].setBounds(170+50+50+50+50+50+50+50+50, 60+50+50+50, 80, 80);
   Board1[69].setBounds(265+50+50+50+50+50+50, 50+50+50+50+3, 80, 80);
   
   Board2[69].setBounds(265+50+50+50+50+50+50, 60+50+50+50+3, 80, 80);
   Board3[69].setBounds(274+50+50+50+50+50+50, 50+50+50+50+3, 80, 80);
   Board4[69].setBounds(275+50+5+50+50+50+50+50, 62+50+50+50, 80, 80);
   Mainframe.add(Board1[69]);
   Mainframe.add(Board2[69]);
   Mainframe.add(Board3[69]);
   Mainframe.add(Board4[69]);
   /*Board1[69].setIcon(p1);
   Board2[69].setIcon(p2);
   Board3[69].setIcon(p3);
   Board4[69].setIcon(p4);*/
   Mainframe.add(Board[69]);
   Board[52] = new JLabel();
   Board1[52] = new JLabel();
   Board2[52] = new JLabel();
   Board3[52] = new JLabel();
   Board4[52] = new JLabel();
   Board[52].setBounds(170+50+50+50+50+50+50+50+50, 60+50+50+50+50, 80, 80);
   Board1[52].setBounds(265+50+50+50+50+50+50, 50+50+50+50+3+50, 80, 80); 
   Board2[52].setBounds(265+50+50+50+50+50+50, 60+50+50+50+3+50, 80, 80);
   Board3[52].setBounds(274+50+50+50+50+50+50, 50+50+50+50+3+50, 80, 80);
   Board4[52].setBounds(275+50+5+50+50+50+50+50, 62+50+50+50+50, 80, 80);
   Mainframe.add(Board1[52]);
   Mainframe.add(Board2[52]);
   Mainframe.add(Board3[52]);
   Mainframe.add(Board4[52]);
   /*Board1[52].setIcon(p1);
   Board2[52].setIcon(p2);
   Board3[52].setIcon(p3);
   Board4[52].setIcon(p4);*/
   Mainframe.add(Board[52]);
   
   Board[49]=new JLabel();
   Board1[49]=new JLabel();
   Board2[49]=new JLabel();
   Board3[49]=new JLabel();
   Board4[49]=new JLabel();
   Board[49].setBounds(170+50+50+50+50+50+50+50+50, 60+50+50+50+50+50+5, 80, 80);
   Board1[49].setBounds(265+50+50+50+50+50+50, 50+50+50+50+3+50+50+3, 80, 80); 
   Board2[49].setBounds(265+50+50+50+50+50+50, 60+50+50+50+3+50+50+8, 80, 80);
   Board3[49].setBounds(274+50+50+50+50+50+55, 50+50+50+50+3+50+50+3, 80, 80);
   Board4[49].setBounds(275+50+5+50+50+50+50+55, 62+50+50+50+50+50+10, 80, 80);
   Mainframe.add(Board1[49]);
   Mainframe.add(Board2[49]);
   Mainframe.add(Board3[49]);
   Mainframe.add(Board4[49]);
  /* Board1[49].setIcon(p1);
   Board2[49].setIcon(p2);
   Board3[49].setIcon(p3);
   Board4[49].setIcon(p4);*/
   Mainframe.add(Board[49]);
   Board[32]=new JLabel();
   Board1[32]=new JLabel();
   Board2[32]=new JLabel();
   Board3[32]=new JLabel();
   Board4[32]=new JLabel();
   Board[32].setBounds(170+50+50+50+50+50+50+50+50, 60+50+50+50+50+50+50+5, 80, 80);
   Mainframe.add(Board[32]);
   Board1[32].setBounds(265+50+50+50+50+50+50, 50+50+50+50+3+50+50+3+50, 80, 80); 
   Board2[32].setBounds(265+50+50+50+50+50+50, 60+50+50+50+3+50+50+8+50, 80, 80);
   Board3[32].setBounds(274+50+50+50+50+50+55, 50+50+50+50+3+50+50+3+50, 80, 80);
   Board4[32].setBounds(275+50+5+50+50+50+50+55, 62+50+50+50+50+50+10+50, 80, 80);
   Mainframe.add(Board1[32]);
   Mainframe.add(Board2[32]);
   Mainframe.add(Board3[32]);
   Mainframe.add(Board4[32]);
  /* Board1[32].setIcon(p1);
   Board2[32].setIcon(p2);
   Board3[32].setIcon(p3);
   Board4[32].setIcon(p4);*/
   Board[29]=new JLabel();
   Board1[29]=new JLabel();
   Board2[29]=new JLabel();
   Board3[29]=new JLabel();
   Board4[29]=new JLabel();
   Board[29].setBounds(170+50+50+50+50+50+50+50+50, 60+50+50+50+50+50+50+50+5, 80, 80);
   Mainframe.add(Board[29]);
   Board1[29].setBounds(265+50+50+50+50+50+50, 50+50+50+50+3+50+50+3+50+50, 80, 80); 
   Board2[29].setBounds(265+50+50+50+50+50+50, 60+50+50+50+3+50+50+8+50+50, 80, 80);
   Board3[29].setBounds(274+50+50+50+50+50+55, 50+50+50+50+3+50+50+3+50+50, 80, 80);
   Board4[29].setBounds(275+50+5+50+50+50+50+55, 62+50+50+50+50+50+10+50+50, 80, 80);
   Mainframe.add(Board1[29]);
   Mainframe.add(Board2[29]);
   Mainframe.add(Board3[29]);
   Mainframe.add(Board4[29]);
  /* Board1[29].setIcon(p1);
   Board2[29].setIcon(p2);
   Board3[29].setIcon(p3);
   Board4[29].setIcon(p4);*/
   Board[12]=new JLabel();
   Board1[12]=new JLabel();
   Board2[12]=new JLabel();
   Board3[12]=new JLabel();
   Board4[12]=new JLabel();
   Board[12].setBounds(170+50+50+50+50+50+50+50+50, 60+50+50+50+50+50+50+50+50+5, 80, 80);
   Mainframe.add(Board[12]);
   Board1[12].setBounds(265+50+50+50+50+50+50, 50+50+50+50+3+50+50+3+50+50+50, 80, 80); 
   Board2[12].setBounds(265+50+50+50+50+50+50, 60+50+50+50+3+50+50+8+50+50+50, 80, 80);
   Board3[12].setBounds(274+50+50+50+50+50+55, 50+50+50+50+3+50+50+3+50+50+50, 80, 80);
   Board4[12].setBounds(275+50+5+50+50+50+50+55, 62+50+50+50+50+50+10+50+50+50, 80, 80);
   Mainframe.add(Board1[12]);
   Mainframe.add(Board2[12]);
   Mainframe.add(Board3[12]);
   Mainframe.add(Board4[12]);
  /* Board1[12].setIcon(p1);
   Board2[12].setIcon(p2);
   Board3[12].setIcon(p3);
   Board4[12].setIcon(p4);*/
   Board[9]=new JLabel();
   Board1[9]=new JLabel();
   Board2[9]=new JLabel();
   Board3[9]=new JLabel();
   Board4[9]=new JLabel();
   Board[9].setBounds(170+50+50+50+50+50+50+50+50, 60+50+50+50+50+50+50+50+50+50+10, 80, 80);
   Mainframe.add(Board[9]);
   Board1[9].setBounds(265+50+50+50+50+50+50, 50+50+50+50+3+50+50+3+50+50+50+50, 80, 80); 
   Board2[9].setBounds(265+50+50+50+50+50+50, 60+50+50+50+3+50+50+8+50+50+50+50, 80, 80);
   Board3[9].setBounds(274+50+50+50+50+50+55, 50+50+50+50+3+50+50+3+50+50+50+50, 80, 80);
   Board4[9].setBounds(275+50+5+50+50+50+50+55, 62+50+50+50+50+50+10+50+50+50+50, 80, 80);
   Mainframe.add(Board1[9]);
   Mainframe.add(Board2[9]);
   Mainframe.add(Board3[9]);
   Mainframe.add(Board4[9]);
   /*Board1[9].setIcon(p1);
   Board2[9].setIcon(p2);
   Board3[9].setIcon(p3);
   Board4[9].setIcon(p4);*/
   
   Board[91] = new JLabel();
   Board1[91] = new JLabel();
   Board2[91] = new JLabel();
   Board3[91] = new JLabel();
   Board4[91] = new JLabel();
   Board[91].setBounds(170+50+50+50+50+50+50+50+50+50+5, 60, 80, 80);
   Board1[91].setBounds(265+50+50+50+50+50+50+50, 50, 80, 80);
   Board2[91].setBounds(265+50+50+50+50+50+50+50, 60, 80, 80);
   Board3[91].setBounds(274+50+50+50+50+50+50+50, 50, 80, 80);
   Board4[91].setBounds(275+50+5+50+50+50+50+50+50, 62, 80, 80);
   Mainframe.add(Board1[91]);
   Mainframe.add(Board2[91]);
   Mainframe.add(Board3[91]);
   Mainframe.add(Board4[91]);
   /*Board1[91].setIcon(p1);
   Board2[91].setIcon(p2);
   Board3[91].setIcon(p3);
   Board4[91].setIcon(p4);*/
   Mainframe.add(Board[91]);
   Board[90] = new JLabel();
   Board1[90] = new JLabel();
   Board2[90] = new JLabel();
   Board3[90] = new JLabel();
   Board4[90] = new JLabel();
   Board[90].setBounds(170+50+50+50+50+50+50+50+50+50+5, 60+50, 80, 80);
   Board1[90].setBounds(265+50+50+50+50+50+50+50, 50+50, 80, 80);
   Board2[90].setBounds(265+50+50+50+50+50+50+50, 60+50, 80, 80);
   Board3[90].setBounds(274+50+50+50+50+50+50+50, 50+50, 80, 80);
   Board4[90].setBounds(275+50+5+50+50+50+50+50+50, 62+50, 80, 80);
   Mainframe.add(Board1[90]);
   Mainframe.add(Board2[90]);
   Mainframe.add(Board3[90]);
   Mainframe.add(Board4[90]);
  /* Board1[90].setIcon(p1);
   Board2[90].setIcon(p2);
   Board3[90].setIcon(p3);
   Board4[90].setIcon(p4);*/
   Mainframe.add(Board[90]);
   Board[71] = new JLabel();
   Board1[71] = new JLabel();
   Board2[71] = new JLabel();
   Board3[71] = new JLabel();
   Board4[71] = new JLabel();
   Board[71].setBounds(170+50+50+50+50+50+50+50+50+50+5, 60+50+50, 80, 80);
   Board1[71].setBounds(265+50+50+50+50+50+50+50, 50+50+50, 80, 80);
   Board2[71].setBounds(265+50+50+50+50+50+50+50, 60+50+50, 80, 80);
   Board3[71].setBounds(274+50+50+50+50+50+50+50, 50+50+50, 80, 80);
   Board4[71].setBounds(275+50+5+50+50+50+50+50+50, 62+50+50, 80, 80);
   Mainframe.add(Board1[71]);
   Mainframe.add(Board2[71]);
   Mainframe.add(Board3[71]);
   Mainframe.add(Board4[71]);
   /*Board1[71].setIcon(p1);
   Board2[71].setIcon(p2);
   Board3[71].setIcon(p3);
   Board4[71].setIcon(p4);*/
   Mainframe.add(Board[71]);
   Board[70] = new JLabel();
   Board1[70] = new JLabel();
   Board2[70] = new JLabel();
   Board3[70] = new JLabel();
   Board4[70] = new JLabel();
   Board[70].setBounds(170+50+50+50+50+50+50+50+50+50+5, 60+50+50+50, 80, 80);
   Mainframe.add(Board[70]);
   Board1[70].setBounds(265+50+50+50+50+50+50+50, 50+50+50+50, 80, 80);
   Board2[70].setBounds(265+50+50+50+50+50+50+50, 60+50+50+50, 80, 80);
   Board3[70].setBounds(274+50+50+50+50+50+50+50, 50+50+50+50, 80, 80);
   Board4[70].setBounds(275+50+5+50+50+50+50+50+50, 62+50+50+50, 80, 80);
   Mainframe.add(Board1[70]);
   Mainframe.add(Board2[70]);
   Mainframe.add(Board3[70]);
   Mainframe.add(Board4[70]);
   /*Board1[70].setIcon(p1);
   Board2[70].setIcon(p2);
   Board3[70].setIcon(p3);
   Board4[70].setIcon(p4);*/
   Board[51] = new JLabel();
   Board1[51] = new JLabel();
   Board2[51] = new JLabel();
   Board3[51] = new JLabel();
   Board4[51] = new JLabel();
   Board[51].setBounds(170+50+50+50+50+50+50+50+50+50+5, 60+50+50+50+50, 80, 80);
   Board1[51].setBounds(265+50+50+50+50+50+50+50, 50+50+50+50+50+5, 80, 80);
   Board2[51].setBounds(265+50+50+50+50+50+50+50, 60+50+50+50+50+5, 80, 80);
   Board3[51].setBounds(274+50+50+50+50+50+50+50, 50+50+50+50+50+5, 80, 80);
   Board4[51].setBounds(275+50+5+50+50+50+50+50+50, 62+50+50+50+50+5, 80, 80);
   Mainframe.add(Board1[51]);
   Mainframe.add(Board2[51]);
   Mainframe.add(Board3[51]);
   Mainframe.add(Board4[51]);
  /* Board1[51].setIcon(p1);
   Board2[51].setIcon(p2);
   Board3[51].setIcon(p3);
   Board4[51].setIcon(p4);*/
   Mainframe.add(Board[51]);
   Board[50]=new JLabel();
   Board1[50]=new JLabel();
   Board2[50]=new JLabel();
   Board3[50]=new JLabel();
   Board4[50]=new JLabel();
   
   Board[50].setBounds(170+50+50+50+50+50+50+50+50+50+5, 60+50+50+50+50+50+10, 80, 80);
   Mainframe.add(Board[50]);
   Board1[50].setBounds(265+50+50+50+50+50+50+50+5, 50+50+50+50+50+50+5+5+5, 80, 80);
   Board2[50].setBounds(265+50+50+50+50+50+50+50+5, 60+50+50+50+50+50+5+5+5, 80, 80);
   Board3[50].setBounds(274+50+50+50+50+50+50+50+5, 50+50+50+50+50+50+5+5+5, 80, 80);
   Board4[50].setBounds(275+50+5+50+50+50+50+50+50+5, 62+50+50+50+50+50+5+5+5, 80, 80);
   Mainframe.add(Board1[50]);
   Mainframe.add(Board2[50]);
   Mainframe.add(Board3[50]);
   Mainframe.add(Board4[50]);
   /*Board1[50].setIcon(p1);
   Board2[50].setIcon(p2);
   Board3[50].setIcon(p3);
   Board4[50].setIcon(p4);*/
   Board[31]=new JLabel();
   Board1[31]=new JLabel();
   Board2[31]=new JLabel();
   Board3[31]=new JLabel();
   Board4[31]=new JLabel();
   Board[31].setBounds(170+50+50+50+50+50+50+50+50+50+5, 60+50+50+50+50+50+50+10, 80, 80);
   Mainframe.add(Board[31]);
   
   Board1[31].setBounds(265+50+50+50+50+50+50+50+5, 50+50+50+50+50+50+5+50+5+5, 80, 80);
   Board2[31].setBounds(265+50+50+50+50+50+50+50+5, 60+50+50+50+50+50+5+50+5+5, 80, 80);
   Board3[31].setBounds(274+50+50+50+50+50+50+50+5, 50+50+50+50+50+50+5+50+5+5, 80, 80);
   Board4[31].setBounds(275+50+5+50+50+50+50+50+50+5, 62+50+50+50+50+50+5+50+5+5, 80, 80);
   Mainframe.add(Board1[31]);
   Mainframe.add(Board2[31]);
   Mainframe.add(Board3[31]);
   Mainframe.add(Board4[31]);
   /*Board1[31].setIcon(p1);
   Board2[31].setIcon(p2);
   Board3[31].setIcon(p3);
   Board4[31].setIcon(p4);*/

   Board[30]=new JLabel();
   Board1[30]=new JLabel();
   Board2[30]=new JLabel();
   Board3[30]=new JLabel();
   Board4[30]=new JLabel();
   
   Board[30].setBounds(170+50+50+50+50+50+50+50+50+50+5, 60+50+50+50+50+50+50+50+10, 80, 80);
   Mainframe.add(Board[30]);
   Board1[30].setBounds(265+50+50+50+50+50+50+50+5, 50+50+50+50+50+50+5+50+5+50+5, 80, 80);
   Board2[30].setBounds(265+50+50+50+50+50+50+50+5, 60+50+50+50+50+50+5+50+5+50+5, 80, 80);
   Board3[30].setBounds(274+50+50+50+50+50+50+50+5, 50+50+50+50+50+50+5+50+5+50+5, 80, 80);
   Board4[30].setBounds(275+50+5+50+50+50+50+50+50+5, 62+50+50+50+50+50+5+50+5+50+5, 80, 80);
   Mainframe.add(Board1[30]);
   Mainframe.add(Board2[30]);
   Mainframe.add(Board3[30]);
   Mainframe.add(Board4[30]);
  /* Board1[30].setIcon(p1);
   Board2[30].setIcon(p2);
   Board3[30].setIcon(p3);
   Board4[30].setIcon(p4);*/
   Board[11]=new JLabel();
   Board1[11]=new JLabel();
   Board2[11]=new JLabel();
   Board3[11]=new JLabel();
   Board4[11]=new JLabel();
   
   Board[11].setBounds(170+50+50+50+50+50+50+50+50+50+5, 60+50+50+50+50+50+50+50+50+10, 80, 80);
   Mainframe.add(Board[11]);
   Board1[11].setBounds(265+50+50+50+50+50+50+50+5, 50+50+50+50+50+50+5+50+5+50+5+50, 80, 80);
   Board2[11].setBounds(265+50+50+50+50+50+50+50+5, 60+50+50+50+50+50+5+50+5+50+5+50, 80, 80);
   Board3[11].setBounds(274+50+50+50+50+50+50+50+5, 50+50+50+50+50+50+5+50+5+50+5+50, 80, 80);
   Board4[11].setBounds(275+50+5+50+50+50+50+50+50+5, 62+50+50+50+50+50+5+50+5+50+5+50, 80, 80);
   Mainframe.add(Board1[11]);
   Mainframe.add(Board2[11]);
   Mainframe.add(Board3[11]);
   Mainframe.add(Board4[11]);
   /*Board1[11].setIcon(p1);
   Board2[11].setIcon(p2);
   Board3[11].setIcon(p3);
   Board4[11].setIcon(p4);*/
   Board[10]=new JLabel();
   Board1[10]=new JLabel();
   Board2[10]=new JLabel();
   Board3[10]=new JLabel();
   Board4[10]=new JLabel();
   
   Board[10].setBounds(170+50+50+50+50+50+50+50+50+50+5, 60+50+50+50+50+50+50+50+50+50+10, 80, 80);
   Mainframe.add(Board[10]);
   Board1[10].setBounds(265+50+50+50+50+50+50+50+5, 50+50+50+50+50+50+5+50+5+50+5+50+50, 80, 80);
   Board2[10].setBounds(265+50+50+50+50+50+50+50+5, 60+50+50+50+50+50+5+50+5+50+5+50+50, 80, 80);
   Board3[10].setBounds(274+50+50+50+50+50+50+50+5, 50+50+50+50+50+50+5+50+5+50+5+50+50, 80, 80);
   Board4[10].setBounds(275+50+5+50+50+50+50+50+50+5, 62+50+50+50+50+50+5+50+5+50+5+50+50, 80, 80);
   Mainframe.add(Board1[10]);
   Mainframe.add(Board2[10]);
   Mainframe.add(Board3[10]);
   Mainframe.add(Board4[10]);
   /*Board1[10].setIcon(p1);
   Board2[10].setIcon(p2);
   Board3[10].setIcon(p3);
   Board4[10].setIcon(p4);*/
   
   JButton Player1 = new JButton("YOU");
   //JButton Player2 = new JButton("Player 2");
   JButton Player3 = new JButton("COMPUTER");
   //JButton Player4 = new JButton("Player 4");

   
   Player1.setBounds(177, 20, 170, 40);
   //Player2.setBounds(177+400-20-5+4-1, 20, 170, 40);
   Player3.setBounds(177+400-20-5+4-1, 515+50+30-10+5+5+3 , 170, 40);
  // Player4.setBounds(177, 515+50+30-10+5+5+3, 170, 40);
    
   //JButton DiceHome= new JButton();
   //DiceHome.setBounds(40, 220, 100, 20);
   //Mainframe.add(DiceHome);
  // DiceHome.setBackground(Color.red);
   JLabel DiceBorder = new JLabel();
   JLabel Sign = new JLabel();
   Sign.setBounds(42, 195+40,80,80);
   
   DiceBorder.setBounds(65,245+40,100,100);
   DiceBorder.setIcon(null);
   Mainframe.add(Sign);
   Mainframe.add(DiceBorder);
   
   
   
   Mainframe.add(Player1);
  // Mainframe.add(Player2);
   Mainframe.add(Player3);
  // Mainframe.add(Player4);
   //Board[100].setIcon(p1);
   Player1.setBackground(Color.white);
  // Player2.setBackground(Color.blue);
   Player3.setBackground(Color.yellow);
  // Player4.setBackground(Color.green);
   
   JLabel Guti1= new JLabel();
   JLabel Guti2= new JLabel();
   
   Guti1.setBounds(100, 5, 80, 80);
   Mainframe.add(Guti1);
   Guti1.setIcon(p3);

   Guti2.setBounds(480, 580, 80, 80);
   Mainframe.add(Guti2);
   Guti2.setIcon(p1);
   
   JLabel DiceGhor1 = new JLabel();
   DiceGhor1.setBounds(400, 1, 100, 80);
   Mainframe.add(DiceGhor1);
   

   JLabel DiceGhor2 = new JLabel();
   DiceGhor2.setBounds(780, 570, 100, 80);
   Mainframe.add(DiceGhor2);
  
   

  

	Player1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(P1==true )
			{
				for(int I=1; I<=101; I++)
				{
					if(P1Driver[I]==1 && I!=P1Leader )
					{    
						Board1[I].setIcon(null);
					}
				}
				
				P1=false;
				P3=false;
				
				DiceGhor2.setIcon(null);
				dice=0;
			    if(Sound==true){
			//actionshowToolkit.getDefaultToolkit().beep();
			    	try {
						DiceThrow();
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					};
			    }
			Random ran= new Random(); 
	 		dice = 1 + ran.nextInt(6);
	 		Guti3Ck=false;
	 		if(dice==1) 
	 		{
	 			 P1=false;
	 			 P3=false;
	 			 Player1.setBackground(Color.white); 
	 			 Player3.setBackground(Color.yellow); 
	 		}
	 		else
	 		{
	 			 P3=false;
	 			 P1=false;
	 			 Player3.setBackground(Color.white); 
	 			 Player1.setBackground(Color.red); 
	 		}
	 		if(dice==1 && P1Leader==0) {P1Leader=1; Guti1Ck=true;}
	 		else if(P1Leader>0){
	 		P1Leader+=dice;
	 		Guti1Ck=true;
	 		}
	 		else P3=true;
	 		
	 		actionshow.setIcon(null);
			for(int I=1; I<=101; I++)
			{
				if(P3Driver[I]==1 && I!=P3Leader )
				{    
					Board3[I].setIcon(null);
				}
			}
		
	 		if(dice==1)  DiceGhor1.setIcon(dice1);
	 		else if(dice==2) DiceGhor1.setIcon(dice2);
	 		else if(dice==3)  DiceGhor1.setIcon(dice3);
	 		else if(dice==4)  DiceGhor1.setIcon(dice4);
	 		else if(dice==5) DiceGhor1.setIcon(dice5);
	 		else if(dice==6)  DiceGhor1.setIcon(dice6);
	 		
	 		if(P1Leader==1 && Guti1Ck==true)
	 		{
	 			Guti1.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						if(P1Leader==1 && Guti1Ck==true){
						
						Guti1.setIcon(null);
						Board1[1].setIcon(p3);
						Guti1Ck=false;
						if(Sound==true)
						{
							 try {
								SetGutiSound() ;
							} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						String s;
				 		s=Integer.toString(P1Leader);
				 	    D1.setText(s);
						DiceGhor1.setIcon(null);
						P1=true;
						
						}
						
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				});
	 		}
	 		else if(P1Leader==100)
	 		{
	 			P1Leader=P1Leader-dice;
	 			String s;
		 		s=Integer.toString(P1Leader);
		 	   D1.setText(s);
	 			P1=false;
	 			P3=true;
	 		    Player1.setBackground(Color.red); 
	 		    Player3.setBackground(Color.white); 
	 			
	 		}
	 		else if(P1Leader>101)
	 		{
	 			
	 			P1Leader=P1Leader-dice;
	 			String s;
		 		s=Integer.toString(P1Leader);
		 	     D1.setText(s);
	 			P1=false;
	 			P3=true;
	 		    Player1.setBackground(Color.red); 
	 		    Player3.setBackground(Color.white); 
	 		}
	 		else if(P1Leader==101)
	 	      {
	 	    	  D1.setText(null);
	 	  	  
			      actionshow.setIcon(null);
			    
	 	    	  P3=false;
	 	    	  P1=false;
	 	    	  D1.setText(" YOU  WIN");
	 	    	  Board1[P1Leader-dice].setIcon(null);
	 	    	  Player1.setBackground(Color.black);
	 	    	  DiceBorder.setIcon(null);
	 	    	   P1 =false;

	 	      }
	 		
	 		 else if(P1Leader==2 && Guti1Ck==true)
	 			{
		
			   int TempP1Leader=2;
	 				
	 				Board1[2].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
			
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked (MouseEvent arg0) {
							// TODO Auto-generated method stub
							
			
			 				
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
					   if(P1Leader==2){
					  			   if(Sound==true){
									try {
										test1();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
					        	  
					        	  
					        	  
												Board1[2].setIcon(p3);
												if(Sound==true)
												{
													 try {
														SetGutiSound() ;
													} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
														// TODO Auto-generated catch block
														e.printStackTrace();
													}
												}
												String s;
										 		s=Integer.toString(2);
										 	   D1.setText(s);
								 				P1Driver[38]=1;
								 				P1Leader=38;
								 				Board1[1].setIcon(null);
								 				actionshow.setIcon(up2);
								 				Board1[38].addMouseListener(new MouseListener() {
													
													@Override
													public void mouseReleased(MouseEvent arg0) {
														// TODO Auto-generated method stub
														
									                    if(P1Leader==38 && TempP1Leader==2 && Guti1Ck==true){
															Board1[2].setIcon(null);
											 				
											 				Board1[38].setIcon(p3);
											 				Guti1Ck=false;
											 				if(Sound==true)
															{
																 try {
																	SetGutiSound() ;
																} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																}
															}
											 				String s;
											 		 		s=Integer.toString(38);
											 		 	   D1.setText(s);
											 				DiceGhor1.setIcon(null);
											 				actionshow.setIcon(null);
											 			
											 				if(dice==1) P1=true;
											 				else P3=true;
															}
													}
													
													@Override
													public void mousePressed(MouseEvent arg0) {
														// TODO Auto-generated method stub
														
											
													}
													
													@Override
													public void mouseExited(MouseEvent arg0) {
														// TODO Auto-generated method stub
														
													}
													
													@Override
													public void mouseClicked(MouseEvent arg0) {
														// TODO Auto-generated method stub
												
													}
													
													@Override
													public void mouseEntered(MouseEvent arg0) {
														// TODO Auto-generated method stub
														
												
													}
												});
								 		
								 				
								 				
								 				
										          }
						}
					});
	 				
	 				
	 				
	 			}
	
				else if(P1Leader==4 && Guti1Ck==true)
	 			{

					 int TempP1Leader=4;
					Board1[4].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
				
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
		
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
							
							if(P1Leader==4){
								
								if(Sound==true){
									try {
										test1();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
									
								
								
								Board1[4].setIcon(p3);
								if(Sound==true)
								{
									 try {
										SetGutiSound() ;
									} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								String s;
						 		s=Integer.toString(4);
						 	   D1.setText(s);
								Board1[4-dice].setIcon(null);
				 				P1Driver[14]=1;
				 				P1Leader=14;
				 				actionshow.setIcon(up4);
				 				Board1[14].addMouseListener(new MouseListener() {
									
									@Override
									public void mouseEntered(MouseEvent arg0) {
										// TODO Auto-generated method stub
										
									}
									
									@Override
									public void mousePressed(MouseEvent arg0) {
										// TODO Auto-generated method stub
										
								
									}
									
									@Override
									public void mouseExited(MouseEvent arg0) {
										// TODO Auto-generated method stub
										
									}
									
									@Override
									public void mouseClicked(MouseEvent arg0) {
										// TODO Auto-generated method stub
							
									}
									
									@Override
									public void mouseReleased(MouseEvent arg0) {
										// TODO Auto-generated method stub
										
										if(P1Leader==14 && TempP1Leader==4 && Guti1Ck==true){
											Board1[4].setIcon(null);
							 				Board1[14].setIcon(p3);
							 				Guti1Ck=false;
							 				if(Sound==true)
											{
												 try {
													SetGutiSound() ;
												} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											}
							 				String s;
							 		 		s=Integer.toString(14);
							 		 	   D1.setText(s);
							 				DiceGhor1.setIcon(null);
							 				actionshow.setIcon(null);
							 				if(dice==1) P1=true;
							 				else P3=true;
											}
									}
								});
								}
						}
					});
				 
				
	 				
	 				
	 			}
				else if(P1Leader==9 && Guti1Ck==true)
				{
                      int TempP1Leader=9;
					Board1[9].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							if(P1Leader==9){
								if(Sound==true){
									try {
										test1();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
								
								
								
								
								
							Board1[9].setIcon(p3);
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(9);
					 	   D1.setText(s);
							Board1[9-dice].setIcon(null);
			 				actionshow.setIcon(up9);
			 				P1Driver[31]=1;
			 				P1Leader=31;
			 				Board1[31].addMouseListener(new MouseListener() {
								
								@Override
								public void mouseEntered(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mousePressed(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseExited(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseClicked(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseReleased(MouseEvent arg0) {
									// TODO Auto-generated method stub
									if(P1Leader==31 && TempP1Leader==9){
									Board1[9].setIcon(null);
					 				Board1[31].setIcon(p3);
					 				Guti1Ck=false;
					 				if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
					 				String s;
					 		 		s=Integer.toString(31);
					 		 	   D1.setText(s);
					 				DiceGhor1.setIcon(null);
					 				actionshow.setIcon(null);
					 				if(dice==1) P1=true;
					 				else P3=true;
									}
								}
							});
							}
							
						}
					});
		
	 			
	 				
	 			}
				
				else if(P1Leader==33 && Guti1Ck==true)
				{
		          
					int TempP1Leader=33;
					
					  Board1[33].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							if(P1Leader==33 && Guti1Ck==true){
								
								if(Sound==true){
									try {
										test1();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
								
								
								
							Board1[33].setIcon(p3);
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(33);
					 	   D1.setText(s);
							Board1[33-dice].setIcon(null);
							actionshow.setIcon(up33);
			 				P1Driver[85]=1;
			 				P1Leader=85;
			 				Board1[85].addMouseListener(new MouseListener() {
								
								@Override
								public void mouseEntered(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mousePressed(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseExited(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseClicked(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseReleased(MouseEvent arg0) {
									// TODO Auto-generated method stub
									if(P1Leader==85 && TempP1Leader==33){
									Board1[33].setIcon(null);
					 				Board1[85].setIcon(p3);
					 				Guti1Ck=false;
					 				if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
					 				String s;
					 		 		s=Integer.toString(85);
					 		 	   D1.setText(s);
					 				DiceGhor1.setIcon(null);
					 				actionshow.setIcon(null);
					 				if(dice==1) P1=true;
					 				else P3=true;
									}
								}
							});
							}
						}
					});
					
			
				
	 				
	 				
	 			}
				
				else if(P1Leader==52 &&  Guti1Ck==true)
				{
					int TempP1Leader=52;

					Board1[52].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							if(P1Leader==52 && Guti1Ck==true){
								
								if(Sound==true){
									try {
										test1();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
			
							Board1[52].setIcon(p3);
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(52);
					 	   D1.setText(s);
							Board1[52-dice].setIcon(null);
							actionshow.setIcon(up52);
			 				P1Driver[88]=1;
			 				P1Leader=88;
			 				Board1[88].addMouseListener(new MouseListener() {
								
								@Override
								public void mouseEntered(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mousePressed(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseExited(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseClicked(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseReleased(MouseEvent arg0) {
									// TODO Auto-generated method stub
									if(P1Leader==88 && TempP1Leader==52){
									Board1[52].setIcon(null);
					 				Board1[88].setIcon(p3);
					 				Guti1Ck=false;
					 				if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
					 				String s;
					 		 		s=Integer.toString(88);
					 		 	   D1.setText(s);
					 				DiceGhor1.setIcon(null);
					 				actionshow.setIcon(null);
					 				if(dice==1) P1=true;
					 				else P3=true;
					 			
									}
								}
							});
							}
						}
					});
			
	 				
	 				
	 			}
				else if(P1Leader==80 && Guti1Ck==true)
				{
	
					int TempP1Leader=80;
					Board1[80].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							if(P1Leader==80){
								
								if(Sound==true){
									try {
										test1();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
								
								
								
								
								
							Board1[80].setIcon(p3);
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(80);
					 	   D1.setText(s);
							Board1[P1Leader-dice].setIcon(null);
							actionshow.setIcon(up80);
			 				P1Driver[99]=1;
			 				P1Leader=99;
			 				 Board1[99].addMouseListener(new MouseListener() {
									
									@Override
									public void mouseReleased(MouseEvent arg0) {
										// TODO Auto-generated method stub
										if(P1Leader==99 && TempP1Leader==80 && Guti1Ck==true){
											Board1[80].setIcon(null);
							 				Board1[99].setIcon(p3);
							 				Guti1Ck=false;
							 				if(Sound==true)
											{
												 try {
													SetGutiSound() ;
												} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											}
							 				String s;
							 		 		s=Integer.toString(99);
							 		 	   D1.setText(s);
							 				DiceGhor1.setIcon(null);
							 				actionshow.setIcon(null);
							 				
							 				
							 				if(dice==1) P1=true;
							 				else P3=true;
											}
									}
									
									@Override
									public void mousePressed(MouseEvent arg0) {
										// TODO Auto-generated method stub
										
									}
									
									@Override
									public void mouseExited(MouseEvent arg0) {
										// TODO Auto-generated method stub
										
									}
									
									@Override
									public void mouseClicked(MouseEvent arg0) {
										// TODO Auto-generated method stub
										
									}
									
									@Override
									public void mouseEntered(MouseEvent arg0) {
										// TODO Auto-generated method stub
						
									}
								});
							}
						}
					});
				
			
	 			
	 				
	 			}
				
				else if(P1Leader==51 && Guti1Ck==true)
				{
					int TempP1Leader=51;
					Board1[51].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							if(P1Leader==51 && Guti1Ck==true){
								if(Sound==true){
									try {
										test();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
								
								
								
							Board1[51].setIcon(p3);
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(51);
					 	   D1.setText(s);
							Board1[51-dice].setIcon(null);
							actionshow.setIcon(down51);
			 				P1Driver[11]=1;
			 				P1Leader=11;
			 				Board1[11].addMouseListener(new MouseListener() {
								
								@Override
								public void mouseEntered(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mousePressed(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseExited(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseClicked(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseReleased(MouseEvent arg0) {
									// TODO Auto-generated method stub
									if(P1Leader==11&& TempP1Leader==51 && Guti1Ck==true){
									Board1[51].setIcon(null);
					 				Board1[11].setIcon(p3);
					 				Guti1Ck=false;
					 				if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
					 				String s;
					 		 		s=Integer.toString(11);
					 		 	   D1.setText(s);
					 				DiceGhor1.setIcon(null);
					 				actionshow.setIcon(null);
					 			
					 				if(dice==1) P1=true;
					 				else P3=true;
									}
								}
							});
							}
						}
					} );
				
			
	 			
	 			}
				
				else if(P1Leader==56 && Guti1Ck==true)
				{
					int TempP1Leader=56;
					Board1[56].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						 
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							if(P1Leader==56 && Guti1Ck==true)
							{
								
								
								if(Sound==true){
									try {
										test();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
								
					
							Board1[P1Leader].setIcon(p3);
							//Guti1Ck=false;
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(56);
					 	   D1.setText(s);
							Board1[56-dice].setIcon(null);
							actionshow.setIcon(down56);
			 				P1Driver[15]=1;
			 				P1Leader=15;
			 				
			 				Board1[15].addMouseListener(new MouseListener() {
								
								@Override
								public void mouseEntered(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mousePressed(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseExited(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseClicked(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseReleased(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
									if(P1Leader==15 && TempP1Leader==56 && Guti1Ck==true){
									Board1[56].setIcon(null);
					 				Board1[15].setIcon(p3);
					 				Guti1Ck=false;
					 				if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
					 				String s;
					 		 		s=Integer.toString(15);
					 		 	   D1.setText(s);
					 				DiceGhor1.setIcon(null);
					 				actionshow.setIcon(null);
					 				
					 			
					 				if(dice==1) P1=true;
					 				else P3=true;
									}
								}
							});
			 				
							}
						}
					});
				
					
	 				
	 			}
				else if(P1Leader==62 && Guti1Ck==true)
				{

					int TempP1Leader=62;
					Board1[62].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
						
							  if(P1Leader==62)
							  {
									if(Sound==true){
										try {
											test();
										}
								          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										}
								  
								  Board1[62].setIcon(p3);
									if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
								  String s;
							 		s=Integer.toString(62);
							 	   D1.setText(s);
								  Board1[62-dice].setIcon(null);
								  actionshow.setIcon(down62);
					 				P1Driver[57]=1;
					 				P1Leader=57;
					 				Board1[57].addMouseListener(new MouseListener() {
										
										@Override
										public void mouseEntered(MouseEvent arg0) {
											// TODO Auto-generated method stub
											
										}
										
										@Override
										public void mousePressed(MouseEvent arg0) {
											// TODO Auto-generated method stub
											
										}
										
										@Override
										public void mouseExited(MouseEvent arg0) {
											// TODO Auto-generated method stub
											
										}
										
										@Override
										public void mouseClicked(MouseEvent arg0) {
											// TODO Auto-generated method stub
											
										}
										
										@Override
										public void mouseReleased(MouseEvent arg0) {
											// TODO Auto-generated method stub
											if(P1Leader==57 && TempP1Leader==62){
											Board1[62].setIcon(null);
							 				Board1[57].setIcon(p3);
							 				Guti1Ck=false;
							 				if(Sound==true)
											{
												 try {
													SetGutiSound() ;
												} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											}
							 				String s;
							 		 		s=Integer.toString(57);
							 		 	   D1.setText(s);
							 				DiceGhor1.setIcon(null);
							 				actionshow.setIcon(null);
							 				
							 				if(dice==1) P1=true;
							 				else P3=true;
											}
										}
									});
					 				
							  }
						}
					});
					
				
	 				
	 			}
				
				else if(P1Leader==92 && Guti1Ck==true)
				{
                      int TempP1Leader=92;
					Board1[92].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
						  if(P1Leader==92 && Guti1Ck==true){	
								if(Sound==true){
									try {
										test();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
							  
							  
							  
							  
							Board1[92].setIcon(p3);
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(92);
					 	   D1.setText(s);
							Board1[92-dice].setIcon(null);
							actionshow.setIcon(down92);
			 				P1Driver[53]=1;
			 				P1Leader=53;
			 				Board1[53].addMouseListener(new MouseListener() {
								
								@Override
								public void mouseEntered(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mousePressed(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseExited(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseClicked(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseReleased(MouseEvent arg0) {
									// TODO Auto-generated method stub
									if(P1Leader==53 && TempP1Leader==92 && Guti1Ck==true){
									Board1[92].setIcon(null);
					 				Board1[53].setIcon(p3);
					 				if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
					 				String s;
					 		 		s=Integer.toString(53);
					 		 		Guti1Ck=false;
					 		 	   D1.setText(s);
					 				DiceGhor1.setIcon(null);
					 				actionshow.setIcon(null);
					 			
					 				
					 				if(dice==1) P1=true;
					 				else P3=true;
					 			
									}
								}
							});
							
						  }
						}
					});
					
				
					
	 			
	 				
	 			}
				
				else if(P1Leader==98 && Guti1Ck==true)
				{
					int TempP1Leader=98;

					Board1[98].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							if(P1Leader==98 && Guti1Ck==true){
								if(Sound==true){
									try {
										test();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
								
								
								
							Board1[98].setIcon(p3);
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(98);
					 	   D1.setText(s);
							Board1[98-dice].setIcon(null);
							actionshow.setIcon(down98);
			 				P1Driver[8]=1;
			 				P1Leader=8;
			 				Board1[8].addMouseListener(new MouseListener() {
								
								@Override
								public void mouseEntered(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mousePressed(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseExited(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseClicked(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseReleased(MouseEvent arg0) {
									// TODO Auto-generated method stub
									if(P1Leader==8 && TempP1Leader==98 && Guti1Ck==true){
									Board1[98].setIcon(null);
					 				Board1[8].setIcon(p3);
					 				Guti1Ck=false;
					 				if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
					 				String s;
					 		 		s=Integer.toString(8);
					 		 	   D1.setText(s);
					 				DiceGhor1.setIcon(null);
					 				actionshow.setIcon(null);
					 				if(dice==1) P1=true;
					 				else P3=true;
									}
								}
							});
							}
						}
					});
			
	 			
	 				
	 			}

	 		else if(P1Leader>1 && P1Leader<101 && Guti1Ck==true)
	 		{
	 			int TempP1Leader=P1Leader;
	 			Board1[TempP1Leader].addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
					
						if((P1Leader==TempP1Leader) &&  (P1Leader>1) && (P1Leader<101) && Guti1Ck==true)
						{
							Board1[TempP1Leader-dice].setIcon(null);
							Board1[TempP1Leader].setIcon(p3);
							Guti1Ck=false;
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(P1Leader);
					 	   D1.setText(s);
							DiceGhor1.setIcon(null);
							if(dice==1) P1=true;
							else 
								P3=true;
						}
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
			
						
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				});
	 			
	 		}
	 		
		 	 if(P1Leader==101)
		 	   {
		 		   D1.setText(null);
			    	  D1.setText(" YOU  WIN"); 
			    	  Board1[101-dice].setIcon(null);
			    	  D1.setEditable(false);
			    	  P3=false;
			    	  GOver.setIcon(GameOver);
			    	  if(Sound==true)
			    	  {
			    		  try {
							GameOverSong();
						} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			    		  
			    	  }
			
		 	   }
		 	 
		 	
			}
		}
	}
);
   

Player3.addActionListener(new ActionListener() {
		
	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(P3==true)
			{
				
				
				
				for(int I=1; I<=101; I++)
				{
					if(P3Driver[I]==1 && I!=P3Leader )
					{    
						Board3[I].setIcon(null);
					}
				}
				P3=false;
				P1=false;
			    //dice=0;
				DiceGhor1.setIcon(null);
				
			    if(Sound==true){
				
			    	try {
						DiceThrow();
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    }
			Random ran= new Random(); 
	 		P3Dice = 1 + ran.nextInt(6);
	 		Guti1Ck=false;
	 		//P1Dice=dice;
	 		if(P3Dice==1) 
	 		{
	 			P3=false;
	 			P1=false;
	 			 Player3.setBackground(Color.white); 
	 			 Player1.setBackground(Color.red); 
	 		}
	 		else
	 		{
	 			P1=false;
	 			P3=false;
	 			 Player1.setBackground(Color.white); 
	 			 Player3.setBackground(Color.yellow); 
	 		}
	 		if(P3Dice==1 && P3Leader==0) P3Leader=1;
	 		else if(P3Leader>0){
	 		P3Leader+=P3Dice;
	 		Guti3Ck=true;
	 		}
	 		else
	 			P1=true;
	 		
	 		actionshow.setIcon(null);
			for(int I=1; I<=101; I++)
			{
				if(P1Driver[I]==1 && I!=P1Leader )
				{    
					Board1[I].setIcon(null);
				}
			}

			
			///System.out.println("P3= "+P3Leader);
	 		if(P3Dice==1)  DiceGhor2.setIcon(dice1);
	 		else if(P3Dice==2) DiceGhor2.setIcon(dice2);
	 		else if(P3Dice==3)  DiceGhor2.setIcon(dice3);
	 		else if(P3Dice==4)  DiceGhor2.setIcon(dice4);
	 		else if(P3Dice==5) DiceGhor2.setIcon(dice5);
	 		else if(P3Dice==6)  DiceGhor2.setIcon(dice6);
	 		
	 		if(P3Leader==1)
	 		{
	 			Guti2.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
						if(P3Leader==1 ){
							
						Guti2.setIcon(null);
						Board3[1].setIcon(p1);
						
						if(Sound==true)
						{
							 try {
								SetGutiSound() ;
							} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						String s;
				 		s=Integer.toString(P3Leader);
				 	   D2.setText(s);
						DiceGhor2.setIcon(null);
						P3=true;
						}
						
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
				});
	 		}
	 		else if(P3Leader==100)
	 		{
	 			P3Leader=P3Leader-P3Dice;
	 			String s;
		 		s=Integer.toString(P3Leader);
		 	   D2.setText(s);
	 			P3=false;
	 			P1=true;
	 		    Player3.setBackground(Color.yellow); 
	 		    Player1.setBackground(Color.white); 
	 			
	 		}
	 		else if(P3Leader>101)
	 		{
	 			
	 			P3Leader=P3Leader-P3Dice;
	 			String s;
		 		s=Integer.toString(P3Leader);
		 	   D2.setText(s);
	 			P3=false;
	 			P1=true;
	 		    Player3.setBackground(Color.yellow); 
	 		    Player1.setBackground(Color.white); 
	 		}
	 		else if(P3Leader==101)
	 	      {
	 	    	  D2.setText(null);
	 	  	  
			      actionshow.setIcon(null);
			    
	 	    	  P1=false;
	 	    	  P3=false;
	 	    	  D2.setText(" COMPUTER  WIN");
	 	    	  Board3[P3Leader-P3Dice].setIcon(null);
	 	    	  Player3.setBackground(Color.black);
	 	    	  DiceBorder.setIcon(null);
	 	    	   P3 =false;

	 	      }
	 		
	 		 else if(P3Leader==2 && Guti3Ck==true)
	 			{
		
			   int TempP3Leader=2;
	 				
	 				Board3[2].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
			
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked (MouseEvent arg0) {
							// TODO Auto-generated method stub
							
			
			 				
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
					          if(P3Leader==2 && Guti3Ck==true){
					  			if(Sound==true){
									try {
										test1();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
	
												Board3[P3Leader].setIcon(p1);
												if(Sound==true)
												{
													 try {
														SetGutiSound() ;
													} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
														// TODO Auto-generated catch block
														e.printStackTrace();
													}
												}
												String s;
										 		s=Integer.toString(P3Leader);
										 	   D2.setText(s);
								 				P3Driver[38]=1;
								 				P3Leader=38;
								 				Board3[1].setIcon(null);
								 				actionshow.setIcon(up2);
								 				Board3[38].addMouseListener(new MouseListener() {
													
													@Override
													public void mouseReleased(MouseEvent arg0) {
														// TODO Auto-generated method stub
														if(P3Leader==38 && TempP3Leader==2 && Guti3Ck==true){
															Board3[2].setIcon(null);
											 				
											 				Board3[38].setIcon(p1);
		                                                   Guti3Ck=false;
											 				if(Sound==true)
															{
																 try {
																	SetGutiSound() ;
																} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																}
															}
											 				String s;
											 		 		s=Integer.toString(P3Leader);
											 		 	   D2.setText(s);
											 				DiceGhor2.setIcon(null);
											 				actionshow.setIcon(null);
											 			
											 				if(P3Dice==1) P3=true;
											 				else P1=true;
											 				
															}
													}
													
													@Override
													public void mousePressed(MouseEvent arg0) {
														// TODO Auto-generated method stub
														
											
													}
													
													@Override
													public void mouseExited(MouseEvent arg0) {
														// TODO Auto-generated method stub
														
													}
													
													@Override
													public void mouseClicked(MouseEvent arg0) {
														// TODO Auto-generated method stub
												
													}
													
													@Override
													public void mouseEntered(MouseEvent arg0) {
														// TODO Auto-generated method stub
														
												
													}
												});
										          }
						}
					});
	 				
	 				
	 		
	 				
	 				
	 			}
	
				else if(P3Leader==4 && Guti3Ck==true)
	 			{

					 int TempP3Leader=4;
					Board3[4].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
				
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
		
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
							
							if(P3Leader==4 && Guti3Ck==true){
								
								if(Sound==true){
									try {
										test1();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
									
								
								
								Board3[P3Leader].setIcon(p1);
								if(Sound==true)
								{
									 try {
										SetGutiSound() ;
									} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
								String s;
						 		s=Integer.toString(P3Leader);
						 	   D2.setText(s);
								Board3[P3Leader-P3Dice].setIcon(null);
				 				P3Driver[14]=1;
				 				P3Leader=14;
				 				actionshow.setIcon(up4);
				 				Board3[14].addMouseListener(new MouseListener() {
									
									@Override
									public void mouseEntered(MouseEvent arg0) {
										// TODO Auto-generated method stub
										
									}
									
									@Override
									public void mousePressed(MouseEvent arg0) {
										// TODO Auto-generated method stub
										
								
									}
									
									@Override
									public void mouseExited(MouseEvent arg0) {
										// TODO Auto-generated method stub
										
									}
									
									@Override
									public void mouseClicked(MouseEvent arg0) {
										// TODO Auto-generated method stub
							
									}
									
									@Override
									public void mouseReleased(MouseEvent arg0) {
										// TODO Auto-generated method stub
										
										if(P3Leader==14 && TempP3Leader==4  && Guti3Ck==true){
											Board3[4].setIcon(null);
							 				Board3[14].setIcon(p1);
							 				Guti3Ck=false;
							 				if(Sound==true)
											{
												 try {
													SetGutiSound() ;
												} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											}
							 				String s;
							 		 		s=Integer.toString(P3Leader);
							 		 	   D2.setText(s);
							 				DiceGhor2.setIcon(null);
							 				actionshow.setIcon(null);
							 				if(P3Dice==1) P3=true;
							 				else P1=true;
							 				
											}
									}
								});
								}
						}
					});
				 
				
	 				
	 				
	 			}
				else if(P3Leader==9 && Guti3Ck==true)
				{
                      int TempP3Leader=9;
					Board3[P3Leader].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							if(P3Leader==9 && Guti3Ck==true){
								if(Sound==true){
									try {
										test1();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
								
								
								
								
								
							Board3[9].setIcon(p1);
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(P3Leader);
					 	   D2.setText(s);
							Board3[P3Leader-P3Dice].setIcon(null);
			 				actionshow.setIcon(up9);
			 				P3Driver[31]=1;
			 				P3Leader=31;
			 				Board3[31].addMouseListener(new MouseListener() {
								
								@Override
								public void mouseEntered(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mousePressed(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseExited(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseClicked(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseReleased(MouseEvent arg0) {
									// TODO Auto-generated method stub
									if(P3Leader==31 && TempP3Leader==9){
									Board3[9].setIcon(null);
					 				Board3[31].setIcon(p1);
					 				Guti3Ck=false;
					 				if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
					 				String s;
					 		 		s=Integer.toString(P3Leader);
					 		 	   D2.setText(s);
					 				DiceGhor2.setIcon(null);
					 				actionshow.setIcon(null);
					 				if(P3Dice==1) P3=true;
					 				else P1=true;
									}
								}
							});
							}
							
						}
					});
				
	 			
	 				
	 			}
				
				else if(P3Leader==33 && Guti3Ck==true)
				{
		          
					int TempP3Leader=33;
					
					  Board3[33].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							if(P3Leader==33 && Guti3Ck==true){
								
								if(Sound==true){
									try {
										test1();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
								
								
								
							Board3[33].setIcon(p1);
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(P3Leader);
					 	   D2.setText(s);
							Board3[P3Leader-P3Dice].setIcon(null);
							actionshow.setIcon(up33);
			 				P3Driver[85]=1;
			 				P3Leader=85;
			 				
			 				Board3[85].addMouseListener(new MouseListener() {
								
								@Override
								public void mouseEntered(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mousePressed(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseExited(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseClicked(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseReleased(MouseEvent arg0) {
									// TODO Auto-generated method stub
									if(P3Leader==85 && TempP3Leader==33){
									Board3[33].setIcon(null);
					 				Board3[85].setIcon(p1);
					 				Guti3Ck=false;
					 				if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
					 				String s;
					 		 		s=Integer.toString(P3Leader);
					 		 	   D2.setText(s);
					 				DiceGhor2.setIcon(null);
					 				actionshow.setIcon(null);
					 				if(P3Dice==1) P3=true;
					 				else P1=true;
									}
								}
							});
							}
						}
					});
					
				
				
	 				
	 				
	 			}
				
				else if(P3Leader==52 && Guti3Ck==true)
				{
					int TempP3Leader=52;

					Board3[P3Leader].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							if(P3Leader==52 && Guti3Ck==true){
								
								if(Sound==true){
									try {
										test1();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
			
							Board3[P3Leader].setIcon(p1);
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(P3Leader);
					 	   D2.setText(s);
							Board3[P3Leader-P3Dice].setIcon(null);
							actionshow.setIcon(up52);
			 				P3Driver[88]=1;
			 				P3Leader=88;
			 				Board3[88].addMouseListener(new MouseListener() {
								
								@Override
								public void mouseEntered(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mousePressed(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseExited(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseClicked(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseReleased(MouseEvent arg0) {
									// TODO Auto-generated method stub
									if(P3Leader==88 && TempP3Leader==52 && Guti3Ck==true){
									Board3[52].setIcon(null);
					 				Board3[88].setIcon(p1);
					 				Guti3Ck=false;
					 				if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
					 				String s;
					 		 		s=Integer.toString(P3Leader);
					 		 	   D2.setText(s);
					 				DiceGhor2.setIcon(null);
					 				actionshow.setIcon(null);
					 				
					 				if(P3Dice==1) P3=true;
					 				else P1=true;
									}
								}
							});
							}
						}
					});
					
	 				
	 				
	 			}
				else if(P3Leader==80 && Guti3Ck==true)
				{
	
					int TempP3Leader=80;
					Board3[P3Leader].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							if(P3Leader==80 && Guti3Ck==true){
								
								if(Sound==true){
									try {
										test1();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
								}
		
							Board3[P3Leader].setIcon(p1);
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(P3Leader);
					 	   D2.setText(s);
							Board3[P3Leader-P3Dice].setIcon(null);
							actionshow.setIcon(up80);
			 				P3Driver[99]=1;
			 				P3Leader=99;
			 				
			 				 Board3[99].addMouseListener(new MouseListener() {
									
									@Override
									public void mouseReleased(MouseEvent arg0) {
										// TODO Auto-generated method stub
										if(P3Leader==99 && TempP3Leader==80 && Guti3Ck==true){
											Board3[80].setIcon(null);
							 				Board3[99].setIcon(p1);
							 				Guti3Ck=false;
							 				if(Sound==true)
											{
												 try {
													SetGutiSound() ;
												} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											}
							 				String s;
							 		 		s=Integer.toString(P3Leader);
							 		 	   D2.setText(s);
							 				DiceGhor2.setIcon(null);
							 				actionshow.setIcon(null);
							 				if(P3Dice==1) P3=true;
							 				else P1=true;
											}
									}
									
									@Override
									public void mousePressed(MouseEvent arg0) {
										// TODO Auto-generated method stub
										
									}
									
									@Override
									public void mouseExited(MouseEvent arg0) {
										// TODO Auto-generated method stub
										
									}
									
									@Override
									public void mouseClicked(MouseEvent arg0) {
										// TODO Auto-generated method stub
										
									}
									
									@Override
									public void mouseEntered(MouseEvent arg0) {
										// TODO Auto-generated method stub
						
									}
								});
			 				
							}
						}
					});
				
			
	 			
	 				
	 			}
				
				else if(P3Leader==51 && Guti3Ck==true)
				{
					int TempP3Leader=51;
					Board3[P3Leader].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							if(P3Leader==51 && Guti3Ck==true){
								if(Sound==true){
									try {
										test();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
								
								
								
							Board3[P3Leader].setIcon(p1);
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(P3Leader);
					 	   D2.setText(s);
							Board3[P3Leader-P3Dice].setIcon(null);
							actionshow.setIcon(down51);
			 				P3Driver[11]=1;
			 				P3Leader=11;
			 				
			 				Board3[11].addMouseListener(new MouseListener() {
								
								@Override
								public void mouseEntered(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mousePressed(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseExited(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseClicked(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseReleased(MouseEvent arg0) {
									// TODO Auto-generated method stub
									if(P3Leader==11&& TempP3Leader==51 && Guti3Ck==true){
									Board3[51].setIcon(null);
					 				Board3[11].setIcon(p1);
					 				Guti3Ck=false;
					 				if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
					 				String s;
					 		 		s=Integer.toString(P3Leader);
					 		 	   D2.setText(s);
					 				DiceGhor2.setIcon(null);
					 				actionshow.setIcon(null);
					 				if(P3Dice==1) P3=true;
					 				else P1=true;
									}
								}
							});
							}
						}
					} );
				
				
	 			
	 			}
				
				else if(P3Leader==56 && Guti3Ck==true)
				{
					int TempP3Leader=56;
					Board3[P3Leader].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						 
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							if(P3Leader==56 && Guti3Ck==true)
							{
								
								
								if(Sound==true){
									try {
										test();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
								
					
							Board3[P3Leader].setIcon(p1);
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(P3Leader);
					 	   D2.setText(s);
							Board3[P3Leader-P3Dice].setIcon(null);
							actionshow.setIcon(down56);
			 				P3Driver[15]=1;
			 				P3Leader=15;
			 				
			 				Board3[15].addMouseListener(new MouseListener() {
								
								@Override
								public void mouseEntered(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mousePressed(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseExited(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseClicked(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseReleased(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
									if(P3Leader==15 && TempP3Leader==56 && Guti3Ck==true){
									Board3[56].setIcon(null);
					 				Board3[15].setIcon(p1);
					 				Guti3Ck=false;
					 				if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
					 				String s;
					 		 		s=Integer.toString(P3Leader);
					 		 	   D2.setText(s);
					 				DiceGhor2.setIcon(null);
					 				actionshow.setIcon(null);
					 				if(P3Dice==1) P3=true;
					 				else P1=true;
									}
								}
							});
			 				
							}
						}
					});
					
					
	 				
	 			}
				else if(P3Leader==62 && Guti3Ck==true)
				{

					int TempP3Leader=62;
					Board3[P3Leader].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
						
							  if(P3Leader==62 && Guti3Ck==true)
							  {
									if(Sound==true){
										try {
											test();
										}
								          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
										}
								  
								  Board3[P3Leader].setIcon(p1);
									if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
								  String s;
							 		s=Integer.toString(P3Leader);
							 	   D2.setText(s);
								  Board3[P3Leader-P3Dice].setIcon(null);
								  actionshow.setIcon(down62);
					 				P3Driver[57]=1;
					 				P3Leader=57;
					 				Board3[57].addMouseListener(new MouseListener() {
										
										@Override
										public void mouseEntered(MouseEvent arg0) {
											// TODO Auto-generated method stub
											
										}
										
										@Override
										public void mousePressed(MouseEvent arg0) {
											// TODO Auto-generated method stub
											
										}
										
										@Override
										public void mouseExited(MouseEvent arg0) {
											// TODO Auto-generated method stub
											
										}
										
										@Override
										public void mouseClicked(MouseEvent arg0) {
											// TODO Auto-generated method stub
											
										}
										
										@Override
										public void mouseReleased(MouseEvent arg0) {
											// TODO Auto-generated method stub
											if(P3Leader==57 && TempP3Leader==62 && Guti3Ck==true){
											Board3[62].setIcon(null);
							 				Board3[57].setIcon(p1);
							 				Guti3Ck=false;
							 				if(Sound==true)
											{
												 try {
													SetGutiSound() ;
												} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
											}
							 				String s;
							 		 		s=Integer.toString(P3Leader);
							 		 	   D2.setText(s);
							 				DiceGhor2.setIcon(null);
							 				actionshow.setIcon(null);
							 				if(P3Dice==1) P3=true;
							 				else P1=true;
											}
										}
									});
					 				
							  }
						}
					});
					
					
	 				
	 			}
				
				else if(P3Leader==92 && Guti3Ck==true)
				{
                      int TempP3Leader=92;
					Board3[P3Leader].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
						  if(P3Leader==92 && Guti3Ck==true){	
								if(Sound==true){
									try {
										test();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
							  
							  
							  
							  
							Board3[P3Leader].setIcon(p1);
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(P3Leader);
					 	   D2.setText(s);
							Board3[P3Leader-P3Dice].setIcon(null);
							actionshow.setIcon(down92);
			 				P3Driver[53]=1;
			 				P3Leader=53;
			 				Board3[53].addMouseListener(new MouseListener() {
								
								@Override
								public void mouseEntered(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mousePressed(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseExited(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseClicked(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseReleased(MouseEvent arg0) {
									// TODO Auto-generated method stub
									if(P3Leader==53 && TempP3Leader==92 && Guti3Ck==true){
									Board3[92].setIcon(null);
					 				Board3[53].setIcon(p1);
					 				Guti3Ck=false;
					 				if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
					 				String s;
					 		 		s=Integer.toString(P3Leader);
					 		 		
					 		 	   D2.setText(s);
					 				DiceGhor2.setIcon(null);
					 				actionshow.setIcon(null);
					 				if(P3Dice==1) P3=true;
					 				else P1=true;
					 			
									}
								}
							});
						  }
						}
					});
					
				
					
					
	 			
	 				
	 			}
				
				else if(P3Leader==98 && Guti3Ck==true)
				{
					int TempP3Leader=98;

					Board3[P3Leader].addMouseListener(new MouseListener() {
						
						@Override
						public void mouseEntered(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mousePressed(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseExited(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseClicked(MouseEvent arg0) {
							// TODO Auto-generated method stub
							
						}
						
						@Override
						public void mouseReleased(MouseEvent arg0) {
							// TODO Auto-generated method stub
							if(P3Leader==98 && Guti3Ck==true){
								if(Sound==true){
									try {
										test();
									}
							          catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									}
								
								
								
							Board3[P3Leader].setIcon(p1);
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(P3Leader);
					 	   D2.setText(s);
							Board3[P3Leader-P3Dice].setIcon(null);
							actionshow.setIcon(down98);
			 				P3Driver[8]=1;
			 				P3Leader=8;
			 				Board3[8].addMouseListener(new MouseListener() {
								
								@Override
								public void mouseEntered(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mousePressed(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseExited(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseClicked(MouseEvent arg0) {
									// TODO Auto-generated method stub
									
								}
								
								@Override
								public void mouseReleased(MouseEvent arg0) {
									// TODO Auto-generated method stub
									if(P3Leader==8 && TempP3Leader==98 && Guti3Ck==true){
									Board3[98].setIcon(null);
					 				Board3[8].setIcon(p1);
					 				Guti3Ck=false;
					 				if(Sound==true)
									{
										 try {
											SetGutiSound() ;
										} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									}
					 				String s;
					 		 		s=Integer.toString(P3Leader);
					 		 	   D2.setText(s);
					 				DiceGhor2.setIcon(null);
					 				actionshow.setIcon(null);
					 				
					 				if(P3Dice==1 && P3==false) P3=true;
					 				else P1=true;
									}
								}
							});
							}
						}
					});
			
	 			
	 				
	 			}

	 		else if(P3Leader>1 && P3Leader<101 && Guti3Ck==true)
	 		{
	 			int TempP3Leader=P3Leader;
	 			//System.out.println(TempP3Leader);
	 		  
	 			Board3[TempP3Leader].addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent arg0) {
						
				      // System.out.println("Problem ki?");
						if((P3Leader==TempP3Leader) &&  (P3Leader>1) &&( P3Leader<101) && Guti3Ck==true)
						{
							//System.out.println(TempP3Leader);
							Board3[TempP3Leader-P3Dice].setIcon(null);
							Board3[TempP3Leader].setIcon(p1);
							Guti3Ck=false;
							if(Sound==true)
							{
								 try {
									SetGutiSound() ;
								} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							String s;
					 		s=Integer.toString(P3Leader);
					 	   D2.setText(s);
							DiceGhor2.setIcon(null);
							if(P3Dice==1 && P3==false) P3=true;
			 				else P1=true;
						}
					}
					
					@Override
					public void mousePressed(MouseEvent arg0) {
			
						
					}
					
					@Override
					public void mouseExited(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent arg0) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent arg0) {
						// TODO Auto-generated method stub
		
						
						
					}
				});
	 			
	 		}
	 		
		 	 if(P3Leader==101)
		 	   {
		 		      D2.setText(null);
			    	  D2.setText(" COMPUTER  WIN"); 
			    	  Board3[P3Leader-P3Dice].setIcon(null);
			    	  D2.setEditable(false);
			    	  P1=false;
			    	  P1=false;
			    	  GOver.setIcon(GameOver);
			    	  if(Sound==true)
			    	  {
			    		  try {
							GameOverSong();
						} catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			    		  
			    	  }
			
		 	   }
		 	 
		 
			}
		}
	}
			);
	
	
    panel1.add(label1);
    Mainframe.add(button1);
    Mainframe.add(panel1);

     Mainframe.setVisible(true);
   
	}
	public static void main(String[] arg)
	{
		new TwoPlayer();
	}

}