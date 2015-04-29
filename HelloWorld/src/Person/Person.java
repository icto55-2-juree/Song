package Person;
public class Person {
	int age;
	public String name;
	protected int height;
	private int weight;

	public void a(){
		weight = 100;
	}
	
	public Person() {
		System.out.println("call Person()");
	}

	public Person(int age, String name, int height, int weight) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
