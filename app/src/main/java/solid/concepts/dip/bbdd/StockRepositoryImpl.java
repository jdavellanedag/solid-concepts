package solid.concepts.dip.bbdd;

import solid.concepts.dip.business.StockRepository;

public class StockRepositoryImpl implements StockRepository {

	@Override
	public int getStock(String shop, String product) {
		return DataBase.stocks.get(shop).get(product);
	}
}
