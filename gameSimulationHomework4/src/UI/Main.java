package UI;

import java.rmi.RemoteException;
import java.time.LocalDate;

import Abstract.BaseCampaignManager;
import Abstract.BaseGameManager;
import Abstract.BaseOrderManager;
import Abstract.BasePlayerManager;
import Abstract.BaseSalesManager;
import Abstract.IOrderService;
import Abstract.IPlayerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.PlayerCheckManager;
import Concrete.PlayerManager;
import Concrete.SalesManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Order;
import Entities.Player;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {

		System.out.println("\n  Oyuncu Bilgileri :");

		BasePlayerManager playerManager = new PlayerManager(new MernisServiceAdapter());
		playerManager.add(new Player(1, 16807467000L, 1986, "Fatih", "Deniz", 500, "deniz.fatih@hotmail.de"));
		playerManager.add(new Player(2, 28861499108L, 1985, "Engin", "Demiroğ", 1000, "engindemirog@engin.com"));

		System.out.println("\n  Oyun Bilgileri :");

		BaseGameManager gameManager = new GameManager();
		gameManager.add(new Game(1, 1, "Subnautica : Below Zero", "Macera", 29.99, 1));
		gameManager.add(new Game(2, 1, "Red Alert", "Strateji", 59.99, 1));
		gameManager.add(new Game(3, 2, "Anno 2205", "Strateji", 39.99, 1));
		gameManager.add(new Game(4, 2, "No Man's Sky", "Aksiyon", 54.99, 1));

		System.out.println("\n  Kampanya Bilgileri :");

		BaseCampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1, "Ilkbahar Kampanyasi", "Tüm oyunlarda %40 indirim",
				LocalDate.of(2021, 04, 01), LocalDate.of(2021, 04, 30), 40, true));
		campaignManager.add(new Campaign(2, "Yaz Kampanyasi", "Tüm oyunlarda %50 indirim", LocalDate.of(2021, 07, 01),
				LocalDate.of(2021, 07, 30), 50, false));
		campaignManager.add(new Campaign(3, "Sonbahar Kampanyasi", "Tüm oyunlarda %30 indirim",
				LocalDate.of(2021, 9, 01), LocalDate.of(2021, 9, 30), 30, false));
		campaignManager.add(new Campaign(4, "Yilbasi Kampanyasi", "Tüm oyunlarda %50 indirim",
				LocalDate.of(2021, 12, 20), LocalDate.of(2021, 12, 31), 50, false));

		System.out.println("\n  Siparis Bilgileri :");

		IOrderService orderService = new OrderManager();
		orderService.add(new Game(1, 1, "Subnautica : Below Zero", "Macera", 29.99, 1), 500);


		System.out.println("\n  Satis Bilgileri :");

		BaseSalesManager salesManager = new SalesManager();
		// salesManager.buy(player1, 1, 1);
		// Order oa = new Order(1, 54.99, 40);
		// orderManager.add(oa);
		// oa.Oyuncu(new Player(1, 16807467380L, 1986, "Fatih", "Deniz", 500,
		// "deniz.fatih@hotmail.de"));

	}

}
