package Abstract;

import Entities.Order;

public interface IOrderService {
	void add(Order order);
	void delete(Order order);
	void update(Order oldOrder,Order order);
}
