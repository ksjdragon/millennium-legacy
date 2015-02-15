package milleniumlegacy;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class player 
{
	int x, y;
	int drawx, drawy;
	BufferedImage player;
	public player(int x, int y, ImageLoader IL)
	{
		this.drawx = x;
		this.drawy = y;
		player = IL.loadImage("../resources/sprites/player.png");
	}
	public void tick()
	{
		
	}
	public void render(Graphics g)
	{
		g.drawImage(player, drawx, drawy, null);
	}
	public void getPosition()
	{
		int x = ((MainGame.offsetx * -1)+ drawx + 16) / 32 + 1;
		int y = ((MainGame.offsety * -1) + drawy + 16) / 32 + 1;
		System.out.println("X: " + x + "Y: " + y);
	}
}
