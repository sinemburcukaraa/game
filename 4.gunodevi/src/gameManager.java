
public class gameManager implements gameService{
	@Override
	 public void add(Game game) {
      System.out.println(game.getName() + " Ba�ar�yla eklendi");
	}
	
	@Override
	 public void update(Game game) {
     System.out.println(game.getName() + " Ba�ar�yla g�ncellendi");
	}
	
	@Override
	 public void delete(Game game) {
     System.out.println(game.getName() + " Ba�ar�yla silindi");
	}
	
	@Override
	public void discount(Game game, campaign campaign) {
		double discount =game.getPrice() - (game.getPrice() * campaign.getCampaignRate())/100;
		System.out.println( "indirimli fiyat� : " + discount );
	}
	

}
