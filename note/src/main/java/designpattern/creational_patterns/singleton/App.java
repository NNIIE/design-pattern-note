package designpattern.creational_patterns.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) {
        Singleton3 singleton1 = Singleton3.getInstance();
        Singleton3 reflection = reflection();

        System.out.println(singleton1 == reflection);
    }

    // 싱글톤 깨트리는 방법 (리플렉션 사용)
    private static Singleton3 reflection() {
        try {
            Constructor<Singleton3> constructor = Singleton3.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            return constructor.newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * 싱글톤 깨트리는 방법 (직렬화 & 역직렬화 사용)
     * Singleton3 > implements Serializable

    private static Singleton3 serializationAndDeserialization() {
        Singleton3 singleton = Singleton3.getInstance();
        Singleton3 singleton1 = null;

        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.obj"))) {
            out.writeObject(singleton);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.obj"))) {
            singleton1 = (Singleton3) in.readObject();
            return singleton1;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
     */

}
