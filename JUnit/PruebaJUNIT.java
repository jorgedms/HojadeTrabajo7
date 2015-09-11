import static org.junit.Assert.*;


public class PruebaJUNIT {
	
	private BinaryT arbol = new BinaryT();
	
	//se crea un arbol para poner a prueba el metodo de buscar elemento en el arbol
	public void start()
	{
		String n = "comida";
		String m = "food";
		
		String o = "arriba";
		String p = "up";
		
		String q = "casa";
		String r = "house";
		
		String s = "arbol";
		String t = "tree";
		
		arbol.addNode(n, m);
		arbol.addNode(o, p);
		arbol.addNode(q, r);
		arbol.addNode(s, t);
		
	}
	
	//Test de agregar un nodo, true si no se creo el nodo, false si se creo el nodo
	public boolean addNodo(){
		return arbol.root != null;
	}
	//Test de encontrar un elemento en el árbol, true si se encuentra comida en el arbol
	public boolean findValue(){
		return (arbol.findName("comida").equals("food"));
		}
	
	}