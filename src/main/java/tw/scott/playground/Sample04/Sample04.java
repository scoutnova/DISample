package tw.scott.playground.Sample04;

import tw.scott.playground.util.DiContainer;

public class Sample04 {
    public Sample04() {
        DiContainer diContainer = DiContainer.getInstance();
        diContainer.inject("ElementDI", new ElementDI(1000));
    }

    public int getPowerInElementWithDI() {
        ElementDI element = (ElementDI)DiContainer.getInstance().getInjection("ElementDI");
        return element.getPower();
    }
    public int getPowerInElementWithSingleton() {
        return ElementSingleton.getInstance().getPower();
    }
}
