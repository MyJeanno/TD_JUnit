package verification.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calcul.ListNonValidException;
import calcul.Nombre;

public class NombreTest2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = ListNonValidException.class)
	public void testPlusGrandNombre() {
		Nombre n = new Nombre();
		n.plusGrandNombre(null);
		
	}

}
