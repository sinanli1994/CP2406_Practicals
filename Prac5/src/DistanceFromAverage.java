import java.util.Scanner;
public class DistanceFromAverage
{
    public static void main(String args[])
    {
        int count = 0;
        double[] numbers = new double[20];
        double number, total = 0, average, distance;
        final int QUIT = 99999;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your numbers or enter " + QUIT + " to quit");
        number = input.nextDouble();

        while (number != QUIT && count < numbers.length)
        {
            numbers[count] = number;
            total += numbers[count];
            ++count;
            if (count < numbers.length)
            {
                System.out.println("Please enter your numbers or enter " + QUIT + " to quit");
                number = input.nextDouble();
            }
        }

        if (count == 0)
        {
            System.out.println("You didn't enter any valid number.");
        }
        else
        {
            average = total / (double)count;
            System.out.println("The average is " + average);
            for (int i = 0; i < count; ++i)
            {
                distance = numbers[i] - average;
                System.out.println("Your number is " + numbers[i] + "\nYour number's distance from average is " + distance);
            }
        }
    }
}
