package milleniumlegacy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Tile 
{
	int x,y;
	char terrain;
	boolean up, down, left, right;
	int offsetx;
	int offsety;
	BufferedImage TileImage;
	String name;
	Animation waterAnimation = new Animation(ImageHandler.waterArray);
	public Tile(int x, int y, char terrain, ImageLoader IL)
	{
		this.x = x;
		this.y = y;
		this.terrain = terrain;
		switch(terrain)
		{
		case '-':
			this.name="1";
			TileImage = ImageHandler.Grass;
			break;
		case 'w':
			this.name="2"; //get water
			TileImage = ImageHandler.Water;
			break;
		case 'r':
			this.name="5";
			TileImage = ImageHandler.Rock;
			break;
		case 'g':
			this.name="4";
			TileImage = ImageHandler.Gravel;
			break;
		case 'c':
			this.name="3";
			TileImage = ImageHandler.Clay;
			break;
		}
	}
	public void Render(Graphics g, int offsetx, int offsety)
	{
	    if (name.equals("2"))
	    {
	    	g.drawImage(waterAnimation.animate(), x*48 + offsetx- 48, y*48 + offsety - 48, 48,48, null);
	    }
		else if (TileImage != null)
		{
			g.drawImage(TileImage, x*48 + offsetx- 48, y*48 + offsety - 48, 48,48, null);
		}
		else
		{
			g.setColor(Color.blue);
			g.drawRect(x*48 + offsetx - 48, y*48 + offsety - 48, 48,48);
		}
		String draw = "x" + x + "y" + y;
		g.setColor(Color.white);
		//g.drawString(draw, x*48 + offsetx - 48, y*48 + 8 + offsety - 48);
	}
}
