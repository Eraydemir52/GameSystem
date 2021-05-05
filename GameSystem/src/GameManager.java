
public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi: "+game.name);
		
	}

	@Override
	public void remove(Game game) {
		System.out.println("Oyun silindi: "+game.name);
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Oyun güncellendi: "+game.name);
		
	}

}
