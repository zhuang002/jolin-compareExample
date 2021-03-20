import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// example of interface
		GroupOfPeople group=new GroupOfPeople(5);
		Person person=new Person("jolin");
		
		showActivities(group);
		showActivities(person);
		
		//example for compareTo
		Integer a=0;
		Integer b=0;
		
		if (a>b) {
			System.out.println("a is larger than b");
		}
		
		if (a.compareTo(b)>0) {
			System.out.println("a is larger than b");
		}
		
		Double d1=0.0;
		Double d2=0.0;
		if (d1.compareTo(d2)>0) {
			System.out.println("d1 is larger than d2");
		}
		
		String s1="ab";
		String s2="AB";
		if (s1.compareTo(s2)>0) {
			System.out.println("s1 is larger than s2");
		}
		
		Boolean b1=true;
		Boolean b2=false;
		if (b1.compareTo(b2)>0) {
			System.out.println("b1 is larger than b2");
		}
		
		ArrayList a1=new ArrayList();
		ArrayList a2=new ArrayList();
		// ArrayList does not have compareTo method
		
		ArrayList<Student> students=new ArrayList<>();
		students.add(new Student(100,"derek",12));
		students.add(new Student(2,"mark",10));
		students.add(new Student(1,"jolin",11));
		
		
		
		Collections.sort(students);
		for (Student student:students) {
			System.out.print(student+" ");
		}
		System.out.println();
		
		Collections.sort(students, (x,y)->x.name.compareTo(y.name));
		for (Student student:students) {
			System.out.print(student+" ");
		}
		System.out.println();
		Collections.sort(students, (x,y)->x.grade-y.grade);
		for (Student student:students) {
			System.out.print(student+" ");
		}
		System.out.println();
		
	}

	/*private static void showActivities(Person person) {
		// TODO Auto-generated method stub
		person.sing();
		person.dance();
		person.run();
	}*/

	private static void showActivities(Activity act) {
		// TODO Auto-generated method stub
		act.sing();
		act.dance();
		act.run();
	}

}


interface Activity {
	void sing();
	void dance();
	void run();
}

class GroupOfPeople implements Activity {
	int numOfPeople;
	
	public GroupOfPeople(int n) {
		this.numOfPeople=n;
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println(this.numOfPeople+" people are singing");
		
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println(this.numOfPeople+" people are dancing");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.numOfPeople+" people are running");
		
	}
	
	
}

class Person implements Activity {
	String name;
	
	public Person(String n) {
		this.name=n;
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println(this.name+ "is singing");
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println(this.name+ "is dancing");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(this.name+ "is running");
	}
	
	
	
}


/* 1. interface: Comparable interface 
 * 		interface is a protocal, which is to define a set of methods.
 */

class Student implements Comparable<Student> {
	int id=0;
	String name=null;
	int grade=6;
	
	public Student(int id, String nm, int grd) {
		this.id=id;
		name=nm;
		this.grade=grd;
	}

	@Override
	public int compareTo(Student stu) {
		// TODO Auto-generated method stub
		return this.id-stu.id;
	}
	
	@Override
	public String toString() {
		return "{"+this.id+","+this.name+","+this.grade+"}";
	}
}
