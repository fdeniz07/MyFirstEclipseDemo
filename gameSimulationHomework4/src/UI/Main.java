package UI;

import java.time.LocalDate;

import Abstract.BaseCampaignManager;
import Abstract.BaseGameManager;
import Abstract.BaseOrderManager;
import Abstract.BasePlayerManager;
import Abstract.BaseSellManager;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Concrete.PlayerManager;
import Concrete.SellManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Order;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n  Oyuncu Bilgileri :");

		BasePlayerManager playerManager = new PlayerManager();
		playerManager.add(new Player(1,16807467380L,1986,"Fatih","Deniz",500,"deniz.fatih@hotmail.de"));
		playerManager.add(new Player(2,28861499108L,1985,"Engin","Demiroğ",1000,"engindemirog@engin.com" ));
		
		//MernisServiceAdapter realPlayerCheck = new MernisServiceAdapter();
		//PlayerManager playerManager2 = new PlayerManager(realPlayerCheck);

		System.out.println("\n  Oyun Bilgileri :");
		
		BaseGameManager gameManager = new GameManager();
		gameManager.add(new Game(1,1,"Subnautica : Below Zero","Macera",29.99,1));
		gameManager.add(new Game(2,1,"Civilization VI","Strateji",59.99,1));
		gameManager.add(new Game(3,2,"Anno 2205","Strateji",39.99,1));
		gameManager.add(new Game(4,2,"No Man's Sky","Aksiyon",54.99,1));
		
		System.out.println("\n  Kampanya Bilgileri :");

		BaseCampaignManager campaignManager= new CampaignManager();
		campaignManager.add(new Campaign(1,"Ilkbahar Kampanyasi","Tüm oyunlarda %40 indirim",LocalDate.of(2021,04,01),LocalDate.of(2021,04,30),40,true));
		campaignManager.add(new Campaign(2,"Yaz Kampanyasi","Tüm oyunlarda %50 indirim",LocalDate.of(2021,07,01),LocalDate.of(2021,07,30),50,false));
		campaignManager.add(new Campaign(3,"Sonbahar Kampanyasi","Tüm oyunlarda %30 indirim",LocalDate.of(2021,9,01),LocalDate.of(2021,9,30),30,false));
		campaignManager.add(new Campaign(4,"Yilbasi Kampanyasi","Tüm oyunlarda %50 indirim",LocalDate.of(2021,12,20),LocalDate.of(2021,12,31),50,false));
		
		
		System.out.println("\n  Siparis Bilgileri :");
		
		BaseOrderManager orderManager = new OrderManager();
		orderManager.add(new Order(1, "aa", "bbb", 1, 30, 20, 20, true));
		
		
		System.out.println("\n  Satis Bilgileri :");
		
		//BaseSellManager sellManager = new SellManager();
		//sellManager.buy(null, null, 0, null);
		
		
		
//		BaseOrderManager orderManager1 = new OrderManager();
//		Order oa  = new Order(1,"Aaa","No Man's Sky",1,54.99,40,5,true);
//		orderManager.add(oa);
//		oa.Oyuncu(new Player(1,16807467380L,1986,"Fatih","Deniz",500,"deniz.fatih@hotmail.de"));

		
		
	}

}
