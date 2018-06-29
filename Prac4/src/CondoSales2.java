import java.util.Scanner;
public class CondoSales2
{
    public static void main(String args[])
    {
        int choNum, choNum2;
        int park = 150000, golf = 170000, lake = 210000, price = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your choice: \n1 - Park view\n2 - Golf course view\n3 - Lake view");
        choNum = input.nextInt();

        if (choNum == 1)
        {
            price = park;
        }
        else
        if (choNum == 2)
        {
            price = golf;
        }
        else
        if (choNum == 3)
        {
            price = lake;
        }
        else
        {
            System.out.println("Price is $0");
        }

        System.out.println("Please enter your choice: \n1 - Garage\n2 - Parking space");
        choNum2 = input.nextInt();
        if (choNum2 == 1)
        {
            price += 5000;
            System.out.println("Your final price is $" + price);
        }
        else
        if (choNum2 == 2)
        {
            System.out.println("Your final price is $" + price);
        }
        else
        {
            System.out.println("Invalid choice.Your final price is $" + price);
        }
    }
}

