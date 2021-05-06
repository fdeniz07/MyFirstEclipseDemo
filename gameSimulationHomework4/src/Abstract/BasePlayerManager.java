package Abstract;

import Entities.Player;

public abstract class BasePlayerManager implements IPlayerService {

	@Override
	public void add(Player player) {
		System.out.println("Oyuncu eklendi : " + player.getFirstName() + " " + player.getLastName());

	}

	@Override
	public void delete(Player player) {
		System.out.println("Oyuncu silindi : " + player.getFirstName() + " " + player.getLastName());

	}

	@Override
	public void update(Player oldPlayer, Player player) {
		oldPlayer.setId(player.getId());
		oldPlayer.setNationalIdentity(player.getNationalIdentity());
		oldPlayer.setBirthYear(player.getBirthYear());
		oldPlayer.setFirstName(player.getFirstName());
		oldPlayer.setLastName(player.getLastName());
		oldPlayer.setEmail(player.getEmail());

		System.out.println("Oyuncu gŁncellendi");

	}

}
