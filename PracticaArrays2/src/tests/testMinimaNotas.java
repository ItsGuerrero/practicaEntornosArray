package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.misArrays;

class testMinimaNotas {

	static int[] notasValidas;
	static int[] notasNoValidas;
	
	@BeforeAll
	public static void inicializarDatos() {
        notasValidas = new int[]{1, 2, 3, 4, 5};
        notasNoValidas = new int[]{-1, 14, -6, -7, 27};
    }
	
	@Test
	void testMinimaNotasValoresValidos() {
		
        float minimo = misArrays.minimaNota(notasValidas);

        assertEquals(1, minimo);
    }
	
	@Test
	void testMinimaNotaValoresValidos() {
        assertThrows(IllegalArgumentException.class, () -> misArrays.minimaNota(notasNoValidas));
    }

}
