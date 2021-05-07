package Concrete;

import Abstract.BasePlayerManager;
import Abstract.IPlayerCheckService;
import Entities.Player;

public class PlayerManager extends BasePlayerManager {

	IPlayerCheckService checkRealPlayer;

	public PlayerManager(IPlayerCheckService checkRealPlayer) {
		this.checkRealPlayer = checkRealPlayer;
	}

	@Override
	public void add(Player player)  {

		if (checkRealPlayer.CheckIfRealPerson(player)) {
			System.out.println("Oyuncu eklendi : " + player.getFullName());
		} else {
			System.out.println(
					"Oyuncu kimlik dogrulama basarisiz : " + player.getFullName());
		}

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

		System.out.println("Oyuncu güncellendi");

	}
	
}
