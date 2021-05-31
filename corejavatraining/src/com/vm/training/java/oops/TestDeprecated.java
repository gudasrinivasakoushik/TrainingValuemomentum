package com.vm.training.java.oops;
class Dep
{
	@Deprecated
	void show()
	{
		System.out.println("i am deprecated");
	}
}
public class TestDeprecated {
public static void main(String[] args) {
	Dep dep=new Dep();
	dep.show();
}
}
