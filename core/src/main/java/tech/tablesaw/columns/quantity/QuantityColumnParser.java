package tech.tablesaw.columns.quantity;

import tech.tablesaw.api.ColumnType;
import tech.tablesaw.columns.AbstractColumnParser;

import javax.measure.Quantity;

public class QuantityColumnParser<T extends Quantity<T>> extends AbstractColumnParser<Quantity<T>> {


    public QuantityColumnParser(ColumnType columnType) {
        super(columnType);
    }

    @Override
    public boolean canParse(String s) {
        return false;
    }

    @Override
    public Quantity<T> parse(String s) {
        return null;
    }
}
