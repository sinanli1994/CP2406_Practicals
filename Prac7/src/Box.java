public class Box
{
    private int numberOfItems;

    public Box(int n) {
        this.numberOfItems = n;
    }

    public void remove() throws EmptyBoxException {
        if (numberOfItems == 0 ) throw new EmptyBoxException(" ");
        numberOfItems -=1 ;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
}
