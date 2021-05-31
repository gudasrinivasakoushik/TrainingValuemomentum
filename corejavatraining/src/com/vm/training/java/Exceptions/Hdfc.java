package com.vm.training.java.Exceptions;

public class Hdfc implements IBankException {

	int credit;
	int balance=10000;
	
	public int credit(int credit) {
		
		this.credit = credit;
		balance=balance+credit;
		return balance;
	}
	public int debit(int debit)
	{
		
		if(debit<(balance-debit))
		{
			balance=balance-debit;
			return balance;
		}
		else if(balance>0 && balance<3500)
		{
			try
			{
				throw new  MinimumBalance("exceedes minimum balance so account under hold");
			}
			catch( MinimumBalance e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			try {
				throw new LowBalance("low balance  so account under hold");
			}
			catch(LowBalance e)
			{
				e.printStackTrace();
			}
		}
		return balance;
	}
	
	int fine=45;
	
	public int fine(int fine) {
		
		this.fine = fine;
		balance=balance-fine;
		
		try {
			throw new ChargesException("charges are added");
		}
		catch(ChargesException e)
		{
			e.printStackTrace();
		}
		
		
		return balance-fine;
		
	}



}
