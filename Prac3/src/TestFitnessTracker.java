public class TestFitnessTracker
{
    public static void main(String[] args)
    {
        FitnessTracker a = new FitnessTracker();
        a.showData();
        FitnessTracker b = new FitnessTracker("Swimming", 10, "April 9");
        b.showData();
    }
}
