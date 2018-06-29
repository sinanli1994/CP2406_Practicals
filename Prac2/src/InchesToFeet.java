public class InchesToFeet
{
    public static void main(String args[])
    {
        int inches, feet,inches2;
        final int conversion = 12;

        inches = 30;
        feet = inches / conversion;
        inches2 = inches % conversion;

        System.out.println(inches + " inches becomes " + feet + " feet and " + inches2 + " inches");
    }
}
