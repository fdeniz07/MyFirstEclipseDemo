package Concrete;

import Abstract.BaseOrderManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Order;
import Entities.Player;

public class OrderManager extends BaseOrderManager {

	@Override
	public void add(Order order) {

	}
	
	public void add2(Game game, Campaign campaign, int orderId, Player player) {
		
		Order order = new Order();
		order.setId(orderId);
		order.setId(campaign.getId());
		order.setDiscount(campaign.getDiscount());
		order.setPlayer(player.getFirstName() + player.getLastName());
		order.setGame(game.getName());
		order.setTotalAmount(game.getPrice());

		/*
		 * double discountedGamePrice = game.getPrice() - (game.getPrice() *
		 * campaign.getDiscount() / 100); order.setAmountToBePaid(discountedGamePrice);
		 * double availableBalance = player.getWallet() - discountedGamePrice;
		 */
		//orderService.add(order);
	}

	@Override
	public void delete(Order order) {
	}

	@Override
	public void update(Order oldOrder, Order order) {
	}

}
