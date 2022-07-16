package solid.concepts.srp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TestRecommender {

	@Test
	public void basic_test() {
		Recommender r = new Recommender();

		List<Movie> recommenations = r.recommendations(BBDD.JOHN);

		assertFalse(recommenations.contains(BBDD.ET));
	}

	@Test
	public void test_format() {
		Recommender r = new Recommender();

		String csv = new Formater().toCSV(r.recommendations(BBDD.JOHN));

		String expected = "Saving Private Ryan,Spielberg,war";

		assertEquals(expected, csv);

	}

}
