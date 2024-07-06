package basic10;

class Human {
	String name;
	int age;
	void eat() {
		System.out.println("밥묵자");
	}
	void sleep() {
		System.out.println("잠잘래");
	}
	
}

class Student extends Human {
	int studentID;
	void goToSchool() {
		System.out.println("등교");
	}
}

class Worker extends Human {
	int workerID;
	void goTowork() {
		System.out.println("출근");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Human h = new Human();
		h.name = "김현지";
		h.age = 11;
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.name ="김민성";
		s.age = 16;
		s.studentID = 128;
		s.eat();
		s.sleep();
		s.goToSchool();
		
		Worker w = new Worker();
		w.name = "봉윤정";
		w.age = 45;
		w.workerID = 128;
		w.eat();
		w.sleep();
		w.goTowork();
	}
}
