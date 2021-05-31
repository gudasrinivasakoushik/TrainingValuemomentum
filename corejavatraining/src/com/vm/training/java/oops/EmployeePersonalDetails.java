package com.vm.training.java.oops;

public class EmployeePersonalDetails extends EmployeeDetails {
	String nationality;

	public EmployeePersonalDetails(int Empid, String Ename, String Dept, String emailid, String mobile, String address,
			String nationality) {
		super(Empid, Ename, Dept, emailid, mobile, address);
		this.nationality = nationality;
	}
	/*public String toString() {
		return Empid+" "+Ename+" "+Dept+" "+emailid+" "+mobile+" "+address+" "+nationality;
		
	}*/
	
public static void main(String[] args) {
	EmployeePersonalDetails emPerDet=new EmployeePersonalDetails(0, "a", "b", "c", "d", "e", "f");
	System.out.println(emPerDet);
}

@Override
public String toString() {
	return "EmployeePersonalDetails [nationality=" + nationality + ", emailid=" + emailid + ", mobile=" + mobile
			+ ", address=" + address + ", Empid=" + Empid + ", Ename=" + Ename + ", Dept=" + Dept + "]";
}
}
