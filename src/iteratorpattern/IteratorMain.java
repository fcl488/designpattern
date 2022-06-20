package iteratorpattern;

public class IteratorMain {
    public static void main(String[] args) {
        Book book1 = new Book("巴黎圣母院");
        Book book2 = new Book("周易");
        Book book3 = new Book("圣经");
        Book book4 = new Book("金刚经");
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(book1);
        bookShelf.appendBook(book2);
        bookShelf.appendBook(book3);
        bookShelf.appendBook(book4);
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
