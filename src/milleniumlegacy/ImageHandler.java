package milleniumlegacy;

import java.awt.image.BufferedImage;

public class ImageHandler
{
	static ImageLoader IL = new ImageLoader();
	static BufferedImage[] imageArray = {
			IL.loadImage("resources/sprites/dirt.png"),
			IL.loadImage("resources/sprites/water.png"),
			IL.loadImage("resources/sprites/clay.png"),
			IL.loadImage("resources/textures/gravel.png"),
			IL.loadImage("resources/textures/rock.png"),
			IL.loadImage("resources/sprites/plant.png"),
			IL.loadImage("resources/sprites/iron.png"),
			IL.loadImage("resources/sprites/fire.png"),
			IL.loadImage("resources/sprites/fridge.png"),
			IL.loadImage("resources/sprites/ice.png"),
			IL.loadImage("resources/sprites/fire.png"),
			IL.loadImage("resources/sprites/flower.png"),
			IL.loadImage("resources/sprites/garden.png"),
			IL.loadImage("resources/sprites/metal.png"),
			IL.loadImage("resources/sprites/plastic.png"),
			IL.loadImage("resources/sprites/sugar.png"),
			IL.loadImage("resources/sprites/arsenic.png"),
			IL.loadImage("resources/sprites/food.png"),
			IL.loadImage("resources/sprites/house.png"),
			IL.loadImage("resources/sprites/suburb.png"),
			IL.loadImage("resources/sprites/city.png"),
			IL.loadImage("resources/sprites/garden.png"),
			IL.loadImage("resources/sprites/electricity.png"),
			IL.loadImage("resources/sprites/supercomputer.png"),
			IL.loadImage("resources/sprites/supercomputer.png"),
			IL.loadImage("resources/sprites/quantumcomputer.png"),
			IL.loadImage("resources/sprites/timemachine.png")
			
	};
	static BufferedImage[] waterArray = {
		IL.loadImage("resources/textures/water0.png"),
		IL.loadImage("resources/textures/water1.png"),
		IL.loadImage("resources/textures/water2.png"),
		IL.loadImage("resources/textures/water3.png"),
		IL.loadImage("resources/textures/water4.png"),
		IL.loadImage("resources/textures/water5.png"),
		IL.loadImage("resources/textures/water6.png"),
		IL.loadImage("resources/textures/water7.png"),
		IL.loadImage("resources/textures/water8.png"),
		IL.loadImage("resources/textures/water9.png")
	};
	public static BufferedImage Grass = IL.loadImage("resources/textures/grass.png");
	public static BufferedImage Gravel = IL.loadImage("resources/textures/gravel.png");
	public static BufferedImage Rock = IL.loadImage("resources/textures/rock.png");
	public static BufferedImage Clay = IL.loadImage("resources/textures/clay.png");
	public static BufferedImage Water = IL.loadImage("resources/textures/water.gif");
	public static BufferedImage Hotbar = IL.loadImage("resources/gui/hotbar.png");
	public static BufferedImage researchMenu = IL.loadImage("resources/gui/research.png");
	
	public static BufferedImage getImage(int num)
	{
		return imageArray[num];
	}
}
