class Numeric<T extends Number> {

    private T num;

    Numeric(T num) {
        this.num = num;
    }

    double getReciprocal() {
        return 1.0 / num.doubleValue();
    }

    double getFraction() {
        double value = num.doubleValue();
        return value - (int) value;
    }

    boolean absEqual(Numeric<?> other) {
        double a = Math.abs(this.num.doubleValue());
        double b = Math.abs(other.num.doubleValue());
        return a == b;
    }
}

public class NumericTest {
    public static void main(String[] args) {

        Numeric<Double> n1 = new Numeric<>(9.76);
        Numeric<Float> n2 = new Numeric<>(-9.76f);

        System.out.println(n1.getReciprocal());
        System.out.println(n1.getFraction());
        System.out.println(n1.absEqual(n2));
    }
}