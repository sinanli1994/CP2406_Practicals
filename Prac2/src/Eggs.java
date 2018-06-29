import java.util.Scanner;
public class Eggs
{
    public static void main(String[] args)
    {
        int eggs, dozens, looseEggs;
        double total;
        final int DOZEN = 12;
        final double DOZEN_EGGS = 3.25, IND_EGGS = 0.45;
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("Please enter the number of eggs >>");
        eggs = inputDevice.nextInt();
        dozens = eggs / DOZEN;
        looseEggs = eggs % DOZEN;
        total = dozens * DOZEN_EGGS + looseEggs * IND_EGGS;
        System.out.println("You ordered "+ eggs + " eggs. That's " + dozens + " dozen at $3.25 per dozen and " + looseEggs + " at 45 cents each for a total of $" + total);
    }
}
