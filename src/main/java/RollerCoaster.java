public class RollerCoaster extends Attraction implements ISecurity, IReviewed{

	private int rating;

	public RollerCoaster(String name, Integer rating) {
		super(name);
		this.rating = 0;

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
}