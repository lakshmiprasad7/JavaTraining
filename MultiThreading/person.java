package MultiThreading;

import java.io.Serializable;

public class person implements Serializable {
private String name;
private int age;
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
public person(String name, int age) {
	super();
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "person [name=" + name + ", age=" + age + "]";
}

}
