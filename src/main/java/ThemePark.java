import java.util.ArrayList;
import java.util.HashMap;

public class ThemePark implements IReviewed {

	private String name;
	private int rating;
	private ArrayList<IReviewed> ratingsList;
	private Stall stall;
	private Attraction attraction;
	private Visitor visitor;
	private HashMap visitorAttraction;


	public ThemePark(String name) {
		this.name = name;
		this.ratingsList = new ArrayList<>();
		this.rating = rating;
		this.attraction = attraction;
		this.stall = stall;
		this.visitor = visitor;
		this.visitorAttraction = new HashMap();
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

	public ArrayList<IReviewed> getAllReviewed() {
		 return this.ratingsList;
	}

	public HashMap visitor(Visitor visitor, Attraction attraction) {
		this.visitorAttraction.put(visitor.getName(), attraction.getName());
		return this.visitorAttraction;
	}
}
