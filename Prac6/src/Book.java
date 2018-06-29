public abstract class Book
{
    private String bookTitle;
    double price;

    public Book(String title)
    {
        bookTitle = title;
    }

    public String getBookTitle()
    {
        return bookTitle;
    }

    public double getPrice()
    {
        return price;
    }

    public abstract void setPrice();
}
