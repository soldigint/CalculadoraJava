package calculadora;
import javax.swing.*;

import java.awt.*;

public class boton  extends JButton{
	
	boton (String n,int lx, int ly, int tx, int ty, Color c)
	{
    
	    Font fuente= new Font("",Font.BOLD,36);
		setText(n);    
		setFont(fuente);
		setForeground(new Color(0,0,255));
		setLocation(lx,ly);
		setSize(tx,ty);
		setVisible(true);
		
	}
	
	
}
