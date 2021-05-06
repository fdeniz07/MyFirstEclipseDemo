package Abstract;

import Entities.Game;

public interface IGameService {
	void add(Game game);
	void delete(Game game);
	void update(Game oldGame , Game game);
}
