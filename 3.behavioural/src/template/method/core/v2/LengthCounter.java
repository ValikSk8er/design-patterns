package template.method.core.v2;

import java.util.function.Consumer;
import java.util.function.Function;

public class LengthCounter implements FunctionalInterfaceGame<String, Integer> {

    @Override
    public Consumer<String> init() {
        return s -> System.out.println("Predefined steps, init message: " + s );
    }

    @Override
    public  Function<String, Integer> start() {
        return String::length;
    }

    @Override
    public Consumer end() {
        return s -> System.out.println("Predefined steps, end game. Message counter is: " + s );
    }
}

