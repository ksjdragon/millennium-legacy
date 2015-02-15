package milleniumlegacy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Button
{
	int x,y,width,height,ButtonID;
	public boolean selected1;
	public Button(int x, int y, int width, int height, int ButtonID)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.ButtonID = ButtonID;
	}
	public Rectangle getBounds()
	{
		return new Rectangle(x,y,width,height);
	}
	public void clicked(Rectangle MouseRectangle)
	{
		if (MouseRectangle.intersects(this.getBounds()))
		{
			if (!Research.selected1)
			{
				if (Inventory.inventory.size() >= ButtonID)
				{
				Research.selectionOne(Inventory.getIdFromButton(ButtonID));
				selected1 =true;
				}
			}
			else if (Research.selected1)
			{
				if (Inventory.inventory.size() >= ButtonID)
				{
				Research.selectionTwo(Inventory.getIdFromButton(ButtonID));
				}
			}
		}
		
	}
	public void ResearchButton(Rectangle MouseRect)
	{
		if (MouseRect.intersects(this.getBounds()))
		{
		if (Research.selected1 && Research.selected2)
		{
			Algorithm.research(Research.selection1, Research.selection2);
			Research.reset();
		}
		}
	}
	public void render(Graphics g)
	{
		g.setColor(Color.GRAY);
		g.fillRect(x,y,width,height);
	}
}
