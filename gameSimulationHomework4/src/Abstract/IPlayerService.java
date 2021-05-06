package Abstract;

import Entities.Player;

public interface IPlayerService {
	void add(Player player);
	void delete(Player player);
	void update(Player oldPlayer , Player player);
}
