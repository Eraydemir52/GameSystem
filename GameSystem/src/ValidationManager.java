
public class ValidationManager implements ValidationService {

	
	public void validate(User user) {
		System.out.println("Do�rulanma tamamland�: "+user.getFirstName()+user.getLastName());
		
	}

}
