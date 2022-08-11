package calculadora;

import javax.swing.*;
import java.awt.*;

public class ventana extends JFrame{

	ventana(int lx, int ly, int tx, int ty)
	{
		
			
        fondo f=new fondo(0,0,500,500);
		
		Color co=new Color(0,0,200);
		
	    boton b1=new boton("0",10,200,50,50,co);
		boton b2=new boton("1",70,200,50,50,co);
		boton b3=new boton("2",130,200,50,50,co);
		boton b4=new boton("3",190,200,50,50,co);
		boton b5=new boton("4",250,200,50,50,co);
		boton b6=new boton("5",10,260,50,50,co);
		boton b7=new boton("6",70,260,50,50,co);
		boton b8=new boton("7",130,260,50,50,co);
		boton b9=new boton("8",190,260,50,50,co);
		boton b10=new boton("9",250,260,50,50,co);
		boton b11=new boton("+",10,320,50,50,co);
		boton b12=new boton("-",70,320,50,50,co);
		boton b13=new boton("*",130,320,50,50,co);
		boton b14=new boton("/",190,320,50,50,co);
		boton b15=new boton("=",250,320,50,50,co);
				
		etiqueta retroalimentacion=new etiqueta(10,10,300,80);
		etiqueta resultado=new etiqueta(10,100,300,80);
		
		f.add(retroalimentacion);
		f.add(resultado);
		
		Acciona1 a1=new Acciona1(0,resultado,retroalimentacion);
		Acciona1 a2=new Acciona1(1,resultado,retroalimentacion);
		Acciona1 a3=new Acciona1(2,resultado,retroalimentacion);
		Acciona1 a4=new Acciona1(3,resultado,retroalimentacion);
		Acciona1 a5=new Acciona1(4,resultado,retroalimentacion);
		Acciona1 a6=new Acciona1(5,resultado,retroalimentacion);
		Acciona1 a7=new Acciona1(6,resultado,retroalimentacion);
		Acciona1 a8=new Acciona1(7,resultado,retroalimentacion);
		Acciona1 a9=new Acciona1(8,resultado,retroalimentacion);
		Acciona1 a10=new Acciona1(9,resultado,retroalimentacion);
		Acciona1 a11=new Acciona1(10,resultado,retroalimentacion);
		Acciona1 a12=new Acciona1(11,resultado,retroalimentacion);
		Acciona1 a13=new Acciona1(12,resultado,retroalimentacion);
		Acciona1 a14=new Acciona1(13,resultado,retroalimentacion);
		Acciona1 a15=new Acciona1(14,resultado,retroalimentacion);
		
		b1.addActionListener(a1);
		b2.addActionListener(a2);
		b3.addActionListener(a3);
		b4.addActionListener(a4);
		b5.addActionListener(a5);
		b6.addActionListener(a6);
		b7.addActionListener(a7);
		b8.addActionListener(a8);
		b9.addActionListener(a9);
		b10.addActionListener(a10);
		b11.addActionListener(a11);
		b12.addActionListener(a12);
		b13.addActionListener(a13);
		b14.addActionListener(a14);
		b15.addActionListener(a15);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(b10);
		f.add(b11);
		f.add(b12);
		f.add(b13);
		f.add(b14);
		f.add(b15);
			
		setContentPane(f);
		setLocation(0,0);
		setSize(320,420);
		setVisible(true);
		
		
	}
}
