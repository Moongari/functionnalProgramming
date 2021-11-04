package functionalinterface;

import java.util.function.Function;

public class _Function {


    public static void main(String[] args) {

        // cas 1
        int value1= incrementValue(1);
        System.out.println("Cas 1: function normal");
        System.out.println(value1);

        //cas 2
        int value2= incrementValueTo.apply(1);
        System.out.println("Cas 2: avec Function<T,R>");
        System.out.println(value2);


        // il est tout a fait possible de combiner des functions(increment et multiply) grace a la methode andThen

        //ici on fait appel a la function d'increment puis on multiplie
        Function<Integer,Integer> resultAllFunctions = incrementValueTo.andThen(multiplyValueBy20);

        //executons ce code
        System.out.println("Combinaison des 2 Function<Integer,Integer> en utilisant andThen");
        System.out.println("Result : " + resultAllFunctions.apply(12));

    }


    //une simple function qui renvoie l'increment d'une valeur
    //cas 1
    static int incrementValue(int number){
        return  number++;
    }
    // maintenant creons une function a l'aide des Function<T,R>
    // le premier parametre est la valeur d'entrée,le second la valeur de sortie equivalent a notre function plus haut
    //cas 2
    static Function<Integer,Integer> incrementValueTo = number -> number++;

    static  Function<Integer,Integer> multiplyValueBy20= number-> number * 20;


}
