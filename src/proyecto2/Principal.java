package proyecto2;

import java.util.logging.Logger;

public class Principal {
	private static final Logger LOGGER  = 
			Logger.getLogger("Calculadora");
	
	
	public static void main(String[] args) {
		LOGGER.info("Hola Mundo");
	}
	
	public static int sumar (int a, int b){ 
		return a + b;
	}

	

}
