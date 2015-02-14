package milleniumlegacy;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class MainGame extends Canvas implements Runnable
{
	private static final long serialVersionUID = -1902119798739765822L;
	ImageLoader IL = new ImageLoader();
	BufferedImage player = IL.loadImage("Untitled.png");
	KeyManager km;
	ArrayList<Tile> map = Map.readyMap();
	Thread main;
	public static boolean up, down, left, right, running;
	int offsetx, offsety;
	public void init()
	{
		km = new KeyManager();
		this.addKeyListener(km);
	}
	public void paintComponent()
	{
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null)
		{
			createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.blue);
		g.fillRect(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width, Toolkit.getDefaultToolkit().getScreenSize().height);
		g.setColor( Color.BLACK );
		for (Tile t : map)
		{
			t.Render(g, offsetx, offsety);
		}
		g.drawImage(player, 200,300, null);
		g.dispose();
		bs.show();
	}
	public void tick()
	{
		if (up)
		{
			offsety++;
		}
		if (down)
		{
			offsety--;
		}
		if (left)
		{
			offsetx++;
		}
		if (right)
		{
			offsetx--;
		}
	}
	public void start()
	{
		main = new Thread(this);
		main.start();
		running = true;
		
	}
	@Override
	public void run() {
		init();
		while (running)
		{
			paintComponent();
			tick();
		}
		
	}
}
