package solid.concepts.ocp;

import java.util.Comparator;

public class PrimeNumberSorting extends PrimeNumberGenerator {
  public PrimeNumberSorting() {
    this.comparator = Comparator.<Integer>naturalOrder().reversed();
  }
}
