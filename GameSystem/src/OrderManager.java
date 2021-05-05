
public class OrderManager  implements OrderService{

	@Override
	public void add(Order order,Campaign campaign,Game game) {
		System.out.println("Sipariþ eklendi:"+order.id);
		float newPrice= game.price-(game.price*(campaign.discountRate/100));
		System.out.println("Normal fiyat: "+game.price+"\tÝndirimli fiyat:"+newPrice);
		
	}

	@Override
	public void update(Order order) {
		System.out.println("Sipariþ silindi:"+order.id);
		
	}

	@Override
	public void delete(Order order) {
		System.out.println("Sipariþ güncellendi:"+order.id);
		
	}

}
