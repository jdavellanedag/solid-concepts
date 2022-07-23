package solid.concepts.lsp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PointsTests {

	private final Point2D reference = new Point3D(3, 5, 1);
	private final List<Point2D> test_points = Arrays.asList(
			new Point2D(3, 5),
			new Point2D(2, 3),
			new Point2D(4, 3));

	@Test
	public void test_equal_if_only_if_dinstance_0() {

		for (Point2D point : test_points) {
			System.out.println("Testing : " + reference + " and " + point);
			assertTrue(reference.equals(point));
			assertEquals(reference.distance(point), 0);
		}
	}

}
