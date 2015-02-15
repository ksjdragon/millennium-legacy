package milleniumlegacy;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;

public class MainGame extends Canvas implements Runnable
{
	private static final long serialVersionUID = -1902119798739765822L;
	public static Tile[][] map = Map.readyMap();
	public static boolean up, down, left, right, running;
	public static int offsetx = 50 * -48, offsety = 50 * -48, speed = 10;;
	static ImageLoader IL = new ImageLoader();
	static player ply = new player(375, 300, IL);
	KeyManager km;
	MouseManager mm;
	
	Thread main;
	Research re = new Research();
	

	public void init()
	{
		km = new KeyManager();
		this.addKeyListener(km);
		mm = new MouseManager();
		this.addMouseListener(mm);
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
		for (Tile[] ta : map)
		{
			for (Tile t : ta)
			{
				t.Render(g, offsetx, offsety);
			}
		}
		ply.render(g);
		Inventory.render(g);
		re.render(g);
		g.dispose();
		bs.show();
	}

	public void tick()
	{
		ply.tick();
		if (up && offsety <= 0)
		{
			offsety += speed;
		}
		if (down && offsety >= 86*-48)
		{
			offsety -= speed;
		}
		if (left && offsetx <= 0)
		{
			offsetx += speed;
		}
		if (right && offsetx >= 81*-48)
		{
			offsetx -= speed;
		}
	    if (ply.getTile() != "1")
		{
			speed = 5;
		}
		else
		{
			speed = 10;
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
				updates = 0;
				frames = 0;
			}

		}

	}

	public static player getPlayer()
	{
		return ply;
	}
}
