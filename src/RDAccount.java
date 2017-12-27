
public class RDAccount extends Account{
double interestRate;
double amount;
int noofmonths;
double monthlyamount;
int age;
RDAccount(double r,int m,int age1)
{
	amount=r;
	noofmonths=m;
	age=age1;
}
@Override
double calculateInterest() {
	if(age<60)
	{
		if(noofmonths==6)
	    interestRate=7.5/100;
		if(noofmonths==9)
		 interestRate=7.75/100;
		if(noofmonths==12)
		    interestRate=8/100;
		if(noofmonths==15)
		    interestRate=8.25/100;
		if(noofmonths==18)
		    interestRate=8.5/100;
		if(noofmonths==21)
		    interestRate=8.75/100;
	}
	if(age>60)
	{
		if(noofmonths==6)
	    interestRate=8/100;
		if(noofmonths==9)
		 interestRate=8.25/100;
		if(noofmonths==12)
		    interestRate=8.50/100;
		if(noofmonths==15)
		    interestRate=8.75/100;
		if(noofmonths==18)
		    interestRate=9.00/100;
		if(noofmonths==21)
		    interestRate=9.25/100;
	}
	return amount*interestRate;
}
}
