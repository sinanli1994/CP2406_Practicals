import java.util.Scanner;
public class EvenEntryLoop
{
    public static void main(String args[])
    {
        int num;
        final int SEN_VALUE = 2;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an even number: ");
        num = input.nextInt();

        while (num != SEN_VALUE)
        {
            if (num % 2 == 0)
                System.out.println("Good job!");
            else
                System.out.println("Invalid number.");
            System.out.println("Please enter an even number: ");
            num = input.nextInt();
        }
    }
}
