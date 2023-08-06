package designpattern.creational_patterns.singleton;

/**
 * double checked locking
 */
public class Singleton2 {

    private static volatile Singleton2 instanse;

    private Singleton2() {}

    public static Singleton2 getInstance() {
        if (instanse == null) {
            synchronized (Singleton2.class) {
                if (instanse == null) {
                    instanse = new Singleton2();
                }
            }
        }
        return instanse;
    }

}
