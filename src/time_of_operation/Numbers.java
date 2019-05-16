package time_of_operation;

public class Numbers {
    Integer number;
    Integer parameter;

    public Numbers(Integer number, Integer parameter) {
        this.number = number;
        this.parameter = parameter;
    }

    @Override
    public boolean equals(Object o) {
        final Numbers n = (Numbers) o;
        return this.number.equals(n.number) && this.parameter.equals(n.parameter);
    }

    @Override
    public int hashCode() {
        return number / 100;
    }
}
