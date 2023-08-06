package designpattern.creational_patterns.factory_method.java;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ship {

    private String name;
    private String color;
    private String logo;

    @Override
    public String toString() {
        return String.format("{name = %s, color = %s, loge = %s}", name, color, logo);
    }

}
