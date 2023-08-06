package designpattern.creational_patterns.factory_method.after;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        Ship ship = createShip(name);
        sendEmailTo(email, ship);

        return ship;
    }

    Ship createShip(String name);

    private static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 제작 완료");
        System.out.println(email + " 전송 완료");
    }

    private void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private static void prepareFor(String name) {
        System.out.println(name + " 제작 준비 중");
    }

}
