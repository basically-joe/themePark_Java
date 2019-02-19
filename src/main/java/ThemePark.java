import java.util.ArrayList;

public class ThemePark implements IReviewed {

	private String name;
	private int rating;
	private ArrayList<IReviewed> ratingsList;


	public ThemePark(String name) {
		this.name = name;
		this.ratingsList = new ArrayList<>();
		this.rating = rating;
	}

	@Override
	public int getRating() {
		return this.rating;
	}

	public String getName() {
		return this.name;
	}

	public int countRatingsInArray() {
		return ratingsList.size();
	}

	public void addRatingToArray(IReviewed review){
		ratingsList.add(review);
	}

	public IReviewed getAllReviewed() {
		 return (IReviewed) this.ratingsList;
	}

}
