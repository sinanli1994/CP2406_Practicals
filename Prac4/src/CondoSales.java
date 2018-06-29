import java.util.Scanner;
public class CondoSales
{
    public static void main(String args[])
    {
        int choNum;
        int park = 150000, golf = 170000, lake = 210000;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your choice: \n1 - Park view\n2 - Golf course view\n3 - Lake view");
        choNum = input.nextInt();
        if (choNum == 1)
        {
            System.out.println("Park view condos are $" + park);
        }
        else
        if (choNum == 2)
        {
            System.out.println("Condos with golf course views are $" + golf);
        }
        else
        if (choNum == 3)
        {
            System.out.println("Condos with lake views are $" + lake);
        }
        else
        {
            System.out.println("Price is $0");
        }
    }
}
