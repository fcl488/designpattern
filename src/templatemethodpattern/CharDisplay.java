package templatemethodpattern;

public class CharDisplay extends AbstractDisplay{
    private char ch;

    public CharDisplay(char c){
        this.ch = c;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void close() {
        System.out.println(">>");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }
}
