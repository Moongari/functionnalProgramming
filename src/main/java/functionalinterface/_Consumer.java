package functionalinterface;


import java.util.function.BiConsumer;
import java.util.function.Consumer;

// Accept 1 arguments and return void
public class _Consumer {

    static Personn p1,p2;
    public static void main(String[] args) {

        p1 =  new Personn("Alice",12);
        p2 =  new Personn("Momo",34);


            infoCustomerNormal(p2);
            infoCustomerConsumer.accept(p2);
            infoCustomerBiConsumer.accept(p2,true);
    }

static  void infoCustomerNormal(Personn personn){
    System.out.println("Bienvenu(e) " + personn.name + " vous avez l'age autoriser : " +
            personn.age + " years");

}
static   Consumer<Personn> infoCustomerConsumer =
        customer-> System.out.println("Bienvenu(e) " + customer.name + " vous avez l'age autoriser : " +
                customer.age + " years");


    static BiConsumer<Personn,Boolean> infoCustomerBiConsumer =
            (customer,isAge)-> System.out.println("Bienvenue "
            + customer.name + " your age is "
            + (isAge ? customer.age + " years" : "***************"));


    static class  Personn{

        private final String name;
        private final int age;

        public Personn(String name, int age){
            this.name=name;
            this.age=age;
        }

        @Override
        public String toString() {
            return "Personn{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
