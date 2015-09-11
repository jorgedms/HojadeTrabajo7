
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;


public class Diccionario<P> {
	private String line, key, value,frase;
	private String[] words;
	private ArrayList<Association<String,String>> listaA = new ArrayList<Association<String,String>>();
	private boolean valor;
	private BinaryT<String> arbolTraductor = new BinaryT<String>();
	
	public void readTexto(String file) throws FileNotFoundException, Exception{
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			frase = "";
		    while ((this.line = br.readLine()) != null) {
		       words = line.split(" ");
		       for(int i = 0; i<words.length; i++){
		    	   System.out.println(words[i]);
		    	   if(arbolTraductor.findName(words[i])!=null){
		    		   frase= frase + " " + arbolTraductor.findName(words[i]);   
		    	   } else {
		    		   frase= frase +" *"+words[i]+"* ";
		    	   }
		    	   
		    	   
		       }
		    }
		}
		System.out.println("readTexto");
		System.out.println(frase);
	}
	
	public void readDiccionario(String file) throws Exception{
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			while((this.line = br.readLine()) != null){
				key="";
				value="";
		        valor = false;
		        for(int x =0; x<line.length();x++){
		        	if((!line.substring(x, x+1).equals("(")) && (!valor)  &&(!line.substring(x, x+1).equals(",")) ){
		        		key += line.substring(x,x+1);
		        	}else if((!line.substring(x, x+1).equals(")")) && valor){
		        		value += line.substring(x, x+1);
		        	}else if(line.substring(x, x+1).equals(",")){
		        		valor = true;
		        	}
		        }
		     Association<String,String> asociacion = new Association<String,String>(key,value);
		     arbolTraductor.addNode(asociacion.getTheKey(),asociacion.getTheValue());
			}
		}
		System.out.println("readDiccionario");
	}
}
