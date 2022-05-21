import java.util.Scanner;
import java.lang.Math;
public class Armstrongnumbercheck {

//function to check if the number is Armstrong or not
        static boolean isArmstrong(int n)
        {
            int x, digits=0, last=0, sum=0;
//assigning n into a X variable
            x=n;
//loop execute until the condition becomes false
            while(x>0)
            {
                x = x/10;
                digits++;
            }
            x = n;
            while(x>0)
            {
//determines the last digit from the number
                last = x % 10;
//calculates the power of a number up to digit times and add the resultant to the sum variable
                sum +=  (Math.pow(last, digits));
//removes the last digit
                x = x/10;
            }
//compares the sum with n
            if(n==sum)
//returns if sum and n are equal
                return true;
//returns false if sum and n are not equal
            else return false;
        }
//driver code
        public static void main(String args[])
        {
            int num;
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the limit: ");
//reads the limit from the user
            num=sc.nextInt();
            System.out.println("Armstrong Number up to "+ num + " are: ");
            for(int i=0; i<=num; i++)
//function calling
                if(isArmstrong(i))
//prints the armstrong numbers
                    System.out.print(i+ ", ");
        }
    }
