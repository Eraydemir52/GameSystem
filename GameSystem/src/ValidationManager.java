
public class ValidationManager implements ValidationService {

	
	public void validate(User user) {
		System.out.println("Doğrulanma tamamlandı: "+user.getFirstName()+user.getLastName());
		
	}

}
