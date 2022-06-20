package templatemethodpattern;

public class TemplateMethodMain {
    public static void main(String[] args) {
        CharDisplay charDisplay = new CharDisplay('c');
        charDisplay.display();
        System.out.println();
        StringDisplay stringDisplay = new StringDisplay("hello world!!!");
        stringDisplay.display();
    }
}
