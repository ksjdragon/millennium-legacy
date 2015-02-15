package milleniumlegacy;
import java.util.*;

public class Item {
	
		public static final HashMap<Integer, String[]> items;
		static 
		{
		//Putting items
		items = new HashMap<Integer, String[]>();
		items.put(1, new String[] {"1","Dirt","0","0","0","0","0","0"});
		items.put(2, new String[] {"2","Water","0","0","0","0","0","0"});
		items.put(3, new String[] {"3","Clay", "99","1","1","1","2","1"});
		items.put(4, new String[] {"4","Gravel", "0","0","0","0","0","0"});
		items.put(5, new String[] {"5","Rock", "0","0","0","0","0","0"});
		items.put(6, new String[] {"6","Plant", "90","1","1","1","4","1"});
		items.put(7, new String[] {"7","Iron", "70","1","3","3","2","1"});
		items.put(8, new String[] {"8","Fire", "90","1","6","2","2","1"});
		items.put(9, new String[] {"9","Fridge", "50","3","8","1","7","1"});
		items.put(10, new String[] {"10","Ice", "70","4","5","5","8","1"});
		items.put(11, new String[] {"11","Furnace", "60","3","10","2","6","1"});
		items.put(12, new String[] {"12","Flower", "80","3","7","1","6","1"});
		items.put(13, new String[] {"13","Garden", "75","12","12","10","3","1"});
		items.put(14, new String[] {"14","Metal", "70","4","13","1","20","50"});
		items.put(15, new String[] {"15","Plastic", "60","3","14","5","2","1"});
		items.put(16, new String[] {"16","Sugar", "90","2","15","7","5","10"});
		items.put(17, new String[] {"17","Arsenic", "80","3","16","6","3","1"});
		items.put(18, new String[] {"18","Food", "90","1","17","6","22","10"});
		items.put(19, new String[] {"19","House", "90","3","10","4","8","1"});
		items.put(20, new String[] {"20","Suburb", "65","30","19","3","13","1"});
		items.put(21, new String[] {"21","City", "75","1","20","20","19","1"});
		items.put(22, new String[] {"22","Farm", "100","5","13","25","6","1"});
		items.put(23, new String[] {"23","Electricity", "90","32","18","2","7","20"});
		items.put(24, new String[] {"24","Computer", "85","60","23","3","10","1"});
		items.put(25, new String[] {"25","Super Computer", "90","100","24","10","21","1"});
		items.put(26, new String[] {"26","Quantum Computer", "90","10","25","4","11","1"});
		items.put(27, new String[] {"27","Time Machine", "30","20","26","45","8","1"});
		}

}
