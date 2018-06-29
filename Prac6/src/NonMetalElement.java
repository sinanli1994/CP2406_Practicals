public class NonMetalElement extends Element
{
    public NonMetalElement(String sym, int num, double weight)
    {
        super(sym, num, weight);
    }

    @Override
    public void describeElement()
    {
        System.out.println("The non-metal is " + getSymbol() + " and the atomic number is " + getAtoNum() + "and the atomic weight is " + getAtoWeight());
    }
}
