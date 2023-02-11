import java.util.*;

public class Task3
{
	public static void main(String[] args) 
	{

		int ch, pin, i;
		long amt=0,dpst=0,wd=0;
		Scanner s = new Scanner(System.in);
		String transactionHistory="";
		int ID=123;
		
		 do{
		 	System.out.println("Enter your id : ");
			 ID = s.nextInt();
		

			System.out.println("Enter your pin : ");
			pin = s.nextInt();
			

			if(ID != 123 || pin!=1319)
				System.out.println("Something went wrong please enter correct option!");
		 }

		while(ID !=123  && pin!=1319);
		
		do
		{
			System.out.println("\n***********ATM Service*********\n");
			System.out.println("1. Transaction History.");
			System.out.println("2. Withdraw.");
			System.out.println("3. Deposit.");
			System.out.println("4. Transfer.");
			System.out.println("5. Quit.");

			System.out.println("\n\nEnter your choice : ");
			ch = s.nextInt();

			switch(ch)
			{
				
				
				case 1:
					System.out.println("Trasction History\n" + transactionHistory);
					break;

				case 2:
					System.out.println("\nEnter the amount to withdraw : ");
					int b = s.nextInt();

					if(b % 100 != 0)
					{
						System.out.println("\nPlease Enter the amount in multiple of 100.");
					}
					else if(b > (amt - 1000))
					{
						System.out.println("\nInsufficent balance in your account.");
					}
					else
					{
						amt = amt - b;
						System.out.println("\n\nPlease receive cash.");
						System.out.println("Your current balance is : " + amt);
					}
					break;

				case 3:
					System.out.println("\nEnter the amount to Deposit : ");
					int c = s.nextInt();
					amt = amt + c;
					System.out.println("Your balance is : "+amt);
					break;

				case 4:
					System.out.println("**********************Transfer to the account**************************");
					{
						Scanner sc = new Scanner(System.in);
						System.out.print("\nEnter Receipent's Name : ");
						String receipent = sc.nextLine();
						System.out.print("\nEnter amount you wish to transfer : ");
						float amt1 = sc.nextFloat();
		
						try {
								if ( amt >= amt1 ) {
									if ( amt1 <= 150000f ) {
										amt -= amt1;
										System.out.println("\nSuccessfully Transfered to : " + receipent);
										String str = amt1 + " : Rs transfered to : " + receipent + "\n";
										transactionHistory = transactionHistory.concat(str);
									}
								else {
										System.out.println("\nINVALID TRANSFER...Limit is 150000.00 only");
									}
								}
								else {
										System.out.println("\nInsufficient Balance");
									}
							}
						catch (Exception e) {
							System.out.println(e);
						}
					}

				case 5:
					System.out.println("Thank you for using ATM service.");
					break;

				default:
					System.out.println("Invalid choice");
			}
		
		}while(ch!=5);
	}
}