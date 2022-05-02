package template.method.core.v2;


import java.util.function.Consumer;
import java.util.function.Function;

public interface FunctionalInterfaceGame<T,R> {
    Consumer<String> init();
    Function<T, R> start();
    Consumer<R> end();

    default void play(String initGameMessage, T startGameParam) {
        init().accept(initGameMessage);
        R gameResult = start().apply(startGameParam);
        end().accept(gameResult);
    }
}
