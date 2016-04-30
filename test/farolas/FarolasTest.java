package farolas;

import static org.junit.Assert.*;

import org.junit.Test;

public class FarolasTest {

	
	@Test
	public void testLuegoDeEncenderUnaFarolaLaFarolaQuedaEncendida() {
		Farola farola = new Farola();
		farola.prender();
		assertTrue(farola.isPrendida());
	}

	@Test
	public void testUnaFarolaNuevaSinUsoEstaApagada(){
		Farola farola = new Farola();
		assertFalse(farola.isPrendida());	
	}
	
}