import static org.junit.Assert.*;

import org.junit.Test;

public class radioBBPTest {

	@Test
	public void test() {
		radioBBP radio = new radioBBP();
		assertEquals(radio.encenderApagar(),!radio.encenderApagar());
		assertEquals(radio.encenderApagar(),!radio.encenderApagar());

		assertEquals(radio.cambiarFrecuencia(),"AM");
		assertEquals(radio.cambiarFrecuencia(),"FM");
		assertEquals(radio.cambiarFrecuencia(),"AM");

		assertEquals(radio.subirVolumen()+1, radio.subirVolumen());
		assertEquals(radio.subirVolumen()+1, radio.subirVolumen());
		assertEquals(radio.subirVolumen()+1, radio.subirVolumen());
		

		assertEquals(radio.bajarVolumen()-1, radio.bajarVolumen());
		assertEquals(radio.bajarVolumen()-1, radio.bajarVolumen());
		assertEquals(radio.bajarVolumen()-1, radio.bajarVolumen());
	}

}
