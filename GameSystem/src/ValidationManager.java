
public class ValidationManager implements ValidationService {

	
	public void validate(User user) {
		System.out.println("Doðrulanma tamamlandý: "+user.getFirstName()+user.getLastName());
		
	}

}
