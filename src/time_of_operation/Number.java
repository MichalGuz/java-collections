package time_of_operation;

public class Number {
    Integer number;
    Integer parameter;

    public Number(Integer number, Integer parameter) {
        this.number = number;
        this.parameter = parameter;
    }

    @Override
    public boolean equals(Object o) {
        final Number n = (Number) o;
        return this.number.equals(n.number) && this.parameter.equals(n.parameter);
    }

    @Override
    public int hashCode() {
        return parameter/1000;
    }
}
