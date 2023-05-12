package tech.tablesaw.api;

import it.unimi.dsi.fastutil.ints.IntComparator;
import tech.tablesaw.columns.AbstractColumn;
import tech.tablesaw.columns.AbstractColumnParser;
import tech.tablesaw.columns.Column;
import tech.tablesaw.columns.quantity.QuantityColumnParser;
import tech.tablesaw.columns.quantity.QuantityColumnType;
import tech.tablesaw.columns.quantity.QuantityFilters;
import tech.tablesaw.selection.Selection;

import javax.measure.Quantity;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class QuantityColumn<T extends Quantity<T>> extends AbstractColumn<QuantityColumn<T>, Quantity<T>>
        implements QuantityFilters{

    private List<Quantity<T>> data;

    private final IntComparator comparator =
            (r1, r2) -> {
                final BigDecimal b1 = new BigDecimal(get(r1).getValue().toString());
                final BigDecimal b2 = new BigDecimal(get(r2).getValue().toString());
                return b1.compareTo(b2);
            };

    /**
     * Constructs a column with the given {@link ColumnType}, name, and {@link AbstractColumnParser}
     *
     * @param type
     * @param name
     * @param parser
     */
    private QuantityColumn(ColumnType type, String name, AbstractColumnParser<Quantity<T>> parser) {
        super(type, name, parser);
    }

    public QuantityColumn(String name, List<Quantity<T>> values) {
        this(QuantityColumnType.instance(), name, new QuantityColumnParser<T>(QuantityColumnType.instance()));
        this.data = new ArrayList<>(values);
    }



    @Override
    public int size() {
        return data.size();
    }

    @Override
    public Table summary() {
        return null;
    }

    @Override
    public Quantity<T>[] asObjectArray() {
        return new Quantity[0];
    }

    @Override
    public int countMissing() {
        return 0;
    }

    @Override
    public String getString(int row) {
        return null;
    }

    @Override
    public Quantity<T> get(int row) {
        return data.get(row);
    }

    @Override
    public void clear() {

    }

    @Override
    public void sortAscending() {

    }

    @Override
    public void sortDescending() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public IntComparator rowComparator() {
        return null;
    }

    @Override
    public Selection isMissing() {
        return null;
    }

    @Override
    public Selection isNotMissing() {
        return null;
    }

    @Override
    public int byteSize() {
        return 0;
    }

    @Override
    public byte[] asBytes(int rowNumber) {
        return new byte[0];
    }

    @Override
    public Set<Quantity<T>> asSet() {
        return null;
    }

    @Override
    public String getUnformattedString(int r) {
        return null;
    }

    @Override
    public boolean isMissing(int rowNumber) {
        return false;
    }

    @Override
    public Column<Quantity<T>> setMissing(int i) {
        return null;
    }

    @Override
    public Column<Quantity<T>> emptyCopy() {
        return null;
    }

    @Override
    public Column<Quantity<T>> copy() {
        return null;
    }

    @Override
    public Column<Quantity<T>> emptyCopy(int rowSize) {
        return null;
    }

    @Override
    public Column<Quantity<T>> lag(int n) {
        return null;
    }

    @Override
    public Column<Quantity<T>> appendCell(String stringValue) {
        return null;
    }

    @Override
    public Column<Quantity<T>> appendCell(String stringValue, AbstractColumnParser<?> parser) {
        return null;
    }

    @Override
    public Column<Quantity<T>> set(int row, Quantity<T> value) {
        return null;
    }

    @Override
    public Column<Quantity<T>> set(int row, Column<Quantity<T>> sourceColumn, int sourceRow) {
        return null;
    }

    @Override
    public Column<Quantity<T>> append(Quantity<T> value) {
        return null;
    }

    @Override
    public Column<Quantity<T>> append(Column<Quantity<T>> column) {
        return null;
    }

    @Override
    public Column<Quantity<T>> append(Column<Quantity<T>> column, int row) {
        return null;
    }

    @Override
    public Column<Quantity<T>> appendObj(Object value) {
        return null;
    }

    @Override
    public Column<Quantity<T>> appendMissing() {
        return null;
    }

    @Override
    public int valueHash(int rowNumber) {
        return 0;
    }

    @Override
    public boolean equals(int rowNumber1, int rowNumber2) {
        return false;
    }

    @Override
    public Column<Quantity<T>> where(Selection selection) {
        return null;
    }

    @Override
    public Column<Quantity<T>> removeMissing() {
        return null;
    }

    @Override
    public Column<Quantity<T>> unique() {
        return null;
    }

    @Override
    public Iterator<Quantity<T>> iterator() {
        return null;
    }

    @Override
    public int compare(Quantity<T> o1, Quantity<T> o2) {
        return 0;
    }
}
