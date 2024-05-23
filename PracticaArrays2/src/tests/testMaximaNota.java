package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.misArrays;

class testMaximaNota {

	static int[] notasValidas;
	static int[] notasInvalidas;
	
	@BeforeAll
	public static void inicializarDatos() {
        notasValidas = new int[]{1, 2, 3, 4, 5};
        notasInvalidas = new int[]{-1, 12, -6, -4, 21};
    }
	
	@Test
	void testMaximaNotasValoresValidos() {
		
        float maximo = misArrays.maximaNota(notasValidas);

        assertEquals(5, maximo);
    }
	
	@Test
	void testMaximaNotaValoresValidos() {
        assertThrows(IllegalArgumentException.class, () -> misArrays.maximaNota(notasInvalidas));
    }

}
