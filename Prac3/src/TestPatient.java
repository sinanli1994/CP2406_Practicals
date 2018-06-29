public class TestPatient
{
    public static void main(String[] args)
    {
        Patient a = new Patient();
        Patient b = new Patient(1234, 15, "A", "-");
        display(a);
        display(b);
        a.setIDNum(3456);
        a.setAge(50);
        a.setBloodData("AB","1");
        display(a);
    }

    public static void display(Patient p)
    {
        String bloodData = p.getBloodData();
        System.out.println("Patient ID number is "+ p.getIDNum() + " Age is " + p.getAge() + " Blood data is " + p.getBloodData());
    }
}
