package iteratorpattern;

public class BookShelf implements Aggregate{
    private Book[] books;
    private int last = 0;
    public BookShelf(int maxSize){
        this.books = new Book[maxSize];
    }
    public Book getBook(int index){
        return books[index];
    }
    public void appendBook(Book book){
        books[last] = book;
        last++;
    }
    public int getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
