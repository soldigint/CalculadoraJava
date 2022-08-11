package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Acciona1 implements ActionListener {
	JTextField resultado, retroalimentacion;
	int nv;
	
	Acciona1( int d, JTextField res, JTextField  retro)
	{
		resultado=res;
		retroalimentacion=retro;
		nv=d;
		
	}
    public void actionPerformed(ActionEvent e) { 
    	Transaccion archivo=new Transaccion();
    	archivo.guardar("c://algo//algo.txt");
    	
   
    	switch (nv)
    {
    case 0:
	{

	resultado.setText("0");
	String aux=retroalimentacion.getText()+"0";
	retroalimentacion.setText(aux);
		
		break;
	}	
    case 1:
    	{

    		resultado.setText("1");    	
    		String aux=retroalimentacion.getText()+"1";
    		retroalimentacion.setText(aux);
    				
    		break;
    	}
    	case 2:
    	{
    		resultado.setText("2");
    		String aux=retroalimentacion.getText()+"2";
    		retroalimentacion.setText(aux);
    		
        break;
        }
    	case 3:
    	{
    		resultado.setText("3");
    		String aux=retroalimentacion.getText()+"3";
    		retroalimentacion.setText(aux);
    		
    		 break;
    	}
    	case 4:
    	{
    		resultado.setText("4");
    		String aux=retroalimentacion.getText()+"4";
    		retroalimentacion.setText(aux);
    		
   		 break;
   	}
    	case 5:
    	{
    		resultado.setText("5");
    		String aux=retroalimentacion.getText()+"5";
    		retroalimentacion.setText(aux);
    		
    		break;
      	}
    	case 6:
    	{
    		resultado.setText("6");
    		String aux=retroalimentacion.getText()+"6";
    		retroalimentacion.setText(aux);
    		
    		break;
      	}
    	case 7:
    	{
    		resultado.setText("7");
    		String aux=retroalimentacion.getText()+"7";
    		retroalimentacion.setText(aux);
    		
    		break;
      	}
    	case 8:
    	{
    		resultado.setText("8");
    		String aux=retroalimentacion.getText()+"8";
    		retroalimentacion.setText(aux);
    		
    		break;
      	}
    	case 9:
    	{
    		resultado.setText("9");
    		String aux=retroalimentacion.getText()+"9";
    		retroalimentacion.setText(aux);
    		
    		break;
      	}
    	case 10:
    	{
    		resultado.setText("+");
    		String aux=retroalimentacion.getText()+"+";
    		retroalimentacion.setText(aux);
    		
    		break;
      	}
    	case 11:
    	{
    		resultado.setText("-");
    		String aux=retroalimentacion.getText()+"-";
    		retroalimentacion.setText(aux);
    		
    		break;
      	}
    	case 12:
    	{
    		resultado.setText("*");
    		String aux=retroalimentacion.getText()+"*";
    		retroalimentacion.setText(aux);
    		
    		break;
      	}
    	case 13:
    	{
    		resultado.setText("/");
    		String aux=retroalimentacion.getText()+"/";
    		retroalimentacion.setText(aux);
    		break;
      	}
    	case 14:
    	{
    		int [ ] operandos=new int[20];
    		String aux=retroalimentacion.getText();	
    		System.out.println(aux);
    		char [] a= aux.toCharArray();
    		int i=0,c=0;
    		String ope="";
    	
    while(a[i]!=' ')
    	{	
    		if(a[i]!='+')
    		{
    	   ope=ope+a[i];
		   System.out.println(" ope solito "+ope);	
			}
    		else
    		{
    			operandos[c]=Integer.parseInt(ope);
        		System.out.println("el numero es: "+operandos[c]+ " c: "+c);            	
    		ope="";
    		c++;
    		}
    		
    		i++;
    	}
    operandos[c]=Integer.parseInt(ope);
	System.out.println("el numero es: "+operandos[c]+ " c: "+c);            	
  		
    		break;
      	}
    	default:
    		break;
    	
    }
	        }
}

