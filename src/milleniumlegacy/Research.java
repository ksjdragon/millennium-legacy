package milleniumlegacy;

import java.awt.Color;
import java.awt.Graphics;

public class Research
{
	public static boolean shouldRender, selected1, selected2;
	static int x = 80;
	public static int squareOffset = 1;
	static int selection1;
	static int selection2;
	String update = "";
	static String SelectOne = "";
	static String SelectTwo = "";
	public static Button button = new Button(x,433,48,48, 1);
	public static Button button2 = new Button(x += 69,433,48,48, 2);
	public static Button button3 = new Button(x += 69,433,48,48, 3);
	public static Button button4 = new Button(x += 70,433,48,48, 4);
	public static Button button5 = new Button(x += 70,433,48,48, 5);
	public static Button button6 = new Button(x += 70,433,48,48, 6);
	public static Button button7 = new Button(x += 69,433,48,48, 7);
	public static Button button8 = new Button(x += 69,433,48,48, 8);
	public static Button button9 = new Button(x += 69,433,48,48, 9);
	public static Button button10 = new Button(x += 70,433,48,48, 10);
	public static Button rb = new Button(75, 120, 260,260, 11);
	public void render(Graphics g)
	{
		if (shouldRender)
		{
			g.drawImage(ImageHandler.researchMenu, 25, 25, 775, 500, null);
			int offset = 0;
			button.render(g);
			button2.render(g);
			button3.render(g);
			button4.render(g);
			button5.render(g);
			button6.render(g);
			button7.render(g);
			button8.render(g);
			button9.render(g);
			button10.render(g);
			rb.render(g);
			for (int i = 0; i <= 100; i++)
			{
				
				if (Inventory.inventory.containsKey(i))
				{
					g.drawImage(ImageHandler.getImage(i - 1), 80 + offset, 433, 48, 48, null);
					g.setColor(Color.WHITE);
					g.drawString("Amount: " + Inventory.inventory.get(i), 80 + offset, 430);
					if (offset == 0)
					{
						offset += 68;
					}
					else
					{
						offset+=70;
					}
				}
			}
			g.setColor(Color.WHITE);
			g.drawString(SelectOne, 385, 180);
			g.drawString(SelectTwo, 385, 300);
			g.drawString("Research", 100,200);
			
		}
	}
	public static void selectionOne(int id)
	{
		selection1 = id;
		selected1 = true;
		SelectOne =Item.items.get(id)[1];
		System.out.println(id);
	}
	public static void selectionTwo(int id)
	{
		selection2 = id;
		selected2 = true;
		SelectTwo =Item.items.get(id)[1];
		//Algorithm.research(selection1, selection2);
	}
	public static void reset()
	{
		selected2 = false;
		selected1 = false;
		SelectTwo = "";
		SelectOne = "";
	}
	
}
