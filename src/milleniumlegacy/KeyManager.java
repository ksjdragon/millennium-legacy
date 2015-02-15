package milleniumlegacy;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener
{

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			MainGame.up = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_S)
		{
			MainGame.down = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			MainGame.left = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			MainGame.right = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			MainGame.getPlayer().Add();
		}
		if (e.getKeyCode() == KeyEvent.VK_R){
			if (Research.shouldRender)
			{
				Research.shouldRender = false;
				Inventory.shouldRender = true;
			}
			else
			{
				Research.shouldRender = true;
				Inventory.shouldRender = false;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		if (e.getKeyCode() == KeyEvent.VK_W)
		{
			MainGame.up = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_S)
		{
			MainGame.down = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_A)
		{
			MainGame.left = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_D)
		{
			MainGame.right = false;
		}
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
		
	}
	
}
