package designpattern.creational_patterns.factory_method.simple;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteShip")) {
            return new WhiteShip(name);
        } else if (name.equals("blackShip")) {
            return new BlackShip(name);
        }
        throw new IllegalArgumentException();
    }

}
