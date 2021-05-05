

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.id=1;
		user.firstName="Eray";
		user.lastName="Demir";
		user.birthDate=2021;
		user.nationaltyId="12";
		
		Game game = new Game();
		game.id=1;
		game.name="Pes 2020";
		game.category="Spor";
		game.description=" Son sürüm";
		game.price=235;
		
		Campaign campaign = new Campaign();
		campaign.id=1;
		campaign.name="Kara cuma";
		campaign.discountRate=10.4f;
		
		Order order = new Order();
		order.id=1;
		order.gameId=1;
		order.userId=1;
		order.price=235;
		
		
		
		
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		
		System.out.println("**********************************************");
		
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		System.out.println("**********************************************");
		
		CampaingManager campaingManager = new CampaingManager();
		campaingManager.add(campaign, game);
		
		System.out.println("**********************************************");
		
		ValidationManager validationManager = new ValidationManager();
		validationManager.validate(user);
		
		System.out.println("**********************************************");

		OrderManager orderManager = new OrderManager();
		orderManager.add(order, campaign, game);
		
		
		
		
	}

}
