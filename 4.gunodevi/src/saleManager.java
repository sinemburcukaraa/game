
public class saleManager implements saleService{
	
 @Override
 public void sale(gamer gamer,campaign campaign ,Game game) {
	 System.out.println(gamer.getFirstName() + " adl� oyuncu " + game.getName() +"  oyununu" 
 +campaign.getCampaignName() + "  kampanyayla oyunu sat�n ald�"); 
	 System.out.println(campaign.getCampaignRate() + " indirim uyguland�");
	 
 }
}
