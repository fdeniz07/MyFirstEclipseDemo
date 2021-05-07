package Abstract;

import Entities.Game;

public abstract class BaseGameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi : " + game.getName() + " : " + game.getPrice() +"€");

	}

	@Override
	public void delete(Game game) {
		System.out.println("Oyun silindi : " + game.getName());

	}

	@Override
	public void update(Game oldGame, Game game) {

		oldGame.setId(game.getId());
		oldGame.setName(game.getName());
		oldGame.setGameType(game.getGameType());
		oldGame.setPrice(game.getPrice());
		System.out.println("Oyun güncellendi");

	}
}
