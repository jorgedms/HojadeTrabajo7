
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diccionario<String> nDiccionario = new Diccionario<String>();
		try{
			nDiccionario.readFile("file.txt");
		} catch(Exception e){
			e.printStackTrace();
		}
	}

}
