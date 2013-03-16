import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

// import java.awt.event.*;

/**
 * 
 */

/**
 * @author Acer
 * 
 */
public class BoardFrame extends JFrame implements MouseListener
{
	
	JPanel	BoardPanel;
	Board		board;
	WhiteMarbles white;
	BlackMarbles black;
	
	BoardFrame ( )
	{
		super ( "Abalone Board" );
		setSize ( 900, 750 );
		setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
		// setLayout( new FlowLayout() ); // set the layout manager
		
		board = new Board ( 9, 9 );
		board.set ( 5, 5, -1 );
		
		white = new WhiteMarbles ( 9, 9 );
		black = new BlackMarbles ( 9, 9 );
		
		JPanel BoardPanel = new DrawBoard ( board );
		add ( BoardPanel );
		BoardPanel.addMouseListener ( this );
		setVisible ( true );
		
	}
	
	public void mouseClicked ( MouseEvent e )
	{
		// Event listener implementation goes here...
		float i = ( e.getX ( ) - 310 ) / 80;
		float j = ( e.getY ( ) - 40 - 45 * i ) / 84;
		if ( i >= 0 && i <= 4 && j >= 0 && i + j < 9 ) // if valid
		{
			white.select ( (int) i, (int) j );
			return;
		}
		j = ( 310 - e.getX ( ) ) / 80;
		i = ( e.getY ( ) - 40 - 45 * i ) / 84;
		if ( j >= 1 && j < 5 && i >= 0 && i < 9 - j ) // if valid
		{
			select ( (int) i, (int) j );
			return;
		}
		setVisible ( false ); // Should reach this if clicked on marble
													// Of course, bugs happen
													// And yes, this whole thing is bad now...
													// And yes, there should be move somewhere
		// g2.fillOval ( j * 84 + 40 + 45 * ( i ), 80 * i + 310, 40, 40 );
		// g2.fillOval ( i * 84 + 40 + 45 * ( j ), 310 - 80 * j, 40, 40 );
	}
	
	@Override
	public void mouseEntered ( MouseEvent arg0 )
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseExited ( MouseEvent arg0 )
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed ( MouseEvent arg0 )
	{
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseReleased ( MouseEvent arg0 )
	{
		// TODO Auto-generated method stub
		
	}
	
}
