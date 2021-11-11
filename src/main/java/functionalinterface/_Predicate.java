package functionalinterface;

import java.util.Locale;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;

// utilisation d'un Predicate pour verifier 1 arguments result boolean
public class _Predicate {

    static Logger logger = Logger.getLogger(_Predicate.class.getName());

    public static void main(String[] args) {

        boolean isEmptyValue = verificationValeur("Albert");

        logger.log(Level.INFO, String.valueOf(isEmptyValue));


        logger.log(Level.INFO,"-----PREDICATE RESULT----- ");
        boolean isOtherValue = VerificationValeurPredicate.test("alpha".toUpperCase(Locale.ROOT));
        logger.log(Level.INFO,String.valueOf(isOtherValue));

    }





    static Predicate<String> VerificationValeurPredicate = value-> (value.startsWith("B") && value.length()>4);
    static boolean verificationValeur(String value) {
        return value.startsWith("A") && value.length() > 4;
    }
}
