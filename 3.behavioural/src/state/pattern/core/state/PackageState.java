package state.pattern.core.state;

import state.pattern.core.Package;

public interface PackageState {
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
