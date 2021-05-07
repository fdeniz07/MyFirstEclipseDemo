package Abstract;

import Entities.Game;
import Entities.Order;
import Entities.Player;


public interface IOrderService {
	//void add(Order order);
	void delete(Order order);
	void update(Order oldOrder,Order order);
	void add(Game game, double wallet);
}
