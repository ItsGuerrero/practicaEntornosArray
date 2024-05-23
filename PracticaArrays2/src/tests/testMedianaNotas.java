package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.misArrays;

class testMedianaNotas {

	static int[] notasValidas;
	static int[] notasNoValidas;
	
	@BeforeAll
	public static void inicializarDatos() {
        notasValidas = new int[]{1, 2, 3, 4, 5};
        notasNoValidas = new int[]{-1, 14, -4, -7, 24};
    }
	
	@Test
	void testMedianaNotasValoresValidos() {
		
        float mediano = misArrays.medianaNotas(notasValidas);

        assertEquals(3, mediano);
    }
	
	@Test
	void testMedianaNotaValoresValidos() {
        assertThrows(IllegalArgumentException.class, () -> misArrays.medianaNotas(notasNoValidas));
    }

}
