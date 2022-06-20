package adapterpattern;

public class AdapterMain {
    public static void main(String[] args) {
        Print print = new PrintBanner("hello");
        print.printStrong();
        print.printWeak();
    }
}
