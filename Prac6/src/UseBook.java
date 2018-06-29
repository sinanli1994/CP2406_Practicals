public class UseBook
{
    public static void main(String arge[])
    {
        Fiction a = new Fiction("a");
        NonFiction b = new NonFiction("b");
        System.out.println("Fiction is " + a.getBookTitle() + " and price is " + a.getPrice());
        System.out.println("Non-Fiction is " + b.getBookTitle() + " and price is " + b.getPrice());
    }
}
