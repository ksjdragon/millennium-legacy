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
		if (terrain == 'g')
		{
			g.setColor(Color.GREEN);
		}
		else
		{
			g.setColor(Color.BLUE);
		}
		g.fillRect(x*16 + offsetx, y*16 + offsety, 16,16);
	}
}
