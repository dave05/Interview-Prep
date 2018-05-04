/*



*/
package travelcost
import java.util.Scanner


public class TravelCosts
{
	public static void main(String[] args)
	{
	int dis, mpg,ppg,totalcost;
	// the variables to calculate the total cost

	Scanner input = new Scanner (System.in);
	System.out.println("enter the distance you wanna travel");
	dis = in.nextInt();
	System.out.println("enter the vechile mpg");
	mpg = in.nextInt();
	System.out.println("enter the price of gas today");
	ppg = in.nextInt();
	totalcost = (dis/mpg) * ppg;
	System.out.printf("the travel costs you", totalcost);

	}

}