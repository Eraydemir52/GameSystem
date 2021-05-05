
public class CampaingManager implements CampaignService {

	@Override
	public void add(Campaign campaign,Game game) {
		System.out.println("Kampanya eklendi: "+campaign.getName());
		float newPrice= game.price-(game.price*(campaign.discountRate/100));
		System.out.println("Normal fiyat: "+game.price+"\tÝndirimli fiyat:"+newPrice);
		
	}

	@Override
	public void remove(Campaign campaign) {
		System.out.println("Kampanya silindi: "+campaign.name);
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi: "+campaign.name);
		
	}

}
