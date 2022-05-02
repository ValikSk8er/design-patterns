package template.method.core;

public class MortalCombat implements Game {

    @Override
    public void init() {
        System.out.println("Mortal Combat Game Init!");
    }

    @Override
    public void start() {
        System.out.println("Mortal Combat Game Started!");
    }

    @Override
    public void end() {
        System.out.println("Mortal Combat Game Finished!");
    }
}
