
public class UserManager implements UserService{

	@Override
	public void add(User user) {
		System.out.println("Kullanıcı eklendi: "+user.firstName+" "+user.lastName);
		
	}

	@Override
	public void remove(User user) {
		System.out.println("Kullanıcı silindi: "+user.firstName+" "+user.lastName);
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı güncellendi: "+user.firstName+" "+user.lastName);
		
	}

}
