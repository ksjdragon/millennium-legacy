package milleniumlegacy;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class player 
{
	int x, y;
	int drawx, drawy;
	BufferedImage player;
	Rectangle bounds;
	public player(int x, int y, ImageLoader IL)
	{
		this.drawx = x;
		this.drawy = y;
		player = IL.loadImage("resources/sprites/player.png");
	}
	public void tick()
	{
		x = ((MainGame.offsetx * -1)+ drawx);
		y = ((MainGame.offsety * -1) + drawy);
		bounds = new Rectangle(x - 27,y - 27, 54,54);
	}
	public void render(Graphics g)
	{
		g.drawImage(player, drawx, drawy, null);
	}
	public String getTile()
	{
		int x = ((MainGame.offsetx * -1)+ drawx + 16) / 48 + 1;
		int y = ((MainGame.offsety * -1) + drawy + 16) / 48 + 1;
		return MainGame.map[x][y].name;
	}
	public String Add()
	{
		int x = ((MainGame.offsetx * -1)+ drawx + 16) / 48 + 1;
		int y = ((MainGame.offsety * -1) + drawy + 16) / 48 + 1;
		Inventory.addItem(Integer.parseInt(MainGame.map[x][y].name), 1);
		System.out.println(Inventory.inventory);
		return MainGame.map[x][y].name;
	}
}
