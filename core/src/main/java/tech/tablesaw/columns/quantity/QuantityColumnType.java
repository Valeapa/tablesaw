package tech.tablesaw.columns.quantity;

import tech.tablesaw.api.QuerySupport;
import tech.tablesaw.columns.AbstractColumnParser;
import tech.tablesaw.columns.AbstractColumnType;
import tech.tablesaw.columns.Column;
import tech.tablesaw.columns.numbers.DoubleColumnType;
import tech.tablesaw.io.ReadOptions;

import javax.measure.Quantity;

public class QuantityColumnType extends AbstractColumnType {

    private static final int BYTE_SIZE = 8; // TODO para que sirve esto?

    private static QuantityColumnType INSTANCE;


    private QuantityColumnType(int byteSize, String name, String printerFriendlyName) {
        super(byteSize, name, printerFriendlyName);
    }

    public static QuantityColumnType instance() {
        if (INSTANCE == null) {
            INSTANCE = new QuantityColumnType(BYTE_SIZE, "QUANTITY", "Quantity");
        }

        return INSTANCE;

    }

    @Override
    public Column<?> create(String name) {
        return null;    // TODO
    }

    @Override
    public AbstractColumnParser<?> customParser(ReadOptions options) {
        return null; // TODO
    }

    /** Returns true if the given value is the missing value indicator for this column type */
    public static <Q extends Quantity<Q>> boolean valueIsMissing(Quantity<Q> quantity) {
        return missingValueIndicator() == quantity; // Como es un singleton el missing value se puede poner así
    }

    /**
     * Returns the missing value indicator for this column type NOTE: Clients should use {@link
     * DoubleColumnType#valueIsMissing(double)} to test for missing value indicators
     */
    public static Quantity<? extends Quantity<?>> missingValueIndicator() {
        return NullQuantity.getInstance();
    }





}
