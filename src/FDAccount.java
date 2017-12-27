
public  class FDAccount extends Account{
public FDAccount(double amount,int noofdays,int age)
{
	amount=this.amount;
	noofdays=this.noofdays;
	age=this.age;
	
}
	int noofdays;
	int  age;
	@Override
	double calculateInterest() {
	if(amount<10000000)
	{
		if(age<60)
		{
		if(noofdays>=7&&noofdays<=14)
			interestRate=4.50/100;
		if(noofdays>=15&&noofdays<=29)
			interestRate=4.75/100;	
		if(noofdays>=30&&noofdays<=45)
			interestRate=5.5/100;
		if(noofdays>=46&&noofdays<=60)
			interestRate=7/100;	
		if(noofdays>=61&&noofdays<=184)
			interestRate=7.5/100;
		if(noofdays>=185&&noofdays<=365)
			interestRate=8.00/100;
		}
		if(age>60)
		{
		if(noofdays>=7&&noofdays<=14)
			interestRate=0.05;
		if(noofdays>=15&&noofdays<=29)
			interestRate=0.0525;	
		if(noofdays>=30&&noofdays<=45)
			interestRate=0.06;
		if(noofdays>=46&&noofdays<=60)
			interestRate=0.075;	
		if(noofdays>=61&&noofdays<=184)
			interestRate=0.08;
		if(noofdays>=185&&noofdays<=365)
			interestRate=0.085;
		}
		
	}
	if(amount>10000000)
	{
		if(noofdays>=7&&noofdays<=14)
			interestRate=6.50/100;
		if(noofdays>=15&&noofdays<=29)
			interestRate=6.75/100;	
		if(noofdays>=30&&noofdays<=45)
			interestRate=6.75/100;
		if(noofdays>=46&&noofdays<=60)
			interestRate=8/100;	
		if(noofdays>=61&&noofdays<=184)
			interestRate=8.5/100;
		if(noofdays>=185&&noofdays<=365)
			interestRate=10.00/100;
	}
		return (amount*interestRate);
	}

}
