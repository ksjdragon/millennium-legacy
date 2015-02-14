package milleniumlegacy;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class player 
{
	int x, y;
	BufferedImage player;
	public player(int x, int y, ImageLoader IL)
	{
		this.x = x;
		this.y = y;
		player = IL.loadImage("Untitled.png");
	}
	public void render(Graphics g)
	{
		g.drawImage(player, x, y, null);
	}
}
