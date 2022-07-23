package solid.concepts.dip.business;

public class StockController {

	private final StockRepository repository;

	public StockController(StockRepository repository) {
		this.repository = repository;
	}

	public boolean needMoreItemsInShop(String shop, String product) {
		int currentStock = repository.getStock(shop, product);

		return currentStock < product.length() * 100;
	}

}
