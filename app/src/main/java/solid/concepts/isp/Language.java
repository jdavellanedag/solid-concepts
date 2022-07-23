package solid.concepts.isp;

import java.util.Arrays;
import java.util.List;

public enum Language {

	EN("i", "am", "hungry"),
	ES("tengo", "hambre");

	List<String> dictionary;

	private Language(String... words) {
		this.dictionary = Arrays.asList(words);
	}

}
