public class RollerCoaster extends Attraction implements ISecurity, IReviewed, ITicketed{

	private int rating;
	private double price;

	public RollerCoaster(String name, Integer rating, Double price) {
		super(name);
		this.rating = rating;
		this.price = price;
	}

	public boolean isAllowedTo(Visitor visitor){
		boolean allowed = true;
		if (visitor.getAge() < 13 || visitor.getHeight() < 146){
			allowed = false;
		}
		return allowed;
	}

	@Override
	public int getRating() {
		return this.rating;
	}

	public void setRating(Integer review){
		this.rating = review;
	}

	public double defaultPrice(){
		return this.price;
	}

	@Override
	public double priceFor(Visitor visitor) {
		return 0;
	}
}