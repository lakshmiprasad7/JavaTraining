package HMSystem;

public class Patient {
//	adding all columns as  instance members
private int id;
private String fname;
private String lname;
private int age;
private String gender;
private String contact_number;
public Patient(int id,String fname, String lname, int age, String gender, String contact_number) {
	super();
	this.id = id;
	this.fname = fname;
	this.lname = lname;
	this.age = age;
	this.gender = gender;
	this.contact_number = contact_number;
}
@Override
public String toString() {
    return "Patient [ID=" + id + ", First Name=" + fname + ", Last Name=" + lname + 
           ", Age=" + age + ", Gender=" + gender + ", Contact Number=" + contact_number + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getContact_number() {
	return contact_number;
}
public void setContact_number(String contact_number) {
	this.contact_number = contact_number;
}

}
