public class TestBloodData
{
    public static void main(String[] args)
    {
        BloodData a = new BloodData();
        BloodData b = new BloodData("AB", "-");
        System.out.println("Blood type is " + a.getBloodType() + " and Rh factor is " + a.getRhFactor());
        System.out.println("Blood type is " + b.getBloodType() + " and Rh factor is " + b.getRhFactor());

        a.setBloodType("O");
        a.setRhFactor("-");
        System.out.println("Blood type is " + a.getBloodType());
        System.out.println("Rh factor is " + a.getRhFactor());
    }
}
