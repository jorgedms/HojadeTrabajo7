import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
public class Principal {
	File archivo = new File("path");
	
	public static void main(String [] arg) {
	      File archivo = null;
	      FileReader fr = null;
	      BufferedReader br = null;
	      ArrayList<Association> lista = new ArrayList<Association>();
	      try {
	         // Apertura del fichero y creacion de BufferedReader para poder
	         // hacer una lectura comoda (disponer del metodo readLine()).
	         archivo = new File ("C:\\Users\\Boris\\workspace\\Hoja7\\src\\datos.txt");
	         fr = new FileReader (archivo);
	         br = new BufferedReader(fr);
	 
	         // Lectura del fichero
	         String linea;
	         while((linea=br.readLine())!=null){
	        	String key="";
	         	String value="";
	         	boolean valor = false;
	        	 for(int x =0; x<linea.length();x++){
	        		if((!linea.substring(x, x+1).equals("(")) && (!valor)  &&(!linea.substring(x, x+1).equals(",")) ){
	        			key += linea.substring(x,x+1);
	        		}else if((!linea.substring(x, x+1).equals(")")) && valor){
	        			value += linea.substring(x, x+1);
	        		}else if(linea.substring(x, x+1).equals(",")){
	        			valor = true;
	        		}
	        	 }
	        	 
	        	 Association<String,String> asociacion = new Association<String,String>(key,value);
	            lista.add(asociacion);
	         }
	         for(Association<String,String> elemento: lista){
	        	 System.out.println("Key: "+elemento.getTheKey());
	         }
	      }
	      catch(Exception e){
	         e.printStackTrace();
	      }finally{
	         // En el finally cerramos el fichero, para asegurarnos
	         // que se cierra tanto si todo va bien como si salta 
	         // una excepcion.
	         try{                    
	            if( null != fr ){   
	               fr.close();     
	            }                  
	         }catch (Exception e2){ 
	            e2.printStackTrace();
	         }
	      }
	   }
	
	}
	

