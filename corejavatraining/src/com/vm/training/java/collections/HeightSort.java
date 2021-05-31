package com.vm.training.java.collections;

import java.util.Comparator;

public class HeightSort  implements Comparator<Wrestler >{

	@Override
	public int compare(Wrestler o1, Wrestler o2) {
		if(o1.getHeight()==o2.getHeight())
		{
			return 0;
		}
		else if(o1.getHeight()>o2.getHeight())
		{
			return 1;
		}
		else
		{
		return -1;
		}
	}

	
}
