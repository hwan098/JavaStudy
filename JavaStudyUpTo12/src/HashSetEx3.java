import java.util.*;

public class HashSetEx3 {

	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 25));
		set.add(new Person("David", 25));
		System.out.println(set);

	}
}

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + " : " + age;
	}
}
