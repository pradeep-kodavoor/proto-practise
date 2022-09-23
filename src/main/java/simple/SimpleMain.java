package simple;

import practise.simple.SimpleOuterClass;

import java.util.Arrays;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("Hello");
        SimpleOuterClass.Simple simple = SimpleOuterClass.Simple.newBuilder()
                .setName("Pradeep")
                .setAge(29)
                .addTodos("Learn proto-buf")
                .addTodos("Learn gRPC")
                .addAllTodos(Arrays.asList("Complete Lab","Learn about CCAI Architecture"))
                .build();

        System.out.println(simple);
    }
}
