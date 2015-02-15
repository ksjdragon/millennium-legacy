package milleniumlegacy;


public class Algorithm {
	
	public static String research() {
		String[] pSelect1 = Item.items.get(1); //1 = player input
		String[] pSelect2 = Item.items.get(2); //2 = second player input
		Object[] keyArray = Item.items.keySet().toArray();
		String Num1 = pSelect1[0];
		String Num2 = pSelect2[0];
		String Name1 = pSelect1[1];
		String Name2 = pSelect2[1];
		String TP1 = pSelect1[2];
		String TP2 = pSelect2[2];
		for(int i = 1; i <= keyArray.length;i++) {
			String[] Craftable = Item.items.get(i);
			String Craft1 = Craftable[4];
			String Craft2 = Craftable[5];
			/*if ((Craft1.equals(Name1) || Craft2.equals(Name2)) && 
					(Craft1.equals(Name2) || Craft2.equals(Name1))) {
				String[] getNewItem = Item.items.get(i);
				//TODO
				
			}*/
		}
		int rand = (int)(Math.random() * (100));
		int Prob = rand;
		
		return Name2;
	}
	


}
