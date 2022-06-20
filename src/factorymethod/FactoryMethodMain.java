package factorymethod;

import factorymethod.framework.Product;
import factorymethod.idcard.IDCardFactory;

public class FactoryMethodMain {
    public static void main(String[] args) {
        IDCardFactory idCardFactory = new IDCardFactory();
        Product amy = idCardFactory.create("Amy");
        Product mike = idCardFactory.create("mike");
        Product tom = idCardFactory.create("tom");
        amy.use();
        mike.use();
        tom.use();
    }
}
