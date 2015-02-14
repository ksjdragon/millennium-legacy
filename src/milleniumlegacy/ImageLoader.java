package milleniumlegacy;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageLoader 
{
	public BufferedImage loadImage (String path)
	{
		try {
			BufferedImage bi = ImageIO.read(getClass().getResourceAsStream(path));
			return bi;
		} catch (IOException e) {
			System.out.println("Error loading Image");
		}
		return null;
		
	}
}
