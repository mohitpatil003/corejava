//
package demo;

public class Student {
	private int id;
	protected String name;
	float per;
	
	public Student() {
		System.out.println("Default constructor");
	}
	
	public Student(int id, String name, float per) {
		this();
		this.id = id;
		this.name = name;
		this.per = per;
		
		System.out.println("Parameterized constructor");
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id  = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getPer() {
		return per;
	}
	
	public void setPer(float per) {
		this.per = per;
	}
	
	@Override
	public String toString() {
		return "Student [id = " + id + ", name = " + name + ", per = " + per + "]";
	}
}
