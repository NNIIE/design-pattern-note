package designpattern.creational_patterns.factory_method.before;

public class ShipFactory {

    public static Ship orderShip(String name, String email) {
        // validate
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }

        prepareFor(name);

        Ship ship = new Ship();
        ship.setName(name);

        // logo
        if (name.equalsIgnoreCase("whiteShip")) {
            ship.setLogo("white");
        } else if (name.equalsIgnoreCase("blackShip")) {
            ship.setLogo("black");
        }

        // color
        if (name.equalsIgnoreCase("whiteShip")) {
            ship.setColor("white");
        } else if (name.equalsIgnoreCase("blackShip")) {
            ship.setColor("black");
        }

        // notify
        sendEmailTo(email, ship);

        return ship;
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 제작 준비 중");
    }

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 제작 완료");
        System.out.println(email + " 전송 완료");
    }

}
