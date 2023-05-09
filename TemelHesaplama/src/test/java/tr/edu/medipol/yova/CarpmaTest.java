package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarpmaTest {

	@Test
	public void testCarp() {
		// GIVEN - ONKOSULLAR
		int sayi7 = 5;
		int sayi8 = 4;

		// WHEN - ASIL TEST
		int gercekSonuc = Carpma.Carp(sayi7, sayi8);

		// THEN - KONTROL / VALIDASYON
		assertEquals(20, gercekSonuc);
	}

}
