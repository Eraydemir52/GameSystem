
public class UserManager implements UserService{

	@Override
	public void add(User user) {
		System.out.println("Kullan�c� eklendi: "+user.firstName+" "+user.lastName);
		
	}

	@Override
	public void remove(User user) {
		System.out.println("Kullan�c� silindi: "+user.firstName+" "+user.lastName);
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� g�ncellendi: "+user.firstName+" "+user.lastName);
		
	}

}
