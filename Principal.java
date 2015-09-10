import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {
	
	private ArrayList<String> arrayAsociacion;
	private BinaryTreeSet arbolTraductor;
	
	public Principal() {
		super();
		arrayAsociacion = new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}

	public String getArrayAsociacion(int i) {
		return arrayAsociacion.get(i);
	}
	

	public void setArrayAsociacion(ArrayList<String> arrayAsociacion) {
		this.arrayAsociacion = arrayAsociacion;
	}

	public void lecturaAsociacion(String texto) throws IOException{
	        FileReader fr = new FileReader(texto);
	        @SuppressWarnings("resource")
			BufferedReader bf = new BufferedReader(fr);
	        
	        String linea;
	         while((linea=bf.readLine())!=null){
	        	 String ingles = "", espanol = "";
	        	 boolean siguiente=false;
	        	 for(int x=0; x<linea.length(); x++){
	        		 if(linea.substring(x, x+1).equals("(") || linea.substring(x, x+1).equals(")")){}
	        		 else if(linea.substring(x, x+1).equals(","))
	        			 siguiente=true;
	        		 
	        		 else if(!siguiente)
	        			 ingles+=linea.substring(x, x+1);
	        		 else if(siguiente)
	        			 espanol+=linea.substring(x, x+1);
	        	 }
	        	 arbolTraductor.addTranslation(ingles,espanol);
	        }
		
	}
	
	public String lecturaTraduccion(String texto) throws IOException{
		FileReader fr = new FileReader(texto);
        @SuppressWarnings("resource")
		BufferedReader bf = new BufferedReader(fr);
        String linea;
        String palabra = "", frase = "";
        while((linea=bf.readLine())!=null){
        	for(int x=0; x<linea.length(); x++){
        		if(!linea.substring(x, x+1).equals(" ")){
        			palabra+=linea.substring(x, x+1);
       		 	}
        		else if(linea.substring(x, x+1).equals(" ")){
        			frase = frase+" "+arbolTraductor.getTranslation(palabra);
        			palabra="";
       		 	}
       	 	}
        }
        return frase;
	}
}
	

