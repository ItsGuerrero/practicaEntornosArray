package util;

import java.util.Arrays;

public abstract class misArrays {
	/**
	 * Calcula la media de las notas de una array
	 * 
	 * @param notas
	 * @return La media de las notas
	 * @throws IllegalArgumentException, si las notas no estan entre 0 y 10
	 */
	public static float mediaNotas(int[] notas) {
		int suma = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 0 || notas[i] > 10) {
				throw new IllegalArgumentException("Las notas tienen que estar entre 0 y 10");
			}
			suma += notas[i];
		}

		return (float) suma / notas.length;
	}

	/**
	 * Calcula la nota más alta de una array
	 * 
	 * @param notas
	 * @return la nota mas alta
	 * @throws IllegalArgumentException, si las notas no estan entre 0 y 10
	 */
	public static int maximaNota(int[] notas) {
		int maximaNota = notas[0];

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 0 || notas[i] > 10) {
				throw new IllegalArgumentException("Las notas tienen que estar entre 0 y 10");
			} else if (notas[i] > maximaNota) {
				maximaNota = notas[i];
			}

		}

		return maximaNota;
	}

	/**
	 * Calcula la nota mas baja de una arrau
	 * 
	 * @param notas
	 * @return la nota mas baja
	 * @throws IllegalArgumentException, si las notas no estan entre 0 y 10
	 */
	public static int minimaNota(int[] notas) {
		int minimaNota = notas[0];

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 0 || notas[i] > 10) {
				throw new IllegalArgumentException("Las notas tienen que estar entre 0 y 10");
			} else if (notas[i] < minimaNota) {
				minimaNota = notas[i];
			}

		}

		return minimaNota;
	}
	
	/**
	 * Calcula la mediana de las notas de una array
	 * @param notas
	 * @return la mediana de las notas
	 * @throws IllegalArgumentException, si las notas no estan entre 0 y 10
	 */
	public static float medianaNotas(int[] notas) {

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < 0 || notas[i] > 10) {
				throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
			}
		}

		Arrays.sort(notas);
		int[] arrayOrdenado = notas;
		int mitad = arrayOrdenado.length / 2;

		if (arrayOrdenado.length % 2 == 0) {
			return (float) (arrayOrdenado[mitad - 1] + arrayOrdenado[mitad]) / 2;
		} else {
			return arrayOrdenado[mitad];
		}
	}
}
