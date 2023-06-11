package SecondPackage;

import java.util.LinkedList;
import java.util.List;

public class AnotherClass {

    Boolean someBoolean;
    Double someStrangeNumber;

    public AnotherClass(Boolean someBoolean, Double someStrangeNumber) {
        this.someBoolean = someBoolean;
        this.someStrangeNumber = someStrangeNumber;
    }

    public Boolean getSomeBoolean() {
        return someBoolean;
    }

    public void setSomeBoolean(Boolean someBoolean) {
        this.someBoolean = someBoolean;
    }

    public Double getSomeStrangeNumber() {
        return someStrangeNumber;
    }

    public void setSomeStrangeNumber(Double someStrangeNumber) {
        this.someStrangeNumber = someStrangeNumber;
    }
}
