package tw.scott.playground;

import tw.scott.playground.another.SomeDifficultModule;

public class Sample02 {
    private SomeDifficultModule something1;
    private String something2;

    public Sample02() {
        this.something1 = SomeDifficultModule.SomeDifficultModuleBuilder.aSomeDifficultModule().build();
        this.something2 = "456";
    }

    public SomeDifficultModule getSomething1() {
        return something1;
    }

    public String getSomething2() {
        return something2;
    }
}
