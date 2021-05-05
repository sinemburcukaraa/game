
public class campaignManager implements campaignService{
	
    @Override
    public void add(campaign campaign) {
		System.out.println(campaign.getCampaignRate()+" indirimli  ve " + campaign.getCampaignName()+" adlý kampanya eklenmiþtir ");
	}
    
    @Override
    public void update(campaign campaign) {
    	System.out.println(campaign.getCampaignRate()+" indirimli  ve " + campaign.getCampaignName()+" adlý kampanya güncellenmiþtir ");
	}
    @Override
    public void delete(campaign campaign) {
    	System.out.println(campaign.getCampaignRate()+" indirimli  ve " + campaign.getCampaignName()+" adlý kampanya silinmiþtir ");
	}

}
