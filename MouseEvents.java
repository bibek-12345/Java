import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.awt.Color;
public class MouseEvents extends Applet implements MouseListener , MouseMotionListener {
	int mousex=0;
	int mousey=0;
	String msg="";
	
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		setBackground(Color.yellow);
	}
	public void mouseClicked(MouseEvent e) {
		mousex=0;
		mousey=10;
		msg="mouser clicked";
		repaint();
	}
	public void mousePressed(MouseEvent e) {
		mousex=e.getX();
		mousey=e.getY();
		msg="mouse pressed";
		repaint();
	}
	public void mouseMoved(MouseEvent e) {
		showStatus("mouse moved at:"+e.getX()+","+e.getY());
	}
	public void mouseReleased(MouseEvent e) {
		mousex=e.getX();
		mousey=e.getY();
		msg="moused released";
		repaint();
	}
	public void mouseEntered(MouseEvent e) {
		mousex=0;
		mousey=10;
		msg="mouser entered";
		repaint();
	}
	public void mouseDragged(MouseEvent e) {
		mousex=e.getX();
		mousey=e.getY();
		msg="moused dragged";
		repaint();
	}
	public void mouseExited(MouseEvent e) {
		mousex=0;
		mousey=10;
		msg="mouser exited";
		repaint();
	}
	public void paint(Graphics g) {
		g.drawString(msg, mousex, mousey);
	}
}
