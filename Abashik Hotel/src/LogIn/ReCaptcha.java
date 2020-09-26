package LogIn;
import java.util.Random;
import java.util.Scanner;


public class ReCaptcha extends Login
{
	public void captcha()
	{
		System.out.print("reCaptcha : ");
		
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase = characters.toLowerCase();   //String.method
		characters = characters + lowerCase + "0123456789";
		//System.out.println(characters);
		String randomString = ""; //we are just set it to empty String
		
		Random rand = new Random();
		int length = 4; // amra 4 ta character er random text generate korte chacchi
			
		char[] text = new char[length]; //now it can hold 4 different values
		for(int i = 0; i<length; i++)
		{
			text[i] = characters.charAt(rand.nextInt(characters.length()));
		}
		for(int j = 0; j<text.length; j++)
		{
			//ei loop ta text array theke data collect kore ekta String e store korbe 
			randomString += text[j]; 
		}
		
		System.out.println(randomString);
		System.out.print("Enter this Captcha : ") ;
		Scanner input = new Scanner(System.in);
		String userInput = input.nextLine();
		
		//Login log = new Login();  // Login class er ekta object create kore nilam
		
		
		if(randomString.equals(userInput))
		{
			System.out.println("Welcome Once again !") ;
			super.logIn();
		}
		else
		{
			System.out.println("Sorry ! You are not human !");
			System.out.println("Please Type that Captcha again !");
			userInput = input.nextLine();
			if(randomString.equals(userInput))
			{
				System.out.println("Welcome to Abashik Hotel !") ;
				super.logIn();
			}
			else
			{
				System.out.println("Sorry ! You are not human !");
			}
		}
		input.close();
	}
}
