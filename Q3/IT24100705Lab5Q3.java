import java.util.Scanner;
public class IT24100705Lab5Q3{
public static void main(String[] args){
	final double Room_Charge = 48000;
	final double Discount_3_4_Days = 0.1;
	final double Discount_5_Or_More =0.2;
	int stDate,enDate,resDays;
	double total_Amount;

	Scanner input = new Scanner(System.in);
	System.out.print("Enter start date (1-31) : ");
	stDate =input.nextInt();
	System.out.print("Enter end date (1-31) : ");
	enDate =input.nextInt();
	if (stDate >0 || stDate<=31 || enDate<=31 || enDate>0) {
		System.out.println("Days must be between 1 and 31");
}
	if (stDate>enDate){
		System.out.println("Start date must be less than end date" );
	
}	
	resDays= enDate-stDate;
	switch(resDays) {
		case 1:
			total_Amount=resDays*Room_Charge;
			System.out.println("Total amount to be paid : "+total_Amount);
			break;
		case 2:
			total_Amount=resDays*Room_Charge;
			System.out.println("Total amount to be paid : "+total_Amount);
			break;
		case 3:
			total_Amount=resDays*Room_Charge;
			System.out.println("Total amount to be paid : "+total_Amount);
			break;
		case 4:
			total_Amount=resDays*Room_Charge*(1-Discount_3_4_Days) ;
			System.out.println("Total amount to be paid : "+total_Amount);
			break;
		default:total_Amount=resDays*Room_Charge*(1-Discount_5_Or_More);
			System.out.println("Total amount to be paid : "+total_Amount);
			break;


		

}

	}
} 