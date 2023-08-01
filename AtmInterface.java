import java.util.Scanner;

public class AtmInterface
{
	public static void main(String[] args) 
	{

		int choice, pin=0, k;
		int amount=0,deposit=0,withdraw=0;
		Scanner s = new Scanner(System.in);
		char trasction = 'y';
		int ID=123;
		int transaction []=new int[10];
		int i=0;
		 do{
		 	System.out.println("Enter your ID : ");
			ID = s.nextInt();
		

			System.out.println("Enter your pin : ");
			pin = s.nextInt();
			

			if(ID != 2318 || pin!=140620)
				System.out.println("Please Enter The correct password");
		 }

		while(ID != 123 && pin!=5456);
		do
		{
			System.out.println("\n------ATM SERVICE FOR YOUR MONEY-----\n");
			System.out.println("1. Trasaction History");
			System.out.println("2. Deposit The Amount");
			System.out.println("3. Withdraw The Money ");
			System.out.println("4. Transfer The Money");
			System.out.println("5. Quit From Exit");

			System.out.println("\n\nEnter your choice : ");
			 choice = s.nextInt();

			switch(choice)
			{
				
				
				case 1:
					System.out.println("***Transaction history***\n");
					for(int j=0;j<i;j++)
					{
						System.out.println(transaction[j]);
					}
					break;

				case 2:

					System.out.println("\nEnter the amount to Deposit ");
					int c = s.nextInt();
					amount = amount + c;
					System.out.println("Your balance is "+amount);
					transaction[i]=amount;
						i++;
					break;
					

				case 3:
					System.out.println("\nEnter the amount to Be  withdraw");
					int b = s.nextInt();

					if(b % 100 != 0)
					{
						System.out.println("\nPlease Enter the amount in multiple of 100 ");
					}
					else if(b > (amount - 500))
					{
						System.out.println("\nInsufficent Balance");
					}
					else
					{
						amount = amount - b;
						System.out.println("\n\nPlease receive cash");
						System.out.println("Your current balance is "+amount);

						transaction[i]=amount;
						i++;
					}
					break;

				case 4:
					System.out.println("-------------------Transfer-------------------------");
					{
						Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter Receipent's Name : ");
		String receipent = sc.nextLine();
		System.out.print("\nEnter amount you wish to transfer : ");
		Float amount1 = sc.nextFloat();
		
		try {
			if ( amount >= amount1 ) {
				if ( amount1 <= 90000f ) {
					trasction++;
					amount -= amount1;
					System.out.println("\nSuccessfully Transfered to " + receipent);
					String str = amount1 + " Rs transfered to " + receipent + "\n";

					transaction[i]=amount;
						i++;
					
				}
				else {
					System.out.println("\nInvalid transfer..Limit is 90000.00 only");
				}
			}
			else {
				System.out.println("\nInsufficient Balance in your Account Please Deposit Some of The amount ");
			}
		}
		catch ( Exception e) {
		}
					}

				case 5:
					System.out.println("Thank you for using our service have a nice day :");
					break;

				default:
					System.out.println("Invalid choice");

			}

			
		}while(choice!=5);
	}
}
