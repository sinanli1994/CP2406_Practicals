public class DemoBox
{
    public static void main(String args[])
    {
        Box b1 = new Box(1);

        try {
            b1.remove();
            b1.remove();
            System.out.println("Item number: " + b1.getNumberOfItems());
        } catch (EmptyBoxException e) {
            System.out.println("The box is empty.");
        }
    }
}
