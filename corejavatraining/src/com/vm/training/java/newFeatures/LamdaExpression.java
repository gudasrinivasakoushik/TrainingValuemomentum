package com.vm.training.java.newFeatures;

interface Test
{
	void display();
	
}




public class LamdaExpression {
	
public static void main(String[] args) {

	Test t=()->
	{
		System.out.println("hello");
		System.out.println("java");
	};
	t.display();
	Test t1=()->System.out.println("hello single line body");
	t1.display();
}

}
