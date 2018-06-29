public class FitnessTracker
{
    private String activity;
    private int minNum;
    private String date;
    public FitnessTracker(String activity, int minutes, String date)
    {
        this.activity = activity;
        this.minNum = minutes;
        this.date = date;
    }

    public FitnessTracker()
    {
        this("running", 0, "January 1");
    }

    public void showData()
    {
        System.out.println("Activity: " + activity + " Minutes: " + minNum + " Data: " +  date);
    }
}
