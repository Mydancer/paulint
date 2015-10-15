
package tryandcatch;
import java.util.Scanner;
public class trycatch {


    public static void main(String[]args) 
    {
 Scanner input = new Scanner(System.in);
 boolean bError = true;
 int n1 = 0, n2 = 0,
nQuotient = 0;
        do 
        {
            try 
            {
                System.out.println("Enter first num: ");
                n1 = input.nextInt();
                System.out.println("Enter second num: ");
                n2 = input.nextInt();
                nQuotient = n1/n2;
                bError = false;
            }
            catch (Exception e) 
            {
                System.out.println("Error!");
            }
        } 
        while (bError);
       
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(nQuotient);
    }
}
