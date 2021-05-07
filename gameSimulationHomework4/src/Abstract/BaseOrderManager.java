package Abstract;

import Entities.Game;
import Entities.Order;
import Entities.Player;

public abstract class BaseOrderManager implements IOrderService {

	@Override
	public void add(Game game,double wallet) {
		
		//System.out.println(game.getName() + ":" + game.getPrice() + " ürün sepete eklenmistir\n" + "Toplam Bakiyeniz: " + player.getWallet());
			
		//System.out.println("Siparisiniz tamamlandi : "+ order.getPlayer() + " " + order.getCampaignId()	+ " id'li kampanyadan " + order.getGame() + " oyununu siparis ettiniz.");
		//System.out.println("Ödemeniz gereken tutar : " + order.getAmountToBePaid() + "€" );
	}

	@Override
	public void delete(Order order) {
		System.out.println(
				order.getId() + " no'lu siparisiniz iptal edildi. Iade edilcek tutar : " + order.getAmountToBePaid());

	}

	public void update(Order oldOrder, Order order) {

		/*
		 * oldOrder.setAmountToBePaid(order.getAmountToBePaid());
		 * oldOrder.setCampaignId(order.getCampaignId());
		 * oldOrder.setDiscount(order.getDiscount()); oldOrder.setGame(order.getGame());
		 * oldOrder.setPlayer(order.getPlayer()); oldOrder.setId(order.getId());
		 * oldOrder.setTotalAmount(order.getTotalAmount());
		 * System.out.println("Siparis güncellendi.");
		 */
	}

}
