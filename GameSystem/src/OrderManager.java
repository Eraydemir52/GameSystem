
public class OrderManager  implements OrderService{

	@Override
	public void add(Order order,Campaign campaign,Game game) {
		System.out.println("Sipari� eklendi:"+order.id);
		float newPrice= game.price-(game.price*(campaign.discountRate/100));
		System.out.println("Normal fiyat: "+game.price+"\t�ndirimli fiyat:"+newPrice);
		
	}

	@Override
	public void update(Order order) {
		System.out.println("Sipari� silindi:"+order.id);
		
	}

	@Override
	public void delete(Order order) {
		System.out.println("Sipari� g�ncellendi:"+order.id);
		
	}

}
