
public class BudgetHome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TestOOPSConcept testOOPS =new TestOOPSConcept();
		//testOOPS.ShowWelcomeMessage("Rajeshkumar Govindaraj");
		//testOOPS.ShowWelcomeMessage("Rajeshkumar","Govindaraj");
		//testOOPS.ShowWelcomeMessage("Rajeshkumar","T","Govindaraj");
		//RBI oRBI = new RBI(5);
		//oRBI.getROI();
		
		SBI oSBI = new SBI(6);
		oSBI.getROI();
		oSBI.getParentROI();
		System.out.println(oSBI.setParentVal);
	}

	
	
}
