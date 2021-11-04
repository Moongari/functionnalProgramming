package functionalinterface;

import java.util.Locale;
import java.util.function.Predicate;


// utilisation d'un Predicate pour verifier 1 arguments result boolean
public class _Predicate {

    public static void main(String[] args) {

        boolean isEmptyValue = verificationValeur("Albert");
        System.out.println(isEmptyValue);

        boolean isOtherValue = VerificationValeurPredicate.test("alpha".toUpperCase(Locale.ROOT));
        System.out.println(isOtherValue);

    }





    static Predicate<String> VerificationValeurPredicate = value-> (value.startsWith("A") && value.length()>4);
    static boolean verificationValeur(String value) {

        if (value.startsWith("A") && value.length()>4) {
            return true;
        }
        return false;
    }
}
