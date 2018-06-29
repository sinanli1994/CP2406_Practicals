public abstract class Element
{
    String symbol;
    int atoNum;
    double atoWeight;

    public Element(String sym, int num, double weight)
    {
        symbol = sym;
        atoNum = num;
        atoWeight = weight;
    }

    public String getSymbol()
    {
        return symbol;
    }

    public int getAtoNum()
    {
        return atoNum;
    }

    public double getAtoWeight()
    {
        return atoWeight;
    }

    public abstract void describeElement();
}
