package tech.tablesaw.columns.quantity;

import tech.units.indriya.unit.BaseUnit;

import javax.measure.Quantity;
import javax.measure.Unit;

public class NullQuantity implements Quantity<NullQuantity> {

    private static NullQuantity INSTANCE;

    private final Unit<NullQuantity> nullUnit = new BaseUnit<>("", "nullUnit");

    private NullQuantity() {}


    public static NullQuantity getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NullQuantity();
        }

        return INSTANCE;
    }


    @Override
    public Quantity<NullQuantity> add(Quantity<NullQuantity> addend) {
        return this;
    }

    @Override
    public Quantity<NullQuantity> subtract(Quantity<NullQuantity> subtrahend) {
        return this;
    }

    @Override
    public Quantity<?> divide(Quantity<?> divisor) {
        return this;
    }

    @Override
    public Quantity<NullQuantity> divide(Number divisor) {
        return this;
    }

    @Override
    public Quantity<?> multiply(Quantity<?> multiplicand) {
        return this;
    }

    @Override
    public Quantity<NullQuantity> multiply(Number multiplicand) {
        return this;
    }

    @Override
    public Quantity<NullQuantity> to(Unit<NullQuantity> unit) {
        return this;
    }

    @Override
    public Quantity<?> inverse() {
        return this;
    }

    @Override
    public Quantity<NullQuantity> negate() {
        return this;
    }

    @Override
    public <T extends Quantity<T>> Quantity<T> asType(Class<T> type) throws ClassCastException {
        throw new UnsupportedOperationException("Cast of NullQuantity is not supported");
    }

    @Override
    public Number getValue() {
        return Double.NaN;
    }

    @Override
    public Unit<NullQuantity> getUnit() {
        return nullUnit;
    }

    @Override
    public Scale getScale() {
        return Scale.ABSOLUTE;
    }

    @Override
    public boolean isEquivalentTo(Quantity<NullQuantity> that) {
        return true;
    }

}
