public class BloodData
{
    private String bloodType;
    private String rhFactor;
    public BloodData(String bloodType, String rhFactor)
    {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public BloodData()
    {
        this("A", "+");
    }

    public void setBloodType(String newBloodType)
    {
        bloodType = newBloodType;
    }

    public String getBloodType()
    {
        return bloodType;
    }

    public void setRhFactor(String newRhFactor)
    {
        rhFactor = newRhFactor;
    }

    public String getRhFactor()
    {
        return rhFactor;
    }
}
