package tech.tablesaw.columns.quantity;

import org.junit.jupiter.api.Test;
import tech.tablesaw.api.QuantityColumn;
import tech.units.indriya.quantity.Quantities;
import tech.units.indriya.unit.Units;

import javax.measure.Quantity;
import javax.measure.quantity.Speed;
import java.util.List;

public class QuantityColumnTest {

    Quantity<Speed> speed1 = Quantities.getQuantity(1.123, Units.METRE_PER_SECOND);
    Quantity<Speed> speed2 = Quantities.getQuantity(2.123, Units.METRE_PER_SECOND);
    Quantity<Speed> speed3 = Quantities.getQuantity(3.123, Units.METRE_PER_SECOND);
    Quantity<Speed> speed4 = Quantities.getQuantity(4.123, Units.METRE_PER_SECOND);

    List<Quantity<Speed>> speedsList = List.of(speed1, speed2, speed3, speed4);

    private final QuantityColumn<Speed> speedColumn = new QuantityColumn<>("Speed", speedsList);

    @Test
    void testQuantities() {
        System.out.println(speedColumn.toString());
    }

    @Test
    void testGet() {
        Quantity<Speed> speed = speedColumn.get(1);

        speed.
    }
}
