import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class TwelveInts
{
    public static void main(String args[])
    {
        int[] somNums = {1,2,3,4,5,6,7,8,9,10,11,12};
        for (int i = 0; i < somNums.length; ++i)
        {
            System.out.println(somNums[i]);
        }

        for (int j = somNums.length - 1; j >= 0; --j)
        {
            System.out.println(somNums[j]);
        }
    }
}
