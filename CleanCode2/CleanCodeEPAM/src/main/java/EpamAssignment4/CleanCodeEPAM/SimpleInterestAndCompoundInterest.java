package EpamAssignment4.CleanCodeEPAM;

import java.util.Scanner;

public class SimpleInterestAndCompoundInterest {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principalAmount , rateOfInterest , noOfYears , simpleInterest , compoundInterest ;
		Scanner sc = new Scanner(System.in) ;
		principalAmount = sc.nextDouble() ;
		rateOfInterest = sc.nextDouble() ;
		noOfYears = sc.nextDouble() ;
		simpleInterest = (principalAmount * noOfYears * rateOfInterest)/100 ;
		compoundInterest = (Math.pow(1.0+(rateOfInterest/100), noOfYears) - 1)*principalAmount ;
		System.out.println("Simple Interest is : "+simpleInterest) ;
		System.out.println("Compound Interest is : "+compoundInterest) ;
	}*/

	public double simpleInterest(double principalAmount, double rateOfInterest, double noOfYears) {
		// TODO Auto-generated method stub
		// the formula for Simple interest is S.I. = (principal * time * rateOfInterest) / 100
		double simpleInterest = (principalAmount * noOfYears * rateOfInterest)/100 ;
		//bw.write(simpleInterest + "\n") ;
		return simpleInterest ;
	}

	public double compoundInterest(double principalAmount, double rateOfInterest, double noOfYears) {
		// TODO Auto-generated method stub
		//the formula for compound interest is C.I. = ((1+(rateOfInterest/100))^time -1)*principal 
		double compoundInterest = (Math.pow(1.0+(rateOfInterest/100), noOfYears) - 1)*principalAmount ;
		return compoundInterest ;
	}

}
