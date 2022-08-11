package calculadora;
import javax.swing.*;
import java.awt.*;

public class etiqueta extends JTextField{

	etiqueta(int lx, int ly, int tx, int ty)
	{
		Font fuente= new Font("",Font.BOLD,36);
		setForeground(new Color(0,0,255));
		setFont(fuente);
		setLocation(lx,ly);
		setSize(tx,ty);
		setVisible(true);
		
	}
	
	
	
	
	
}
