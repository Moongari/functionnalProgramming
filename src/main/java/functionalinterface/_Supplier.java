package functionalinterface;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Supplier is just return a value
public class _Supplier{

    static final String connectionString = "jdbc://localhost:5432/users";
    static Logger logger = Logger.getLogger(_Supplier.class.getName());
    public static void main(String[] args) {

        // return value normal method

        logger.log(Level.INFO,getConnectionString());

        //return value by Supplier
        logger.log(Level.INFO,getConnectionStringSupplier.get());

        //return arrays by Supplier
        logger.log(Level.INFO, String.valueOf(getList.get()));




    }




    static String getConnectionString() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getConnectionStringSupplier =()-> connectionString;

    static Supplier<List<String>> getList = ()-> List.of("1","3","5");



}





