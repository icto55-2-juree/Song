package Person;

public class Student extends Person {

	public Student() {
		System.out.println("call Student()");
	}

	public Student(int age, String name, int height, int weight) {
		super(age, name, height, weight);
	}

	public void set() {
	      age = 30;
	      name = "홍길동";
	      height = 175;
	//      weight = 65;
	   }

	   public static void main( String[] args ) {
	      Student s = new Student();
	      s.set();
	   }
	   
}
