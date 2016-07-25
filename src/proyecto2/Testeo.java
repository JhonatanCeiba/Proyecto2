package proyecto2;

import static org.junit.Assert.*;
import proyecto2.Principal;

import org.junit.Test;

public class Testeo {

	@Test
	public void test() {
		assertEquals(Principal.sumar(4, 5), 10);
	}
	
	@Test
	public void test11() {
		assertEquals(Principal.sumar(4,5), 9);
	}
	
	@Test
	public void test22() {
		assertEquals(Principal.sumar(4,5), 10);
	}


}
