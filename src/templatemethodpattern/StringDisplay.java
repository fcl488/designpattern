package templatemethodpattern;

public class StringDisplay extends AbstractDisplay{
    private String str;

    public StringDisplay(String s){
        this.str = s;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void close() {
        printLine();
    }

    @Override
    public void print() {
        System.out.print("|");
        System.out.print(str);
        System.out.println("|");
    }

    private void printLine() {
        System.out.print("+");
        for (int i=0;i< str.length();i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
