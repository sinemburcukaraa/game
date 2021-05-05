
public class gameManager implements gameService{
	@Override
	 public void add(Game game) {
      System.out.println(game.getName() + " Baþarýyla eklendi");
	}
	
	@Override
	 public void update(Game game) {
     System.out.println(game.getName() + " Baþarýyla güncellendi");
	}
	
	@Override
	 public void delete(Game game) {
     System.out.println(game.getName() + " Baþarýyla silindi");
	}
	
	@Override
	public void discount(Game game, campaign campaign) {
		double discount =game.getPrice() - (game.getPrice() * campaign.getCampaignRate())/100;
		System.out.println( "indirimli fiyatý : " + discount );
	}
	

}
