public class MetalElement extends Element
{
    public MetalElement(String sym, int num, double weight)
    {
        super(sym, num, weight);
    }

    @Override
    public void describeElement()
    {
        System.out.println("The metal is " + getSymbol() + " and the atomic number is " + getAtoNum() + "and the atomic weight is " + getAtoWeight());
    }
}
