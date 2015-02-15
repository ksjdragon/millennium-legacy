package milleniumlegacy;

public class Algorithm
{

	public static void research(int pSelect1, int pSelect2)
	{	
		Object[] keyArray = Item.items.keySet().toArray();
		for (int i = 1; i <= keyArray.length; i++)
		{
			String[] Craftable = (String[])Item.items.get(i);
			int Craft1int = Integer.parseInt(Craftable[4]);
			int Craft2int = Integer.parseInt(Craftable[6]);
			int rand = (int) (Math.random() * (100));
			int Prob = rand;
			if ((Craft1int == pSelect1 || Craft1int == pSelect2) &&
					(Craft2int == pSelect1 || Craft2int == pSelect2))
			{
				String[] requisite = (String[]) Item.items.get(i);
				int current1 = Inventory.inventory.get(pSelect1);
				int current2 = Inventory.inventory.get(pSelect2);
				int requisite1 = Integer.parseInt(requisite[3]);
				int requisite2 = Integer.parseInt(requisite[5]);
				if ((current1 >= requisite1 && current2 >= requisite2) )
				{
					if ((current1 -= requisite1) <= 0)
					{
						Inventory.inventory.remove(pSelect1);
						Research.squareOffset+=2;
					}
					else{
						Inventory.inventory.put(pSelect1, current1 -= requisite1);
					}
				if ((current2 -= requisite2) <= 0)
				{
					Inventory.inventory.remove(pSelect2);
					Research.squareOffset+=2;
				}
				else{
					Inventory.inventory.put(pSelect2, current2 -= requisite2);
				}
				int craftability = Integer.parseInt(requisite[2]);
				if (Prob <= craftability)
				{
						int outputnum = Integer.parseInt(requisite[7]);
						Inventory.addItem(i, outputnum);
						break;
				} else {
					break;
					}
				} else {
					break;
				}
			
			} 
		}

	}

}
