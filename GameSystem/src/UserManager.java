
public class UserManager implements UserService{

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý eklendi: "+user.firstName+" "+user.lastName);
		
	}

	@Override
	public void remove(User user) {
		System.out.println("Kullanýcý silindi: "+user.firstName+" "+user.lastName);
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý güncellendi: "+user.firstName+" "+user.lastName);
		
	}

}
