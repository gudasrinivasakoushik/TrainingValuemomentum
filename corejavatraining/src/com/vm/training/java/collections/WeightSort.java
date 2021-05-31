package com.vm.training.java.collections;

import java.util.Comparator;
import java.util.function.ToDoubleFunction;

public class WeightSort implements Comparator<Wrestler> {

	@Override
	public int compare(Wrestler o1, Wrestler o2) {
		// TODO Auto-generated method stub
		if(o1.getWeight()==o2.getWeight())
		{
			return 0;
		}
		else if(o1.getWeight()>o2.getWeight())
		{
			return 1;
		}
		else
		{
		return -1;
		}
	}

	

	

}
