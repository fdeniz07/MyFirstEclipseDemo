package Abstract;

import Entities.Order;

public abstract class BaseOrderManager implements IOrderService {

	@Override
	public void add(Order order) {
		System.out.println("Siparisiniz tamamlandi : ");
	//+ order.getPlayer() + " " + order.getCampaignId()	+ " idli kampanyadan " + order.getGame() + " oyununu satin aldiniz.");
		System.out.println("Ödemeniz gereken tutar : " + order.getAmountToBePaid());
	}

	@Override
	public void delete(Order order) {
		System.out.println(
				order.getId() + " no'lu siparisiniz iptal edildi. Iade edilcek tutar : " + order.getAmountToBePaid());

	}

	public void update(Order oldOrder, Order order) {

		oldOrder.setAmountToBePaid(order.getAmountToBePaid());
		oldOrder.setCampaignId(order.getCampaignId());
		oldOrder.setDiscount(order.getDiscount());
		oldOrder.setGame(order.getGame());
		oldOrder.setPlayer(order.getPlayer());
		oldOrder.setId(order.getId());
		oldOrder.setTotalAmount(order.getTotalAmount());
		System.out.println("Siparis güncellendi.");

	}

}
