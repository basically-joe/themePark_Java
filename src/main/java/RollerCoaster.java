public class RollerCoaster extends Attraction implements ISecurity{

	public RollerCoaster(String name) {
		super(name);
	}

	public boolean isAllowedTo(Visitor visitor){
		boolean allowed = true;
		if (visitor.getAge() < 13 || visitor.getHeight() < 146){
			allowed = false;
		}
		return allowed;
	}

}
