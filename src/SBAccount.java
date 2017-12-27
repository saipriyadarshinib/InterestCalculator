
public class SBAccount extends Account{
double interestRate;
double Amount;
public SBAccount(int a,String t) 
{
	Amount=a;
	if(t.equals("Normal"))
		interestRate=0.04;
	else
		interestRate=0.06;
	
	
}
@Override
double calculateInterest() {
	Amount=Amount*interestRate;
	return Amount;
}
}
