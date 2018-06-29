
public class Factorials
{
    public static void main(String args[])
    {
        int num, factorial;
        final int MAX = 10;

        for (num = 1; num <= MAX; num++)
        {
            factorial = num;
            for (int i = num - 1; i > 0; --i)
                factorial = factorial * i;
            System.out.println(num + " factorial is " + factorial);
        }
    }
}
