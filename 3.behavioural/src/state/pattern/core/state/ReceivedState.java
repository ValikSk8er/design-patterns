package state.pattern.core.state;

import state.pattern.core.Package;

public class ReceivedState implements PackageState {
    @Override
    public void next(Package pkg) {
        System.out.println("This is the final state");
    }

    @Override
    public void prev(Package pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("This package is already received by a client.");
    }
}
