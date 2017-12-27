import java.util.*;
public class Main {

	public static void main(String[] args) {
		while(true)
		{
		System.out.println("Select the option");
		System.out.println("1.Interest Calculator-SB");
		System.out.println("2.Interest Calculator-FD");
		System.out.println("3.Interest Calculator-RD");
		System.out.println("4.exit");
		Scanner s=new Scanner(System.in);
		int option=s.nextInt();
		switch(option)
		{
		case 1:System.out.println("Enter the average amount in your account");
		       int a=s.nextInt();
		       System.out.println("enter the type of account:Normal/NRI");
		       String t=s.next();
		       SBAccount s1=new SBAccount(a,t);
		       System.out.println("Interest Gained"+s1.calculateInterest());
		       break;
		case 2:System.out.println("Enter the FD Amount");
		       double a1=s.nextDouble();
		       System.out.println("Enter the number of days");
		       int d=s.nextInt();
		       System.out.println("Enter your age");
		       int age=s.nextInt();
		       FDAccount f=new FDAccount(a1,d,age);
		       System.out.println("Interest Gained"+f.calculateInterest());
		       break;
		case 3:System.out.println("Enter the RD Amount");
	           double r=s.nextDouble();
	            System.out.println("Enter the maturity period");
	            int m=s.nextInt();
	            System.out.println("Enter the age");
	            int age1=s.nextInt();
	            RDAccount r1=new RDAccount(r,m,age1);
	            System.out.println("Interest Gained"+r1.calculateInterest());
			       break;
		case 4:System.exit(0);
		}
		}
	}

}
