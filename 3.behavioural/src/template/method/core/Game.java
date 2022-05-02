package template.method.core;

public interface Game {
    void init();
    void start();
    void end();

    default void play() {
        init();
        start();
        end();
    }
}
