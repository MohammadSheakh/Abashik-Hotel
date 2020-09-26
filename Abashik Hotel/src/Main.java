import java.text.SimpleDateFormat;
import java.util.Date;
import LogIn.ReCaptcha;
public class Main extends ReCaptcha
{
	public void design()
	{
		///Get Current Date and Time: java.text.SimpleDateFormat  //Resource - https://www.javatpoint.com/java-get-current-date
		Date date = new Date();
		SimpleDateFormat Format = new SimpleDateFormat("hh:mm:ss");
	//	System.out.println("|--------------------------------------------------------------------|");
		System.out.print("             Current Time - "+Format.format(date));
		SimpleDateFormat Format1 = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(" and Date - "+Format1.format(date));
		System.out.print("|-----------------------------------------------------------------|");
		
	
	
		System.out.println("");
        System.out.println("   _______________________________________________________________");
        System.out.println("  |---------------------------------------------------------------|");
        System.out.println("  |----------___________________________________________----------|");
        System.out.println("  |          |                                         |          |");
        System.out.println("  |          |       >>  Project  Abashik Hotel   <<   |          |");
        System.out.println("  |==========|_________________________________________|==========|");
        System.out.println("  |---------------------------------------------------------------|");
        System.out.println("  |-----------Sompurno Oshamajik Karjokolap Mukto-----------------|");
        System.out.println("  |______________Shorboda Apnar Shebay Niyojito___________________| ");
        System.out.println("");
	
	
		System.out.println("               ***Welcome To Project  Abashik Hotel***");
        System.out.println("         First of all please proof that you are human or not !");
	
	
		
		super.captcha();
	}
	
	public static void main(String[] args)
	{	
		 /*
		//Default   - Visible to the package 
		//Public    - Visible to the world
		//Private   - Visible to the class only
		//Protected - Visible to the package and all sub class 
		 */
		Main m1 = new Main();
		m1.design();
	}
}
