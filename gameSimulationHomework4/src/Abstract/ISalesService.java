package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface ISalesService {
	
	void buy(Game game , Campaign campaign , int orderId, Player player);
}
