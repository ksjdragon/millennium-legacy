package milleniumlegacy;

import java.util.ArrayList;

public class Map 
{
	static ImageLoader IL = MainGame.IL;
	
	static MapLoader ml = new MapLoader();
	public static Tile[][] readyMap()
	{
		Tile[][] mappp;
		ArrayList<ArrayList<Tile>> tilesy = new ArrayList<ArrayList<Tile>>();
		ArrayList<Tile> tilesx = new ArrayList<Tile>();
		char[][] map = ml.LoadMap("milleniumWorld.txt");
		mappp = new Tile[map.length][map[0].length];
		int countery = 0, counterx = 0;
		for (char[] chararr : map)
		{
			for (char c: chararr)
			{
				mappp[counterx][countery] = new Tile(counterx, countery, c, IL);
				counterx++;
			}
			countery++;
			counterx = 0;
		}
		return mappp;
	}
}
