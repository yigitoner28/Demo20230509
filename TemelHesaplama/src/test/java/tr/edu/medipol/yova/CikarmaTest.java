package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class CikarmaTest {

	@Test
	public void testCikar() {
		// GIVEN - ONKOSULLAR
		int sayi3 = 100;
		int sayi4 = 5;

		// WHEN - ASIL TEST
		int gercekSonuc = Cikarma.Cikar(sayi3, sayi4);

		// THEN - KONTROL / VALIDASYON
		assertEquals(95, gercekSonuc);
	}
}
