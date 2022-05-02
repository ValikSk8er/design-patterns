package state.pattern.core;

import state.pattern.core.state.OrderedState;
import state.pattern.core.state.PackageState;

public class Package {
    //defines default state
    private PackageState state = new OrderedState();

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void previousState() {
        state.prev(this);
    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}
