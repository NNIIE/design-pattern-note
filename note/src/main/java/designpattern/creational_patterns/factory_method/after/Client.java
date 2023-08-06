package designpattern.creational_patterns.factory_method.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();

        client.print(new WhiteShipFactory(), "WhiteShip", "greg0917@naver.com");
        System.out.println();
        client.print(new BlackShipFactory(), "BlackShip", "greg0917@naver.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }

}
