package functionalinterface;

import java.util.function.BiFunction;

public class _BiFunction {

    //BiFunction takes 2 arguments and produces 1 result

    public static void main(String[] args) {


        //without BiFunction
        int value1 = IncrementByOneMultiply(1,12);

        System.out.println(value1);

        //with BiFunction
       int valueBiFunction =  incrementByOnAndMultiplyBiFunction.apply(1,12);

        System.out.println(valueBiFunction);

    }

    static int IncrementByOneMultiply(int numberAdd,int numberMultiply){
        return (numberAdd+1) * numberMultiply;
    }
    static BiFunction<Integer,Integer,Integer> incrementByOnAndMultiplyBiFunction =
            (numberToIncrement,numberToMultiply) -> (numberToIncrement+1) * numberToMultiply;

}
