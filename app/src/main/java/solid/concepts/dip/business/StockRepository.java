package solid.concepts.dip.business;

public interface StockRepository {
  int getStock(String shop, String product);
}
