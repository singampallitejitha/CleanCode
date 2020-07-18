package EpamAssignment4.CleanCodeEPAM2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        //System.out.println( "Hello World!" );
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)) ;
    	double areaOfHouse = 0.0 ;
		try {
			areaOfHouse = Double.parseDouble(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	String buildingType = null;
		try {
			buildingType = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	HouseBuilding hb = new HouseBuilding() ;
    	try {
			bw.write("Total Cost of Constructing building by having cost of square feet value : "+hb.costOfBuilding(areaOfHouse ,buildingType)) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	bw.flush();
    }
}
