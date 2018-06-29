public class BookArray
{
    public static void main(String[] args)
    {
        Book[] books = new Book[10];

        books[0] = new Fiction("a");
        books[1] = new Fiction("a");
        books[2] = new NonFiction("b");
        books[3] = new Fiction("a");
        books[4] = new Fiction("a");
        books[5] = new NonFiction("b");
        books[6] = new NonFiction("b");
        books[7] = new NonFiction("b");
        books[8] = new Fiction("a");
        books[9] = new Fiction("a");

        for (int i = 0; i < books.length; ++i)
        {
            System.out.println("The book is " + books[i].getBookTitle() + " and price is " + books[i].getPrice());
        }
    }
}
