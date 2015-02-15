package milleniumlegacy;

import java.awt.Color;
import java.awt.Graphics;

public class Tile 
{
	int x,y;
	char terrain;
	boolean up, down, left, right;
	int offsetx;
	int offsety;
	public Tile(int x, int y, char terrain)
	{
		this.x = x;
		this.y = y;
		this.terrain = terrain;
	}
	public void Render(Graphics g, int offsetx, int offsety)
	{
		if (terrain == 'd')
		{
			g.setColor(Color.GREEN);
		}
		else if (terrain == 'r')
		{
			g.setColor(Color.DARK_GRAY);
		}
		else if (terrain == 'c')
		{
			g.setColor(Color.gray);
		}
		else
		{
			g.setColor(Color.blue);
		}
		g.fillRect(x*32 + offsetx - 32, y*32 + offsety - 32, 32,32);
		String draw = "x" + x + "y" + y;
		g.setColor(Color.black);
		g.drawString(draw, x*32 + offsetx - 32, y*32 + 8 + offsety - 32);
	}
}
