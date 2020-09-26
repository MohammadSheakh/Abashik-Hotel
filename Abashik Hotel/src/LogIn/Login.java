package LogIn;
import java.util.Random;
import java.util.Scanner;

import Admin.AdminMain;
import Feature.Bank;
import Feature.Menu;
import Feature.Registration;

public class Login extends Menu implements AdminMain ,Registration , Bank
{
	public void banking(int nid)	
	{
		Scanner input = new Scanner(System.in);
		int bankSelection;
		System.out.println("Available bank list : ");
        System.out.println("                     1. Current Mobile Banking. ");
        System.out.println("                     2. Lime Light Mobile Banking. ");
        System.out.println("                     3. OK Mobile Bank. ");
        System.out.print("PLease Select a bank (give input in number): ");
        
        bankSelection = input.nextInt();
		switch(bankSelection)
            {
                case 1:
                	System.out.println("Welcome to Current bank !");
                	
                    break;
                case 2:
                	System.out.println("Welcome to Lime Light Bank !");
                	
					break;
                case 3:
                	System.out.println("Welcome to Ok Mobile Bank !");
                	
					break;
                default:
                    System.out.println("Sorry you give a wrong input ! Please Try Again !"); // ekhane je try again bollam .. while loop use kora shikhte hobe
                    while(bankSelection != 1 && bankSelection != 2 && bankSelection != 3)
					{
						banking(nid);
					}
					break;
            }
		System.out.println("1. I already have an Account .");
		System.out.println("2. No I have no account yet");
		System.out.print("Please select an option (1 or 2) : ");
		int bankingOptionSelect = input.nextInt();
		if(bankingOptionSelect == 1)
		{
			System.out.println("*****please log in first****");
			System.out.println("Enter Your Bank ID : ");
			int bankId = input.nextInt();
			System.out.println("Enter your Bank Password : ");
			int bankpass = input.nextInt(); 
		}
		else if(bankingOptionSelect == 2)
		{
			System.out.println("You should create an account first ! ");
			System.out.println("Please enter your full name : ");
			String nameforbankAcc = input.nextLine();
			input.nextLine();
			System.out.println("Please enter your NID Number : ");
			int NIDforBank = input.nextInt();
			if(NIDforBank == nid)//////////////   compare nid
			{
				System.out.println("Thank you ! your NID number is correct !");
				
				System.out.println("Option list : ");
			    System.out.println("            1. Pay Bill");
			    System.out.println("            2. Mobile Recharge");
			    System.out.println("            3. Send Money");
			    System.out.println("            4. Cash Out");
			    System.out.println("            5. Bank Transfer");
			    System.out.println("            6. Password Recovery");
			    System.out.println("Plese select an option : ");
			    int bankingOptionList = input.nextInt();
			    switch(bankingOptionList)
			    {
			    case 1:
			    	billPay();
			    	break;
			    case 2:
			    	System.out.println("This portion is for mobile Banking");
			    	break;
			    case 3:
			    	System.out.println("This is for send money");
			    	break;
			    case 4:
			    	System.out.println("This is for Cash Out");
			    	break;
			    case 5:
			    	System.out.println("Yeah ! you can transfer bank !");
			    	banking(nid);
			    	break;
			    case 6:
			    	System.out.println("Yeah ! you can change your password !");
					/*
					 * ekhane kono default password thakbe na .. admin section theke password dekha jabe ..
					 * admin ke bolte hobe .. then she check kore dekhbe 
					 */
			    }
			}
		}
		else
		{
			System.out.println("You give a wrong info ! Try again ");
			while(bankingOptionSelect != 1 && bankingOptionSelect != 2)
			{
				banking(nid);
			}
		}
		
	}
	
	public void billPay(int packageBill, String packageBillRef) 
	{
		Scanner input = new Scanner(System.in);
		int Bill = packageBill;
		String ref = packageBillRef;
		System.out.print("Enter amount you want to pay : ");
		int billAmount  = input.nextInt();
		System.out.print("Enter products reference number ");
		String productRef = input.nextLine();
		input.nextLine();
		
		if(Bill == billAmount && ref.equals(productRef))
		{
			System.out.println("Thank you So much. Your Bill is Paid");
		}
		else
		{
			System.out.println("Something error!");
		}
		
		input.close();
	}
	
	public void regDetails()
	{
		
		//Bank ob ;
		
		 Scanner input = new Scanner(System.in);
		String cusName, firstName, lastName, gender, maritalStatus, email, extraFacility;
		int nid, phoneNum, groupMemberNum, genderChoice, packageSuggestion, choosePackage;
		
		//ei variable gula theke kichu variable Bank / car parking / Food Bill / car Service /online Shoping 
		//ei class gula te use kora gele valo hoito
		
		System.out.println("..............................................");
		System.out.print("Enter your first name : ");
		//input.nextLine();
		firstName = input.nextLine();
		
		System.out.print("Enter your last name : ");
		lastName = input.nextLine();
		cusName = firstName+" "+lastName;
		System.out.println("Customer's Full Name : "+firstName+" "+lastName);
		System.out.println("Select your gender : ");
		System.out.println("				 1. Male");
		System.out.println("				 2. Female");
		System.out.println("				 3. Other");
		System.out.print("Please enter an option (in number) : ");
		genderChoice = input.nextInt();
		switch(genderChoice)
		{	
			case 1 :
				gender = "Male";
				break;
			case 2 :
				gender = "Female";
				break;
			case 3 : 
				gender = "Other";
				break;
			default :
				System.out.println("Sorry !");
			/*	
				while( 3 < genderChoice <1 )
				{
					System.out.println("Please select the right option again");
				}
			*/
		}
		input.nextLine();
		System.out.print("Marital Status : ");
		maritalStatus = input.nextLine();
		System.out.print("Enter phone number : ");
		phoneNum = input.nextInt();
		input.nextLine();
		System.out.print("Enter your email address : ");
		email = input.nextLine();
		System.out.print("Enter your NID number :");
		nid = input.nextInt();
		
		System.out.println("How many member you have in your group ?");
		System.out.print("Type Here : ");
		groupMemberNum = input.nextInt();
		
		
		System.out.println("..............................................");
		System.out.println("Thank You So much for giving us these important information !");
		System.out.println("Now, you can  choose a flat which you want ...");
		System.out.println("Before that as you guys are "+groupMemberNum+" in number .");
		if(groupMemberNum > 0 &&  groupMemberNum <= 2)
		{
			packageSuggestion = 5;
			System.out.println("So, We suggst you to take a look our "+packageSuggestion+" number package !");
		}
		else if(groupMemberNum > 2 &&  groupMemberNum <= 3)
		{
			packageSuggestion = 4;
			System.out.println("So, We suggst you to take a look our "+packageSuggestion+" number package !");
		}
		else if(groupMemberNum > 3 &&  groupMemberNum < 6)
		{
			packageSuggestion = 3;
			System.out.println("So, We suggst you to take a look our "+packageSuggestion+" number package !");
		}
		else if(groupMemberNum > 5 &&  groupMemberNum < 9)
		{
			packageSuggestion = 2;
			System.out.println("So, We suggst you to take a look our "+packageSuggestion+" number package !");
		}
		else if(groupMemberNum > 8 &&  groupMemberNum < 13)
		{
			packageSuggestion = 1;
			System.out.println("So, We suggst you to take a look our "+packageSuggestion+" number package !");
		}
		else
		{
			System.out.println("Please from Menu, go to helpdesk..You can contact there with our officials . Thank You !");
		}
		
		System.out.println("Our packages :");
		System.out.println("..................................................................................");
        System.out.println(".          |.......         >>>>    Flat Booking    <<<<     .....................");
        System.out.println(". Package  |......................................................................");
        System.out.println("           |Person     |                 Details                 | Price(Per Day).");
        System.out.println("...........|......................................................................");
		System.out.println(".          |           | Full AC 4 Master Bedroom                |               .");
        System.out.println(".    1     | 12 Person | each room contain Extra large Double Bed|  4000/- (BDT) .");
        System.out.println(".          |           | Generator, TV ,Oven,2 Balcony, Gyser,   |               .");
        System.out.println("..................................................................................");
		System.out.println(".          |           |                                         |               .");
        System.out.println(".    2     | 8 Person  | Living room : 1 Extra large Double Bed  |  2500/- (BDT) .");
        System.out.println(".          |           |                                         |               .");
        System.out.println("..................................................................................");
        System.out.println(".          |           | Living room : 1 sofa bed                |               .");
        System.out.println(".    3     | 5 Person  | Bedroom 2   : 1 Extra large Double Bed  |  1750/- (BDT) .");
        System.out.println(".          |           | Bedroom 3   : 1 Extra large Double Bed  |               .");
        System.out.println("..................................................................................");
        System.out.println(".          |           | Living room : 1 sofa bed                |               .");
        System.out.println(".    4     | 3 Person  | Bedroom 2   : 1 Extra large Double Bed  |  1550/- (BDT) .");
        System.out.println(".          |           |                                         |               .");
        System.out.println("..................................................................................");
        System.out.println(".          |           |                                         |               .");
        System.out.println(".    5     | 2 Person  | Living room : 1 Extra large Double Bed  |  1000/- (BDT) .");
        System.out.println(".          |           |                                         |               .");
        System.out.println("..................................................................................");
		System.out.println("Every room has attached bathroom and Other nessary stuffs");
		System.out.println("");
		System.out.println("Which package do you want ?");
		System.out.print("Type Here : ");
		choosePackage = input.nextInt();
		System.out.println("How many days you want to stay here : ");
		int days  = input.nextInt();
		
		
		System.out.println("As you don't have any Bank Account.. at first go to banking method !");
		System.out.println("And create a bank account first ! After every time when you want to pay your bill");
		System.out.println("You can call only BillPay function then ! ");
		
		Random rand = new Random(); //Reference number create korte kaje lagbe
		switch(choosePackage)
		{
		case 1:
			int package1Bill = 4000 * days;
			String package1BillRef = Integer.toHexString(rand.nextInt(9999)+5000);
			System.out.println("Your Bill is "+package1Bill);
			System.out.println("Bill reference number : "+package1BillRef);
			banking(nid);
			billPay(package1Bill, package1BillRef);
			break;
		case 2:
			int package2Bill = 2500 * days;
			String package2BillRef = Integer.toHexString(rand.nextInt(9999)+5000);
			System.out.println("Your Bill is "+package2Bill);
			System.out.println("Bill reference number : "+package2BillRef);
			banking(nid);
			billPay(package2Bill, package2BillRef);
			break;
		case 3:
			int package3Bill = 1750 * days;
			String package3BillRef = Integer.toHexString(rand.nextInt(9999)+5000);
			System.out.println("Your Bill is "+package3Bill);
			System.out.println("Bill reference number : "+package3BillRef);
			banking(nid);
			billPay(package3Bill, package3BillRef);
			break;
		case 4:
			int package4Bill = 1550 * days;
			String package4BillRef = Integer.toHexString(rand.nextInt(9999)+5000);
			System.out.println("Your Bill is "+package4Bill);
			System.out.println("Bill reference number : "+package4BillRef);
			banking(nid);
			billPay(package4Bill, package4BillRef);
			break;
		case 5:
			int package5Bill = 1000 * days;
			String package5BillRef = Integer.toHexString(rand.nextInt(9999)+5000);
			System.out.println("Your Bill is "+package5Bill);
			System.out.println("Bill reference number : "+package5BillRef);
			banking(nid);
			billPay(package5Bill, package5BillRef);
			break;
		default:
			System.out.println("Under Construction !");
			break;
		}
		
		input.close();
		System.out.println("Do you want to park your car in our basement?");
		System.out.print("Type Here (yes/no) : ");
		extraFacility = input.nextLine();
		input.nextLine();
		
		//Menu obj = new Menu();
		
		if(extraFacility == "yes")
        {
            //carParking();
			
        }
		else
		{
			super.menuFunction();
		}
		
	}
	public void menuFunction() {
		// TODO Auto-generated method stub
		
	}

	public void adminCheck()
	{
		Scanner input = new Scanner(System.in);
		
		int[] forgetPass = new int[2];
		int Password[] = {1122,3344,5566};
		
		System.out.println("You can log in as ");
		System.out.println("               1. Administrative ");
		System.out.println("               2. Senior Executive ");
		System.out.println("               3. Secretery ");
		System.out.print("Choose your option : ");
		int adminLogInOption = input.nextInt();
		if(adminLogInOption == 1)
		{
			int Id1 = 20421321;
			System.out.println("Here's two option : ");
			System.out.println("1.I can Remember my ID and Password !");
			System.out.println("2. I Forgot my Password !");
			System.out.print("Choose one (1/2): ");
			int OptionSelect = input.nextInt();
			switch(OptionSelect)
			{
				case 1:
					break;
				case 2:
					System.out.println("Enter your Id : ");
					int checkId1 = input.nextInt();
					if(checkId1 == Id1)
					{
						System.out.println("We detect that, you are our Administrative ! Please Enter your new Password !");
						System.out.print("Update your password : ");
						forgetPass[0] = input.nextInt();
						System.out.println("Done");
					}
			}
			System.out.println("");
			System.out.print("Enter your Id : ");
			int id1 = input.nextInt();
			System.out.print("Enter your password : ");
			int Pass1 = input.nextInt();
			if(id1 == Id1)
			{
				if(Pass1 == forgetPass[0] || Pass1 == Password[0])
				{
					System.out.println("WE got you");
				}
			}
			else
			{
				System.out.println("Sorry ! You type a worng password !");
			}
		}
		else if(adminLogInOption == 2)
		{
			int Id2 = 20421322;
			System.out.println("Here's two option : ");
			System.out.println("1.I can Remember my ID and Password !");
			System.out.println("2. I Forgot my Password !");
			System.out.print("Choose one (1/2): ");
			int OptionSelect = input.nextInt();
			switch(OptionSelect)
			{
				case 1:
					break;
				case 2:
					System.out.print("Enter your Id : ");
					int checkId2 = input.nextInt();
					if(checkId2 == Id2)
					{
						System.out.println("We detect that, you are our Senior Executive ! Please Enter your new Password !");
						System.out.print("Update your password : ");
						forgetPass[1] = input.nextInt();
						System.out.println("Done");
					}
			}
			System.out.println("");
			System.out.print("Enter your Id : ");
			int id2 = input.nextInt();
			System.out.print("Enter your password : ");
			int Pass2 = input.nextInt();
			if(id2 == Id2)
			{
				if(Pass2 == forgetPass[1] || Pass2 == Password[1])
					{
					System.out.println("WE got you");
				}
			}
			else
			{
				System.out.println("Sorry ! You type a worng password !");
			}
		}
		else if(adminLogInOption == 3)
		{
			int Id3 = 20421323;
			System.out.println("Here's two option : ");
			System.out.println("1.I can Remember my ID and Password !");
			System.out.println("2. I Forgot my Password !");
			System.out.print("Choose one (1/2): ");
			int OptionSelect = input.nextInt();
			switch(OptionSelect)
			{
				case 1:
					break;
				case 2:
					System.out.print("Enter your Id : ");
					int checkId1 = input.nextInt();
					if(checkId1 == Id3)
					{
						System.out.println("We detect that, you are our Secretery ! Please Enter your new Password !");
						System.out.print("Update your password : ");
						forgetPass[2] = input.nextInt();
						System.out.println("Done");
					}
			}
			System.out.println("");
			System.out.print("Enter your Id : ");
			int id3 = input.nextInt();
			System.out.print("Enter your password : ");
			int Pass3 = input.nextInt();
			if(id3 == Id3)
			{
				if(Pass3 == forgetPass[2] || Pass3 == Password[2])
				{
					System.out.println("WE got you");
				}
			}
			else
			{
				System.out.println("Sorry ! You type a worng password !");
			}
		}
		else
		{
			adminCheck();
		}
		input.close();
	}
	
	public void logIn()
	{
		Scanner input = new Scanner(System.in);
		int count = -1;
		do
		{
			try
			{
				
				System.out.println("Log in as : ");
				System.out.println("           1. Admin");
				System.out.println("       2. Customer");
				System.out.println("");
				System.out.print("Enter option number (1 or 2): ");
				int logInOption = input.nextInt();
				
				
				switch(logInOption)
				{
					case 1:
						adminCheck();
						break;
					case 2:
						regDetails();
						System.out.println("regDetails function ekhan theke call hobe");
						break;
						
						default:
							System.out.println("Its under construction");
				}
				
				//input.close();
			}
			catch(Exception e)
			{
				//System.out.println("We found an exception : "+e); //ekhane exception dekhacche java.lang.NullPointerException
				count ++;
				if(count == 1)
				{
					System.out.println("Sorry You give a unknown input !");
				}
			}
		}while(count == 0);
		
		input.close();
	}

	@Override
	public void billPay() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void banking() {
		// TODO Auto-generated method stub
		
	}

}


