public class Patient
{
    private int IDNum;
    private int age;
    private BloodData bloodData;
    public Patient(int IDNum, int age, String bloodType, String RhFactor)
    {
        this.IDNum = IDNum;
        this.age = age;
        bloodData = new BloodData(bloodType, RhFactor);
    }

    public Patient()
    {
        IDNum = 1234;
        age = 10;
        bloodData = new BloodData("O", "+");
    }

    public int getIDNum()
    {
        return IDNum;
    }

    public void setIDNum(int newID)
    {
        this.IDNum = newID;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int newAge)
    {
        this.age = newAge;
    }

    public String getBloodData()
    {
        return bloodData.getBloodType() + bloodData.getRhFactor();
    }

    public void setBloodData(String type, String rh)
    {
        bloodData.setBloodType(type);
        bloodData.setRhFactor(rh);
    }
}
