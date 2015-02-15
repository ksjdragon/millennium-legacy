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
	KeyManager km;
	player ply = new player(375, 300, IL);
	ArrayList<Tile> map = Map.readyMap();
	Thread main;
	public static boolean up, down, left, right, running;
	public static int offsetx, offsety;

	public void init()
	{
		km = new KeyManager();
		this.addKeyListener(km);
	}

	public void render()
	{
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null)
		{
			createBufferStrategy(3);
			return;
		}
		Graphics g = bs.getDrawGraphics();
		g.setColor(Color.black);
		g.fillRect(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width,
				Toolkit.getDefaultToolkit().getScreenSize().height);
		g.setColor(Color.BLACK);
		for (Tile t : map)
		{
			t.Render(g, offsetx, offsety);
		}
		ply.render(g);
		g.dispose();
		bs.show();
	}

	public void tick()
	{
		if (up)
		{
			offsety += 3;
		}
		if (down)
		{
			offsety -= 3;
		}
		if (left)
		{
			offsetx += 3;
		}
		if (right)
		{
			offsetx -= 3;
		}
	}

	public void start()
	{
		main = new Thread(this);
		main.start();
		running = true;

	}

	public void run()
	{
		init();
		long lastTime = System.nanoTime();
		final double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		int updates = 0;
		int frames = 0;
		long timer = System.currentTimeMillis();

		while (running)
		{
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			if (delta >= 1)
			{
				tick();
				updates++;
				delta--;
			}
			render();
			frames++;

			if (System.currentTimeMillis() - timer > 1000)
			{
				timer += 1000;
				System.out.println(updates + " Ticks, Fps " + frames);
				ply.getPosition();
				updates = 0;
				frames = 0;
			}

		}

	}
}
