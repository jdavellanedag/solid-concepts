package solid.concepts.ocp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PrimeNumberGeneratorTests {

	@Test
	public void test_natural_order() {

		PrimeNumberGenerator generador = new PrimeNumberGenerator();
		List<Integer> expected = Arrays.asList(2, 3, 5, 7, 11, 13);

		assertEquals(generador.primes(15), expected);
	}

	@Test
	public void test_reverse_order() {

		PrimeNumberGenerator generador = new PrimeNumberSorting();
		List<Integer> expected = Arrays.asList(13, 11, 7, 5, 3, 2);

		assertEquals(generador.primes(15), expected);
	}

}
