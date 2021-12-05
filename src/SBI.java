
public class SBI extends RBI {
	
	public SBI(int val) {
		super(val);
	}
	
	public void getROI() {
		System.out.println("ROI for SBI is" + 25);
	}
	
	public void getParentROI() {
		super.getROI();
	}
	
	public void notImplemented() {
		
	}
}
