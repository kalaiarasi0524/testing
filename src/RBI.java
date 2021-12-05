
abstract class RBI {
	int ROI = 4;
	int setParentVal;
	
	public RBI(int val) {
		setParentVal = val;
	}
	
	public void getROI() {
		System.out.println("ROI for RBI is" + ROI);
	}
	
	abstract void notImplemented(); 
}
