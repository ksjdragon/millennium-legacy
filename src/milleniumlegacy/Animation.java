package milleniumlegacy;

import java.awt.image.BufferedImage;

public class Animation
{
	BufferedImage[] imagearray;
	int[] time;
	int counter;
	public Animation(BufferedImage[] imagearray, int[] time)
	{
		this.imagearray = imagearray;
		this.time = time;
	}
	public Animation(BufferedImage[] imagearray)
	{
		this.imagearray = imagearray;
	}
	public BufferedImage animate()
	{
		if (counter < imagearray.length - 1)
		{
			counter++;
		}
		else
		{
			counter = 0;
		}
		BufferedImage temp = imagearray[counter];
		return temp;
	}
}
