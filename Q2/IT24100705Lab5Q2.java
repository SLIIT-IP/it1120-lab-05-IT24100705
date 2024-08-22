import java.util.Scanner;
public class IT24100705Lab5Q2{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of new members introduced :");
	int No_of_New = input.nextInt();

	if (No_of_New >=0)
	{
		switch(No_of_New)
		{
			case 0:System.out.print("No Price");
				break;
			case 1:System.out.print("Price is a : pen");
				break;
			case 2:System.out.print("Price is a : Umbrella");
				break;
			case 3 :System.out.print("Price is a : Bag");
				break;
			case 4:System.out.print("Price is a : Travelling Bag");
				break;
			default:System.out.print("Price is a : Headphone");
				break;

		}
	} else
		{
			System.out.print("Input must be a number 0 or greater");	
		}
			
		
		
		
    
	

 }
}