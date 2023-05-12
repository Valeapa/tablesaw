package tech.tablesaw.columns.quantity;

import javax.measure.Quantity;
import java.util.function.Predicate;

public class QuantityPredicates {


    private QuantityPredicates() {}

    public static final Predicate<Quantity<?>> isMissing =
            i -> i.equals(QuantityColumnType.missingValueIndicator());

    public static final Predicate<Quantity<? extends Quantity<?>>> isNotMissing =
            i -> !i.equals(QuantityColumnType.missingValueIndicator());
}
