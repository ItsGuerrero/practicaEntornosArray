package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.misArrays;

class testMediaNotas {

	static int[] notasValidas;
	static int[] notasNoValidas;
    
	@BeforeAll
	public static void inicializarDatos() {
        notasValidas = new int[]{1, 2, 3, 4, 5};
        notasNoValidas = new int[]{-1, 13, -8, -7, 25};
    }
	
	@Test
	void testMediaNotasValoresValidos() {
		
        float mediaCalculada = misArrays.mediaNotas(notasValidas);

        assertEquals(3, mediaCalculada);
    }
	
	@Test
	void testMediaNotaValoresNoValidos() {
		
        assertThrows(IllegalArgumentException.class, () -> misArrays.mediaNotas(notasNoValidas));
    }

}
