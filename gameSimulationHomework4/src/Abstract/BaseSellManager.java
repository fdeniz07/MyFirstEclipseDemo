package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Order;
import Entities.Player;

public abstract class BaseSellManager implements ISellService{
	
	/*
	 * IOrderService orderService;
	 * 
	 * public SellManager() {
	 * 
	 * }
	 * 
	 * public SellManager(IOrderService orderService) { this.orderService =
	 * orderService; }
	 */
	
	
	
	@Override
	public void buy(Game game, Campaign campaign, int orderId, Player player) {

		Order order = new Order();

		order.setId(orderId);
		order.setId(campaign.getId());
		order.setDiscount(campaign.getDiscount());
		order.setPlayer(player.getFirstName() + player.getLastName());
		order.setGame(game.getName());
		order.setTotalAmount(game.getPrice());

		double discountedGamePrice = game.getPrice() - (game.getPrice() * campaign.getDiscount() / 100);
		order.setAmountToBePaid(discountedGamePrice);
		double availableBalance = player.getWallet() - discountedGamePrice;
		//orderService.add(order);

		System.out.println("Your Wallet is : " + player.getWallet());
		System.out.println("\n Amount to be paid : " + discountedGamePrice);
		System.out.println("\n Your available balance is : " + availableBalance);
	}
}
