
public class mainJunit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PruebaJUNIT prueba = new PruebaJUNIT();
		
		
		//prueba inserter nodo
		prueba.start();
		// True si se creo el nodo
		System.out.println("True si se creo el nodo:");
		System.out.println("Se inserto un nodo => "+prueba.addNodo());
		
		//probar si busqueda de elemento funciona
		//true si se encontro el elemento
		System.out.println("True si se encontro el elemento en el árbol:");
		System.out.println("Se encontro el elemento comida en el arbol => "+prueba.findValue());
		

	}

}
