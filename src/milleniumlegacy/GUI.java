package milleniumlegacy;


import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.WindowConstants;

public class GUI {
	public static JFrame f;
	public static void main(String[] args) {
		try
		{
			Process process = new ProcessBuilder("WorldGenerator.exe","","").start();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
		
	}
	public static void createAndShowGUI()
	{
		f = new JFrame("Millenium Legacy");
		MainGame  draw = new MainGame();
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.getContentPane().add(draw);
		f.setResizable(false);
		f.pack();
		f.setSize(825, 625);
		f.setVisible(true);
		draw.start();
	}
	
}

