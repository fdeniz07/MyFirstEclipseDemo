package Concrete;

import Abstract.BaseSalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Order;
import Entities.Player;

public class SalesManager extends BaseSalesManager {

	@Override
	public void buy(Game game, Campaign campaign, int orderId, Player player) {
		
		if (player.getWallet()>game.getPrice()) {
			System.out.println(game.getName() + " oyununu satin aldiniz");
		}else {
			System.out.println("Bakiyeniz yetersiz: " + player.getWallet());
		}

		
		double amountToBePaid = game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100);

		Order order = new Order();
		double discountedGamePrice = game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100);
		order.setAmountToBePaid(discountedGamePrice);
		double availableBalance = player.getWallet() - discountedGamePrice;

		System.out.println("Sayin " + player.getFullName() + ", " + campaign.getName() + " kampanyasi uygulandi. "
				+ game.getName() + " oyununun fiyati " + amountToBePaid + "€ olarak hesaplandi. \n Bakiyeniz: "
				+ availableBalance);

	}

}
