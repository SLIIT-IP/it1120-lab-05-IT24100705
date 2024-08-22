import java.util.Scanner;
public class IT24100705Lab5Q1{
public static void main(String[] args){

	int n1,n2,n3;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the first integer :");
	n1 = input.nextInt();

	System.out.println("Enter the Second integer :");
	n2 = input.nextInt();
	
	System.out.println("Enter the third integer :");
	n3 = input.nextInt();
	
	System.out.println("User entered numbers are :"+n1+" "+n2+"  "+n3+"");
		
	if (n1<n2 && n1<n3){
		System.out.println("The smallest number is :"+n1);
		}
	else if(n2<n1 && n2<n3){
		System.out.println("The smallest number is :"+n2);
		}
	else   {
		System.out.println("The smallest number is :"+n3);
		}
	if(n1>n2 && n1>n3){
		System.out.println("The largest number is :"+n1);
		}
	else if(n2>n1 && n2>n3){
		System.out.println("The largest number is :"+n2);
		}
	else    {
		System.out.println("The largest number is :"+n3);
		}
	}
}
	







	
	
