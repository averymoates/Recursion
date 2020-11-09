
public class Cake {
	
	private int bites = 10;
	
	public Cake() {
		//Nothing to implement 
	}
	
	public void takeABite() {
		--this.bites;
		System.out.println("Ehh, could be better.");
	}
	
	public boolean isEmpty() {
		return bites==0;
		//Looks like an empty cake.
	}
	
	
}
