 import java.util.Scanner;
public class ProceduralCode
{
public static void main (String args [])
{
double fixedbalance;
Scanner input = new Scanner (System.in);  
System.out.println("Enter the amount: ");  
fixedbalance = input.nextDouble();

double totalEvents;
System.out.println("Enter the total events you will be organizing: ");
totalEvents = input.nextDouble();
double dividedbudget = fixedbalance/totalEvents;
System.out.println(dividedbudget);
//put if else or switch statment according to the budget and display the options.
if (dividedbudget <= 100000)
{
   System.out.println("Here are the few option you can consider"
           +             "     Mutton Karahi "
           
           +             " Chicken Biryani "
           
           +              "   Russian Salad  "
           
           +                   "      Kheer    "
           
                    +        "   ColdDinks   ");
}
   if (dividedbudget >= 200000)
   {
   System.out.println("Here are the few options you can consider"+
           "                      Chicken Corn Soup      "+
           "                     Egg Fried Rice with Shaslik     "+
           "                           Mixed Veggies                  "+
           "                           Achar Gosht                    "+
           "                           Fried Fish                     "+
           "                            Kheer                         "+
           "                            Greek Salad                    "
              );
   }
   else 
   {
   System.out.println("Please enter a valid amount");
   }
            
   }
   

 
    

}
