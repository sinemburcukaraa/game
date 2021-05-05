
public class Main {

	public static void main(String[] args) {
          gamer gamer=new gamer("burcu", "kara", "123456789", 2000);
          gamerManager gamerManager=new gamerManager();
          gamerManager.login(gamer);
          gamerManager.delete(gamer);
          gamerManager.login(gamer);
          
          campaign campaign=new campaign(1,"bahar indirimi ",30.0);
          campaignManager campaignManager =new campaignManager();
          campaignManager.add(campaign);
          campaignManager.delete(campaign);
          campaignManager.update(campaign);
          
          Game game=new Game(1, "101 okey plus", 100);
          gameManager gameManager=new gameManager();
          gameManager.add(game);
          gameManager.delete(game);
          gameManager.discount(game, campaign);
          
          saleManager saleManager=new saleManager();
          saleManager.sale(gamer, campaign, game);
          
          validationManager validationManager=new validationManager();
          validationManager.validate(gamer);
	}

}
