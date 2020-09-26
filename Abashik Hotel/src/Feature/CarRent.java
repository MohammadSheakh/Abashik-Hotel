package Feature;
import java.util.Scanner;
public interface CarRent 
{
	public void availableCar();
	/*{
		/*
			//Default   - Visible to the package 
			//Public    - Visible to the world
			//Private   - Visible to the class only
			//Protected - Visible to the package and all sub class 
		*/
	/*	String[] carList = {"Toyota X Corolla", "Toyota Fielder", "Pajero" , "Hiace"};
		System.out.println("Available car in your area : ");
		int i = 1;
		int j = 0;
		for(String carLoop : carList)
		{
			System.out.println("               "+i+". "+carList[j]);
			i++;
			j++;
		}
	}*/
	public void carService();
	/*{
		Scanner input = new Scanner(System.in);
		System.out.println("This is carService method");
		System.out.println("______________________________________");
		System.out.println("=======Feel Safe to Ride.com.bd=======");	
		System.out.println("______________________________________");
		System.out.print("Please enter your name : ");
		String cusNameForCar = input.nextLine();
		System.out.print("Gender : ");
		String cusGenderForCar = input.nextLine();
		System.out.println("Select Driver : ");
        System.out.println("               1. Male ");
        System.out.println("               2. Female  ");
		
        System.out.print("Enter your choice (1 or 2) : ");
		/*try
		{*/
	//		int c = input.nextInt();
		/*}
		catch(Exception e)
		{
			System.out.println("Something wrong !");
			System.out.println("Enter your choice again(1 or 2) : ");
			int c = input.nextInt();
		}*/
/*			if(c==1)
			{
				System.out.println("You have selected male driver !");
			}
			else
			{
				System.out.println("You have selected female driver !");
			}
		System.out.println("Rules and regulation : ");
        System.out.println("                      1. Brother, please do not vomit in the car ! if you need polythene,ask me.. I will give you !");
		System.out.println("                      2. Please behave in moderation! If you think Bill is more then your thinking call at 2525 number!");
		
        System.out.print("From : ");
        String from = input.nextLine();
		input.nextLine();
		System.out.print("To   : ");
        String to = input.nextLine();
		availableCar();
	}
	
	/*
	public static void main(String[] args)
	{
		CarRent obj = new CarRent();
		obj.carService();
	}
	*/
}
