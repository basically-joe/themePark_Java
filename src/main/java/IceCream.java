public class IceCream extends Stall implements IReviewed{

	private int rating;

	public IceCream(String name, String ownerName, String parkingSpot, Integer rating) {

		super(name, ownerName, parkingSpot);
		this.rating = 0;

	}

	@Override
	public int getRating() {
		return this.rating;
	}
}
