package milleniumlegacy;
import java.util.*;

public class Item {
	
		public static final HashMap<Integer, String[]> items;
		static 
		{
		//Putting items
		items = new HashMap<Integer, String[]>();
		items.put(1, new String[] {"1","Dirt", "Universal",null,null,null});
		items.put(2, new String[] {"2","Water","Universal",null,null,null});
		items.put(3, new String[] {"3","Clay","Medieval", "99","Dirt","Water"});
		}

}
