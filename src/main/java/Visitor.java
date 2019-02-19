public class Visitor {

	private String name;
	private int age;
	private int height;
	private double money;

	public Visitor(String name, int age, int height, double money) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}
}
