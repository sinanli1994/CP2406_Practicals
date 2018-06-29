public class ElementArray
{
    public static void main(String args[])
    {
        Element[] elements = new Element[4];

        elements[0] = new MetalElement("Li", 3, 6.941);
        elements[1] = new NonMetalElement("C", 6, 12.01);
        elements[2] = new MetalElement("Be", 4, 9.012);
        elements[3] = new NonMetalElement("N", 7, 14.01);

        for (int i = 0; i < elements.length; ++i)
        {
            elements[i].describeElement();
        }
    }
}
