package solid.concepts.isp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TextProcessorTests {

	@Test
	public void simple_test() {

		TextProcessor processor = new TextProcessorImpl();

		processor.add("Spelynk");
		processor.add("doesnt");
		processor.add("matter");

		assertEquals("Spelynk doesnt matter", processor.text());
	}

	@Test
	public void test_using_language() {

		MultiLanguage processor = new TextProcessorImpl();

		processor.add("I");
		processor.add("am");
		processor.add("hungry");

		assertEquals("I am hungry", processor.text());

		assertTrue(processor.correct(Language.EN));
	}
}
