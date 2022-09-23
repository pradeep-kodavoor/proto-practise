package complex;

import practise.complex.ComplexOuterClass;

import java.util.Arrays;

public class ComplexMain {

    static ComplexOuterClass.Dummy getDummy(int id, String name) {
        return  ComplexOuterClass.Dummy.newBuilder()
                .setId(id)
                .setName(name)
                .build();

    }

    public static void main(String[] args) {
        ComplexOuterClass.Complex complex = ComplexOuterClass.Complex.newBuilder()
                .addDummy(getDummy(1,"test1"))
                .addDummy(getDummy(2,"tes2"))
                .addAllDummy(Arrays.asList(getDummy(3, "test3"), getDummy(4, "test4")))
                .build();

        System.out.println(complex);
    }
}
