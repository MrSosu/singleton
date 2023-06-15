package factory;

import java.util.Arrays;
import java.util.List;

public class PizzaBoscaiola extends Pizza{
    public PizzaBoscaiola() {
        super("Boscaiola", Arrays.asList("funghi", "salsiccia", "mozzarella"), 6.00, true);
    }
}
