package factory;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class PizzaMargherita extends Pizza {


    public PizzaMargherita() {
        super("Margherita", Arrays.asList("Mozzarella", "Pomodoro", "Basilico"), 5.00, true);
    }
}
