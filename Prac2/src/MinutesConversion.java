import java.util.Scanner;
public class MinutesConversion
{
    public static void main(String[] args)
    {
        int minutes, hours;
        double days;
        final int HOURS_CON = 60, DAYS_CON = 1440;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter the number of minutes >>");
        minutes = inputDevice.nextInt();
        hours = minutes / HOURS_CON;
        days = (double) minutes / DAYS_CON;
        System.out.println(minutes + " minutes equals " + hours + " hours and equals " + days + " days.");
    }
}
