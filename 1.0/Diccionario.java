import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class Diccionario<P> {
	private String line;
	public void readFile(String file) throws FileNotFoundException, Exception{
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
		    while ((this.line = br.readLine()) != null) {
		       System.out.println(this.line);
		    }
		}
		System.out.println("readFile");
				
	}
}
