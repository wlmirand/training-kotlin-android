package william.miranda.playground.instructor._1Intro;

import william.miranda.playground.instructor._Shared.Customer;

public class _7FromJava {

    public static void main(String[] args) {

        Customer customerKotlin = new Customer(1, "Mary Jane");
        System.out.println(customerKotlin.getId() + " - " + customerKotlin.getName());

        int result = _3FunctionsKt.sum(2, 3, 5);
        System.out.println(result);
    }
}
