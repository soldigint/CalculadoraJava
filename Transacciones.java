package calculadora;
import java.io.*;

public class Transacciones {

	public String [] abrirArchivo(String ruta){
		String [] arreglo;
		 arreglo= new String[100];
		 FileReader fr = null;
         BufferedReader br = null;
         try
         {  int contador=0;
             fr = new FileReader(ruta);
             br = new BufferedReader( fr );
            contador=Integer.parseInt(br.readLine());
          
            for(int i=0;i<contador; i++)
            {
            	arreglo[i]=br.readLine();
            	 System.out.println(arreglo[i]);
            }
            
                }catch( Exception ex ){  }
         finally
         {
             try{
                 br.close();
             }catch( Exception ex ){}
         }
		
	return	arreglo;
	}
	
	
	public void guardarArchivo(String ruta, String[] arreglos, int indice ){
		
		File fil;
		fil= new File(ruta);
		
         try
         { 
             FileWriter write = new FileWriter(fil);
             BufferedWriter bw = new BufferedWriter( write );
             PrintWriter wr= new PrintWriter(bw);
             wr.append(indice+"\n");
            for(int i=0;i<indice; i++)
            {
            	wr.append(arreglos[i]+"\n");
            	 System.out.println(arreglos[i]);
            }
            
            wr.close();
            bw.close(); 
                }catch( Exception ex ){  }
        
	}
	
}
