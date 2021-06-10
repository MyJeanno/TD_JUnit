package verification.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import calcul.Nombre;

class NombreTest {

	@Test
	void testVerif() {
		Nombre n = new Nombre();
		int[] t1 = new int[] { 8, 9, 10 };
		assertEquals(10, n.plusGrandNombre2(t1));

		int[] t2 = new int[] { 1, 2, 3 };
		assertEquals(3, n.plusGrandNombre(t2));
	}

	@Test
	void testVerifNegative() {
		Nombre n = new Nombre();
		int[] t1 = new int[] { -7, -8, -9 };
		assertEquals(-7, n.plusGrandNombre2(t1));

		int[] t2 = new int[] { -8, -7, -9 };
		assertEquals(-7, n.plusGrandNombre(t2));
	}

	@Test
	void testVerifValeursNull() {
		Nombre n = new Nombre();
		n.plusGrandNombre(null);
	}

}
