package com.vm.training.java.Exceptions;
class Training{
	void train()throws Exception
	{
		System.out.println("no knowledge");
	}
	void trainAllSubjects()throws Exception
	{
		specificTraining();
		System.out.println("can train all subjects");
	}
	void specificTraining()throws Exception
	{
		train();
		System.out.println("can only train on java and angular");
	}
}
public class ThrowsTest {
public static void main(String[] args)throws Exception {
	Training training =new Training();
	//try
	//{
training.train();
//	}
//	catch(Exception e)
	//{
	//	e.printStackTrace();
	//}
}
}
