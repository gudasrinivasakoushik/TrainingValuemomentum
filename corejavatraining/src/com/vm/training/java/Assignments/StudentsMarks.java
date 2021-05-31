package com.vm.training.java.Assignments;

public class StudentsMarks {
private int subject1;
private int subject2;
private int subject3;
private int subject4;

/*public StudentsMarks(int subject1, int subject2, int subject3, int subject4) {
	super();
	this.subject1 = subject1;
	this.subject2 = subject2;
	this.subject3 = subject3;
	this.subject4 = subject4;
}*/
public int getSubject1() {
	return subject1;
}
public void setSubject1(int subject1) {
	this.subject1 = subject1;
}
public int getSubject2() {
	return subject2;
}
public void setSubject2(int subject2) {
	this.subject2 = subject2;
}
public int getSubject3() {
	return subject3;
}
public void setSubject3(int subject3) {
	this.subject3 = subject3;
}
public int getSubject4() {
	return subject4;
}
public void setSubject4(int subject4) {
	this.subject4 = subject4;
}
@Override
public String toString() {
	return "StudentsMarks [subject1=" + subject1 + ", subject2=" + subject2 + ", subject3=" + subject3 + ", subject4="
			+ subject4 + "]";
}






}
