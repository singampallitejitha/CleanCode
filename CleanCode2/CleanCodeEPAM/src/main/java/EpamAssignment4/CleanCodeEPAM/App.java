package EpamAssignment4.CleanCodeEPAM;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        SimpleInterestAndCompoundInterest sci = new SimpleInterestAndCompoundInterest() ;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) ;
        try {
			String inp[] = br.readLine().split(" ") ;
			double principalAmount = Double.parseDouble(inp[0]) ;
			double rateOfInterest = Double.parseDouble(inp[1]) ;
			double noOfYears = Double.parseDouble(inp[2]) ;
			bw.write("Simple Interest is : "+sci.simpleInterest(principalAmount , rateOfInterest , noOfYears)+"\n") ;
			bw.write("Compound Interest is : "+sci.compoundInterest(principalAmount , rateOfInterest , noOfYears)+"\n") ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        bw.flush();
    }
}
