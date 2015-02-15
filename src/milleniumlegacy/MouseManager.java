package milleniumlegacy;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseManager implements MouseListener
{

	@Override
	public void mouseClicked(MouseEvent e)
	{
		
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		
		
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		Research.button.clicked(new Rectangle(e.getX(),e.getY(),1,1));
		Research.button2.clicked(new Rectangle(e.getX(),e.getY(),1,1));
		Research.button3.clicked(new Rectangle(e.getX(),e.getY(),1,1));
		Research.button4.clicked(new Rectangle(e.getX(),e.getY(),1,1));
		Research.button5.clicked(new Rectangle(e.getX(),e.getY(),1,1));
		Research.button6.clicked(new Rectangle(e.getX(),e.getY(),1,1));
		Research.button7.clicked(new Rectangle(e.getX(),e.getY(),1,1));
		Research.button8.clicked(new Rectangle(e.getX(),e.getY(),1,1));
		Research.button9.clicked(new Rectangle(e.getX(),e.getY(),1,1));
		Research.button10.clicked(new Rectangle(e.getX(),e.getY(),1,1));
		Research.rb.ResearchButton(new Rectangle(e.getX(),e.getY(),1,1));
		if (Research.selected1 && !Research.button.getBounds().intersects(new Rectangle(e.getX(),e.getY(),1,1)) && !Research.button3.getBounds().intersects(new Rectangle(e.getX(),e.getY(),1,1)) && !Research.button4.getBounds().intersects(new Rectangle(e.getX(),e.getY(),1,1)) && !Research.button5.getBounds().intersects(new Rectangle(e.getX(),e.getY(),1,1)) && !Research.button6.getBounds().intersects(new Rectangle(e.getX(),e.getY(),1,1)) && !Research.button7.getBounds().intersects(new Rectangle(e.getX(),e.getY(),1,1)) && !Research.button8.getBounds().intersects(new Rectangle(e.getX(),e.getY(),1,1)) && !Research.button9.getBounds().intersects(new Rectangle(e.getX(),e.getY(),1,1)) && !Research.button2.getBounds().intersects(new Rectangle(e.getX(),e.getY(),1,1)) && !Research.button10.getBounds().intersects(new Rectangle(e.getX(),e.getY(),1,1)) )
		{
			Research.reset();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		
		
	}

}
