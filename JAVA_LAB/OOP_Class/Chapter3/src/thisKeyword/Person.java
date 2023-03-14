package thisKeyword;

public class Person {
	
	private String name;
	private int age;
	
	public Person() {
		this("이름없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] agrs) {
		Person person = new Person();
		System.out.println(person.name); // 이름없
		System.out.println(person.age); // 1
		
		System.out.println(person.getPerson());
	}

}
