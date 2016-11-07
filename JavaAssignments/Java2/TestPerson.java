
class Person{
	protected String myName ;
	protected int myAge;
	protected String myGender;
	Person(String name,int age,String gender){
		myName = name;
		myAge = age;
		myGender= gender;
	}
	public String toString(){
		return (""+myName + ", age: "+ myAge +", gender: "+myGender+"");
	}
	public String getMyName() {
		return myName;
	}
	public void setMyName(String myName) {
		this.myName = myName;
	}
	public int getMyAge() {
		return myAge;
	}
	public void setMyAge(int myAge) {
		this.myAge = myAge;
	}
	public String getMyGender() {
		return myGender;
	}
	public void setMyGender(String myGender) {
		this.myGender = myGender;
	}
}
class Student extends Person{
	protected String myIdNum;
	protected double myGPA;
    Student(String name,int age,String gender,String idNum,double gpa){
    	super(name,age,gender);
    	myIdNum = idNum;
    	myGPA = gpa;
    	}
	public String getMyIdNum() {
		return myIdNum;
	}
	public void setMyIdNum(String myIdNum) {
		this.myIdNum = myIdNum;
	}
	public double getMyGPA() {
		return myGPA;
	}
	public void setMyGPA(double myGPA) {
		this.myGPA = myGPA;
	}
}
class Teacher extends Person{
	protected String subject;
	protected double salary;
	public Teacher(String name,int age,String gender,String subject,double salary){
		/*super.setMyAge(age);
    	super.setMyGender(gender);
    	super.setMyName(name);*/
		super(name,age,gender);
    	this.subject=subject;
    	this.salary=salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString(){
		return (super.toString()+",Subject :"+subject+" Salary : Rs"+salary);
	}
}
class CollegeStudent extends Student{
	String major;
	int year;
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	CollegeStudent(String myName,int myAge,String myGender,String myIdNum,double myGPA,int year,String major){
		super(myName,myAge,myGender,myIdNum,myGPA);
		this.major=major;
		this.year=year;
	}
	public String toString(){
		return (super.toString()+",Year :"+year+" Major : Rs"+major);
	}
}
public class TestPerson {
	public static void main(String args[]){
		Person bob =new Person("Coach Bob",27,"M");
		System.out.println(bob);
		Student lynne =new Student("Lynne Brooke",16,"F","HS95129",3.5);
		System.out.println(lynne);
		Teacher mrJava =new Teacher("Duke Java", 34, "M","Computer Science",50000);
		System.out.println(mrJava);
		CollegeStudent ima =new CollegeStudent("Ima Frosh",18,"F","UCB123", 4.0, 1,"English");
		System.out.println(ima);
	}
}
