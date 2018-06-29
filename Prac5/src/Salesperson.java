public class Salesperson
{
    private int idNum;
    private double salAmount;

    public Salesperson(int idNum, double salAmount)
    {
        this.idNum = idNum;
        this.salAmount = salAmount;
    }

    public int getIdNum()
    {
        return idNum;
    }

    public void setIdNum(int newId)
    {
        idNum = newId;
    }

    public double getSalAmount()
    {
        return salAmount;
    }

    public void setSalAmount(double newSalAmount)
    {
        salAmount = newSalAmount;
    }


}
