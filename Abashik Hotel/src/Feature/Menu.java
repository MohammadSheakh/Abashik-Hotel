package Feature;
import LogIn.Login;
//import jdk.internal.util.xml.impl.Input;
//import jdk.internal.util.xml.impl.Input;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

//import com.sun.org.apache.xml.internal.security.utils.SignerOutputStream;

//Folder and File create korar jonno
import java.io.File;
//File e data entry korar jonno 
import java.util.Formatter;
//next 4 options are for web
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
//next 2 options are for showing date and time
import java.text.SimpleDateFormat;
import java.util.Date;
public class Menu extends Login implements Registration, Bank, CarRent, DayCount, Food, HelpDesk, Leisure, Notice, Parking,  Shopping
{
	int nid;
	int CustomerName;
	public void menuFunction()
	{
		System.out.println("All option's are here : ");
		System.out.print("1. Registration \t 2. Food Order \t 3. BillPay \t4. Car Service\n");
		System.out.print("5. Leisure Time \t 6. Car Parking \t7. Banking \t8. Notice Board ");
		System.out.println("9. Help Desk \t 10. Day Count \t 11. Online Shopping ");
		
		System.out.print("Enter an option : ");
		
		Scanner input = new Scanner(System.in);
		int menuOption = input.nextInt();
		
		
		switch(menuOption)
        {
        case 1:
		
            regDetails();
            break;
			
        case 2:
		
			foodOrder();
            break;
			
        case 3:
		
            billPay();
            break;
			
        case 4:
		
            carService();
            break;
		
        case 5:
		
            leisureTime();
            break;
			
        case 6:
		
            carParking();
            break;
			
        case 7:
		
            banking();
            break;
			
        case 8:
		
            noticeBoard();
            break;
			
        case 9:
		
            helpDesk();
            break;
			
        case 10:
		
            dayCount();
            break;
			
		case 11:
		
            shopping();
            break;
			
        default:
		
            while(menuOption < 0 && menuOption > 11)
            {
                System.out.print("Please enter a right option : ");
                menuOption = input.nextInt();
            }

                break;///////////////////////////////ekhane jhamela thakte pare ///////
        }
    }

	@Override
	public void shopping() throws IOException, URISyntaxException
	{
		
		//https://www.youtube.com/watch?v=Bws9aQuAcdg
		Scanner input = new Scanner(System.in);
		System.out.println("_______________________________________________");
		System.out.println("|     WELCOME TO THE GALLERIA SHOPPING MALL     |");
		System.out.println("|-----------------------------------------------|");
		System.out.println("| SL.|               Option Name                |");
		System.out.println("|-----------------------------------------------|");
		System.out.println("| 01.| Log in                                   |");
		System.out.println("| 02.| View all product                         |");
		System.out.println("| 03.| Product you want                         |");
		System.out.println("| 04.| Wish list                                |");
		System.out.println("| 05.| Recently Added                           |");
		System.out.println("| 06.| UpComing Proeduct                        |");
		System.out.println("| 07.| Show cart                                |");
		System.out.println("| 08.| Main menu                                |");
		System.out.println("|_______________________________________________|");
		
		System.out.println("Enter an option :");
		int menuOption = input.nextInt();
		switch(menuOption)
        {
        case 1:
            //log_in();
        	System.out.print("Enter your name : ");
        	String nameforShop = input.nextLine();
        	System.out.print("Enter your Nid : ");
        	int nidForShop = input.nextInt();
        	System.out.println("Enter Your Mobile Number : ");
        	int phoneForShop = input.nextInt();
/*
 * ekhane nid compare korte hobe .. 
 */
            break;
        case 2:
           // View_all_product();
        	System.out.println("_______________________________________________________________________________________________");
        	System.out.println("| Item Number | Product name  | Details                      |  Price   | Ratings | Status      |");
        	System.out.println("|-----------------------------------------------------------------------------------------------|");
        	System.out.println("| 1410948038  | IR Sensor     | Detection distance: 2 ~ 60cm | 99 Taka  |  4.7/5  | In Stock    |");
        	System.out.println("| 1410948039  | Laser Diod    | 5 Volt, Spot Color : Red     | 35 Taka  |  3.5/5  | Out of Stock|");
        	System.out.println("| 1410948040  | Netgear Router| 4 (5dBi)Antena, 3 Room       | 2400 Taka|  2.1/5  | In Stock    |");
        	System.out.println("| 1410948041  | Glue Gun      | With two free glue stick     | 225 Taka |  4.9/5  | In Stock    |");
        	System.out.println("|_______________________________________________________________________________________________|");
            System.out.println("");
            System.out.println("Enter item number to view details and order : ");
            int productOrder = input.nextInt();
            switch(productOrder)
            {
            case 1410948038 :
                String product1status = "In Stock";
                System.out.println("Product Name : IR Sensor");
            	System.out.print("Do you want to view product picture ? Type here(yes/no) : ");
            	String productPic1 = input.nextLine();
            	
            	if(productPic1 == "yes")
            	{
            		String link1 = "https://shutr.bz/3dJFkGo";
            		Desktop uri = Desktop.getDesktop();
            		uri.browse(new URI(link1));
                }
            	else
            	{
            	
            	}
                if(product1status == "In Stock")
                {
                	System.out.println("Do you want to add to Cart ? (yes/no) : ");
                	String cartDecision1 = input.nextLine();
                	if(cartDecision1 == "yes")
                	{
                   
                		//F:\Eclipse Java\Abashik Hotel\src\Admin
                		//Folder create korar jonno 
                		File dir = new File("F:/Eclipse Java/Abashik Hotel/src/Admin/Shoping");
                		dir.mkdir(); //make directory
                		File folder1 = new File("F:/Eclipse Java/Abashik Hotel/src/Admin/Shoping/orderDetails.txt");
                		try 
                		{
                			folder1.createNewFile();//File create korar jonno amra ei method ta use korbo
                			System.out.println("Files are created"); //file create hoile ei message ta print hobe
                		}
                		catch(Exception e)
                		{
                			System.out.println(e);
                		}
                		//file e data entry korar jonno  try catch block use korte hobe
                		try
                		{
                			Formatter file1 = new Formatter("F:/Eclipse Java/Abashik Hotel/src/Admin/Shoping/orderDetails.txt");////()er moddhe bole dite hobe jei file ta apni use korte chacchen
                			file1.format("%s%s%s%s\r\n","Customer Name and ID : ",nameforShop,"<-->",phoneForShop);
                			file1.format("%s\r\n", "____________________________________________________________________________");
                			file1.format("%s%s%s%s%s%s%s%s%s%s%s\r\n","|"," Item Number ","|"," Product name","|"," Details                 ","|","  Price    ","|"," Status  ","|");
                			file1.format("%s\r\n", "|---------------------------------------------------------------------------|");
                			file1.format("%s%s%s%s%s%s%s%s%s%s%s\r\n","|","1410948038","   |","IR Sensor","    |","5 Volt, Spot Color : Red ","|","35 Taka ","   |","In Stock ","|");
                			file1.format("%s\r\n", " ----------------------------------------------------------------------------");
                			file1.close();
                		}
                		catch(Exception e)
                		{
                			System.out.println("Exception : "+e);
                		}
                	}
                	else
                	{
                		shopping();
                	}
                }//this portion is for product1status 
                else
                {
                	System.out.println("As this product is out of stock ! you can not add to cart !");
                	shopping();
                }
                break;
              
               

            case 1410948039 :
            	String product2status = "Out of Stock";
                System.out.println("Product Name : Laser Diod");
                System.out.println("Do you want to view product picture ? Type here(yes/no) : ");
                String productPic2 = input.next();
                if(productPic2 == "yes")
                {
                    String link2 = "https://shutr.bz/2YM7Y5w";
                    Desktop uri = Desktop.getDesktop();
                	uri.browse(new URI(link2));
                    break;
                }
                else
                {
                	
                }
                if(product2status == "In Stock")
                {
                	System.out.println("Do you want to add to Cart ? (yes/no) : ");
                    String cartDecision2 = input.nextLine();
                    if(cartDecision2 == "yes")
                    {
                       
                    	//file e data entry korar jonno  try catch block use korte hobe
                    	try
                		{
                    		Formatter file1 = new Formatter("F:/Eclipse Java/Abashik Hotel/src/Admin/Shoping/orderDetails.txt");////()er moddhe bole dite hobe jei file ta apni use korte chacchen
                    		file1.format("%s%s%s%s\r\n","Customer Name and ID : ",nameforShop,"<-->",phoneForShop);
                    		file1.format("%s\r\n", "____________________________________________________________________________");
                    		file1.format("%s%s%s%s%s%s%s%s%s%s%s\r\n","|"," Item Number ","|"," Product name","|"," Details                 ","|","  Price    ","|"," Status  ","|");
                    		file1.format("%s\r\n", "|---------------------------------------------------------------------------|");
                    		file1.format("%s%s%s%s%s%s%s%s%s%s%s\r\n","|","1410948039","   |","Laser Diod","    |","Detection distance: 2 ~ 60cm ","|","99 Taka ","   |","Out  Stock ","|");
                    		file1.format("%s\r\n", " ----------------------------------------------------------------------------");
                        	file1.close();
                		}
                    	catch(Exception e){
                    		System.out.println("Exception : "+e);
                		}
                     }
                    else
                    {
                    	shopping();
                    }
                }
                else
                {
                	System.out.println("As this product is out of stock ! you can not add to cart !");
                	shopping();
                }
                break;
            case 1410948040 :
            	String product3status = "In Stock";
                System.out.println("Product Name : Netgear Router");
                System.out.println("Do you want to view product picture ? Type here(yes/no) : ");
                String productPic3 = input.next();
                if(productPic3 == "yes")
                {
                    String link3 = "https://shutr.bz/2YM7Y5w";   /////////////////////Link change korte hobe
                    Desktop uri = Desktop.getDesktop();
                	uri.browse(new URI(link3));
                    break;
                }
                else
                {
                	
                }
                if(product3status == "In Stock")
                {
                	System.out.println("Do you want to add to Cart ? (yes/no) : ");
                    String cartDecision2 = input.nextLine();
                    if(cartDecision2 == "yes")
                    {
                       
                    	//file e data entry korar jonno  try catch block use korte hobe
                    	try
                		{
                    		Formatter file1 = new Formatter("F:/Eclipse Java/Abashik Hotel/src/Admin/Shoping/orderDetails.txt");////()er moddhe bole dite hobe jei file ta apni use korte chacchen
                    		file1.format("%s%s%s%s\r\n","Customer Name and ID : ",nameforShop,"<-->",phoneForShop);
                    		file1.format("%s\r\n", "____________________________________________________________________________");
                    		file1.format("%s%s%s%s%s%s%s%s%s%s%s\r\n","|"," Item Number ","|"," Product name","|"," Details                 ","|","  Price    ","|"," Status  ","|");
                    		file1.format("%s\r\n", "|---------------------------------------------------------------------------|");
                    		file1.format("%s%s%s%s%s%s%s%s%s%s%s\r\n","|","1410948040","   |","Netgear Router","    |","4 (5dBi)Antena, 3 Room ","|","2400 Taka ","   |","In Stock ","|");
                    		file1.format("%s\r\n", " ----------------------------------------------------------------------------");
                        	file1.close();
                		}
                    	catch(Exception e){
                    		System.out.println("Exception : "+e);
                		}
                     }
                    else
                    {
                    	shopping();
                    }
                }
                else
                {
                	System.out.println("As this product is out of stock ! you can not add to cart !");
                	shopping();
                }
                break;
            case 1410948041 :
            	String product4status = "In Stock";
                System.out.println("Product Name : Glue Gun");
                System.out.println("Do you want to view product picture ? Type here(yes/no) : ");
                String productPic4 = input.next();
                if(productPic4 == "yes")
                {
                    String link4 = "https://shutr.bz/2YM7Y5w";  ////////////////////link change korte hobe 
                    Desktop uri = Desktop.getDesktop();
                	uri.browse(new URI(link4));
                    break;
                }
                else
                {
                	
                }
                if(product4status == "In Stock")
                {
                	System.out.println("Do you want to add to Cart ? (yes/no) : ");
                    String cartDecision2 = input.nextLine();
                    if(cartDecision2 == "yes")
                    {
                       
                    	//file e data entry korar jonno  try catch block use korte hobe
                    	try
                		{
                    		Formatter file1 = new Formatter("F:/Eclipse Java/Abashik Hotel/src/Admin/Shoping/orderDetails.txt");////()er moddhe bole dite hobe jei file ta apni use korte chacchen
                    		file1.format("%s%s%s%s\r\n","Customer Name and ID : ",nameforShop,"<-->",phoneForShop);
                    		file1.format("%s\r\n", "____________________________________________________________________________");
                    		file1.format("%s%s%s%s%s%s%s%s%s%s%s\r\n","|"," Item Number ","|"," Product name","|"," Details                 ","|","  Price    ","|"," Status  ","|");
                    		file1.format("%s\r\n", "|---------------------------------------------------------------------------|");
                    		file1.format("%s%s%s%s%s%s%s%s%s%s%s\r\n","|","1410948041","   |","Glue Gun","    |","With two free glue stick ","|","225 Taka ","   |","In Stock ","|");
                    		file1.format("%s\r\n", " ----------------------------------------------------------------------------");
                        	file1.close();
                		}
                    	catch(Exception e){
                    		System.out.println("Exception : "+e);
                		}
                     }
                    else
                    {
                    	shopping();
                    }
                }
                else
                {
                	System.out.println("As this product is out of stock ! you can not add to cart !");
                	shopping();
                }
                break;
        case 3:
            //Product_you_want();
        	System.out.println("Product you want portion is under construction !");
            break;
        case 4:
            //wish_list();
        	//taking input from user and write that into a .txt file 
        	try 
        	{
        		String productName, productDetails,desirePrice;
        		System.out.print("How many product you want to buy : ");
            	int numberOfDesireProduct = input.nextInt();
            	System.out.println("Please enter product name, details and Your desire Price serially, so that we can give you an offer ! : ");
            	Formatter file2 = new Formatter("F:/Eclipse Java/Abashik Hotel/src/Admin/Shoping/ProductTheyWant.txt");////()er moddhe bole dite hobe jei file ta apni use korte chacchen
            	file2.format("%s%s%s%s\r\n","Customer Name and ID : ",nameforShop,"<-->",phoneForShop);
            	file2.format("%s\r\n", "____________________________________________________________________________");
    			file2.format("%s%s%s%s%s%s%s\r\n","|"," Product name","|"," Details                 ","|","  Your desire Price    ","|");
    			file2.format("%s\r\n", "|---------------------------------------------------------------------------|");
            	for(int i = 1; i <= numberOfDesireProduct; i++)
            	{
            		System.out.print("Give product name, details and desire Price : ");
            		productName = input.nextLine();
            		productDetails = input.nextLine();
            		desirePrice = input.nextLine();
            		file2.format("%s%s%s%s%s%s%s\r\n","|", productName,"|", productDetails                 ,"|",  desirePrice    ,"|");
            	}
            	file2.format("%s\r\n", " ----------------------------------------------------------------------------");
    			file2.close();
        	}
        	catch(Exception e)
        	{
        		System.out.println(e);
        	}
        	
            break;
        case 5:
            //Recently_Added();
        	System.out.println("Recently_Added() portion is under construction !");
            break;
        case 6:
            //UpComing_Proeduct();
        	System.out.println("UpComing_Proeduct() portion is under construction !");
            break;
        case 7:
            //Show_cart();
        	//File theke Data read korte hobe 
        	System.out.println("Show_cart(); portion is under construction ! working on this topic");
        	
        	try
        	{
        		File file = new File("F:/Eclipse Java/Abashik Hotel/src/Admin/Shoping/orderDetails.txt");
        		Scanner fileInput = new Scanner(file); //jehetu file theke data read korbo
        		//File ke she kotokkhon porjonto read korbe .. jotokkhon File e data thakbe..ejonno while loop
        		while(fileInput.hasNext())//hasNext jeta kore .. she ekta line er pore arekta line e jabe .. dekhbe kotokkhon porjonto data ase
        		{
        			//ei loop e jhamela ase may be ., arektu guchaite hobe
        			
        			String cusName, productName, details, status;
        			String phoneNumber, itemNumber, price; //egulao String hishebe declare korlam :(
        			//File theke evabe data read korbe
        			cusName = fileInput.next();
        			phoneNumber = fileInput.next();//ekta jhamela ase .. String theke int e convert hoite parbe na boltese
        			itemNumber = fileInput.next();
        			productName = fileInput.next();
        			details = fileInput.next();
        			price = fileInput.next();
        			status = fileInput.next();
        			//Then shei data console e print korbe 
        			System.out.println("Customer Name and ID : "+cusName+ " "+phoneNumber);
        			System.out.println("____________________________________________________________________________");
        			System.out.println("|"+" Item Number "+"|"+" Product name"+"|"+" Details                 "+"|"+"  Price    "+"|"+" Status  "+"|");
            		System.out.println("|---------------------------------------------------------------------------|");
            		System.out.println("|"+itemNumber+"   |"+productName+"    |"+details+"|"+price+"   |"+status+"|");
            		System.out.println(" ----------------------------------------------------------------------------");
            		
        		}
        	}
        	catch(Exception e)
        	{
        		System.out.println(e);
        	}
            break;
        case 8:
            //Main menu();
        	menuFunction();
            break;
    }
}

	@Override
	public void carParking() 
	{
		System.out.println("This is car parking Section !");
	}

	@Override
	public void noticeBoard() 
	{
		System.out.println("All the notice Are Here !");
		System.out.println("                       1. Pets are not allowed.");
		System.out.println("                       2. Smoking is prohibited in this compound.");
		System.out.println("                       3. Here is no age requirement for check-in.");
		System.out.println("                       4. Enter the dates of your stay and check the conditions of your required room.");
		System.out.println("                       5. For any deficulty.. call 01790-583345");
		System.out.println("                       6. Stay Humble :3");
		System.out.println("                       7. Thanks for your Support ! and please keep patients always .");//////banan vul thakte pare !
	}

	@Override
	public void leisureTime() 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("@@                                             @@");
		System.out.println("@@                                             @@");
		System.out.println("@@                                             @@");
		System.out.println("@@           @@@@@@@@@@@@@@@@@@@@@@@           @@");
		System.out.println("@@           @                     @           @@");
		System.out.println("@@           @       WELCOME       @           @@");
		System.out.println("@@           @  	   TO          @           @@");
		System.out.println("@@           @       LIBRARY       @           @@");
		System.out.println("@@           @                     @           @@");
		System.out.println("@@           @@@@@@@@@@@@@@@@@@@@@@@           @@");
		System.out.println("@@                                             @@");
		System.out.println("@@                                             @@");
		System.out.println("@@                                             @@");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("");
		System.out.println("Here we give you google drive link to reach over 2000 books and some link might not accessible !\\n in that case please use vpn ! Happy reading !");
		System.out.println(">>BEFORE DOWNLOAD MAKE YOUR PHONE AVAILABLE ADOBE READER AND GMAIL ACCOUNT SIGN IN. <<");
		System.out.println("1. 2000 Books download link\t\t 2. 1400 Books download link");
		System.out.println("3. 1000+ Islamic Books download link\t 4. 500+ Islamic Books download link");
		String UrlA = "https://bit.ly/2XLF594";
        String UrlB = "https://bit.ly/2YiQU5H";
        String UrlC = "https://bit.ly/33Zoa4p";
        String UrlD = "https://bit.ly/2XMoqCj";
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.print("WHich link you want to open ?\nType here : ");
        int linkOption = input.nextInt();
        
        Desktop uri = Desktop.getDesktop(); // jekono link browser e open korar jonno 
    	
        switch(linkOption)
        {
        case a:
        	uri.browse(new URI(UrlA));
        	break;
        case b:
        	uri.browse(new URI(UrlB));
        	break;
        case c:
        	uri.browse(new URI(UrlC));
        	break;
        case d:
        	uri.browse(new URI(UrlD));
        	break;
        default:
        	break;
        }
	}

	@Override
	public void helpDesk() 
	{
		Desktop uri = Desktop.getDesktop(); // jekono link browser e open korar jonno 
		Scanner input = new Scanner(System.in);
		System.out.println("Some question you may ask !");
		System.out.println("1. Helpline number ?");
		System.out.println("2. program creators details .");
		System.out.println("3. Our Social media link ");
		System.out.println("4. Email Id");
		System.out.println("5. Ask us anything. Admin will reply later !");
		System.out.println("6. Back to menu !");
		System.out.print("Enter a option number that you want to know/ask : ");
		int helpDeskOptionSelect = input.nextInt();
		switch(helpDeskOptionSelect)
		{
		case 1:
			System.out.println("Our helpline number : 01790-583345");
			break;
		case 2:
			System.out.println("          Mohammad Sheakh");
			System.out.println("247,West Rampura,Dhaka,Bangladesh-1219");
			break;	
		case 3:
			String fbID = "https://bit.ly/3dy9xZv";
			String instaID = "https://bit.ly/365EUdt";
			System.out.println("1. Facebook ID : Mohammad Sheakh");
			System.out.println("2. Instagram handle : _mohammad_sheakh_");
			System.out.print("Type here : ");
			int idSelect = input.nextInt();
			switch(idSelect)
			{
			case 1:
				uri.browse(new URI(fbID));
				break;
			case 2:
				uri.browse(new URI(instaID));
				break;
			default:
				System.out.println("Something is wrong.. check Menu class and Helpdesk");
				break;
			}
			break;
		case 4:
			System.out.println("Mail ID : mohammad.sheakh@gmail.com");
			String mailMe = "https://bit.ly/33FwFBQ";
			uri.browse(new URI(mailMe));
			break;
		case 5:
			System.out.println("____________________________________________________________________________");
			String nameforHelpDesk,phoneforHelpdesk,messageHelpDesk;
			
			//Folder create korar jonno 
    		File dir = new File("F:/Eclipse Java/Abashik Hotel/src/Admin/HelpDesk");
    		dir.mkdir(); //make directory
    		File folder1 = new File("F:/Eclipse Java/Abashik Hotel/src/Admin/HelpDesk/Question.txt");
    		try 
    		{
    			folder1.createNewFile();//File create korar jonno amra ei method ta use korbo
    			System.out.println("Files are created"); //file create hoile ei message ta print hobe
    		}
    		catch(Exception e)
    		{
    			System.out.println(e);
    		}
    		//file e data entry korar jonno  try catch block use korte hobe
    		try
    		{
    			Formatter file1 = new Formatter("F:/Eclipse Java/Abashik Hotel/src/Admin/HelpDesk/Question.txt");////()er moddhe bole dite hobe jei file ta apni use korte chacchen
    			//file1.format("%s%s%s%s\r\n","Customer Name and ID : ",nameforShop,"<-->",phoneForShop);
    			file1.format("%s\r\n", "____________________________________________________________________________");
    			System.out.println("Enter Your Name : ");
    			nameforHelpDesk = input.next();
    			System.out.println("Your Phone Number/Fb Id :");
    			phoneforHelpdesk = input.next();
    			System.out.println("Type message to us : ");
    			messageHelpDesk = input.next();
    			file1.format("%s%s%s\r\n","|"," Customer Name  ","|"," Phone Number/Fb Id  ","|"," message to us :   ","|");
    			file1.format("%s\r\n","|---------------------------------------------------------------------------|");
    			file1.format("%s%s%s%s%s%s%s\r\n","|",nameforHelpDesk,"   |",phoneforHelpdesk,"    |",messageHelpDesk,"|");
    			file1.format("%s\r\n"," ----------------------------------------------------------------------------");
    			file1.close();
    		}
    		catch(Exception e)
    		{
    			System.out.println("Exception : "+e);
    		}
    		break;
		case 6:
			menuFunction();
			break;
		default:
			System.out.println("This is default");
			menuFunction();
			break;
				
		}
	}

	@Override
	public void foodOrder() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("In which time you want to order your food ? ");
		System.out.println("                1. Breakfast. ");
		System.out.println("                2. Lunch. ");
		System.out.println("                3. Dinner. ");
		System.out.println("Please enter your choice : ");
		int timeChoice = input.nextInt();
		switch(timeChoice)
        {
            case 1:
            	break;
            case 2:
            	break;
            case 3:
            	break;
            default:
            	break;
        }
		
		
	}

	@Override
	public void dayCount() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is day count section !");
	}

	@Override
	public void availableCar() 
	{
		// TODO Auto-generated method stub
		System.out.println("This is Uber Section !");
	}

	@Override
	public void carService() 
	{
		System.out.println("This is Uber Section !");
		
	}

	@Override
	public void billPay() 
	{
		System.out.println("This is Bill Pay Function !");
		
	}

	@Override
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

	@Override
	public void regDetails() 
	{
		Date date = new Date();
		SimpleDateFormat Format = new SimpleDateFormat("hh:mm:ss");
		System.out.println("|-----------------------------------------------------------------|");
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
        System.out.println("Here's all your data :");
		System.out.println("Your Name    : ");
		System.out.println("Your NID     : ");
		System.out.println("Flat Package : ");
		System.out.println("Day          : ");
		System.out.println("Day Passed   : ");
	}
}
