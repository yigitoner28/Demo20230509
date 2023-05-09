package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class BolmeTest {

	@Test
	public void testBol() {
		// GIVEN - ONKOSULLAR
		int sayi5 = 100;
		int sayi6 = 5;

		// WHEN - ASIL TEST
		int gercekSonuc = Bolme.Bol(sayi5, sayi6);

		// THEN - KONTROL / VALIDASYON
		assertEquals(20, gercekSonuc);
	}

}
