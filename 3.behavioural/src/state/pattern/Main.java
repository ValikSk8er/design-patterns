package state.pattern;

import state.pattern.core.Package;

/**
* https://www.baeldung.com/java-state-design-pattern
*/
public class Main {
    public static void main(String[] args) {
        Package pkg = new Package();

        //OrderedState
        pkg.previousState();
        System.out.println(pkg.getState().getClass().getSimpleName());
        pkg.printStatus();

        //DeliveredState
        pkg.nextState();
        System.out.println(pkg.getState().getClass().getSimpleName());
        pkg.printStatus();

        //ReceivedState
        pkg.nextState();
        System.out.println(pkg.getState().getClass().getSimpleName());
        pkg.printStatus();

        //ReceivedState
        pkg.nextState();
    }
}
