package tech.tablesaw.columns.quantity;

import tech.tablesaw.columns.Column;
import tech.tablesaw.selection.BitmapBackedSelection;
import tech.tablesaw.selection.Selection;

import javax.measure.Quantity;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public interface QuantityFilters {

    default <Q extends Quantity<Q>> Selection eval(Predicate<Quantity<Q>> predicate) {
        Selection selection = new BitmapBackedSelection();
        for (int idx = 0; idx < size(); idx++) {
            if (predicate.test(get(idx))) {
                selection.add(idx);
            }
        }
        return selection;
    }

    default <Q extends Quantity<Q>> Selection eval(BiPredicate<Quantity<Q>, Quantity<Q>> predicate, Column<Q> otherColumn) {
        Selection selection = new BitmapBackedSelection();
        for (int idx = 0; idx < size(); idx++) {
            if (predicate.test(get(idx), otherColumn.get(idx))) {
                selection.add(idx);
            }
        }
        return selection;
    }

    int size();

    <Q extends Quantity<Q>> Quantity<Q> get(int index);
}
