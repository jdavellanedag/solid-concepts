package solid.concepts.dip;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import solid.concepts.dip.bbdd.StockRepositoryImpl;
import solid.concepts.dip.business.StockController;

public class StockControllerTests {

	@Test
	public void test_stock_control() {
		StockController controller = new StockController(new StockRepositoryImpl());

		assertFalse(controller.needMoreItemsInShop("north shop", "table"));
		assertTrue(controller.needMoreItemsInShop("north shop", "lamp"));

	}

}
