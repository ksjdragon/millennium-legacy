package milleniumlegacy;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Hashtable;


	public class Inventory {
	
		public static final Hashtable<Integer, Integer> inventory;
		public static boolean shouldRender = true;
		static 
		{
		//Putting items
		inventory = new Hashtable<Integer, Integer>();
		}
		public static void addItem(int id, int amount)
		{
			if (inventory.containsKey(id))
			{
				int current = inventory.get(id);
				if (current <= 998)
				{
				inventory.put(id, current+=1);
				}
				else
				{
					inventory.put(id, 999);
				}
			}
			else
			{
			inventory.put(id, amount);
			}
		}
		public static int getIdFromButton(int Button)
		{
			int counter = 0;
			if (inventory.size() >= Button)
			{
				for (int i = 0; i <= 100; i++)
				{
					if (inventory.containsKey(i))
					{
						counter++;
						if (counter == Button)
						{
							return i;
						}
						
					}
					
				}
			}
			return Button;
			
		}
		public static void render(Graphics g)
		{
			if (shouldRender)
			{
			g.drawImage(ImageHandler.Hotbar, 180, 548, 464, 48, null);
			int offset = 0;
			for (int i = 0; i <= 100; i++)
			{
				if (inventory.containsKey(i))
				{
					g.drawImage(ImageHandler.getImage(i - 1), 188 + offset, 556, 32, 32, null);
					g.setColor(Color.cyan);
					if (inventory.get(i) > 99)
					{
						g.drawString("" + inventory.get(i), 188+offset + 4, 564);
					}
					else if (inventory.get(i) > 9)
					{
						g.drawString("" + inventory.get(i), 188+offset + 8, 564);
					}
					else
					{
						g.drawString("" + inventory.get(i), 188+offset + 12, 564);
					}
					offset += (41 + 1);
				}
			}
			}
			
		}

}
