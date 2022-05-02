package template.method.core;

public class Chess implements Game {

    @Override
    public void init() {
        System.out.println("Chess Game Init!");
    }

    @Override
    public void start() {
        System.out.println("Chess Game Started!");
    }

    @Override
    public void end() {
        System.out.println("Chess Game Finished!");
    }
}
