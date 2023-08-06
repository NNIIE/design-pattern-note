package designpattern.creational_patterns.factory_method.java;

public class WhiteShip extends Ship {

    private static final String NAME = "whiteShip";

    public WhiteShip(String name) {
        setName(name);
        setLogo("white");
        setColor("white");
    }

}
