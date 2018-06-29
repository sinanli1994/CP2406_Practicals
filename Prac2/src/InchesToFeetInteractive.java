import java.util.Scanner;
public class InchesToFeetInteractive
{
    public static void main(String[] args)
    {
        int inches, feet, inches2;
        final int conversion = 12;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter your inches >>");
        inches = inputDevice.nextInt();
        feet = inches / conversion;
        inches2 = inches % conversion;
        System.out.println(inches + " inches becomes " + feet + " feet and " + inches2 + " inches");
    }
}
