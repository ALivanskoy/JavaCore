package FirstPackage;

public class SomeClass {

    protected int someNumber;
    protected String someFieldOne;
    protected String getSomeFieldTwo;

    public SomeClass(int someNumber, String someFieldOne, String getSomeFieldTwo) {
        this.someNumber = someNumber;
        this.someFieldOne = someFieldOne;
        this.getSomeFieldTwo = getSomeFieldTwo;
    }

    public int getSomeNumber() {
        return someNumber;
    }

    public void setSomeNumber(int someNumber) {
        this.someNumber = someNumber;
    }

    public String getSomeFieldOne() {
        return someFieldOne;
    }

    public void setSomeFieldOne(String someFieldOne) {
        this.someFieldOne = someFieldOne;
    }

    public String getGetSomeFieldTwo() {
        return getSomeFieldTwo;
    }

    public void setGetSomeFieldTwo(String getSomeFieldTwo) {
        this.getSomeFieldTwo = getSomeFieldTwo;
    }
}
