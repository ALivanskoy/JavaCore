package os.enums;

public enum DiscountSize {
    ZERO(0),
    FIVE(5),
    TEN(10),
    FIFTEEN(15),
    TWENTY(20);

    private final int value;

    DiscountSize(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
