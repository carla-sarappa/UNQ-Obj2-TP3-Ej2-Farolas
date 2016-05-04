package farolas;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

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
	
	@Test
	public void testCuandoAUnaFarolaPrendidaSeLeDicePrenderSiguePrendida(){
		Farola farola = new Farola();
		farola.prender();
		farola.prender();
		assertTrue(farola.isPrendida());	
	}
	
	@Test
	public void testCuandoAUnaFarolaApagadaSeLeDiceApagarSigueApagada(){
		Farola farola = new Farola();
		farola.apagar();
		farola.apagar();
		assertFalse(farola.isPrendida());
	}
	
	@Test
	public void testLasFarolasPuedenEstarConectadasConOtrasFarolas(){
		Farola farola = new Farola();
		Farola otraFarola = new Farola();
		Farola tercerFarola = new Farola();
		farola.conectarCon(otraFarola);
		farola.conectarCon(tercerFarola);
		
		List<Farola> listas = new ArrayList<Farola>();
		listas.add(otraFarola);
		listas.add(tercerFarola);
		
		assertArrayEquals(listas.toArray(), farola.getVecinas().toArray());
	}

	@Test
	public void testAlPrenderUnaFarolaSeDebenPrenderTodasLasDemas(){
		Farola farola = new Farola();
		Farola otraFarola = new Farola();
		Farola tercerFarola = new Farola();
		farola.conectarCon(otraFarola);
		farola.conectarCon(tercerFarola);
		otraFarola.conectarCon(tercerFarola);
		tercerFarola.conectarCon(farola);
		farola.prender();
		
		assertTrue(otraFarola.isPrendida());
		assertTrue(tercerFarola.isPrendida());
		
	}
	
	@Test
	public void testAlApagarUnaFarolaSeDebenApagarTodasLasDemas(){
		Farola farola = new Farola();
		Farola otraFarola = new Farola();
		Farola tercerFarola = new Farola();
		farola.conectarCon(otraFarola);
		farola.conectarCon(tercerFarola);
		otraFarola.conectarCon(tercerFarola);
		tercerFarola.conectarCon(farola);
		farola.apagar();
		
		assertTrue(otraFarola.isPrendida());
		assertTrue(tercerFarola.isPrendida());
	}
}