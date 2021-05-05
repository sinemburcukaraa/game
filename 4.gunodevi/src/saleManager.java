
public class saleManager implements saleService{
	
 @Override
 public void sale(gamer gamer,campaign campaign ,Game game) {
	 System.out.println(gamer.getFirstName() + " adlý oyuncu " + game.getName() +"  oyununu" 
 +campaign.getCampaignName() + "  kampanyayla oyunu satýn aldý"); 
	 System.out.println(campaign.getCampaignRate() + " indirim uygulandý");
	 
 }
}
