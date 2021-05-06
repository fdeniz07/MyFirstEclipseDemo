package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface ISellService {
	
	void buy(Game game, Campaign campaign, int Id, Player player);
}
