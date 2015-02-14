package milleniumlegacy;

import java.util.ArrayList;

public class Map 
{
	static MapLoader ml = new MapLoader();
	public static ArrayList<Tile> readyMap()
	{
		ArrayList<Tile> tiles = new ArrayList<Tile>();
		char[][] map = ml.LoadMap("map.txt");
		int countery = 0, counterx = 0;
		for (char[] chararr : map)
		{
			countery++;
			for (char c: chararr)
			{
				counterx++;
				System.out.println(counterx);
				tiles.add(new Tile(counterx, countery, c));
			}
			counterx = 0;
		}
		return tiles;
	}
}
