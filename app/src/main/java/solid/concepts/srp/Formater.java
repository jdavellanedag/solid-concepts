package solid.concepts.srp;

import java.util.List;
import java.util.stream.Collectors;

public class Formater {

  public String toCSV(List<Movie> movies) {

    return movies.stream()
        .map(p -> (p.getTitle() + "," + p.getDirector() + "," + p.getGenre()))
        .collect(Collectors.joining("\n"));
  }

}
