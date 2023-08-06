package designpattern.creational_patterns.factory_method.before;

public class Client {

    public static void main(String[] args) {
        Ship whiteShip = ShipFactory.orderShip("WhiteShip", "greg0917@naver.com");
        System.out.println(whiteShip);

        System.out.println();

        Ship blackShip = ShipFactory.orderShip("BlackShip", "greg0917@naver.com");
        System.out.println(blackShip);
    }

}
