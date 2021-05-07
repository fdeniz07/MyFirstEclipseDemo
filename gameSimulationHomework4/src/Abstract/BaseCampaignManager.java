package Abstract;


import Entities.Campaign;

public abstract class BaseCampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		
		String isActive;
		if (campaign.isCampaignStatus()) {
			isActive="Aktif";
		}
		else {
			isActive="Pasif";
		}
		
		System.out.println("Yeni kampanya eklendi: " + campaign.getName() + " : " + campaign.getDescription() + " - " + "Durumu: " + isActive);	
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya silindi : " + campaign.getName());
		
	}

	@Override
	public void update(Campaign oldCampaign, Campaign campaign) {
		oldCampaign.setId(campaign.getId());
		oldCampaign.setName(campaign.getName());
		oldCampaign.setDiscount(campaign.getDiscount());
		oldCampaign.setDescription(campaign.getDescription());
		oldCampaign.setCampaignStartDate(campaign.getCampaignStartDate());
		oldCampaign.setCampaignEndDate(campaign.getCampaignEndDate());
		oldCampaign.setCampaignStatus(campaign.isCampaignStatus());
		System.out.println("Kampanya güncellendi");
		
	}

}
