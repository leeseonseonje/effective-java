package effective.java.effectivejava.item37.code;

import lombok.Getter;

@Getter
public class Plant {

    private String name;
    private LifeCycle lifeCycle;

    public Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return name;
    }
}
