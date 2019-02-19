public class IceCream extends Stall implements IReviewed{
	private int rating;
	public IceCream(String name, String ownerName, String parkingSpot) {
		super(name, ownerName, parkingSpot);
		int rating = 0;
	}

	@Override
	public int getRating() {
		return rating;
	}
}
