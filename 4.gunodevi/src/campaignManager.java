
public class campaignManager implements campaignService{
	
    @Override
    public void add(campaign campaign) {
		System.out.println(campaign.getCampaignRate()+" indirimli  ve " + campaign.getCampaignName()+" adl� kampanya eklenmi�tir ");
	}
    
    @Override
    public void update(campaign campaign) {
    	System.out.println(campaign.getCampaignRate()+" indirimli  ve " + campaign.getCampaignName()+" adl� kampanya g�ncellenmi�tir ");
	}
    @Override
    public void delete(campaign campaign) {
    	System.out.println(campaign.getCampaignRate()+" indirimli  ve " + campaign.getCampaignName()+" adl� kampanya silinmi�tir ");
	}

}
