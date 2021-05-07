package Abstract;

import Entities.Player;

public interface IPlayerService {
	void add(Player player) throws Exception;
	void delete(Player player);
	void update(Player oldPlayer , Player player);
}
