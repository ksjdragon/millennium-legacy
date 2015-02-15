package milleniumlegacy;

import java.awt.Rectangle;

public class SolidTile extends Tile
{
	int x, y;
	public SolidTile(int x, int y, char terrain, ImageLoader IL )
	{
		super(x, y, terrain, IL);
		this.x = x;
		this.y = y;
	}
	public Rectangle getBounds()
	{
		return new Rectangle(x * 42, y * 42, 42,42);
	}

	
}
