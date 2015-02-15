package milleniumlegacy;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MapLoader {

	public char[][] LoadMap(String path) {
		ArrayList<String> lines = new ArrayList<String>();
		BufferedReader br;
		File map = new File(path);
		
		try {
			FileReader fr = new FileReader(map);
			br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null)
			{
				lines.add(line);
			}
			char[][] maparr = new char[lines.size()][lines.get(0).toCharArray().length];
			for (int y = 0; y <= lines.size() - 1; y++)
			{
				for (int x = 0; x <= lines.get(0).toCharArray().length - 1; x++)
				{
					maparr[y][x] = lines.get(y).toCharArray()[x];
				}
			}
			br.close();
			return maparr;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static int countLines(String filename) throws IOException {
		InputStream is = new BufferedInputStream(new FileInputStream(filename));
		try {
			byte[] c = new byte[1024];
			int count = 0;
			int readChars = 0;
			boolean empty = true;
			while ((readChars = is.read(c)) != -1) {
				empty = false;
				for (int i = 0; i < readChars; ++i) {
					if (c[i] == '\n') {
						++count;
					}
				}
			}
			return (count == 0 && !empty) ? 1 : count;
		} finally {
			is.close();
		}
	} // Thank you google
}
