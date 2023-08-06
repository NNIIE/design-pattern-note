package designpattern.creational_patterns.factory_method.java;

public class BlackShip extends Ship {

    private static final String NAME = "blackShip";

    public BlackShip(String name) {
        setName(name);
        setLogo("black");
        setColor("black");
    }

}
