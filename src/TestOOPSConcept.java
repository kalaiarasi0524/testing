
public class TestOOPSConcept {
	public void ShowWelcomeMessage(String userName) {
		System.out.println("Calling first Method");
		System.out.println("Hello" + userName);
	}
	
	public void ShowWelcomeMessage(String firstName, String lastName) {
		System.out.println("Calling second Method");
		String userName = firstName + " " + lastName;
		System.out.println("Hello" + userName);	
	}
	
	public void ShowWelcomeMessage(String firstName,String middleName, String lastName) {
		System.out.println("Calling third Method");
		String userName = firstName + " " +middleName+" "+ lastName;
		System.out.println("Hello" + userName);	
	}
}

